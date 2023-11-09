<template>
<h1>显示隐藏指令</h1>
<!-- v-if指令控制元素是否显示  true显示 false不显示(删除元素) -->
  <h3 v-if="isShow">刘德华</h3>
<!-- 和上面v-if的状态取反 -->
  <h3 v-else>郭富城</h3>
  <!-- v-show指令控制元素是否显示  true显示 false不显示(隐藏元素)
   在需要频繁切换显示隐藏状态的情况下使用,执行效率高于v-if-->
  <h3 v-show="isShow">张学友</h3>
</template>

<script setup>
  import {ref} from "vue";

  const isShow = ref(false);
</script>

<style scoped>

</style>