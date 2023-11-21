package cn.tedu.baking.controller;

import cn.tedu.baking.pojo.dto.UserLoginDTO;
import cn.tedu.baking.pojo.dto.UserRegDTO;
import cn.tedu.baking.pojo.dto.UserUpdateDTO;
import cn.tedu.baking.response.JsonResult;
import cn.tedu.baking.service.IUserService;
import com.sun.org.apache.bcel.internal.generic.JSR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired
    IUserService service;
    @PostMapping("reg")
    public JsonResult reg(UserRegDTO userRegDTO){
        service.reg(userRegDTO);
        return JsonResult.ok();
    }
    @PostMapping("login")
    public JsonResult login(UserLoginDTO userLoginDTO){

        return JsonResult.ok(service.login(userLoginDTO));
    }
    @PostMapping("update")
    public JsonResult update(UserUpdateDTO userUpdateDTO){
        System.out.println("userUpdateDTO = " + userUpdateDTO);
        service.update(userUpdateDTO);
        return JsonResult.ok();
    }
}
