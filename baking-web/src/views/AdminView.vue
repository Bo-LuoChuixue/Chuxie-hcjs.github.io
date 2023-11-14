<template>
 <el-container>
   <el-header style="background-color: #336688;line-height: 60px" >
      <h1 style="font-size: 30px;color: white;margin: 0">烘焙坊后台管理系统
        <span style="float: right;font-size: 20px">欢迎XXX回来!
          <a href="">退出登录</a>
        </span>
      </h1>
   </el-header>
   <el-container>
     <el-aside width="200px">
        <el-menu router active-text-color="orange" style="padding: 20px;height: 100%">
          <img src="/imgs/icon.png" style="width: 150px">
          <el-menu-item index="/admin/user">
            <el-icon><User/></el-icon>用户管理
          </el-menu-item>
          <el-menu-item index="/admin/banner">
            <el-icon><Picture/></el-icon>轮播图管理
          </el-menu-item>
          <el-menu-item index="/admin/content">
            <el-icon><ChatLineSquare/></el-icon>内容管理
          </el-menu-item>
        </el-menu>
     </el-aside>
     <el-main>
       <router-view/>
     </el-main>
   </el-container>
 </el-container>
</template>
