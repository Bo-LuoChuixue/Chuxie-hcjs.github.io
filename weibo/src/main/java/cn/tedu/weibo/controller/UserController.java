package cn.tedu.weibo.controller;

import cn.tedu.weibo.pojo.dto.UserLoginDTO;
import cn.tedu.weibo.pojo.dto.UserRegDTO;
import cn.tedu.weibo.pojo.vo.UserVO;
import cn.tedu.weibo.response.JsonResult;
import cn.tedu.weibo.response.StatusCode;
import cn.tedu.weibo.service.IUserService;
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
    public JsonResult reg(UserRegDTO userRegDTO) {
        service.reg(userRegDTO);
        return JsonResult.ok();
    }

    @PostMapping("login")
    public JsonResult login(UserLoginDTO userLoginDTO) {
        //System.out.println("userLoginDTO = " + userLoginDTO);
        UserVO userVO = service.login(userLoginDTO);
        //把登錄成功的用戶信息響應給客戶端
        return new JsonResult(StatusCode.LOGIN_SUCCESS, userVO);
    }
}
