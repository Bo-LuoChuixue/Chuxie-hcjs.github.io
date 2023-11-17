<template>
  <h1>微博首頁</h1>
  <div v-if="user==null">
    <div style="display: inline-block;"></div>
    <router-link to="/reg">註冊</router-link>
    <div style="margin-left: 10px; display: inline-block;"></div>
    <router-link to="/login">登錄</router-link>
  </div>
  <div v-else>
    <h2>歡迎{{ user.nickname }}</h2>
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
import {ref} from "vue";

const user = ref(localStorage.user ? JSON.parse(localStorage.user) : null);
const logout = () => {
  if (confirm("是否確認退出登錄")) {
    localStorage.clear();//清除localStorage中的數據
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
