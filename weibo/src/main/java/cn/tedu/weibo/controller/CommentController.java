package cn.tedu.weibo.controller;

import cn.tedu.weibo.pojo.dto.CommentDTO;
import cn.tedu.weibo.pojo.vo.CommentVO;
import cn.tedu.weibo.response.JsonResult;
import cn.tedu.weibo.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/comments")
public class CommentController {
    @Autowired
    ICommentService service;

    @PostMapping("add-new")
    public JsonResult addNew(CommentDTO commentDTO) {
        System.out.println("commentDTO = " + commentDTO);
        service.addNew(commentDTO);
        return JsonResult.ok();
    }

    @GetMapping("{id}")
    public JsonResult listById(@PathVariable Long id) {
        List<CommentVO> list = service.listById(id);
        return JsonResult.ok(list);
    }
}
