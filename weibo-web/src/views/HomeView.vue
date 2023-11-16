<template>
  <h1>微博首页</h1>
  <div v-if="user==null">
    <div style="display: inline-block;"></div>
    <router-link to="/reg">注册</router-link>
    <div style="margin-left: 10px; display: inline-block;"></div>
    <router-link to="/login">登录</router-link>
  </div>
  <div v-else>
    <h2>欢迎{{ user.nickname }}</h2>
    <router-link to="/post">发微博</router-link>  |
    <a href="javascript:void(0)" @click="logout()">退出登录</a>
  </div>
</template>

<script setup>
import {ref} from "vue";

const user = ref(localStorage.user ? JSON.parse(localStorage.user) : null);
const logout = () => {
  if (confirm("是否确认退出登录"))
  localStorage.clear();//清楚localStorage中的数据
  user.value = null;
}
</script>
