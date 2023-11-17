package cn.tedu.weibo.controller;

import cn.tedu.weibo.pojo.dto.InsertWeiboDTO;
import cn.tedu.weibo.pojo.vo.WeiboDetailVO;
import cn.tedu.weibo.pojo.vo.WeiboIndexVO;
import cn.tedu.weibo.response.JsonResult;
import cn.tedu.weibo.service.IWeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    @GetMapping("")  // localhost:8080/v1/weibos
    public JsonResult listForIndex(){
        List<WeiboIndexVO> list = service.listForIndex();
        //把从数据库中查询到的装着微博对象的list集合响应给客户端
        return JsonResult.ok(list);
    }
    // localhost:8080/v1/weibos/210
    @GetMapping("{id}")
    public JsonResult detailById(@PathVariable Long id){
        System.out.println("id = " + id);
        WeiboDetailVO weiboDetailVO = service.detailById(id);

        return JsonResult.ok(weiboDetailVO);
    }

}
