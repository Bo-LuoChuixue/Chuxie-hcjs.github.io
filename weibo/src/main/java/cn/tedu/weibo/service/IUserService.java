package cn.tedu.weibo.service;

import cn.tedu.weibo.pojo.dto.UserLoginDTO;
import cn.tedu.weibo.pojo.dto.UserRegDTO;

public interface IUserService {
    void reg(UserRegDTO userRegDTO);

    void login(UserLoginDTO userLoginDTO);
}
