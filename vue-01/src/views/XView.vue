<script>
export default {
  name: "XView"
}
</script>

<template>
  <h1>弹出框组件</h1>
  <!-- placement设置弹出位置 -->
  <el-popover
      placement="bottom"
      title="标题"
      :width="300"
      trigger="hover"
      content="弹出后显示的内容"
  >
    <template #reference>
      <el-button class="m-2">按钮</el-button>
    </template>
  </el-popover>
  <hr>
  <el-popover
      placement="bottom"
      title="欢迎访问xxx网站"
      :width="200" trigger="hover"
  >
    <template #reference>
      <el-icon size="50"><User /></el-icon>
    </template>
    <div style="text-align: center">
      <el-button type="info">注册</el-button>
      <el-button type="warning">登录</el-button>
    </div>
  </el-popover>
</template>

<style scoped>

</style>