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
      <el-form-item><el-button>注册</el-button></el-form-item>
    </el-form>
  </el-card>
</template>
<script setup>
</script>