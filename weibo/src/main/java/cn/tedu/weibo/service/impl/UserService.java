package cn.tedu.weibo.service.impl;

import cn.tedu.weibo.exception.ServiceException;
import cn.tedu.weibo.mapper.UserMapper;
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
        UserVO userVO=mapper.selectByUsername(userRegDTO.getUsername());
        if (userVO!=null){
            throw new ServiceException(StatusCode.USERNAME_ALREADY_EXISTS);
        }
        User user=new User();
        BeanUtils.copyProperties(userRegDTO,user);
        user.setCreated(new Date());
        mapper.insert(user);
    }
}
