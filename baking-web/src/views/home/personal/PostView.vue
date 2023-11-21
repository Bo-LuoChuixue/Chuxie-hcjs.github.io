<template>
<el-card>
  <h1 style="color: orange">{{c.id==null?'发布内容页面':'修改内容页面'}}</h1>
  <el-form label-width="100px">
    <el-form-item label="文章标题">
      <el-input v-model="c.title" placeholder="请输入文章标题"></el-input>
    </el-form-item>
    <el-form-item label="文章分类">
      <el-radio-group v-model="c.type" @change="handleChange()">
        <el-radio-button label="1">烘焙食谱</el-radio-button>
        <el-radio-button label="2">烘焙视频</el-radio-button>
        <el-radio-button label="3">行业资讯</el-radio-button>
      </el-radio-group>
    </el-form-item>
    <el-form-item label="二级分类">
      <el-select placeholder="请选择" v-model="c.categoryId">
        <el-option v-for="cat in categoryArr"
                   :label="cat.name" :value="cat.id"></el-option>

      </el-select>
    </el-form-item>
    <el-form-item label="封面">
      <!--    上传组件开始    -->
      <el-upload
          v-model:file-list="fileList"
          action="http://localhost:8080/v1/upload"
          name="file"
          limit="1"
          list-type="picture-card"
          :on-preview="handlePictureCardPreview"
          :on-remove="handleRemove"
          :on-success="handleSuccess"
      >
        <el-icon><Plus /></el-icon>
      </el-upload>
      <el-dialog v-model="dialogVisible">
        <img w-full :src="dialogImageUrl" alt="Preview Image" />
      </el-dialog>
      <!--    上传组件结束    -->

    </el-form-item>
    <el-form-item v-show="c.type==2" label="视频">
      <!--    上传组件开始    -->
      <el-upload
          action="http://localhost:8080/v1/upload"
          name="file"
          limit="1"
          accept="video/*"
          :on-remove="handleRemove"
          :on-success="handleSuccess"
      >
        <el-button>点击上传视频</el-button>
        <div>只能上传mp4文件,且不超过100MB</div>
      </el-upload>
      <el-dialog v-model="dialogVisible">
        <img w-full :src="dialogImageUrl" alt="Preview Image" />
      </el-dialog>
      <!--    上传组件结束    -->

    </el-form-item>
    <el-form-item v-show="c.type!=2" label="文章内容">
<!--ref="xxx" 让元素和某个变量进行关联-->

      <div ref="editorContent"></div>
    </el-form-item>
    <el-form-item><el-button type="primary" @click="post()">
      {{c.id==null?'发布内容':'修改内容'}}
    </el-button></el-form-item>
  </el-form>
</el-card>
</template>

<script setup>
import {onMounted, ref} from "vue";
import { Plus } from '@element-plus/icons-vue'
import { ElMessage } from 'element-plus'
//导入富文本编辑器    安装指令: npm install wangeditor
import Editor from 'wangeditor';
import axios from "axios";
import router from "@/router";
import qs from "qs";

const categoryArr = ref([]);

const handleChange = ()=>{
  c.value.categoryId=""; //把之前记录的二级分类数据清除
  loadCategories();//请求type改变之后对应的二级分类数据
}

const c = ref({title:"",type:1,categoryId:""});
const post = ()=>{
  if (c.value.title.trim()==''){ElMessage.error('标题不能为空!');return;}
  if (c.value.imgUrl==null){ElMessage.error('请选择封面!');return;}
  //得到当前登录的用户信息
  let user = localStorage.user?JSON.parse(localStorage.user):null;
  if (user==null){
    alert("请先登录!");
    router.push('/login');
    return;
  }
  c.value.createBy = user.id; //设置作者id    <h1>你好</h1>
  //把富文本编辑器里面的内容取出   取出的是包含html标签的内容
  c.value.content = editor.txt.html();
  //设置摘要 (正文的前30个字符作为摘要)   editor.txt.text()得到纯文本内容(不包括标签)
  c.value.brief = editor.txt.text().slice(0,30);
  let data = qs.stringify(c.value);
  axios.post('http://localhost:8080/v1/contents/add-new',data)
  .then((response)=>{
    if (response.data.code==2001){
      ElMessage.success( c.value.id==null?"发布完成!":"修改完成!");
      router.push('/personal/management');//跳转到稿件管理页面
    }
  })


}

/*********上传相关开始**********/

const fileList = ref([])

const dialogImageUrl = ref('')
const dialogVisible = ref(false)
const handleSuccess = (response,file,fileList)=>{
  //response = JsonResult
  //判断上传的文件是图片还是视频
  if (file.raw.type.includes('image')){
    //把上传成功的图片路径装进内容对象c里面
    c.value.imgUrl = response.data;
  }else{//代表上传的是视频
    c.value.videoUrl = response.data;
  }

}
const handleRemove = (uploadFile, uploadFiles) => {
  //判断上传的文件是图片还是视频
  if (uploadFile.raw.type.includes('image')){
    //把上传成功的图片路径装进内容对象c里面
    c.value.imgUrl = null;
  }else{//代表上传的是视频
    c.value.videoUrl = null;
  }
 //发出删除文件的请求
  let url = uploadFile.response.data; //得到当前文件的路径
  axios.post('http://localhost:8080/v1/remove?url='+url).then((response)=>{
    if (response.data.code==2001){
      ElMessage.success("删除文件完成!");
    }
  })
}

const handlePictureCardPreview = (uploadFile) => {
  dialogImageUrl.value = uploadFile.url
  dialogVisible.value = true
}
/*********上传相关结束**********/

/*富文本编辑器相关*/
const editorContent = ref(null); //此变量对应的是页面中的div
let editor = null;
//此方法是VUE框架的一个声明周期方法(从创建开始到销毁过程中自动调用的方法),
// 此方法是在VUE框架挂载完成时触发(可以理解为页面加载完时)
onMounted(()=>{
  //实例化富文本编辑器对象,需要用到页面中的div
  editor = new Editor(editorContent.value);
  //设置占位文本
  editor.config.placeholder="请输入内容详情...";
  //将富文本编辑器渲染到页面中
  editor.create();



  //判断地址栏中是否包含id ,location.search得到地址栏中?以及后面的内容
  if (location.search.includes('id')){//修改
    let id = new URLSearchParams(location.search).get('id');
    //通过id请求内容详情
    axios.get(BASE_URL+'/v1/contents/'+id+'/update').then((response)=>{
      if (response.data.code==2001){
        c.value = response.data.data;
        //设置富文本编辑器显示的内容
        editor.txt.html(c.value.content);
        loadCategories();
      }
    })
  }else{//发布
    //发请求获取二级分类数据
    loadCategories();
  }
});

const loadCategories = ()=>{
  axios.get('http://localhost:8080/v1/categories/'+c.value.type).then((response)=>{
    if (response.data.code==2001){
      categoryArr.value = response.data.data;
    }
  })
}

</script>

<style scoped>

</style>