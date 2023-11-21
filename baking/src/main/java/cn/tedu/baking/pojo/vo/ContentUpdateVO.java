package cn.tedu.baking.pojo.vo;

import lombok.Data;

@Data
public class ContentUpdateVO {
    private Long id;
    private String content;
    private String title;
    private String imgUrl;
    private String videoUrl;
    private Long type;
    private Long categoryId;
}
