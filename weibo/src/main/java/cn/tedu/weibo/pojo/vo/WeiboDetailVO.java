package cn.tedu.weibo.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

/**
 * 微博詳情頁功能的VO類
 */

@Data
public class WeiboDetailVO {
    //微博id,微博內容,微博發布時間,用戶昵稱
    private Long id;
    private String content;
    /*
      1.pattern參數:指定日期時間的格式
        年:y 月:M 日:d 時:H 分:m 秒:s
        小大小, 大小小
        格式1: 2000-01-01 00:00:00
        格式2: 2000/01/01 00:00:00
        格式3: 2000年01月01日00時00分00秒
      2.timezone參數:指定時區
     */
    @JsonFormat(pattern = "yyyy年MM月dd日HH時mm分ss秒", timezone = "GMT+8")
    private Date created;
    private String nickname;
}








