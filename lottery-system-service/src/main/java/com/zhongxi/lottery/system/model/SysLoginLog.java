package com.zhongxi.lottery.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统登陆日志表
 * </p>
 *
 * @author shenxh
 * @since 2018-05-02
 */
@TableName("sys_login_log")
public class SysLoginLog extends Model<SysLoginLog> {
	
	private static final long serialVersionUID = 1L;
	
	/**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 日志名称
     */
	private String logName;
    /**
     * 管理员id
     */
	private Long userId;
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
    /**
     * 登录ip
     */
	private String ip;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysLoginLog [id=" + id + ", logName=" + logName + ", userId=" + userId + ", createDateTime="
				+ createTime + ", status=" + status + ", messages=" + messages + ", ip=" + ip + "]";
	}
	
}
