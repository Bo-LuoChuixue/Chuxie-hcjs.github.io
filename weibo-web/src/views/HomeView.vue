<template>
  <h1>微博首页</h1>
  <div v-if="user==null">
    <div style="display: inline-block;"></div>
    <router-link to="/reg">注册</router-link>
    <div style="margin-left: 10px; display: inline-block;"></div>
    <router-link to="/login">登录</router-link>
  </div>
  <div v-else>
    <h2>欢迎{{user.nickname}}</h2>
    <a href="">退出登录</a>
  </div>
</template>

<script setup>
import {ref} from "vue";

const user=ref(localStorage.user?JSON.parse(localStorage.user):null);
</script>
