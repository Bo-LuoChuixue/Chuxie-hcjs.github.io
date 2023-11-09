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
    <el-footer style="background-color: #282c30;text-align: center;
color: #666;width: 1200px;margin: 0 auto;height: 200px;padding-top: 50px">
      <p>Copyright © 北京达内金桥科技有限公司版权所有 京ICP备12003709号-3 京公网安备 11010802029572号</p>
      <p>涵盖20余门课程体系，致力于打造权威的IT职业教育学习平台</p>
      <p>达内在线WWW.TMOOC.CN 专注于IT职业技能培训</p>
    </el-footer>
  </el-container>
</template>

<script>

</script>
