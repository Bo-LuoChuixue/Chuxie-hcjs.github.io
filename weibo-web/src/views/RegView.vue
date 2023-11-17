<template>
  <h1>註冊頁面</h1>
  <el-card>
    <el-form label-width="100px">
      <el-form-item label="用戶名">
        <el-input v-model="user.username"></el-input>
      </el-form-item>
      <el-form-item label="密碼">
        <el-input v-model="user.password"></el-input>
      </el-form-item>
      <el-form-item label="昵稱">
        <el-input v-model="user.nickname"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button @click="reg()">註冊</el-button>
      </el-form-item>
    </el-form>
  </el-card>
</template>
<script setup>
import {ref} from "vue";
import qs from 'qs';
import axios from "axios";import router from "@/router";
import {ElMessage} from "element-plus";

const user = ref({username: "", password: "", nickname: ""});
const reg = () => {
  //將user對象轉成查詢字符串
  let data = qs.stringify(user.value);
  console.log(data);

  //向服務器發出請求
  axios.post('http://localhost:8080/v1/users/reg', data).then((response) => {
    console.log(response.data);//response對象里裝着服務器響應的內容  response.data得到服務器響應的數據
    if (response.data.code==2001){
      router.push('/');
    }else {
      ElMessage.error("用戶名已存在！");
    }
  })
}
</script>