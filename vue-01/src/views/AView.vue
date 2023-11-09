<template>
  <h1>文本相关指令</h1>
<!--{{响应式变量}} 插值: 让此处显示的文本内容和响应式变量进行绑定-->
  {{info}}
<!--v-text="响应式变量" 让元素的文本内容和变量进行绑定-->
  <h3 v-text="info"></h3>
<!-- v-html="响应式变量" 让元素的html内容和变量进行绑定 -->
  <h3 v-html="info"></h3>
</template>

<script setup>
  //定义一个响应式变量
  import {ref} from "vue";
  const info = ref("文本相关<s>加粗标签</s>");
</script>

<style scoped>

</style>