package cn.tedu.baking.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ContentManagementVO {
    private Long id;
    private String title;
    private String imgUrl;
    private String brief;
    private Long type;
    private String categoryName; //分类名称
    private Integer viewCount;
    private Integer commentCount;
    @JsonFormat(pattern = "yyyy/MM/dd",timezone = "GMT+8")
    private Date createTime;
}
