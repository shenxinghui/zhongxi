package com.zhongxi.lottery.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zhongxi.lottery.common.node.MenuNode;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.system.model.SysMenu;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
  * 系统菜单表 Mapper接口
 * </p>
 *
 * @author shenxh
 * @since 2018-05-03
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 根据条件查询菜单列表
     */
	public List<Map<String, Object>> selectMenus(@Param("condition") String condition, @Param("level") String level);

    /**
     * 根据角色id查询菜单id列表
     */
	public List<Long> getMenuIdsByRoleId(@Param("roleId") Long roleId);

    /**
     * 获取菜单列表树
     */
	public List<ZTreeNode> getMenuTreeList();

    /**
     * 根据菜单列表menuIds获取菜单列表树
     */
	public List<ZTreeNode> getMenuTreeListByMenuIds(List<Long> menuIds);

    /**
     * 根据角色id获取资源url
     */
    public List<String> getResUrlsByRoleId(@Param("roleId") Long roleId);

    /**
     * 根据角色列表roleIds获取菜单
     */
    public List<MenuNode> getMenusByRoleIds(List<Long> roleIds);
}