package cn.tedu.weibo.controller;

import cn.tedu.weibo.pojo.dto.InsertWeiboDTO;
import cn.tedu.weibo.response.JsonResult;
import cn.tedu.weibo.service.IWeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weibos")
public class WeiboController {
    @Autowired
    IWeiboService service;
    @PostMapping("add-new")
    public JsonResult addNew(InsertWeiboDTO weiboDTO){
        System.out.println("weiboDTO = " + weiboDTO);
        service.addNew(weiboDTO);
        return JsonResult.ok();
    }
}
