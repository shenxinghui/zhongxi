package com.zhongxi.lottery.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.system.model.SysRole;

/**
 * <p>
 * 系统角色服务类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
public interface SysRoleService extends IService<SysRole> {
	
	 /**
     * 设置某个角色的权限
     */
    void setAuthority(Long roleId, String ids);

    /**
     * 删除角色
     */
    void deleteRolesById(Long roleId);
	
	/**
     * 根据条件查询角色列表
     */
	public List<Map<String, Object>> selectRoles(String condition);

    /**
     * 获取角色列表树
     */
	public List<ZTreeNode> getRoleTreeList();

    /**
     * 根据角色Id获取角色列表树
     */
	public List<ZTreeNode> getRoleTreeListByRoleId(String[] roleId);
}
