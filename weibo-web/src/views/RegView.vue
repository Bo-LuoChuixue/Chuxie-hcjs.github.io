<template>
  <h1>注册页面</h1>
  <el-card>
    <el-form label-width="100px">
      <el-form-item label="用户名">
        <el-input v-model="user.username"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input v-model="user.password"></el-input>
      </el-form-item>
      <el-form-item label="昵称">
        <el-input v-model="user.nickname"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button @click="reg()">注册</el-button>
      </el-form-item>
    </el-form>
  </el-card>
</template>
<script setup>
import {ref} from "vue";
import qs from 'qs';
import axios from "axios";

const user = ref({username: "", password: "", nickname: ""});
const reg = () => {
  //将user对象转成查询字符串
  let data = qs.stringify(user.value);
  console.log(data);

  //向服务器发出请求
  axios.post('http://localhost:8080/v1/users/reg', data).then((response) => {
    console.log(response.data);//response对象里装着服务器响应的内容  response.data得到服务器响应的数据
  })
}
</script>