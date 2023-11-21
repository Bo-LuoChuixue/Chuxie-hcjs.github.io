<template>
<el-card>
  <h1>稿件管理页面</h1>
  <el-radio-group v-model="type" @change="loadContents()">
    <el-radio-button label="1">烘焙食谱</el-radio-button>
    <el-radio-button label="2">烘焙视频</el-radio-button>
    <el-radio-button label="3">行业资讯</el-radio-button>
  </el-radio-group>
  <el-button style="position: relative;top: 4px;left: 10px" @click="post()">发布内容</el-button>
<!-- 从ContentView里面copy下面的表格 -->
  <el-table :data="arr">
    <el-table-column label="编号" type="index" width="60px"></el-table-column>
    <el-table-column label="标题" prop="title" width="150px"></el-table-column>
    <el-table-column label="封面" width="100px">
      <template #default="scope">
<!--此处访问的是Vue实例中的全局变量和方法, 无法直接访问window实例中的内容-->

        <img :src="BASE_URL+scope.row.imgUrl" style="width: 80px">
      </template>
    </el-table-column>
    <el-table-column label="摘要" prop="brief" width="300px"></el-table-column>
    <el-table-column label="分类" prop="categoryName" width="80px"></el-table-column>
    <el-table-column label="浏览量" prop="viewCount" width="80px"></el-table-column>
    <el-table-column label="评论量" prop="commentCount" width="80px"></el-table-column>
    <el-table-column label="创建时间" prop="createTime" width="180px"></el-table-column>
    <el-table-column label="操作" width="200px" fixed="right">
      <template #default="scope">
        <el-button type="success" @click="update(scope.row)">编辑</el-button>
        <el-button type="danger" @click="del(scope.$index,scope.row)">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
</el-card>
</template>

<script setup>
import {onMounted, ref} from "vue";
import router from "@/router";
import axios from "axios";
import {ElMessage} from "element-plus";
const type=ref(1);

const post=()=>{
  router.push('/personal/post');
}
const arr = ref([]);

const update = (c)=>{
  router.push('/personal/post?id='+c.id);
}
const del = (i,c)=>{
  if (confirm("您确定要删除此内容吗?")){
    axios.post(BASE_URL+'/v1/contents/'+c.id+'/delete').then((response)=>{
      if (response.data.code==2001){
        ElMessage.success("删除完成!");
        //从数组中删除内容, 页面会自动跟着改变
        arr.value.splice(0,1);
      }
    })
  }
}

const loadContents=()=>{
  let user = getUser();
  //发出获取内容列表的请求
  axios.get(BASE_URL+'/v1/contents/'+type.value+'/'+user.id+'/management')
      .then((response)=>{
        if (response.data.code==2001){
          arr.value = response.data.data;
        }
      })
}
onMounted(()=>{
  loadContents();
})

</script>

<style scoped>

</style>