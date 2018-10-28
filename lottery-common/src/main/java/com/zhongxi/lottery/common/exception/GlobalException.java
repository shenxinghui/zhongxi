package com.zhongxi.lottery.common.exception;

/**
 * 封装全局的异常类
 */
public class GlobalException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Integer code;

    private String message;

    public GlobalException(IException serviceExceptionEnum) {
        this.code = serviceExceptionEnum.getCode();
        this.message = serviceExceptionEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
