package cn.tedu.baking.pojo.vo;

import lombok.Data;

@Data
public class UserVO {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String imgUrl;
    private Integer isAdmin;
}
