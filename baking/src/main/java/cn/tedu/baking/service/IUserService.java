package cn.tedu.baking.service;

import cn.tedu.baking.pojo.dto.UserLoginDTO;
import cn.tedu.baking.pojo.dto.UserRegDTO;

public interface IUserService {
    void reg(UserRegDTO userRegDTO);

    void login(UserLoginDTO userLoginDTO);
}
