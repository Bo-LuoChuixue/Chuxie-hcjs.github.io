<template>
<el-table :data="arr">
  <el-table-column type="index" label="编号" width="60"></el-table-column>
  <el-table-column label="轮播图">
    <template #default="scope">
      <img :src="scope.row.imgUrl" style="width: 300px">
    </template>
  </el-table-column>
  <el-table-column prop="createTime" label="发布时间"></el-table-column>
  <el-table-column label="操作">
    <template #default="scope">
      <el-button type="danger">删除</el-button>
    </template>
  </el-table-column>
</el-table>
</template>

<script setup>
  import {ref} from "vue";

  const arr = ref([
    {id:1,imgUrl:"/imgs/banner1.jpg",
      createTime:"2023/5/27 14:00:20"},
    {id:2,imgUrl:"/imgs/banner2.jpg",
      createTime:"2023/5/27 14:00:20"},
    {id:3,imgUrl:"/imgs/banner3.jpg",
      createTime:"2023/5/27 14:00:20"}])
</script>

<style scoped>

</style>