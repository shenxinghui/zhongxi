package com.zhongxi.lottery.common.exception;

/**
 * 异常接口类
 */
public interface IException {
    /**
     * 获取异常编码
     */
    Integer getCode();

    /**
     * 获取异常信息
     */
    String getMessage();
}
