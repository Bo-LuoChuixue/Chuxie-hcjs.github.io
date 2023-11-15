package cn.tedu.weibo.controller;

import cn.tedu.weibo.mapper.UserMapper;
import cn.tedu.weibo.pojo.dto.UserRegDTO;
import cn.tedu.weibo.pojo.entity.User;
import cn.tedu.weibo.pojo.vo.UserVO;
import cn.tedu.weibo.response.JsonResult;
import cn.tedu.weibo.response.StatusCode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired
    UserMapper mapper;

    @PostMapping("reg")
    public JsonResult reg(UserRegDTO userRegDTO) {
        System.out.println("userRegDTO = " + userRegDTO);
        UserVO userVO=mapper.selectByUsername(userRegDTO.getUsername());
        if (userVO!=null){
            return new JsonResult(StatusCode.USERNAME_ALREADY_EXISTS);
        }
        User user=new User();
        BeanUtils.copyProperties(userRegDTO,user);
        user.setCreated(new Date());
        mapper.insert(user);
        return JsonResult.ok();
    }
}
