<template>
<div id="main-div">
  <el-card style="width: 500px;height: 300px;margin: 50px auto">
      <el-form label-width="100px" style="margin-top: 50px;">
        <el-form-item label="用户名">
          <el-input placeholder="请输入用户名" v-model="user.username"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input type="password" v-model="user.password" placeholder="请输入密码"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button style="position: relative;left: 100px" type="primary" @click="login()">登录</el-button>
        </el-form-item>
      </el-form>
  </el-card>
</div>
</template>

<script setup>
import {ref} from "vue";
import qs from "qs";
import axios from "axios";
import router from "@/router";
import {ElMessage} from "element-plus";

const user = ref({username:"",password:""});
const login = ()=>{
  let data = qs.stringify(user.value);
  axios.post('http://localhost:8080/v1/users/login',data)
  .then((response)=>{
    if (response.data.code==2001){
      //把登录成功的用户信息保存到localStorage里面response.data.data=userVO
      localStorage.user = JSON.stringify(response.data.data);

      // router.push('/');  返回首页但是页面没有刷新
      location.href='/';  //返回首页 并刷新页面
    }else{
      ElMessage.error(response.data.msg);
    }
  })
}
</script>

<style scoped>
#main-div{
  height: 500px;background-image: url('/public/imgs/loginbg.gif');
  overflow: hidden;
  background-position: center;
  background-size: cover;/*设置封面*/

}
</style>