<template>
  <el-card>
    <h1 style="color: orange">發布內容頁面</h1>
    <el-form label-width="100px">
      <el-form-item label="文章標題">
        <el-input v-model="c.title" placeholder="請輸入文章標題"></el-input>
      </el-form-item>
      <el-form-item label="文章分類">
        <el-radio-group v-model="c.type">
          <el-radio-button label="1">烘焙食譜</el-radio-button>
          <el-radio-button label="2">烘焙視頻</el-radio-button>
          <el-radio-button label="3">行業資訊</el-radio-button>
        </el-radio-group>
      </el-form-item>
      <el-form-item label="二級分類">
        <el-select placeholder="請選擇" v-model="c.categoryId">
          <el-option label="麵包" value="1"></el-option>
          <el-option label="小食" value="2"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="封面">
        <!--    上傳組件開始    -->
        <el-upload
            v-model:file-list="fileList"
            action="https://run.mocky.io/v3/9d059bf9-4660-45f2-925d-ce80ad6c4d15"
            list-type="picture-card"
            :on-preview="handlePictureCardPreview"
            :on-remove="handleRemove"
        >
          <el-icon>
            <Plus/>
          </el-icon>
        </el-upload>
        <el-dialog v-model="dialogVisible">
          <img w-full :src="dialogImageUrl" alt="Preview Image"/>
        </el-dialog>
        <!--    上傳組件結束    -->

      </el-form-item>
      <el-form-item label="文章內容">
        <!--ref="xxx" 讓元素和某個變量進行關聯-->

        <div ref="editorContent"></div>
      </el-form-item>
      <el-form-item>
        <el-button type="primary">發布內容</el-button>
      </el-form-item>
    </el-form>
  </el-card>
</template>

<script setup>
import {onMounted, ref} from "vue";
import {Plus} from '@element-plus/icons-vue'
import {UploadProps, UploadUserFile} from 'element-plus'
//導入富文本編輯器    安裝指令: npm install wangeditor
import Editor from 'wangeditor';


const c = ref({title: "", type: 1, categoryId: ""});

/*********上傳相關開始**********/

const fileList = ref([])

const dialogImageUrl = ref('')
const dialogVisible = ref(false)

const handleRemove = (uploadFile, uploadFiles) => {
  console.log(uploadFile, uploadFiles)
}

const handlePictureCardPreview = (uploadFile) => {
  dialogImageUrl.value = uploadFile.url
  dialogVisible.value = true
}
/*********上傳相關結束**********/

/*富文本編輯器相關*/
const editorContent = ref(null); //此變量對應的是頁面中的div
let editor = null;
//此方法是VUE框架的一個聲明周期方法(從創建開始到銷毀過程中自動調用的方法),
// 此方法是在VUE框架掛載完成時觸發(可以理解為頁面加載完時)
onMounted(() => {
  //實例化富文本編輯器對象,需要用到頁面中的div
  editor = new Editor(editorContent.value);
  //設置佔位文本
  editor.config.placeholder = "請輸入內容詳情...";
  //將富文本編輯器渲染到頁面中
  editor.create();
});
</script>

<style scoped>

</style>