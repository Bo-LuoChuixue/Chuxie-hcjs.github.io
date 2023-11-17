<template>
  <h1>微博首頁</h1>
  <div v-if="user==null">
    <div style="display: inline-block;"></div>
    <router-link to="/reg">註冊</router-link>
    <div style="margin-left: 10px; display: inline-block;"></div>
    <router-link to="/login">登錄</router-link>
  </div>
  <div v-else>
    <h2>歡迎{{ user.nickname }}!</h2>
    <!--  javascript:void(0)廢掉超鏈接的跳轉功能  -->
    <router-link to="/post">發微博</router-link>
    |
    <a href="javascript:void(0)" @click="logout()">退出登錄</a>
  </div>
  <hr>
  <div v-for="w in weiboArr">
    <router-link :to="'/detail?id='+w.id">
      <h3>{{ w.nickname }}說:{{ w.content }}</h3>
    </router-link>

  </div>
</template>
<script setup>
import {onMounted, ref} from "vue";
import axios from "axios";
import {ElMessage} from "element-plus";
//判斷localStorage.user是否有值,有值將字符串轉成對象,沒有值則為null
const user = ref(localStorage.user ? JSON.parse(localStorage.user) : null);
const logout = () => {
  if (confirm("您確認要退出登錄嗎?")) {
    localStorage.clear();//清除localStorage裏面的數據
    //因為頁面和user對象進行了綁定, localStorage裏面的數據清除不會影響user對象
    user.value = null;
  }
}
const weiboArr = ref([]);
//頁面加載完成后發請求獲取微博數據
onMounted(() => {
  axios.get('http://localhost:8080/v1/weibos').then((response) => {
    if (response.data.code == 2001) {
      //response.data=JsonResult(code,msg,data數據)
      weiboArr.value = response.data.data;
    } else {
      ElMessage.error(response.data.msg);
    }
  })
})
</script>
