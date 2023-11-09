<script setup>
import {ref} from "vue";
const handleDelete = (i,emp)=>{
  if (confirm("是否删除"+emp.name+"?")){
    arr.value.splice(i,1);
  }
}

const tableData = [
  {
    date: '2016-05-03',
    name: 'Tom',
    address: 'No. 189, Grove St, Los Angeles',
  },
  {
    date: '2016-05-02',
    name: 'Tom',
    address: 'No. 189, Grove St, Los Angeles',
  },
  {
    date: '2016-05-04',
    name: 'Tom',
    address: 'No. 189, Grove St, Los Angeles',
  },
  {
    date: '2016-05-01',
    name: 'Tom',
    address: 'No. 189, Grove St, Los Angeles',
  },
]

const arr=ref([{name:"张三",salary:3000,job:"销售"},
  {name:"李四",salary:4000,job:"人事"},
  {name:"王五",salary:5000,job:"出纳"}]);
</script>

<template>
  <h1>表格组件</h1>
  <el-table :data="tableData" style="width: 100%">
    <el-table-column prop="date" label="Date" width="180" />
    <el-table-column prop="name" label="Name" width="180" />
    <el-table-column prop="address" label="Address" />
  </el-table>
  <h3>员工列表</h3>
  <el-table :data="arr" stripe border>
    <el-table-column prop="index" label="编号" width="100px"></el-table-column>
    <el-table-column prop="name" label="姓名"></el-table-column>
    <el-table-column prop="salary" label="薪水"></el-table-column>
    <el-table-column prop="job" label="工作"></el-table-column>
    <el-table-column label="Operations">
      <template #default="scope">
        <el-button size="small" type="danger"
                   @click="handleDelete(scope.$index, scope.row)"
        >Delete</el-button
        >
      </template>
    </el-table-column>
  </el-table>
</template>

<style scoped>

</style>