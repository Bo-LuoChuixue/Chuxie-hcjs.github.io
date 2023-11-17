package cn.tedu.weibo.pojo.dto;

import lombok.Data;

/**
 * 登錄功能的DTO類
 */

@Data
public class UserLoginDTO {
    private String username;
    private String password;
}
