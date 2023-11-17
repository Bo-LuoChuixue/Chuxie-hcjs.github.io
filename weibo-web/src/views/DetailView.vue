<template>
  <h1>詳情頁面</h1>
  <h2>{{ w.nickname }}說:{{ w.content }}</h2>
  <p>{{ w.created }}</p>
  <hr>
  <h3>評論相關</h3>
  <el-input placeholder="輸入評論內容" v-model="c.content"></el-input>
  <el-button @click="postComment()">評論</el-button>
  <hr>
  <div v-for="comment in commentArr">
    <h4>{{comment.nickname}}說：{{comment.content}}</h4>
    <p style="font-size: 12px;color: #666;margin: 0">{{comment.created}}</p>
  </div>
</template>

<script setup>

import {onMounted, ref} from "vue";
import axios from "axios";
import {ElMessage} from "element-plus";
import router from "@/router";
import qs from "qs";

const w = ref({});
//定義評論對象
const c = ref({content: ""});
const postComment = () => {
  //得到微博的id 和 作者id
  c.value.weiboId = w.value.id;
  //得到當前登錄的用戶信息
  let user = localStorage.user ? JSON.parse(localStorage.user) : null;
  if (user == null) {
    alert("請先登錄!")
    router.push('/login');
    return;
  }
  c.value.userId = user.id;//把當前登錄的用戶id給到評論對象
  let data = qs.stringify(c.value);//把需要傳遞的js對象轉成查詢字符串格式
  axios.post('http://localhost:8080/v1/comments/add-new', data)
      .then((response) => {
        if (response.data.code == 2001) {
          ElMessage.success("評論完成!");
        } else {
          ElMessage.error(response.data.msg);
        }
      })
}
const commentArr = ref([]);
onMounted(() => {
  //得到地址欄中的微博id
  let id = new URLSearchParams(location.search).get('id');
  console.log("id=" + id);
  axios.get('http://localhost:8080/v1/weibos/' + id).then((response) => {
    if (response.data.code == 2001) {
      w.value = response.data.data;
    } else {
      ElMessage.error(response.data.msg);
    }
  })

  //請求當前微博相關的評論
  axios.get('http://localhost:8080/v1/comments/' + id).then((response) => {
    if (response.data.code == 2001) {
      commentArr.value = response.data.data;
    }
  })
})
</script>

<style scoped>

</style>