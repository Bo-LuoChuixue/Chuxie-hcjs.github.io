<template>
  <el-table :data="arr">
    <el-table-column label="編號" type="index" width="60px"></el-table-column>
    <el-table-column label="標題" prop="title" width="150px"></el-table-column>
    <el-table-column label="封面" width="100px">
      <template #default="scope">
        <img :src="scope.row.imgUrl" style="width: 80px">
      </template>
    </el-table-column>
    <el-table-column label="摘要" prop="brief" width="300px"></el-table-column>
    <el-table-column label="分類" prop="categoryName" width="80px"></el-table-column>
    <el-table-column label="瀏覽量" prop="viewCount" width="80px"></el-table-column>
    <el-table-column label="評論量" prop="commentCount" width="80px"></el-table-column>
    <el-table-column label="創建時間" prop="createTime" width="180px"></el-table-column>
    <el-table-column label="操作" width="200px">
      <template #default="scope">
        <el-button type="success">編輯</el-button>
        <el-button type="danger">刪除</el-button>
      </template>
    </el-table-column>
  </el-table>
</template>

<script setup>
import {ref} from "vue";

const arr = ref([
  {
    "id": 11,
    "title": "入口即酥的超濃花生醬酥餅a",
    "brief": "花生醬+花生油=超濃郁花生香 沒有糖粉，用了白砂糖 本是入口即酥 卻又在酥后留下些許顆粒感 花生濃香",
    "imgUrl": "/imgs/a.jpg",
    "type": 1,
    "categoryName": "家常菜",
    "viewCount": 8,
    "commentCount": 0,
    "createTime": "2023/03/27 19:51:45"
  },
  {
    "id": 12,
    "title": "棗泥花式麵包,好吃到爆",
    "brief": "之前做了棗泥餡，配上花式麵包，好吃到爆。 棗泥花式麵包的用料 肉鬆麵包麵糰 見肉鬆麵包配方，棗泥",
    "imgUrl": "/imgs/b.jpg",
    "type": 1,
    "categoryName": "麵包",
    "viewCount": 1,
    "commentCount": 0,
    "createTime": "2023/03/28 16:12:42"
  },
  {
    "id": 13,
    "title": "酥脆培根吐司芝士卷，人見人愛",
    "brief": "人見人愛的培根平時一般都是放吐司裏面做三文治吃今天培根要露臉啦哈哈哈哈簡單快手酥脆可口的培根吐司芝士",
    "imgUrl": "/imgs/c.jpg",
    "type": 1,
    "categoryName": "家常菜",
    "viewCount": 1,
    "commentCount": 0,
    "createTime": "2023/03/28 16:15:43"
  },
  {
    "id": 14,
    "title": "開放式三明治,一份小清新快手早餐",
    "brief": " 昨夜下了很怕人的驟雨，清晨辦公桌上的薄荷微微抖動它的恭弘=叶 恭弘子。一份小清新快手早餐，讓生活簡潔不簡單。 ",
    "imgUrl": "/imgs/d.jpg",
    "type": 1,
    "categoryName": "小食",
    "viewCount": 1,
    "commentCount": 0,
    "createTime": "2023/03/28 16:16:24"
  },
  {
    "id": 15,
    "title": "核桃葡萄干軟歐：蔓越莓種面",
    "brief": "干，來款核桃葡萄干軟歐吧！核桃是個寶，好處太多，不一一列舉啦！ 蔓越莓種面的用料 主麵糰， 蔓越",
    "imgUrl": "/imgs/a.jpg",
    "type": 1,
    "categoryName": "麵包",
    "viewCount": 2,
    "commentCount": 0,
    "createTime": "2023/03/28 16:16:56"
  },
  {
    "id": 16,
    "title": "蔓越莓綠豆糕，味道還不錯值得一試!",
    "brief": "全家都很喜歡吃綠豆糕，但樓下甜品店的綠豆糕太甜了，那就自己動手做吧。之前嘗試過帶皮綠豆，顏色做出來沒",
    "imgUrl": "/imgs/b.jpg",
    "type": 1,
    "categoryName": "麵包",
    "viewCount": 4,
    "commentCount": 0,
    "createTime": "2023/03/28 16:17:35"
  },
  {
    "id": 17,
    "title": "心形火龍果椰蓉麵包,任誰都抗拒不了",
    "brief": "椰蓉的香味 任誰都抗拒不了吧正好還有半個紅心火龍果做成了***嫩的小愛心麵包可愛又好吃可以做9個。 ",
    "imgUrl": "/imgs/c.jpg",
    "type": 1,
    "categoryName": "小食",
    "viewCount": 15,
    "commentCount": 1,
    "createTime": "2023/03/28 16:18:12"
  },
  {
    "id": 18,
    "title": "爆漿抹茶甜甜圈麵包，自帶幸福感的小甜甜",
    "brief": "爆漿抹茶甜甜圈麵包好吃的起飛的爆漿抹茶甜甜圈，从里到外被抹茶包裹着，自帶幸福感的小甜甜，抹茶控們完全",
    "imgUrl": "/imgs/d.jpg",
    "type": 1,
    "categoryName": "家常菜",
    "viewCount": 15,
    "commentCount": 1,
    "createTime": "2023/03/28 16:20:26"
  }
]);
</script>

<style scoped>

</style>