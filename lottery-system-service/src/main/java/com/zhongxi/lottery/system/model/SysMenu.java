package com.zhongxi.lottery.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 系统菜单表
 * </p>
 *
 * @author shenxh
 * @since 2018-05-02
 */
@TableName("sys_menu")
public class SysMenu extends Model<SysMenu> {
	
	private static final long serialVersionUID = 1L;
	
	 /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 菜单编号
     */
    private String code;
    /**
     * 菜单父编号
     */
    private String pcode;
    /**
     * 当前菜单的所有父菜单编号
     */
    private String pcodes;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * url地址
     */
    private String url;
    /**
     * 菜单排序号
     */
    private Integer serialNumber;
    /**
     * 菜单层级
     */
    private Integer levels;
    /**
     * 是否是菜单(0:不是 1:是)
     */
    private Integer ismenu;
    /**
     * 菜单状态(0:不启用 1:启用)
     */
    private Integer status;
    /**
     * 是否打开(0:不打开 1:打开)
     */
    private Integer isopen;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPcodes() {
		return pcodes;
	}
	public void setPcodes(String pcodes) {
		this.pcodes = pcodes;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Integer getLevels() {
		return levels;
	}
	public void setLevels(Integer levels) {
		this.levels = levels;
	}
	public Integer getIsmenu() {
		return ismenu;
	}
	public void setIsmenu(Integer ismenu) {
		this.ismenu = ismenu;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsopen() {
		return isopen;
	}
	public void setIsopen(Integer isopen) {
		this.isopen = isopen;
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
		return "SysMenu [id=" + id + ", code=" + code + ", pcode=" + pcode + ", pcodes=" + pcodes + ", menuName="
				+ menuName + ", icon=" + icon + ", url=" + url + ", serialNumber=" + serialNumber + ", levels=" + levels
				+ ", ismenu=" + ismenu + ", status=" + status + ", isopen=" + isopen + ", remark=" + remark + "]";
	}
}
