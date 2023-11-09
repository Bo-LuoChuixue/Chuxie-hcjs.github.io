<template>
<h1>表单组件</h1>
  <div style="width: 400px;margin: 0 auto">
    <el-form label-width="80px">
      <el-form-item label="用户名">
        <el-input placeholder="请输入用户名" v-model="user.username"></el-input>
      </el-form-item>
      <el-form-item label="密码">
        <el-input type="password" placeholder="请输入密码" v-model="user.password"></el-input>
      </el-form-item>
      <el-form-item label="性别">
        <el-radio-group v-model="user.gender" >
          <el-radio-button label="男" />
          <el-radio-button label="女" />
        </el-radio-group>
      </el-form-item>
      <el-form-item label="所在地">
        <el-select v-model="user.city" placeholder="请选择">
          <el-option label="北京" value="bj"></el-option>
          <el-option label="上海" value="sh"></el-option>
          <el-option label="广州" value="gz"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="管理员">
        <el-switch v-model="user.isAdmin"></el-switch>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="reg()">注册</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script setup>
  import {ref} from "vue";
  import {ElMessage} from "element-plus";
  const user = ref({username:"",password:"",gender:"",city:"",isAdmin:false});
  const reg = ()=>{
    ElMessage.success("注册成功!");
  }
</script>

<style scoped>

</style>