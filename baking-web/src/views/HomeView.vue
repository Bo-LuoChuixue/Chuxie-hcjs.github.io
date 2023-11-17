<template>
  <el-container>
    <!--el-header的高度不能通過css樣式 必須使用height屬性-->

    <el-header style="background-color: white" height="80px">
      <div style="width: 1200px;margin: 0 auto">
        <el-row :gutter="10">
          <el-col :span="6">
            <router-link to="/">
              <img src="/imgs/icon.png" width="200">
            </router-link>

          </el-col>
          <el-col :span="10">
            <el-menu mode="horizontal" active-text-color="orange">
              <el-menu-item index="1">食譜</el-menu-item>
              <el-menu-item index="2">視頻</el-menu-item>
              <el-menu-item index="3">資訊</el-menu-item>
            </el-menu>
          </el-col>
          <el-col :span="6">
            <el-input style="position: relative;top: 20px" placeholder="請輸入搜索的內容">
              <template #append>
                <el-button @click="search()" :icon="Search"/>
              </template>
            </el-input>
          </el-col>
          <el-col :span="2">
            <el-popover v-if="user==null"
                        placement="bottom"
                        title="歡迎訪問烘焙坊"
                        :width="200" trigger="hover"
            >
              <template #reference>
                <el-icon style="position: relative;top: 20px"
                         size="25">
                  <User/>
                </el-icon>
              </template>
              <div style="text-align: center">
                <el-button type="info" @click="reg()">註冊</el-button>
                <el-button type="warning" @click="login()">登錄</el-button>
              </div>
            </el-popover>
            <el-popover v-else
                        placement="bottom"
                        title="歡迎訪問烘焙坊"
                        :width="200" trigger="hover"
            >
              <template #reference>
                <el-icon style="position: relative;top: 20px"
                         size="25">
                  <User/>
                </el-icon>
              </template>
              <div style="text-align: center">
                <el-button type="info" @click="router.push('/personal')">個人中心</el-button>
                <el-button type="warning" @click="logout()">退出登錄</el-button>
                <el-button type="danger" @click="router.push('/admin')">後台管理頁面</el-button>
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
            <p>教程靈感就看烘焙坊</p>
            <p>烘焙行業網絡社區平台</p>
            <p>全國百城上千個職位等你來</p>
          </el-col>
          <el-col :span="8" id="footer-center">
            <el-row :gutter="10">
              <el-col :span="8">
                <h3>關於我們</h3>
                <p>烘焙學院</p>
                <p>烘焙食譜</p>
                <p>分類信息</p>
                <p>求職招聘</p>
                <p>社區交流</p>
              </el-col>
              <el-col :span="8">
                <h3>服務與支持</h3>
                <p>聯繫我們</p>
                <p>廣告投放</p>
                <p>用戶協議</p>
                <p>友情鏈接</p>
                <p>在線反饋</p>
              </el-col>
              <el-col :span="8">
                <h3>底部導航</h3>
                <p>Archiver</p>
                <p>手機版</p>
                <p>小黑屋</p>
              </el-col>
            </el-row>
          </el-col>
          <el-col :span="8">
            <p style="font-size: 60px;color: orange;margin: 10px 0">烘焙<span
                style="color: #666">坊</span></p>
            <p>烘焙行業網絡社區平台</p>
          </el-col>
        </el-row>
      </div>
    </el-footer>
  </el-container>
</template>

<script setup>
//導入搜索圖標  显示在按鈕裏面的圖標需要單獨導入
import {Search} from '@element-plus/icons-vue'
import router from "@/router";
import {ref} from "vue";

const logout = () => {
  if (confirm("您確認退出登錄嗎?")) {
    localStorage.clear();
    user.value = null;
  }
}

const user = ref(localStorage.user ? JSON.parse(localStorage.user) : null);

const reg = () => {
  router.push('/reg');//跳轉到註冊頁面
}
const login = () => {
  router.push('/login');//跳轉到登錄頁面
}
const search = () => {
  router.push('/list');
}
</script>
<style>
footer h3 {
  color: white;
}

#footer-center p {
  margin: 5px 0;
}
</style>
