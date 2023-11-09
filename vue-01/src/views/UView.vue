<script setup>

</script>

<template>
<h1>布局组件</h1>

    <h3>两等分</h3>
    <el-row>
        <el-col :span="12"><div class="c1"></div></el-col>
        <el-col :span="12"><div class="c1"></div></el-col>
    </el-row>
  <h3>六等分</h3>
  <el-row :gutter="10">
  <el-col :span="4"><div class="c1"></div></el-col>
  <el-col :span="4"><div class="c1"></div></el-col>
  <el-col :span="4"><div class="c1"></div></el-col>
  <el-col :span="4"><div class="c1"></div></el-col>
  <el-col :span="4"><div class="c1"></div></el-col>
  <el-col :span="4"><div class="c1"></div></el-col>
  </el-row>
  <h3>1:2:3</h3>
  <el-row :gutter="10">
  <el-col :span="4"><div class="c1"></div></el-col>
  <el-col :span="8"><div class="c1"></div></el-col>
  <el-col :span="12"><div class="c1"></div></el-col>
  </el-row>
  <h3>两等分并居中</h3>
  <div style="width: 1200px;margin: 0 auto">
    <el-row>
      <el-col :span="12"><div class="c1"></div></el-col>
      <el-col :span="12"><div class="c1"></div></el-col>
    </el-row>
  </div>
  <h3>列偏移</h3>
  <el-row>
    <el-col :span="20" :offset="4"><div class="c1"></div></el-col>
  </el-row>
  <h3>嵌套(可以嵌套无数层)</h3>
  <el-row>
    <el-col :span="12"><div class="c1"></div></el-col>
    <el-col :span="12">
      <el-row>
        <el-col :span="12"><div class="c1"></div></el-col>
        <el-col :span="12">
          <el-row>
            <el-col v-for="item in 24" :span="1"><div class="c1">{{item}}</div></el-col>
          </el-row>
        </el-col>
      </el-row>
    </el-col>
  </el-row>
</template>

<style scoped>
.c1{height: 50px;border: 1px solid red;border-radius: 2px}
</style>