<template>
  <div style="width: 1200px;margin: 0 auto">
    <el-row :gutter="20">
     <el-col :span="18">
      <el-card>
        <h1 style="color: orange;text-align: center">枣泥花式面包,隔壁小孩儿都馋哭了!</h1>
        <p style="color: #666;font-size: 12px;text-align: center">
          作者:传奇哥 | 发布时间:2023/11/13 | 阅读次数:2352
        </p>
        <hr>
        <el-card style="font-size:12px;color:#666">
          <span style="font-weight: bold;color: #0aa1ed">摘要:</span>
          这是文章的摘要内容...
        </el-card>
        <p style="height: 400px">正文内容</p>
      </el-card>
<!--评论相关开始-->
       <el-card style="margin-top: 20px">
         <p>发一条友善的评论</p>
         <hr>
         <el-row :gutter="10">
           <el-col :span="22">
             <el-input placeholder="说点儿啥..."></el-input>
           </el-col>
           <el-col :span="2">
             <el-button>发布</el-button>
           </el-col>
         </el-row>
<!--    列表开始     -->
         <el-row :gutter="10" v-for="item in 4">
          <el-col :span="2">
            <el-avatar style="margin-top:5px" src="/imgs/head.jpg"></el-avatar>
          </el-col>
          <el-col :span="22">
            <p style="color: orange;font-weight: bold;margin: 5px">传奇哥</p>
            <p style="margin:0">看起来很好吃</p>
            <p style="font-size: 12px;color: #666;margin:0px">2023/11/13 16:30:20</p>
          </el-col>
         </el-row>
<!--    列表结束     -->
       </el-card>
<!--评论相关结束-->

     </el-col>
     <el-col :span="6">
       <el-card>
         <div id="head_div"></div>
         <div style="text-align: center;position: relative;bottom: 45px">
           <el-avatar src="/imgs/head.jpg" :size="90" style="border: 5px solid white"></el-avatar>
           <p style="font-size: 20px;font-weight: bold;margin: 0">传奇哥</p>
           <el-icon><Edit/></el-icon>本文作者<br>
           <el-icon><Clock/></el-icon>2023/11/13
         </div>
       </el-card>
        <!--   作者其它文章开始    -->
       <el-card style="margin-top: 20px">
         <h2>作者其它文章</h2>
         <hr>
         <el-row :gutter="10" v-for="item in 4">
          <el-col :span="10">
            <img src="/imgs/a.jpg" style="width: 100%">
          </el-col>
          <el-col :span="14">
            <p style="height: 40px;margin: 0">文章的标题</p>
            <p style="font-size: 12px;color: #666">2023/11/13</p>
          </el-col>
         </el-row>
       </el-card>
       <!--   作者其它文章结束    -->
       <!--   热门文章开始    -->
       <el-card style="margin-top: 20px">
         <h2>热门文章</h2>
         <hr>
         <el-row :gutter="10" v-for="item in 4">
           <el-col :span="10">
             <img src="/imgs/a.jpg" style="width: 100%">
           </el-col>
           <el-col :span="14">
             <p style="height: 40px;margin: 0">文章的标题</p>
             <p style="font-size: 12px;color: #666">2023/11/13</p>
           </el-col>
         </el-row>
       </el-card>
       <!--   热门文章结束    -->

     </el-col>
    </el-row>
  </div>
</template>

<script setup>

</script>

<style scoped>
#head_div{
  background-image: url('/public/imgs/avarbg.jpg');
  height: 90px;
}
</style>