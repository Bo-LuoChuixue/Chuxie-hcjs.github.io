<template>
  <h1>属性绑定</h1>
<!--当元素的某个属性里面需要用到某个变量的值时,使用属性绑定-->
  <input type="text" v-bind:value="info">
  <input type="text" :value="info">
  <a :href="url">超链接</a>
</template>

<script setup>
  import {ref} from "vue";
  //定义响应式变量用于和页面元素进行绑定
  const info = ref("属性绑定");
  const url = ref("http://www.baidu.com");
</script>

<style scoped>

</style>