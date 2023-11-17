package cn.tedu.weibo.pojo.dto;

import lombok.Data;

/**
 * 發布微博的DTO類
 */

@Data
public class InsertWeiboDTO {
    //微博內容
    private String content;
    private Long userId;
}








