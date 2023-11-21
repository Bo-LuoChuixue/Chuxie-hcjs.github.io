package cn.tedu.baking.pojo.dto;

import lombok.Data;

@Data
public class ContentDTO {
    private Long id;//新增没有值, 修改有值
    private String title;
    private String content;
    private String brief;
    private Long type;
    private Long categoryId;
    private String imgUrl;
    private Long createBy;
    private String videoUrl;

}
