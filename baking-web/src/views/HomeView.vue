<template>
<el-container>
<!--el-header的高度不能通过css样式 必须使用height属性-->

  <el-header style="background-color: white" height="80px">
    <div style="width: 1200px;margin: 0 auto">
      <el-row :gutter="10" >
        <el-col :span="6">
          <router-link to="/">
            <img src="/imgs/icon.png" width="200">
          </router-link>

        </el-col>
        <el-col :span="10">
          <el-menu mode="horizontal" active-text-color="orange">
            <el-menu-item index="1">食谱</el-menu-item>
            <el-menu-item index="2">视频</el-menu-item>
            <el-menu-item index="3">资讯</el-menu-item>
          </el-menu>
        </el-col>
        <el-col :span="6">
          <el-input style="position: relative;top: 20px" placeholder="请输入搜索的内容">
            <template #append>
              <el-button @click="search()" :icon="Search" />
            </template>
          </el-input>
        </el-col>
        <el-col :span="2">
          <el-popover
              placement="bottom"
              title="欢迎访问烘焙坊"
              :width="200" trigger="hover"
          >
            <template #reference>
              <el-icon style="position: relative;top: 20px"
                       size="25"><User /></el-icon>
            </template>
            <div style="text-align: center">
              <el-button type="info" @click="reg()">注册</el-button>
              <el-button type="warning" @click="login()">登录</el-button>
            </div>
          </el-popover>
        </el-col>
      </el-row>
    </div>

  </el-header>
  <el-main>
    <router-view/>
  </el-main>
  <el-footer style="background-color: rgb(47,50,52);height: 280px;padding: 50px 0">
    <div style="width: 1200px;margin: 0 auto;color: #666;text-align: center">
      <el-row :gutter="10">
       <el-col :span="8">
         <img src="/imgs/icon.png">
         <p>教程灵感就看烘焙坊</p>
         <p>烘焙行业网络社区平台</p>
         <p>全国百城上千个职位等你来</p>
       </el-col>
       <el-col :span="8" id="footer-center">
         <el-row :gutter="10">
          <el-col :span="8">
            <h3>关于我们</h3>
            <p>烘焙学院</p>
            <p>烘焙食谱</p>
            <p>分类信息</p>
            <p>求职招聘</p>
            <p>社区交流</p>
          </el-col>
          <el-col :span="8">
            <h3>服务与支持</h3>
            <p>联系我们</p>
            <p>广告投放</p>
            <p>用户协议</p>
            <p>友情链接</p>
            <p>在线反馈</p>
          </el-col>
          <el-col :span="8">
            <h3>底部导航</h3>
            <p>Archiver</p>
            <p>手机版</p>
            <p>小黑屋</p>
          </el-col>
         </el-row>
       </el-col>
       <el-col :span="8">
         <p style="font-size: 60px;color: orange;margin: 10px 0">烘焙<span
             style="color: #666">坊</span></p>
         <p>烘焙行业网络社区平台</p>
       </el-col>
      </el-row>
    </div>
  </el-footer>
</el-container>
</template>

<script setup>
//导入搜索图标  显示在按钮里面的图标需要单独导入
import {Search} from '@element-plus/icons-vue'
import router from "@/router";

const reg =()=>{
  router.push('/reg');//跳转到注册页面
}
const login =()=>{
  router.push('/login');//跳转到登录页面
}
const search =()=>{
  router.push('/list');
}
</script>
<style>
footer h3{
  color: white;
}
#footer-center p{
  margin: 5px 0;
}
</style>
