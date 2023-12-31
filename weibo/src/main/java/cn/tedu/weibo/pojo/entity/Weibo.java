package cn.tedu.weibo.pojo.entity;

import lombok.Data;
import java.util.Date;

/**
 * 微博表實體類
 */

@Data
public class Weibo {
    private Long id;
    private String content;
    private Date created;
    private Long userId;
}
