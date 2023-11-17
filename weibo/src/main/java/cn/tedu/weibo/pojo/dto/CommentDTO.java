package cn.tedu.weibo.pojo.dto;

import lombok.Data;

/**
 * 發表評論DTO類
 */

@Data
public class CommentDTO {
    private Long weiboId;
    private String content;
    private Long userId;
}
