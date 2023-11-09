<script>
export default {
  name: "WView"
}
</script>

<template>
  <h1>走马灯组件</h1>
  <el-carousel trigger="click">
    <el-carousel-item><img src="b1.jpg" style="width: 100%"></el-carousel-item>
    <el-carousel-item><img src="b2.jpg" style="width: 100%"></el-carousel-item>
    <el-carousel-item><img src="b3.jpg" style="width: 100%"></el-carousel-item>
    <el-carousel-item><img src="b4.jpg" style="width: 100%"></el-carousel-item>
  </el-carousel>

  <h2>卡片式</h2>
  <div style="width: 800px;margin: 0 auto">
    <el-carousel trigger="click" type="card">
      <el-carousel-item><img src="b1.jpg" style="width: 100%"></el-carousel-item>
      <el-carousel-item><img src="b2.jpg" style="width: 100%"></el-carousel-item>
      <el-carousel-item><img src="b3.jpg" style="width: 100%"></el-carousel-item>
      <el-carousel-item><img src="b4.jpg" style="width: 100%"></el-carousel-item>
    </el-carousel>
  </div>

  <h2>垂直卡片式</h2>
  <div style="width: 800px;margin: 0 auto">
    <el-carousel trigger="click" type="card" direction="vertical">
      <el-carousel-item><img src="b1.jpg" style="width: 100%"></el-carousel-item>
      <el-carousel-item><img src="b2.jpg" style="width: 100%"></el-carousel-item>
      <el-carousel-item><img src="b3.jpg" style="width: 100%"></el-carousel-item>
      <el-carousel-item><img src="b4.jpg" style="width: 100%"></el-carousel-item>
    </el-carousel>
  </div>
</template>

<style scoped>

</style>