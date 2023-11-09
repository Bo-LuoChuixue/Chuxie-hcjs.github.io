<template>
<h1>计算器练习</h1>
<!--当需要从控件中获取用户输入的内容时使用双向绑定-->
  <input type="text" v-model="n1">
  <input type="text" v-model="n2">
  <input type="button" value="加" @click="f(1)">
  <input type="button" value="减" @click="f(2)">
  <input type="button" value="乘" @click="f(3)">
  <input type="button" value="除" @click="f(4)">
  <h3>结果:{{result}}</h3>
</template>

<script setup>
import {ref} from "vue";
const result = ref("");
const n1 = ref("");
const n2 = ref("");
const f = (x)=>{
  //判断输入的内容是否是NaN
  if (isNaN(n1.value)||isNaN(n2.value)){
    result.value = "输入错误!";
    return;
  }
  switch (x) {
    case 1:
      result.value = n1.value*1+n2.value*1;
      break;
    case 2:
      result.value = n1.value-n2.value;
      break;
    case 3:
      result.value = n1.value*n2.value;
      break;
    case 4:
      result.value = n1.value/n2.value;
      break;
  }
}

</script>

<style scoped>

</style>