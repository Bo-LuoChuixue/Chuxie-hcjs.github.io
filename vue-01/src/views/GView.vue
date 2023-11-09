<template>
<h1>循环遍历指令</h1>
  <ul>
    <!--v-for="变量 in 数组" 循环遍历指令, 遍历的过程中生成当前元素-->
    <li v-for="name in arr">{{name}}</li>
  </ul>
  <table border="1">
    <caption>新势力列表</caption>
    <tr>
      <th>编号</th><th>名称</th><th>价格</th><th>销量</th>
    </tr>
    <tr v-for="(product,i) in productArr">
      <td>{{i+1}}</td>
      <td>{{product.title}}</td>
      <td>{{product.price}}</td>
      <td>{{product.saleCount}}</td>
    </tr>
  </table>
</template>

<script setup>
  import {ref} from "vue";

  const arr = ref(["刘备","关羽","张飞"]);
  const productArr = ref([{title:"小鹏汽车",price:250000,saleCount:100},
    {title:"理想汽车",price:350000,saleCount:200},
    {title:"蔚来汽车",price:550000,saleCount:300}]);
</script>

<style scoped>

</style>