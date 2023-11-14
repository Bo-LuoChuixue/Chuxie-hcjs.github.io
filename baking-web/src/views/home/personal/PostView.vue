<template>
  <el-card>
    <h1 style="color: orange">发布内容页面</h1>
    <el-form label-width="100px">
      <el-form-item label="文章标题">
        <el-input v-model="c.title" placeholder="请输入文章标题"></el-input>
      </el-form-item>
      <el-form-item label="文章分类">
        <el-radio-group v-model="c.type">
          <el-radio-button label="1">烘焙食谱</el-radio-button>
          <el-radio-button label="2">烘焙视频</el-radio-button>
          <el-radio-button label="3">行业资讯</el-radio-button>
        </el-radio-group>
      </el-form-item>
      <el-form-item label="二级分类">
        <el-select placeholder="请选择">
          <el-option label="面包" value="1"></el-option>
          <el-option label="泡芙" value="2"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="封面"></el-form-item>
      <el-form-item label="文章内容"></el-form-item>
      <el-form-item><el-button type="primary">发布内容</el-button></el-form-item>
    </el-form>
  </el-card>
</template>

<script setup>
import {ref} from "vue";

const c = ref({title:"",type:1});
</script>

<style scoped>

</style>