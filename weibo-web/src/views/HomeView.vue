<template>
  <h1>微博首页</h1>
  <div v-if="user==null">
    <div style="display: inline-block;"></div>
    <router-link to="/reg">註冊</router-link>
    <div style="margin-left: 10px; display: inline-block;"></div>
    <router-link to="/login">登錄</router-link>
  </div>
  <div v-else>
    <h2>欢迎{{ user.nickname }}回来!</h2>
    <!--  javascript:void(0)废掉超链接的跳转功能  -->
    <router-link to="/post">发微博</router-link>
    |
    <a href="javascript:void(0)" @click="logout()">退出登录</a>
  </div>
  <hr>
  <div v-for="w in weiboArr">
    <router-link :to="'/detail?id='+w.id">
      <h3>{{ w.nickname }}说:{{ w.content }}</h3>
    </router-link>
  </div>
</template>

<script setup>
import {onMounted, ref} from "vue";
import axios from "axios";
import {ElMessage} from "element-plus";

//判断localStorage.user是否有值,有值将字符串转成对象,没有值则为null
const user = ref(localStorage.user ? JSON.parse(localStorage.user) : null);
const logout = () => {
  if (confirm("您确认要退出登录吗?")) {
    localStorage.clear();//清除localStorage里面的数据
    //因为页面和user对象进行了绑定, localStorage里面的数据清除不会影响user对象
    user.value = null;
  }
}
const weiboArr = ref([]);
//页面加载完成后发请求获取微博数据
onMounted(() => {
  axios.get('http://localhost:8080/v1/weibos').then((response) => {
    if (response.data.code == 2001) {
      //response.data=JsonResult(code,msg,data数据)
      weiboArr.value = response.data.data;
    } else {
      ElMessage.error(response.data.msg);
    }
  })
})
</script>
