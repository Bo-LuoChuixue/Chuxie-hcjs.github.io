<template>
  <el-container>
    <el-header>
      <h1 style="background-color: #0aa1ed">后台管理页面</h1>
    </el-header>
    <el-container>
      <el-aside>
        <el-menu router>
          <el-menu-item index="/category">分类列表</el-menu-item>
          <el-menu-item index="/banner">轮播图列表</el-menu-item>
          <el-menu-item index="/product">商品列表</el-menu-item>
        </el-menu>
      </el-aside>
      <el-main>
        <router-view/>
      </el-main>
    </el-container>
  </el-container>
</template>
<script setup>
</script>