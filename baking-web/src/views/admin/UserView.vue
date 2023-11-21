<template>
  <el-table :data="arr">
    <el-table-column type="index" label="编号" width="60px"></el-table-column>
    <el-table-column prop="userName" label="用户名"></el-table-column>
    <el-table-column prop="nickName" label="昵称"></el-table-column>
    <el-table-column label="头像">
<!--   scope.row得到当前行对应的数组里面的对象   -->
      <template #default="scope">
        <el-avatar :src="scope.row.imgUrl"></el-avatar>
      </template>
    </el-table-column>
    <el-table-column label="管理员">
      <template #default="scope">
        <el-switch v-model="scope.row.isAdmin"></el-switch>
      </template>
    </el-table-column>
    <el-table-column prop="createTime" label="创建时间"></el-table-column>
    <el-table-column label="操作">
      <template #default="scope">
        <el-button type="danger">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script setup>
  import {ref} from "vue";

  const arr = ref([{
    "id":12,
    "nickName":"汤姆",
    "userName":"tom",
    "isAdmin":true,
    "imgUrl":"/imgs/head.jpg",
    "createTime":"2023/03/31 00:43:52"
  },
    {
      "id":13,
      "nickName":"刘德华",
      "userName":"ldh",
      "isAdmin":false,
      "imgUrl":"/imgs/a.jpg",
      "createTime":"2023/03/25 15:03:08"
    },
    {
      "id":17,
      "nickName":"杰瑞",
      "userName":"jerry",
      "isAdmin":false,
      "imgUrl":"/imgs/b.jpg",
      "createTime":"2023/05/11 20:40:44"
    }]);
</script>

<style scoped>

</style>