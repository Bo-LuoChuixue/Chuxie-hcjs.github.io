<template>
<h1>开关组件</h1>
是否是管理员:<el-switch v-model="isAdmin"></el-switch>
是否是普通用户:<el-switch v-model="isUser"></el-switch>
  是否显示图片:<el-switch v-model="isShow"></el-switch>
  <hr>
  <img v-show="isShow" src="Sulli.jpg" width="100">
</template>

<script setup>
import {ref} from "vue";

const isAdmin = ref(false);
const isUser = ref(true);
const isShow = ref(true);
</script>

<style scoped>

</style>