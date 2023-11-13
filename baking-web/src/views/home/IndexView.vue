<template>
<div style="width: 1200px;margin: 0 auto">
  <el-carousel>
    <el-carousel-item><img src="/imgs/banner1.jpg" style="width: 100%"></el-carousel-item>
    <el-carousel-item><img src="/imgs/banner2.jpg" style="width: 100%"></el-carousel-item>
    <el-carousel-item><img src="/imgs/banner3.jpg" style="width: 100%"></el-carousel-item>
  </el-carousel>
<!-- 食谱相关开始 -->
  <el-row :gutter="10" style="background-color: white">
   <el-col :span="3">
     <p style="font-size: 28px;margin: 10px">烘焙食谱</p>
   </el-col>
   <el-col :span="21">
      <el-menu mode="horizontal" default-active="1" active-text-color="orange">
        <el-menu-item index="1">全部</el-menu-item>
        <el-menu-item index="2">面包</el-menu-item>
        <el-menu-item index="3">零食</el-menu-item>
      </el-menu>
   </el-col>
  </el-row>
<!-- 内容列表开始 -->
  <el-row :gutter="20">
   <el-col :span="6" style="margin-top: 10px" v-for="item in 4">
     <el-card>
       <router-link to="/detail" style="text-decoration: none;color: #333">
         <img src="/imgs/a.jpg" style="width: 100%;height: 150px">
         <p style="height: 40px">家常面包</p>
       </router-link>

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
<!-- 食谱相关结束 -->

  <!-- 视频相关开始 -->
  <el-row :gutter="10" style="margin-top:20px;background-color: white">
    <el-col :span="3">
      <p style="font-size: 28px;margin: 10px">烘焙视频</p>
    </el-col>
    <el-col :span="21">
      <el-menu mode="horizontal" default-active="1" active-text-color="orange">
        <el-menu-item index="1">全部</el-menu-item>
        <el-menu-item index="2">面包教学</el-menu-item>
        <el-menu-item index="3">零食教学</el-menu-item>
      </el-menu>
    </el-col>
  </el-row>
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
  <!-- 视频相关结束 -->

  <!-- 资讯相关开始 -->
  <el-row :gutter="10" style="margin-top:20px;background-color: white">
    <el-col :span="3">
      <p style="font-size: 28px;margin: 10px">行业资讯</p>
    </el-col>
    <el-col :span="21">
      <el-menu mode="horizontal" default-active="1" active-text-color="orange">
        <el-menu-item index="1">全部</el-menu-item>
        <el-menu-item index="2">美食资讯</el-menu-item>
        <el-menu-item index="3">店家资讯</el-menu-item>
      </el-menu>
    </el-col>
  </el-row>
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
  <!-- 资讯相关结束 -->
</div>
</template>

<script>

</script>

<style scoped>

</style>