package com.zhongxi.lottery.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.zhongxi.lottery.common.node.MenuNode;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.system.model.SysMenu;

/**
 * <p>
 * 系统菜单服务类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
public interface SysMenuService extends IService<SysMenu> {
	
    /**
     * 删除菜单
     */
	public  void deleteMenu(Long menuId);
    
    /**
     * 删除菜单包含所有子菜单
     */
	public void deleteMenuContainSubMenus(Long menuId);
	
	/**
     * 根据条件查询菜单列表
     */
	public List<Map<String, Object>> selectMenus(String condition, String level);

    /**
     * 根据角色id查询菜单id列表
     */
	public List<Long> getMenuIdsByRoleId(Long roleId);

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
    public List<String> getResUrlsByRoleId(Long roleId);

    /**
     * 根据角色列表roleIds获取菜单
     */
    public List<MenuNode> getMenusByRoleIds(List<Long> roleIds);
}
