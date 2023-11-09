<script>
export default {
  name: "YView"
}
</script>

<template>
  <h1>卡片组件</h1>
  <el-row :gutter="10">
    <el-col v-for="item in 4" :span="6">
      <el-card>
        <img src="Sulli.jpg" style="width: 100%">
        <p>崔雪莉</p>
        <div style="font-size: 12px;color: #666;text-align: left">
          身高:1.70米
          <span style="float: right">体重: 96斤</span>
        </div>
      </el-card>
    </el-col>
  </el-row>
</template>

<style scoped>

</style>