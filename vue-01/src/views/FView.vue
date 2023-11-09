<template>
<h1>猜数字练习</h1>
  <input type="text" placeholder="请输入1-100的随机整数" v-model="num">
  <input type="button" value="猜一猜" @click="f()">
  <h3>结果:{{info}}</h3>
</template>

<script setup>
 import {ref} from "vue";

 const num = ref("");
 const info = ref("");
 let x = parseInt(Math.random()*100)+1;
 const f = ()=>{
   if (num.value>x){
     info.value = "猜大了!";
   }else if (num.value<x){
     info.value = "猜小了!";
   }else{
     info.value = "恭喜你猜对了!";
   }
 }
</script>

<style scoped>

</style>