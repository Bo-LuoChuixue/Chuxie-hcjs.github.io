<template>
<h1>综合练习</h1>
  <table border="1">
    <caption>个人信息</caption>
    <tr><td>照片:</td><td><img :src="p.imgUrl" width="100"></td></tr>
    <tr><td>姓名:</td><td>{{p.name}}</td></tr>
    <tr><td>年龄:</td><td>{{p.age}}</td></tr>
    <tr><td>好友:</td>
      <td><ul><li v-for="name in p.friends">{{name}}</li></ul></td>
    </tr>
  </table>
  <input type="button" value="加载数据" @click="load()">
</template>

<script setup>
import {ref} from "vue";

const p = ref({name:"",age:"",imgUrl:"",friends:[]});
const load=()=>{
  let person = {name:"崔雪莉",age:26,imgUrl:"https://img2.baidu.com/it/u=873563546,670720569&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=625",friends:["李知恩","具荷拉","金泰妍"]}
  //把从服务器请求到的数据赋值给响应式变量
  p.value = person;
}
</script>

<style scoped>

</style>