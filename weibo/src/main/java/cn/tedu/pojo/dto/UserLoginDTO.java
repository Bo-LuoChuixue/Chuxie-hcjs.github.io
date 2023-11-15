package cn.tedu.pojo.dto;

import lombok.Data;

/**
 * 登录功能的DTO类
 */

@Data
public class UserLoginDTO {
    private String username;
    private String password;
}
