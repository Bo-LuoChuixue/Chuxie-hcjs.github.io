<template>
<h1>员工列表练习</h1>
  <input type="text" placeholder="姓名" v-model="emp.name">
  <input type="text" placeholder="工资" v-model="emp.salary">
  <input type="text" placeholder="工作" v-model="emp.job">
  <input type="button" value="添加" @click="add()">
  <table border="1">
    <caption>员工列表</caption>
    <tr><th>编号</th><th>姓名</th><th>工资</th><th>工作</th><th>操作</th></tr>
    <tr v-for="(e,i) in arr"><td>{{i+1}}</td>
      <td>{{e.name}}</td><td>{{e.salary}}</td><td>{{e.job}}</td>
      <td><input type="button" value="删除" @click="del(i)"></td>
    </tr>
  </table>
</template>

<script setup>
import {ref} from "vue";
const arr = ref([]);
const emp = ref({name:"",salary:"",job:""});
const add = ()=>{
  //创建一个新对象 数据来自和页面进行绑定的emp响应式变量
  let newEmp = {name:emp.value.name,salary:emp.value.salary,job:emp.value.job}
  arr.value.push(newEmp);
}
const del = (i)=>{
  if (confirm("您确认要删除此员工吗?")){
    //splice(位置,数量)
    arr.value.splice(i,1);
  }
}
</script>

<style scoped>

</style>