<template>
  <el-container>
    <el-header style="width: 1200px;margin: 0 auto">
      <el-menu mode="horizontal" background-color="#0aa1ed"
               active-text-color="orange"
               text-color="#fff">
        <el-menu-item index="1">精彩活动</el-menu-item>
        <el-menu-item index="2">精品女装</el-menu-item>
        <el-menu-item index="3">品牌男装</el-menu-item>
        <el-menu-item index="4">母婴产品</el-menu-item>
        <el-menu-item index="5">数码科技</el-menu-item>
      </el-menu>
    </el-header>
    <el-main>
  <!--  此routerView用来展示首页商品列表和详情    -->
      <router-view/>
    </el-main>
    <el-footer>共用的脚</el-footer>
  </el-container>
</template>

<script>

</script>
