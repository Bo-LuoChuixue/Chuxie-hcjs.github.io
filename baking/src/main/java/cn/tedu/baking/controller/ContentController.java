package cn.tedu.baking.controller;

import cn.tedu.baking.pojo.dto.ContentDTO;
import cn.tedu.baking.pojo.vo.ContentManagementVO;
import cn.tedu.baking.pojo.vo.ContentUpdateVO;
import cn.tedu.baking.response.JsonResult;
import cn.tedu.baking.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/contents")
public class ContentController {
    @Autowired
    IContentService service;
    @PostMapping("add-new")
    public JsonResult addNew(ContentDTO contentDTO){
        System.out.println("contentDTO = " + contentDTO);
        service.addNew(contentDTO);
        return JsonResult.ok();
    }
    @GetMapping("{type}/{userId}/management")
    public JsonResult listForManagement(@PathVariable Long type,
                                        @PathVariable Long userId){
        System.out.println("type = " + type + ", userId = " + userId);
        List<ContentManagementVO> list = service.listForManagement(type,userId);
        return JsonResult.ok(list);
    }
    @PostMapping("{id}/delete")
    public JsonResult deleteById(@PathVariable Long id){
        service.deleteById(id);
        return JsonResult.ok();
    }
    @GetMapping("{id}/update")
    public JsonResult getDetailForUpdate(@PathVariable Long id){
        ContentUpdateVO contentUpdateVO = service.getDetailForUpdate(id);
        return JsonResult.ok(contentUpdateVO);
    }
}
