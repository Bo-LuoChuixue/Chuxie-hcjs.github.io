package cn.tedu.weibo.service.impl;

import cn.tedu.weibo.exception.ServiceException;
import cn.tedu.weibo.mapper.UserMapper;
import cn.tedu.weibo.pojo.dto.UserLoginDTO;
import cn.tedu.weibo.pojo.dto.UserRegDTO;
import cn.tedu.weibo.pojo.entity.User;
import cn.tedu.weibo.pojo.vo.UserVO;
import cn.tedu.weibo.response.StatusCode;
import cn.tedu.weibo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper mapper;

    @Override
    public void reg(UserRegDTO userRegDTO) {
        UserVO userVO = mapper.selectByUsername(userRegDTO.getUsername());
        if (userVO != null) {
            throw new ServiceException(StatusCode.USERNAME_ALREADY_EXISTS);
        }
        User user = new User();
        BeanUtils.copyProperties(userRegDTO, user);
        user.setCreated(new Date());
        mapper.insert(user);
    }

    @Override
    public UserVO login(UserLoginDTO userLoginDTO) {
        UserVO userVO = mapper.selectByUsername(userLoginDTO.getUsername());
        if (userVO == null) { //用户名不存在
            throw new ServiceException(StatusCode.USERNAME_ERROR);
        }
        if (!userVO.getPassword().equals(userLoginDTO.getPassword())){ //密码错误
            throw new ServiceException(StatusCode.PASSWORD_ERROR);
        }
        return userVO;//把登陆成功的用户信息传递给UserController
    }
}
