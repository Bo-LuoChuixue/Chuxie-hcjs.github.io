<template>
<h1>选择器组件</h1>
  <el-select placeholder="请选择" v-model="price">
    <el-option v-for="item in arr" :label="item.title"
               :value="item.price"></el-option>
  </el-select>
  <h3 v-if="price>0">您选择的商品是{{price}}元</h3>
</template>

<script setup>
  import {ref} from "vue";
  const price = ref("");
  const arr = ref([{title:"手机",price:3000},{title:"冰箱",price:2000},
    {title:"电视",price:5000},
    {title:"洗衣机",price:1000}]);
</script>

<style scoped>

</style>