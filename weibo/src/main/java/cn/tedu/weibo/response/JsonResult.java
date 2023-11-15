package cn.tedu.weibo.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 统一响应结果的类:common.response.JsonResult
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult {
    //响应状态码code,提示消息msg,响应数据data
    private Integer code;
    private String msg;
    private Object data;

    /**
     * 第1个构造方法:用于没有具体数据返回的controller方法;
     * 注意:一旦使用了自定义枚举类,此构造方法就不会再被使用;
     *     因为所有的状态码和提示消息都会定义到枚举类中,不会在控制器方法中传递了.
     */
    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 第2个构造方法:用于没有具体数据返回的controller方法;
     */
    public JsonResult(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    /**
     * 第3个构造方法:针对于有具体数据返回的controller方法
     */
    public JsonResult(StatusCode statusCode, Object data){
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
        this.data = data;
    }

    /**
     * 定义2个静态方法:用于快速构建JsonResult对象
     *   专门针对于操作成功的业务场景.
     *   1.静态方法1: 针对于有具体数据返回的,操作成功OPERATION_SUCCESS的业务场景;
     *   2.静态方法2: 针对于没有具体数据返回的,操作成功OPERATION_SUCCESS的业务场景;
     */
    public static JsonResult ok(Object data){
        return new JsonResult(StatusCode.OPERATION_SUCCESS, data);
    }
    public static JsonResult ok(){
        return ok(null);
    }
}







