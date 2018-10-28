package com.zhongxi.lottery.system.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 系统角色和菜单关联表
 * </p>
 *
 * @author shenxh
 * @since 2018-05-02
 */
@TableName("sys_relation")
public class SysRelation extends Model<SysRelation> {
	
	private static final long serialVersionUID = 1L;
	
	/**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 菜单id
     */
    private Long menuId;
    /**
     * 角色id
     */
    private Long roleId;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
    
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    
	@Override
	public String toString() {
		return "SysRelation [id=" + id + ", menuId=" + menuId + ", roleId=" + roleId + "]";
	}
}
