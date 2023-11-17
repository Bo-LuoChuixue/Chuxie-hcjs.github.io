package cn.tedu.baking.pojo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private String imgUrl;
    private Integer isAdmin;
    private Date createTime;


}
