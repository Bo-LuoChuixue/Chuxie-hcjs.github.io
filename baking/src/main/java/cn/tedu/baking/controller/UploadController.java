package cn.tedu.baking.controller;

import cn.tedu.baking.response.JsonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class UploadController {
    @PostMapping("upload")
    public JsonResult upload(MultipartFile file) throws IOException {
        //得到文件的原始文件名   a.jpg
        String fileName = file.getOriginalFilename();
        //得到后缀   .jpg
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        //得到唯一文件名 UUID.randomUUID()得到一个16进制的唯一标识符
        //0455a878-b62f-4a98-90bb-2f6a5ab59392.jpg
        fileName = UUID.randomUUID()+suffix;
        System.out.println(fileName);
        String dirPath = "d:/files";
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("/yyyy/MM/dd/");
        String datePath = simpleDateFormat.format(new Date());
        //     d:/files/2023/11/18/
        File dirFile = new File(dirPath+datePath);
        //如果不存在则创建文件夹
        if (!dirFile.exists()){
            dirFile.mkdirs();//创建文件夹
        }
        //把文件保存到指定位置  d:/files/2023/11/18/xxxx.jpg  异常抛出
        file.transferTo(new File(dirPath+datePath+fileName));
        //把图片的相对路径响应给客户端   /2023/11/18/xxxx.jpg
        return JsonResult.ok(datePath+fileName);
    }

    @PostMapping("remove")
    public JsonResult remove(String url){
        //   d:/files/2023/11/18/xxx.jpg
        new File("d:/files"+url).delete();
        return JsonResult.ok();
    }
}
