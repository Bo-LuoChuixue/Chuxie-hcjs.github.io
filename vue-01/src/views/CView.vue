<template>
  <h1>双向绑定</h1>
  {{info}}
<!-- v-model="响应式变量" 让控件的值和变量进行双向绑定 -->
  <input type="text" v-model="info">
  <hr>
  <a :href="url">超链接</a>
  <input type="text" v-model="url">
</template>

<script setup>
  import {ref} from "vue";
  const url = ref("http://www.baidu.com");
  const info = ref("双向绑定");
</script>

<style scoped>

</style>