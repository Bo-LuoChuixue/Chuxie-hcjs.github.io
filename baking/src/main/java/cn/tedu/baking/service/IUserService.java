package cn.tedu.baking.service;

import cn.tedu.baking.pojo.dto.UserLoginDTO;
import cn.tedu.baking.pojo.dto.UserRegDTO;
import cn.tedu.baking.pojo.dto.UserUpdateDTO;
import cn.tedu.baking.pojo.vo.UserVO;

public interface IUserService {
    void reg(UserRegDTO userRegDTO);

    UserVO login(UserLoginDTO userLoginDTO);

    void update(UserUpdateDTO userUpdateDTO);
}
