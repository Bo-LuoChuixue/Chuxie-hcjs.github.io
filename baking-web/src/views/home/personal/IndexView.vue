<script>
export default {
  name: "IndexView"
}
</script>

<template>
  <el-card>
    <el-form label-width="100px" style="width: 500px">
      <el-form-item label="头像"></el-form-item>
      <el-form-item label="昵称">
        <el-input placeholder="请输入昵称"></el-input>
      </el-form-item>
      <el-form-item label="用户名">
        <el-input value="tom" disabled></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary">保存修改</el-button>
      </el-form-item>
    </el-form>
  </el-card>
</template>

<style scoped>

</style>