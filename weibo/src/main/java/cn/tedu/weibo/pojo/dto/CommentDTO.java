package cn.tedu.weibo.pojo.dto;

import lombok.Data;

/**
 * 發表評論DTO類
 */

@Data
public class CommentDTO {
    //微博id,評論內容,用戶id
    private Long weiboId;
    private String content;
    private Long userId;
}








