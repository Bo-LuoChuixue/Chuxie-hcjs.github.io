<template>
<div style="width: 1200px;margin: 0 auto">
  <el-row :gutter="10">
   <el-col :span="12">
     <el-card>
       <img src="/imgs/reg.png" style="width: 100%">
     </el-card>
   </el-col>
    <el-col :span="12">
      <el-form  label-width="100px" style="margin-top: 100px">
        <el-form-item>
          <h1 style="font-size: 40px;width: 100%">立即註冊
<!--router-link是腳手架工程中取代超鏈接的標籤,好處是 超鏈接跳轉會讓整個頁面刷新,
而router-link只替換局部內容,不做整體刷新-->
            <router-link to="/login" style="font-size: 20px;color: #0aa1ed;float:right">
              已有賬號?現在登錄
            </router-link>
          </h1>
        </el-form-item>
        <el-form-item label="用戶名">
          <el-input placeholder="請輸入用戶名" v-model="user.username"></el-input>
        </el-form-item>
        <el-form-item label="密碼">
          <el-input placeholder="請輸入密碼" v-model="user.password"></el-input>
        </el-form-item>
        <el-form-item label="昵稱">
          <el-input placeholder="請輸入昵稱" v-model="user.nickname"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="reg()">註冊</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
</div>
</template>

<script setup>
import {ref} from "vue";
import qs from 'qs';
import axios from 'axios';
import router from "@/router";
import {ElMessage} from 'element-plus'
const  user = ref({username:"",password:"",nickname:""});
const reg = ()=>{
  let data = qs.stringify(user.value);
  axios.post('http://localhost:8080/v1/users/reg',data).then((response)=>{
    if (response.data.code==2001){
      router.push('/login');
    }else{
      ElMessage.error(response.data.msg);
    }
  })
}
</script>

<style scoped>

</style>