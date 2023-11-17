package cn.tedu.weibo.pojo.dto;

import lombok.Data;

/**
 * 发表评论DTO类
 */

@Data
public class CommentDTO {
    private Long weiboId;
    private String content;
    private Long userId;
}








