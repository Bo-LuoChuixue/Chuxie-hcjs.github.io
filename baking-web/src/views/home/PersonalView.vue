<template>
<div style="width: 1200px;margin: 0 auto">
  <el-row :gutter="20">
   <el-col :span="4">
     <el-menu router active-text-color="orange" style="height: 100%">
       <el-menu-item index="/personal/index">个人信息</el-menu-item>
       <el-menu-item index="/personal/management">稿件管理</el-menu-item>
     </el-menu>
   </el-col>
   <el-col :span="20"><router-view/></el-col>
  </el-row>
</div>
</template>

<script>
export default {
  name: "PersonalView"
}
</script>

<style scoped>

</style>