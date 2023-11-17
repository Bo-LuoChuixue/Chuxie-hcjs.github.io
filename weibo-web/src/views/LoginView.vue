<template>
  <h1>登錄頁面</h1>
  <el-card style="width: 400px;margin: 0 auto">
    <el-form label-width="80px">
      <el-form-item label="用戶名">
        <el-input placeholder="請輸入用戶名" v-model="user.username"></el-input>
      </el-form-item>
      <el-form-item label="密碼">
        <el-input placeholder="請輸入密碼" type="password"
                  v-model="user.password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button @click="login()">登錄</el-button>
      </el-form-item>
    </el-form>
  </el-card>
</template>

<script setup>
import {ref} from "vue";
import qs from 'qs'
import axios from "axios";
import router from "@/router";
import {ElMessage} from "element-plus";

const user = ref({username: "", password: ""})
const login = () => {
  let data = qs.stringify(user.value);
  axios.post('http://localhost:8080/v1/users/login', data)
      .then((response) => {
        // response.data=JsonResult(code,msg,data)
        if (response.data.code == 1001) {
          ElMessage.success('歡迎' + response.data.data.nickname + '回來!');
          //把登錄成功的用戶信息保存到localStorage裏面,這樣在首頁就可以訪問到了
          //localStorage裏面只能保存字符串數據不能保存對象,所以需要將對象轉成JSON字符串
          localStorage.user = JSON.stringify(response.data.data);
          router.push('/');//回首頁
        } else {
          ElMessage.error(response.data.msg);
        }
      })
}
</script>

<style scoped>

</style>