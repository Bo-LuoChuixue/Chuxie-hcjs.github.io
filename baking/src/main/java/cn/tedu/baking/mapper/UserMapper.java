package cn.tedu.baking.mapper;

import cn.tedu.baking.pojo.entity.User;
import cn.tedu.baking.pojo.vo.UserVO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserVO selectByUsername(String username);

    int insert(User user);
}
