package cn.tedu.weibo.pojo.vo;

import lombok.Data;

/**
 * 微博首頁列表展示功能的VO類
 */

@Data
public class WeiboIndexVO {
    //微博id,微博內容,用戶昵稱
    private Long id;
    private String content;
    private String nickname;
}







