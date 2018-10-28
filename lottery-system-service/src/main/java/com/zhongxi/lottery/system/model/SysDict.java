package com.zhongxi.lottery.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 系统字典表
 * </p>
 *
 * @author shenxh
 * @since 2018-05-02
 */
@TableName("sys_dict")
public class SysDict extends Model<SysDict> {
	
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
     * 父级字典id
     */
	private Long pid;
    /**
     * 字典名称
     */
	private String dictName;
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

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
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
		return "SysDict [id=" + id + ", serialNumber=" + serialNumber + ", pid=" + pid + ", dictName=" + dictName
				+ ", remark=" + remark + "]";
	}

}
