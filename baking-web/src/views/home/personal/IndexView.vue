<template>
  <el-card>
    <el-form label-width="100px" style="width: 500px">
      <el-form-item label="头像">
<!--    上传组件开始
   action设置请求地址
   name 请求参数的名称
   limit上传文件的数量
   on-success上传成功事件
   -->
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
      <el-form-item label="昵称">
        <el-input placeholder="请输入昵称" v-model="user.nickname"></el-input>
      </el-form-item>
      <el-form-item label="用户名">
        <el-input v-model="user.username" disabled></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="save()">保存修改</el-button>
      </el-form-item>
    </el-form>
  </el-card>

</template>

<script setup>

import { ref } from 'vue'
import { Plus } from '@element-plus/icons-vue'

import  { ElMessage} from 'element-plus'
import qs from "qs";
import axios from "axios";
//得到当前登录的用户信息
const user = ref(localStorage.user?JSON.parse(localStorage.user):null);
const save = ()=>{
  //id username password imgUrl isAdmin nickname
  let editUser = {id:user.value.id,nickname:user.value.nickname,
    imgUrl:user.value.imgUrl};
  let data = qs.stringify(editUser);
  axios.post('http://localhost:8080/v1/users/update',data)
  .then((response)=>{
    if (response.data.code==2001){
      ElMessage.success("修改完成!");
      //更新浏览器中记录的用户数据
      localStorage.user = JSON.stringify(user.value);
      location.reload();//刷新页面
    }
  })

}

/*********上传相关开始**********/
const fileList = ref([])

const dialogImageUrl = ref('')
const dialogVisible = ref(false)
const handleSuccess = (response,file,files) =>{
  //在axios框架中 response.data=JsonResult
  //此处的response就是服务器响应的JsonResult对象   response=JsonResult
  user.value.imgUrl = response.data;

}

const handleRemove = (uploadFile, uploadFiles) => {
  console.log(uploadFile, uploadFiles)
  //向服务器发出删除请求 uploadFile此时删除的文件对象
  // uploadFile.response代表服务器上传成功时响应的JsonResult
  axios.post('http://localhost:8080/v1/remove?url='+uploadFile.response.data)
  .then((response)=>{
    if (response.data.code==2001){
      ElMessage.success("文件删除完成!");
    }
  });
}

const handlePictureCardPreview = (uploadFile) => {
  dialogImageUrl.value = uploadFile.url
      dialogVisible.value = true
}
/*********上传相关结束**********/
</script>

<style scoped>

</style>