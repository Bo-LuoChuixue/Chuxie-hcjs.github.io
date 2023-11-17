package cn.tedu.weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.Pattern;

/**
 * 註冊功能DTO類
 */

@Data
public class UserRegDTO {
    //用戶名,密碼,昵稱
    /*
      ApiModelProperty註解: 添加在POJO類的屬性上.
        value參數:對應參數說明;
        required參數:對應是否必須;
     */
    /*
        message參數: 自定義提示消息
        1.NotNull註解: 不能為null
     */
    //@NotNull(message = "用戶名不能為null")
    //@NotEmpty(message = "用戶名不能為null,也不能為空字符串")
    //@NotBlank(message = "用戶名不能為null,也不能為空字符串,也不能為空白串")
    //@Size(min = 6, max = 12, message = "用戶名必須在6-12位之間")
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{0,7}$|^[a-zA-Z0-9]{0,14}$", message = "用戶名不能超過7個漢字或14個字符")
    @ApiModelProperty(value = "用戶名", required = true, example = "Tony")
    private String username;
    @ApiModelProperty(value = "密碼", required = true, example = "123456")
    private String password;
    @ApiModelProperty(value = "昵稱", required = true, example = "tony")
    private String nickname;
}
