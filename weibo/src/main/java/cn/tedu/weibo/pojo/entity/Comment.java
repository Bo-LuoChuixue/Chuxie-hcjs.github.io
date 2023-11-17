package cn.tedu.weibo.pojo.entity;

import lombok.Data;
import java.util.Date;

/**
 * 評論表實體類
 */

@Data
public class Comment {
    private Long id;
    private String content;
    private Date created;
    private Long userId;
    private Long weiboId;
}
