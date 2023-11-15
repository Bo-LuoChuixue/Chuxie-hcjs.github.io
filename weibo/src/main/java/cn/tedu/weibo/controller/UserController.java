package cn.tedu.weibo.controller;

import cn.tedu.weibo.pojo.dto.UserRegDTO;
import cn.tedu.weibo.response.JsonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @PostMapping("reg")
    public JsonResult reg(UserRegDTO userRegDTO){
        System.out.println("userRegDTO"+userRegDTO);
        return JsonResult.ok();
    }
}
