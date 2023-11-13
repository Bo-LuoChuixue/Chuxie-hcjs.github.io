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
          <h1 style="font-size: 40px;width: 100%">立即注册
<!--router-link是脚手架工程中取代超链接的标签,好处是 超链接跳转会让整个页面刷新,
而router-link只替换局部内容,不做整体刷新-->
            <router-link to="/login"
                         style="font-size: 20px;color: #0aa1ed;float:right">
              已有账号?现在登录
            </router-link>
          </h1>
        </el-form-item>
        <el-form-item label="用户名">
          <el-input placeholder="请输入用户名"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input placeholder="请输入密码"></el-input>
        </el-form-item>
        <el-form-item label="昵称">
          <el-input placeholder="请输入昵称"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="primary">注册</el-button>
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
</div>
</template>

<script setup>

</script>

<style scoped>

</style>