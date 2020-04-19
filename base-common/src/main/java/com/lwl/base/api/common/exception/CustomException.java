package com.lwl.base.api.common.exception;

/**
 * 自定义异常
 * @author LinWenLi
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}