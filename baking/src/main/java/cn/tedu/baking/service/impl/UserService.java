package cn.tedu.baking.service.impl;

import cn.tedu.baking.exception.ServiceException;
import cn.tedu.baking.mapper.UserMapper;
import cn.tedu.baking.pojo.dto.UserRegDTO;
import cn.tedu.baking.pojo.entity.User;
import cn.tedu.baking.pojo.vo.UserVO;
import cn.tedu.baking.response.StatusCode;
import cn.tedu.baking.service.IUserService;
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
        if (userVO!=null){
            throw new ServiceException(StatusCode.USERNAME_ALREADY_EXISTS);
        }
        User user = new User();
        BeanUtils.copyProperties(userRegDTO,user);
        user.setCreateTime(new Date());
        user.setIsAdmin(0);//非管理员
        mapper.insert(user);
    }
}
