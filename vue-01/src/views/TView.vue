<script setup>
import {ElMessage} from "element-plus";

const handleSelect=(index)=>{
  console.log(index);
  if (index==5){
    ElMessage("点击了“免费课”")
  }
}
</script>

<template>
<h1>菜单组件</h1>
  <el-menu text-color="red" active-text-color="#fff" background-color="#0aa1ed" mode="horizontal" default-active="1" @select="handleSelect"><!-- mode="horizontal" 设置为横向，默认为纵向 default-active="x" 默认选中 -->
      <el-menu-item index="1">首页</el-menu-item>
      <el-menu-item index="2">直播课</el-menu-item>
      <el-menu-item index="3">线上课</el-menu-item>
      <el-menu-item index="4">脱产班</el-menu-item>
      <el-menu-item index="5">免费课</el-menu-item>
  </el-menu>
  <h3>侧栏</h3>
  <div style="width: 300px">
    <el-menu>
        <el-sub-menu index="1">
          <template #title>魏</template>
          <el-menu-item index="1-1">曹操</el-menu-item>
          <el-menu-item index="1-2">许褚</el-menu-item>
          <el-menu-item index="1-3">张辽</el-menu-item>
        </el-sub-menu>
      <el-sub-menu index="2">
        <template #title>蜀</template>
        <el-menu-item index="2-1">刘备</el-menu-item>
        <el-menu-item index="2-2">诸葛亮</el-menu-item>
        <el-menu-item index="2-3">刘谌</el-menu-item>
      </el-sub-menu>
      <el-sub-menu index="3">
        <template #title>吴</template>
        <el-menu-item index="3-1">孙权</el-menu-item>
        <el-menu-item index="3-2">周瑜</el-menu-item>
        <el-menu-item index="3-3">鲁肃</el-menu-item>
      </el-sub-menu>
    </el-menu>
  </div>
</template>

<style scoped>

</style>