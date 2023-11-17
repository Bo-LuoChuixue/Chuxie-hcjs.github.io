package cn.tedu.weibo.controller;

import cn.tedu.weibo.pojo.dto.CommentDTO;
import cn.tedu.weibo.response.JsonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/comments")
public class CommentController {
    @PostMapping("add-new")
    public JsonResult addNew(CommentDTO commentDTO) {
        System.out.println("commentDTO = " + commentDTO);
        return JsonResult.ok();
    }
}
