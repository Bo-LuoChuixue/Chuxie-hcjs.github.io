package cn.tedu.weibo.service;

import cn.tedu.weibo.pojo.dto.UserLoginDTO;
import cn.tedu.weibo.pojo.dto.UserRegDTO;
import cn.tedu.weibo.pojo.vo.UserVO;

public interface IUserService {
    void reg(UserRegDTO userRegDTO);

    UserVO login(UserLoginDTO userLoginDTO);
}
