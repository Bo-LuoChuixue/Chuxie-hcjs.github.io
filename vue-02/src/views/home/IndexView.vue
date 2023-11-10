<template>
  <el-carousel>
    <el-carousel-item v-for="url in bannerArr">
      <img :src="url" style="width: 100%;height: 100%">
    </el-carousel-item>
  </el-carousel>
  <!-- 商品列表开始 -->
  <el-row :gutter="20">
    <el-col style="margin: 10px 0" :span="6" v-for="p in productArr">
      <el-card>
        <!--    router-link 取代超链接, 好处是直接替换内容 而不是整个页面刷新    -->
        <router-link to="/detail">
          <img :src="p.url" style="width: 100%">
          <p style="font-size: 14px;height: 30px">{{p.title}}</p>
        </router-link>
        <p>
          <b>￥{{p.price}}</b><s>{{p.oldPrice}}</s>
          <span style="float: right">销量:{{p.saleCount}}件</span>
        </p>
      </el-card>
    </el-col>
  </el-row>
  <!-- 商品列表结束 -->
</template>

<script setup>
import {ref} from "vue";

const bannerArr = ref(["/imgs/b1.jpg", "/imgs/b2.jpg", "/imgs/b3.jpg", "/imgs/b4.jpg"])
const productArr = ref([{
  title: "森马牛仔裤女宽松慢跑裤运动风2022春季新款", price: 233, oldPrice: 598, url: "/imgs/a.jpg", saleCount: 2342},
  {title: "茵曼马甲连衣裙两件套春季新款娃娃领色织格长袖背心裙套装", price: 233, oldPrice: 598, url: "/imgs/b.jpg", saleCount: 2342},
  {title: "雪中飞墨绿色短袖t恤女夏2022新款纯棉半袖打底体恤夏季", price: 233, oldPrice: 598, url: "/imgs/c.jpg", saleCount: 2342},
  {title: "【佟丽娅同款】鸭鸭明星同款羽绒服2021年冬季新款时尚", price: 233, oldPrice: 598, url: "/imgs/d.jpg", saleCount: 2342},
  {title: "BEASTER小恶魔鬼脸明星同款夹克毛绒保暖加厚字母印花", price: 233, oldPrice: 598, url: "/imgs/e.jpg", saleCount: 2342},
  {title: "香影毛呢外套女中长款2021年冬季新款气质韩版娃娃领", price: 233, oldPrice: 598, url: "/imgs/f.jpg", saleCount: 2342},
  {title: "SEMIR森马商场同款打底针织毛衣纯色高领新品显瘦", price: 233, oldPrice: 598, url: "/imgs/g.jpg", saleCount: 2342},
  {title: "美特斯邦威女MTEE 贺岁系列中长款风衣736598", price: 233, oldPrice: 598, url: "/imgs/h.jpg", saleCount: 2342},
  {title: "imone2021秋款黑色小西装外套女韩版学生宽松学", price: 233, oldPrice: 598, url: "/imgs/i.jpg", saleCount: 2342},
  {title: "BEASTER 小恶魔明星同款保暖长袖街头潮流连帽卫", price: 233, oldPrice: 598, url: "/imgs/j.jpg", saleCount: 2342},
  {title: "憨厚皇后100%绵羊皮2021秋海宁真皮皮衣女长款修", price: 233, oldPrice: 598, url: "/imgs/k.jpg", saleCount: 2342},
  {title: "美特斯邦威高腰牛仔裤女宽松小脚新款春秋彩色", price: 233, oldPrice: 598, url: "/imgs/a.jpg", saleCount: 2342}])

</script>

<style scoped>

</style>