<template>
<div style="width: 1200px;margin: 0 auto">


<!-- 内容列表开始 -->
  <el-row :gutter="20">
   <el-col :span="6" style="margin-top: 10px" v-for="item in 4">
     <el-card>
       <img src="/imgs/a.jpg" style="width: 100%;height: 150px">
       <p style="height: 40px">家常面包</p>
       <el-row :gutter="10">
        <el-col :span="4">
          <el-avatar :size="30" src="/imgs/head.jpg"></el-avatar>
        </el-col>
        <el-col :span="16"><span style="font-size: 20px">传奇哥</span></el-col>
        <el-col :span="4">
          <span style="font-size: 16px;color: #666">面包</span>
        </el-col>
       </el-row>
     </el-card>
   </el-col>
  </el-row>
  <div style="text-align: center"><el-button>点击加载更多</el-button></div>
<!-- 内容列表结束 -->


</div>
</template>

<script>

</script>

<style scoped>

</style>