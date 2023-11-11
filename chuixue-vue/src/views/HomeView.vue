<script setup>
import {ref} from 'vue'

const input1 = ref('')
</script>

<template>
  <el-menu
      :default-active="activeIndex"
      class="el-menu-demo"
      mode="horizontal"
      :ellipsis="false"
      @select="handleSelect"
  >
    <el-menu-item index="0">
      <img
          style="width: 170px"
          src="/pic/logo.png"
          alt="QQmusic logo"
      />
    </el-menu-item>
    <el-menu-item index="1">音乐馆</el-menu-item>
    <el-menu-item index="2">我的音乐</el-menu-item>
    <el-menu-item index="3">客户端</el-menu-item>
    <el-menu-item index="4">开放平台</el-menu-item>
    <el-menu-item index="5">VIP</el-menu-item>
    <el-input
        v-model="input1"
        class="w-50 m-2"
        size="large"
        placeholder="搜索音乐、MV、歌单、用户"
    />
    <el-menu-item index="6">登录</el-menu-item>
    <el-sub-menu index="7">
      <template #title>开通VIP</template>
      <el-menu-item index="7-1" align="center">开通超级会员</el-menu-item>
      <el-menu-item index="7-2" align="center">开通绿钻豪华版</el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="8">
      <template #title>充值</template>
      <el-menu-item index="8-1" align="center">购买乐币</el-menu-item>
      <el-menu-item index="8-2" align="center">充值饭票</el-menu-item>
    </el-sub-menu>
  </el-menu>

</template>

<style scoped>

</style>