package cn.tedu.weibo.pojo.entity;

import lombok.Data;
import java.util.Date;

/**
 * 用戶表實體類
 */

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private Date created;
}
