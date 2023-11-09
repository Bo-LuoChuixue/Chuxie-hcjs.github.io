<template>
<h1>消息提示</h1>
  <el-button @click="f(1)">消息1</el-button>
  <el-button @click="f(2)">消息2</el-button>
  <el-button @click="f(3)">消息3</el-button>
  <el-button @click="f(4)">消息4</el-button>
</template>

<script setup>
  import {ElMessage} from 'element-plus'
  const f=(x)=>{
    switch (x) {
      case 1:ElMessage("普通消息");
        break;
      case 2:ElMessage.success("成功消息");
        break;
      case 3:ElMessage.warning("警告消息");
        break;
      case 4:ElMessage.error("错误消息");
        break;
    }
  }
</script>

<style scoped>

</style>