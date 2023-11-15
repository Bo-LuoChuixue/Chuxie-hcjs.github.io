package cn.tedu.weibo.exception;


import cn.tedu.weibo.response.JsonResult;
import cn.tedu.weibo.response.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ControllerAdvice注解:
 *   1.添加在类上,标识此类为全局异常处理器的类;
 *   2.处理所有由控制器controller中抛出的异常;
 *   3.处理流程:
 *     3.1 当控制器抛出异常时,框架会首先检查有没有定义全局异常处理器;
 *     3.2 如果定义了,则会到该异常处理器的类中找对应的异常处理方法;
 *     3.3 如果定义了异常处理方法,则由该方法处理异常并返回响应给客户端;
 * RestControllerAdvice注解:
 *     组合注解,等价于 ControllerAdvice注解 + ResponseBody注解;
 */
//@ControllerAdvice
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public JsonResult doHandleServiceException(ServiceException ex){
        log.error(ex.getStatusCode().getMsg());
        return new JsonResult(ex.getStatusCode());
    }
    /**
     * ExceptionHandler注解:
     *   1.此方法为异常处理方法;
     * @param ex 控制器中抛出的异常对象;
     * @return  JsonResult
     */
    @ExceptionHandler
    public JsonResult doHandleRuntimeException(RuntimeException ex){
        /*
           1.code
           2.msg
           3.data
         */
        //从异常对象ex中,获取具体的异常提示信息
        String data = ex.getMessage();
        log.error("RuntimeException: " + data);

        return new JsonResult(StatusCode.OPERATION_FAILED, data);
    }

    /**
     * 控制器抛出异常后;
     * 1:找到全局异常处理器[@RestControllerAdvice];
     * 2:找对应的异常处理方法;
     * 3:如果没有定义对应的异常处理方法,则找该异常父类的处理方法;
     * 4:如果也没有定义父类的异常处理方法,则使用SpringMVC默认的异常处理机制.
     */
    @ExceptionHandler
    public JsonResult doHandleIllegalArgumentException(IllegalArgumentException ex){
        String data = ex.getMessage();
        log.error("IllegalArgumentException:" + data);

        return new JsonResult(StatusCode.OPERATION_FAILED, data);
    }

    /**
     * 处理由Validation抛出的异常
      */
    @ExceptionHandler
    public JsonResult doHandleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        /*
            1.code: 3002
            2.msg:  参数校验失败
            3.data: 不能为null
         */
        String data = ex.getFieldError().getDefaultMessage();

        return new JsonResult(StatusCode.VALIDATED_ERROR, data);
    }

    /**
     * 1.如果所有的异常处理方法都无法处理该异常时,会被此方法捕获;
     * 2.一旦添加了此异常处理方法,则程序中再也看不到500状态码了;
     * 3.一般在最后时添加此异常处理方法.
     */
    /*
    @ExceptionHandler
    public JsonResult doHandleThrowableException(Throwable ex){
        String data = ex.getMessage();

        return new JsonResult(StatusCode.THROWABLE_ERROR, data);
    }*/
}







