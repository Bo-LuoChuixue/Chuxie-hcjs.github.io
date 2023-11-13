<template>
<el-container>
   <el-header>
     <div style="width: 1200px;margin: 0 auto">
       <el-row :gutter="10">
         <el-col :span="6">
           <img src="/imgs/icon.png" width="200">
         </el-col>
         <el-col :span="10">
           <el-menu mode="horizontal" active-text-color="orane">
               <el-menu-item index="1">食谱</el-menu-item>
               <el-menu-item index="2">视频</el-menu-item>
               <el-menu-item index="3">资讯</el-menu-item>
           </el-menu>
         </el-col>
         <el-col :span="6">
            <el-input style="position: relative;top: 20px" placeholder="输入要搜索的内容">
                <template #append>
                  <el-button :icon="Search"/>
                </template>
            </el-input>
         </el-col>
         <el-col :span="2">
           <el-popover placement="bottom" title="欢迎访问烘焙坊" :width="200" trigger="hover">
             <template #reference>
               <el-icon style="position: relative;top: 20px" size="25"><User /></el-icon>
             </template>
             <div style="text-align: center">
               <el-button type="info">注册</el-button>
               <el-button type="warning">登录</el-button>
             </div>
           </el-popover>
         </el-col>
       </el-row>
     </div>
   </el-header>
  <el-main>
    <router-view/>
  </el-main>
</el-container>
</template>

<script setup>
import {search} from '@element-plus/icons-vue'//导入搜索图标
</script>
