package cn.tedu.weibo.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import javax.validation.constraints.Pattern;

/**
 * 注册功能DTO类
 */
@Data
public class UserRegDTO {
    //用户名,密码,昵称
    /*
      ApiModelProperty注解: 添加在POJO类的属性上.
        value参数:对应参数说明;
        required参数:对应是否必须;
     */
    /*
        message参数: 自定义提示消息
        1.NotNull注解: 不能为null
     */
    //@NotNull(message = "用户名不能为null")
    //@NotEmpty(message = "用户名不能为null,也不能为空字符串")
    //@NotBlank(message = "用户名不能为null,也不能为空字符串,也不能为空白串")
    //@Size(min = 6, max = 12, message = "用户名必须在6-12位之间")
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{0,7}$|^[a-zA-Z0-9]{0,14}$", message = "用户名不能超过7个汉字或14个字符")
    @ApiModelProperty(value = "用户名", required = true, example = "Tony")
    private String username;
    @ApiModelProperty(value = "密码", required = true, example = "123456")
    private String password;
    @ApiModelProperty(value = "昵称", required = true, example = "tony")
    private String nickname;
}
