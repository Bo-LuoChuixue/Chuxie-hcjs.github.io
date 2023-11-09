<template>
<h1>事件绑定</h1>
  <input type="button" value="按钮" @click="f()">
  <input type="text" v-model="info">
</template>

<script setup>
import {ref} from "vue";
const info = ref("");
const f = ()=>{
  //弹出文本框的值
  alert(info.value);
}
</script>

<style scoped>

</style>