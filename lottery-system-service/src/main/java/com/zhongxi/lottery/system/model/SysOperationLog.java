package com.zhongxi.lottery.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统操作日志表
 * </p>
 *
 * @author shenxh
 * @since 2018-05-02
 */
@TableName("sys_operation_log")
public class SysOperationLog extends Model<SysOperationLog> {
	
	private static final long serialVersionUID = 1L;
	
	/**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 日志类型
     */
	private String logType;
    /**
     * 日志名称
     */
	private String logName;
    /**
     * 用户id
     */
	private Long userId;
    /**
     * 类名称
     */
	private String className;
    /**
     * 方法名称
     */
	private String methodName;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 状态(0:失败 1:成功)
     */
	private String status;
    /**
     * 具体消息
     */
	private String messages;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysOperationLog [id=" + id + ", logType=" + logType + ", logName=" + logName + ", userId=" + userId
				+ ", className=" + className + ", methodName=" + methodName + ", createTime=" + createTime
				+ ", status=" + status + ", messages=" + messages + "]";
	}
}
