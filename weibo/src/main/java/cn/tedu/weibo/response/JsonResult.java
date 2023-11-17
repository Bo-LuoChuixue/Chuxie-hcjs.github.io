package cn.tedu.weibo.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 統一響應結果的類:common.response.JsonResult
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult {
    //響應狀態碼code,提示消息msg,響應數據data
    private Integer code;
    private String msg;
    private Object data;

    /**
     * 第1個構造方法:用於沒有具體數據返回的controller方法;
     * 注意:一旦使用了自定義枚舉類,此構造方法就不會再被使用;
     *     因為所有的狀態碼和提示消息都會定義到枚舉類中,不會在控制器方法中傳遞了.
     */
    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 第2個構造方法:用於沒有具體數據返回的controller方法;
     */
    public JsonResult(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    /**
     * 第3個構造方法:針對於有具體數據返回的controller方法
     */
    public JsonResult(StatusCode statusCode, Object data){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = data;
    }

    /**
     * 定義2個靜態方法:用於快速構建JsonResult對象
     *   專門針對於操作成功的業務場景.
     *   1.靜態方法1: 針對於有具體數據返回的,操作成功OPERATION_SUCCESS的業務場景;
     *   2.靜態方法2: 針對於沒有具體數據返回的,操作成功OPERATION_SUCCESS的業務場景;
     */
    public static JsonResult ok(Object data){
        return new JsonResult(StatusCode.OPERATION_SUCCESS, data);
    }
    public static JsonResult ok(){
        return ok(null);
    }
}







