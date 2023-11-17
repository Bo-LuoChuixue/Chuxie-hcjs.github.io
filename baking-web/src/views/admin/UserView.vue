<template>
  <el-table :data="arr">
    <el-table-column type="index" label="編號" width="60px"></el-table-column>
    <el-table-column prop="userName" label="用戶名"></el-table-column>
    <el-table-column prop="nickName" label="昵稱"></el-table-column>
    <el-table-column label="頭像">
      <!--   scope.row得到當前行對應的數組裡面的對象   -->
      <template #default="scope">
        <el-avatar :src="scope.row.imgUrl"></el-avatar>
      </template>
    </el-table-column>
    <el-table-column label="管理員">
      <template #default="scope">
        <el-switch v-model="scope.row.isAdmin"></el-switch>
      </template>
    </el-table-column>
    <el-table-column prop="createTime" label="創建時間"></el-table-column>
    <el-table-column label="操作">
      <template #default="scope">
        <el-button type="danger">刪除</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script setup>
import {ref} from "vue";

const arr = ref([{
  "id": 12,
  "nickName": "湯姆",
  "userName": "tom",
  "isAdmin": true,
  "imgUrl": "/imgs/head.jpg",
  "createTime": "2023/03/31 00:43:52"
},
  {
    "id": 13,
    "nickName": "劉德華",
    "userName": "ldh",
    "isAdmin": false,
    "imgUrl": "/imgs/a.jpg",
    "createTime": "2023/03/25 15:03:08"
  },
  {
    "id": 17,
    "nickName": "傑瑞",
    "userName": "jerry",
    "isAdmin": false,
    "imgUrl": "/imgs/b.jpg",
    "createTime": "2023/05/11 20:40:44"
  }]);
</script>

<style scoped>

</style>