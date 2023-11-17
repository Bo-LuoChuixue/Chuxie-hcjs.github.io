<template>
  <h1>發微博頁面</h1>
  <el-input v-model="w.content" placeholder="說點兒啥..."></el-input>
  <el-button @click="post()">發布微博</el-button>
</template>

<script setup>
import {ref} from "vue";
import qs from 'qs';
import axios from "axios";
import router from "@/router";
import {ElMessage} from "element-plus";

const user = localStorage.user ? JSON.parse(localStorage.user) : null;
//和頁面進行綁定的變量需要定義成響應式變量
const w = ref({content: "", userId: user.id});
const post = () => {
  //把對象轉成查詢字符串
  let data = qs.stringify(w.value);
  axios.post('http://localhost:8080/v1/weibos/add-new', data)
      .then((response) => {
        if (response.data.code == 2001) {
          router.push('/');
        } else {
          ElMessage.error(response.data.msg);
        }
      })
}
</script>

<style scoped>

</style>