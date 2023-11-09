<template>
<h1>员工列表练习</h1>
  <el-form label-width="100px">
    <el-form-item label="姓名">
      <el-input placeholder="员工姓名" v-model="emp.name"></el-input>
    </el-form-item>
    <el-form-item label="工资">
      <el-input placeholder="员工工资" v-model="emp.salary"></el-input>
    </el-form-item>
    <el-form-item label="工作">
      <el-input placeholder="员工工作" v-model="emp.job"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="add()">添加</el-button>
    </el-form-item>
  </el-form>
  <el-table :data="arr" border>
    <el-table-column type="index" label="编号" width="100"></el-table-column>
    <el-table-column prop="name" label="名字" ></el-table-column>
    <el-table-column prop="salary" label="工资" ></el-table-column>
    <el-table-column prop="job" label="工作"></el-table-column>
    <el-table-column label="操作">
        <template #default="scope">
             <el-button type="danger" @click="del(scope.$index,scope.row)">删除</el-button>
        </template>
    </el-table-column>
  </el-table>
</template>

<script setup>
  import {ref} from "vue";
  const del=(i,emp)=>{
    if (confirm("是否删除"+emp.name+"?")){
      arr.value.splice(i,1);
    }
  }

  const emp = ref({name:"",salary:"",job:""});
  const arr = ref([{name:"张三",salary:3000,job:"销售"},
    {name:"李四",salary:4000,job:"人事"},
    {name:"王五",salary:5000,job:"出纳"}]);
  const add=()=>{
    let newEmp={name:emp.value.name,salary:emp.value.salary,job:emp.value.job}
    arr.value.push(newEmp);
  }
</script>

<style scoped>

</style>