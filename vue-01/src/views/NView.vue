<template>
<h1>单选组件</h1>

  <el-radio-group v-model="info" size="large">
    <el-radio-button label="魏国" />
    <el-radio-button label="蜀国" />
    <el-radio-button label="吴国" />
  </el-radio-group>
  <h3>当前选中的国家是:{{info}}</h3>


  <el-radio-group v-model="price" size="large">
<!--标签体内是展示给用户看的内容, label设置的是选中后得到的内容-->
    <el-radio-button v-for="item in arr" :label="item.price">{{item.title}}</el-radio-button>
  </el-radio-group>
  <h3>当前的商品是{{price}}元</h3>
</template>

<script setup>
import {ref} from "vue";
const price = ref("0");
const arr = ref([{title:"手机",price:3000},{title:"冰箱",price:2000},
  {title:"电视",price:5000},
  {title:"洗衣机",price:1000}]);

const info = ref("吴国");
</script>

<style scoped>

</style>