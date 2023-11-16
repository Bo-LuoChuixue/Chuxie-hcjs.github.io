<script setup>
import {ref} from "vue";

const user=ref({username:"",password:""})
</script>

<template>
<h1>登录页面</h1>
  <el-card style="width: 400px;margin: 0 auto">
    <el-form label-width="80px">
      <el-form-item label="用户名">
      <el-input placeholder="请输入用户名" v-model="user.username"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input placeholder="请输入密码" type="password" v-model="user.password"></el-input>
      </el-form-item>
      <el-form-item><el-button @click="login()">登录</el-button></el-form-item>
    </el-form>
  </el-card>
</template>

<style scoped>

</style>