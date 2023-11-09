<script>
export default {
  name: "VView"
}
</script>

<template>
  <h1>布局容器组件</h1>
  <el-container>
    <el-header>Header</el-header>
    <el-main>Main</el-main>
    <el-footer>Footer</el-footer>
  </el-container>
  <h2>上,下(左,右)</h2>
  <el-container>
    <el-header>Header</el-header>
    <el-container>
      <el-aside width="200px">Aside</el-aside>
      <el-main>Main</el-main>
    </el-container>
  </el-container>
  <h2>上,下(左,右(上,下))</h2>
  <el-container>
    <el-header>Header</el-header>
    <el-container>
      <el-aside width="200px">Aside</el-aside>
      <el-container>
        <el-main>Main</el-main>
        <el-footer>Footer</el-footer>
      </el-container>
    </el-container>
  </el-container>
</template>

<style scoped>
.el-aside{background-color: pink}
.el-header{background-color: red;}
.el-main{background-color: blue;height: 500px}
.el-footer{background-color: green}
</style>