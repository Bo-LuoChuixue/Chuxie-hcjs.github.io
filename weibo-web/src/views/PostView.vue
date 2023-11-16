<script setup>
import {ref} from "vue";
import qs from "qs";
import axios from "axios";
import router from "@/router";
import {ElMessage} from "element-plus";

const user=localStorage.user?JSON.parse(localStorage.user):null;
const w=ref({content:"",userId:user.id});
const post=()=>{
  let data=qs.stringify(w.value);
  axios.post('http://localhost:8080/v1/weibos/add-new',data).then((response)=>{
    if (response.data.code==2001){
      router.push('/');
    }else {
      ElMessage.error(response.data.msg);
    }
  })
}
</script>

<template>
<h1>发微博</h1>
  <el-input v-model="w.content" placeholder="请输入微博内容"></el-input>
  <el-button @click="post()">发布</el-button>
</template>

<style scoped>

</style>