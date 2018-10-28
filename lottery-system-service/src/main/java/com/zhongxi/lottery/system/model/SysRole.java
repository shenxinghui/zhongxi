package com.zhongxi.lottery.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 系统角色表
 * </p>
 *
 * @author shenxh
 * @since 2018-05-02
 */
@TableName("sys_role")
public class SysRole extends Model<SysRole> {
	
	private static final long serialVersionUID = 1L;
	
	/**
     * 主键id
     */
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 序号
     */
	private Integer serialNumber;
    /**
     * 父角色id
     */
	private Long pid;
    /**
     * 角色名称
     */
	private String roleName;
    /**
     * 部门id
     */
	private Long deptId;
    /**
     * 备注
     */
	private String remark;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysRole [id=" + id + ", serialNumber=" + serialNumber + ", pid=" + pid + ", roleName=" + roleName
				+ ", deptId=" + deptId + ", remark=" + remark + "]";
	}
}
