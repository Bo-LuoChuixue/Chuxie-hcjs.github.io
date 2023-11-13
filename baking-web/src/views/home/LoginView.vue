<template>
<div id="main-div">
  <el-card style="width: 500px;height: 300px;margin: 50px auto">
      <el-form label-width="100px" style="margin-top: 50px;">
        <el-form-item label="用户名">
          <el-input placeholder="请输入用户名"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input type="password" placeholder="请输入密码"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button style="position: relative;left: 100px" type="primary">登录</el-button>
        </el-form-item>
      </el-form>
  </el-card>
</div>
</template>

<script setup>

</script>

<style scoped>
#main-div{
  height: 500px;background-image: url('/public/imgs/loginbg.gif');
  overflow: hidden;
  background-position: center;
  background-size: cover;/*设置封面*/

}
</style>