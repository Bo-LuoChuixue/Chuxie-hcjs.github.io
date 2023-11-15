package cn.tedu.weibo.exception;

import cn.tedu.weibo.response.StatusCode;
import lombok.Getter;

public class ServiceException extends RuntimeException{
    @Getter
    private StatusCode statusCode;
    public ServiceException(StatusCode statusCode){
        this.statusCode=statusCode;
    }
}
