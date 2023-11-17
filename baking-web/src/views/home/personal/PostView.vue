<template>
<el-card>
  <h1 style="color: orange">发布内容页面</h1>
  <el-form label-width="100px">
    <el-form-item label="文章标题">
      <el-input v-model="c.title" placeholder="请输入文章标题"></el-input>
    </el-form-item>
    <el-form-item label="文章分类">
      <el-radio-group v-model="c.type">
        <el-radio-button label="1">烘焙食谱</el-radio-button>
        <el-radio-button label="2">烘焙视频</el-radio-button>
        <el-radio-button label="3">行业资讯</el-radio-button>
      </el-radio-group>
    </el-form-item>
    <el-form-item label="二级分类">
      <el-select placeholder="请选择" v-model="c.categoryId">
        <el-option label="面包" value="1"></el-option>
        <el-option label="小食" value="2"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="封面">
      <!--    上传组件开始    -->
      <el-upload
          v-model:file-list="fileList"
          action="https://run.mocky.io/v3/9d059bf9-4660-45f2-925d-ce80ad6c4d15"
          list-type="picture-card"
          :on-preview="handlePictureCardPreview"
          :on-remove="handleRemove"
      >
        <el-icon><Plus /></el-icon>
      </el-upload>
      <el-dialog v-model="dialogVisible">
        <img w-full :src="dialogImageUrl" alt="Preview Image" />
      </el-dialog>
      <!--    上传组件结束    -->

    </el-form-item>
    <el-form-item label="文章内容">
<!--ref="xxx" 让元素和某个变量进行关联-->

      <div ref="editorContent"></div>
    </el-form-item>
    <el-form-item><el-button type="primary">发布内容</el-button></el-form-item>
  </el-form>
</el-card>
</template>

<script setup>
import {onMounted, ref} from "vue";
import { Plus } from '@element-plus/icons-vue'
import { UploadProps, UploadUserFile } from 'element-plus'
//导入富文本编辑器    安装指令: npm install wangeditor
import Editor from 'wangeditor';


const c = ref({title:"",type:1,categoryId:""});

/*********上传相关开始**********/

const fileList = ref([])

const dialogImageUrl = ref('')
const dialogVisible = ref(false)

const handleRemove = (uploadFile, uploadFiles) => {
  console.log(uploadFile, uploadFiles)
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
});
</script>

<style scoped>

</style>