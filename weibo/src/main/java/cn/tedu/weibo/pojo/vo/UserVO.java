package cn.tedu.weibo.pojo.vo;

import lombok.Data;

@Data
public class UserVO {
    /*
     *   1.註冊功能: id
     *   2.獲取當前用戶功能: nickname
     *   3.登錄功能: password
     */
    private Long id;
    private String password;
    private String nickname;
}
