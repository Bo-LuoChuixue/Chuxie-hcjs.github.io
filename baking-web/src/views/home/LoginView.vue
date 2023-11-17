<template>
  <div id="main-div">
    <el-card style="width: 500px;height: 300px;margin: 50px auto">
      <el-form label-width="100px" style="margin-top: 50px;">
        <el-form-item label="用戶名">
          <el-input placeholder="請輸入用戶名" v-model="user.username"></el-input>
        </el-form-item>
        <el-form-item label="密碼">
          <el-input type="password" placeholder="請輸入密碼" v-model="user.password"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button style="position: relative;left: 100px" type="primary" @click="login()">登錄</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </div>
</template>

<script setup>
import {ref} from "vue";
import qs from "qs";
import axios from "axios";

const user = ref({username: "", password: ""});
const login = () => {
  let data = qs.stringify(user.value);
  axios.post('http://localhost:8080/v1/users/login', data).then((response) => {
    if (response.data.code == 2001) {
      router.push('/')
    } else {
      ElMessage.error(response.data.msg);
    }
  })
}
</script>

<style scoped>
#main-div {
  height: 500px;
  background-image: url('/public/imgs/loginbg.gif');
  overflow: hidden;
  background-position: center;
  background-size: cover; /*設置封面*/
}
</style>