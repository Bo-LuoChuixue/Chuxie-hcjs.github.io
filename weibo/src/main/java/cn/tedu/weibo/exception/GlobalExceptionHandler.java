package cn.tedu.weibo.exception;


import cn.tedu.weibo.response.JsonResult;
import cn.tedu.weibo.response.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ControllerAdvice註解:
 *   1.添加在類上,標識此類為全局異常處理器的類;
 *   2.處理所有由控制器controller中拋出的異常;
 *   3.處理流程:
 *     3.1 當控制器拋出異常時,框架會首先檢查有沒有定義全局異常處理器;
 *     3.2 如果定義了,則會到該異常處理器的類中找對應的異常處理方法;
 *     3.3 如果定義了異常處理方法,則由該方法處理異常並返迴響應給客戶端;
 * RestControllerAdvice註解:
 *     組合註解,等價於 ControllerAdvice註解 + ResponseBody註解;
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
     * ExceptionHandler註解:
     *   1.此方法為異常處理方法;
     * @param ex 控制器中拋出的異常對象;
     * @return  JsonResult
     */
    @ExceptionHandler
    public JsonResult doHandleRuntimeException(RuntimeException ex){
        /*
           1.code
           2.msg
           3.data
         */
        //從異常對象ex中,獲取具體的異常提示信息
        String data = ex.getMessage();
        log.error("RuntimeException: " + data);

        return new JsonResult(StatusCode.OPERATION_FAILED, data);
    }

    /**
     * 控制器拋出異常后;
     * 1:找到全局異常處理器[@RestControllerAdvice];
     * 2:找對應的異常處理方法;
     * 3:如果沒有定義對應的異常處理方法,則找該異常父類的處理方法;
     * 4:如果也沒有定義父類的異常處理方法,則使用SpringMVC默認的異常處理機制.
     */
    @ExceptionHandler
    public JsonResult doHandleIllegalArgumentException(IllegalArgumentException ex){
        String data = ex.getMessage();
        log.error("IllegalArgumentException:" + data);

        return new JsonResult(StatusCode.OPERATION_FAILED, data);
    }

    /**
     * 處理由Validation拋出的異常
      */
    @ExceptionHandler
    public JsonResult doHandleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        /*
            1.code: 3002
            2.msg:  參數校驗失敗
            3.data: 不能為null
         */
        String data = ex.getFieldError().getDefaultMessage();

        return new JsonResult(StatusCode.VALIDATED_ERROR, data);
    }

    /**
     * 1.如果所有的異常處理方法都無法處理該異常時,會被此方法捕獲;
     * 2.一旦添加了此異常處理方法,則程序中再也看不到500狀態碼了;
     * 3.一般在最後時添加此異常處理方法.
     */
    /*
    @ExceptionHandler
    public JsonResult doHandleThrowableException(Throwable ex){
        String data = ex.getMessage();

        return new JsonResult(StatusCode.THROWABLE_ERROR, data);
    }*/
}







