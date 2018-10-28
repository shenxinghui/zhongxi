package com.zhongxi.lottery.common.exception;

import com.zhongxi.lottery.common.util.StringUtils;

/**
 * 工具类初始化异常
 */
public class ToolBoxException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ToolBoxException(Throwable e) {
		super(e.getMessage(), e);
	}
	
	public ToolBoxException(String message) {
		super(message);
	}
	
	public ToolBoxException(String messageTemplate, Object... params) {
		super(StringUtils.format(messageTemplate, params));
	}
	
	public ToolBoxException(String message, Throwable throwable) {
		super(message, throwable);
	}
	
	public ToolBoxException(Throwable throwable, String messageTemplate, Object... params) {
		super(StringUtils.format(messageTemplate, params), throwable);
	}
}
