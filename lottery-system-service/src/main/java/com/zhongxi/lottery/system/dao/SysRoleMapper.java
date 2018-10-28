package com.zhongxi.lottery.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.system.model.SysRole;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 系统角色表 Mapper接口
 * </p>
 *
 * @author shenxh
 * @since 2018-05-03
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {
	
    /**
     * 根据条件查询角色列表
     */
	public List<Map<String, Object>> selectRoles(@Param("condition") String condition);

    /**
     * 获取角色列表树
     */
	public List<ZTreeNode> getRoleTreeList();

    /**
     * 根据角色Id获取角色列表树
     */
	public List<ZTreeNode> getRoleTreeListByRoleId(String[] roleId);
}