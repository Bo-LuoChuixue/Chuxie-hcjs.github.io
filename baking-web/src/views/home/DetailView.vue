<template>
  <div style="width: 1200px;margin: 0 auto">
    <el-row :gutter="20">
      <el-col :span="18">
        <el-card>
          <h1 style="color: orange;text-align: center">棗泥花式麵包,隔壁小孩兒都饞哭了!</h1>
          <p style="color: #666;font-size: 12px;text-align: center">
            作者:傳奇哥 | 發布時間:2023/11/13 | 閱讀次數:2352
          </p>
          <hr>
          <el-card style="font-size:12px;color:#666">
            <span style="font-weight: bold;color: #0aa1ed">摘要:</span>
            這是文章的摘要內容...
          </el-card>
          <p style="height: 400px">正文內容</p>
        </el-card>
        <!--評論相關開始-->
        <el-card style="margin-top: 20px">
          <p>發一條友善的評論</p>
          <hr>
          <el-row :gutter="10">
            <el-col :span="22">
              <el-input placeholder="說點兒啥..."></el-input>
            </el-col>
            <el-col :span="2">
              <el-button>發布</el-button>
            </el-col>
          </el-row>
          <!--    列表開始     -->
          <el-row :gutter="10" v-for="item in 4">
            <el-col :span="2">
              <el-avatar style="margin-top:5px" src="/imgs/head.jpg"></el-avatar>
            </el-col>
            <el-col :span="22">
              <p style="color: orange;font-weight: bold;margin: 5px">傳奇哥</p>
              <p style="margin:0">看起來很好吃</p>
              <p style="font-size: 12px;color: #666;margin:0px">2023/11/13 16:30:20</p>
            </el-col>
          </el-row>
          <!--    列表結束     -->
        </el-card>
        <!--評論相關結束-->

      </el-col>
      <el-col :span="6">
        <el-card>
          <div id="head_div"></div>
          <div style="text-align: center;position: relative;bottom: 45px">
            <el-avatar src="/imgs/head.jpg" :size="90" style="border: 5px solid white"></el-avatar>
            <p style="font-size: 20px;font-weight: bold;margin: 0">傳奇哥</p>
            <el-icon>
              <Edit/>
            </el-icon>
            本文作者<br>
            <el-icon>
              <Clock/>
            </el-icon>
            2023/11/13
          </div>
        </el-card>
        <!--   作者其它文章開始    -->
        <el-card style="margin-top: 20px">
          <h2>作者其它文章</h2>
          <hr>
          <el-row :gutter="10" v-for="item in 4">
            <el-col :span="10">
              <img src="/imgs/a.jpg" style="width: 100%">
            </el-col>
            <el-col :span="14">
              <p style="height: 40px;margin: 0">文章的標題</p>
              <p style="font-size: 12px;color: #666">2023/11/13</p>
            </el-col>
          </el-row>
        </el-card>
        <!--   作者其它文章結束    -->
        <!--   熱門文章開始    -->
        <el-card style="margin-top: 20px">
          <h2>熱門文章</h2>
          <hr>
          <el-row :gutter="10" v-for="item in 4">
            <el-col :span="10">
              <img src="/imgs/a.jpg" style="width: 100%">
            </el-col>
            <el-col :span="14">
              <p style="height: 40px;margin: 0">文章的標題</p>
              <p style="font-size: 12px;color: #666">2023/11/13</p>
            </el-col>
          </el-row>
        </el-card>
        <!--   熱門文章結束    -->

      </el-col>
    </el-row>
  </div>
</template>

<script setup>

</script>

<style scoped>
#head_div {
  background-image: url('/public/imgs/avarbg.jpg');
  height: 90px;
}
</style>