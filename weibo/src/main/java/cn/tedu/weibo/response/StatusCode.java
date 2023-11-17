package cn.tedu.weibo.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 自定義枚舉類狀態碼
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum StatusCode {
    //所有的實例都在最上面
    NOT_LOGIN(1000, "未登錄"),
    LOGIN_SUCCESS(1001, "登錄成功"),
    PASSWORD_ERROR(1002, "密碼錯誤"),
    USERNAME_ERROR(1003, "用戶名錯誤"),
    USERNAME_ALREADY_EXISTS(1004, "用戶名被佔用"),
    OPERATION_SUCCESS(2001, "操作成功"),
    OPERATION_FAILED(2002, "操作失敗"),
    THROWABLE_ERROR(8888, "Throwable異常"),
    VALIDATED_ERROR(3002, "參數校驗失敗");
    private Integer code;
    private String msg;
}
