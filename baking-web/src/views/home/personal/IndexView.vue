<template>
  <el-card>
    <el-form label-width="100px" style="width: 500px">
      <el-form-item label="頭像">
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
      <el-form-item label="昵稱">
        <el-input placeholder="請輸入昵稱"></el-input>
      </el-form-item>
      <el-form-item label="用戶名">
        <el-input value="tom" disabled></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary">保存修改</el-button>
      </el-form-item>
    </el-form>
  </el-card>

</template>

<script setup>
/*********上傳相關開始**********/
import {ref} from 'vue'
import {Plus} from '@element-plus/icons-vue'

import {UploadProps, UploadUserFile} from 'element-plus'

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
</script>

<style scoped>

</style>