package com.zhongxi.lottery.system.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhongxi.lottery.common.node.MenuNode;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.system.dao.SysMenuMapper;
import com.zhongxi.lottery.system.dao.SysRelationMapper;
import com.zhongxi.lottery.system.model.SysMenu;
import com.zhongxi.lottery.system.service.SysMenuService;

/**
 * <p>
 * 系统菜单服务实现类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper,SysMenu> implements SysMenuService {
	
	@Resource
	private SysRelationMapper sysRelationMapper;
	
	@Transactional
	public void deleteMenu(Long menuId) {

        //删除菜单
        this.baseMapper.deleteById(menuId);

        //删除menuId关联的relation
        this.sysRelationMapper.deleteRelationByMenuId(menuId);
    }
    
    @Transactional
    public void deleteMenuContainSubMenus(Long menuId) {

        SysMenu sysMenu = this.baseMapper.selectById(menuId);

        //删除当前菜单
        deleteMenu(menuId);

        //删除所有子菜单
        Wrapper<SysMenu> wrapper = new EntityWrapper<>();
        wrapper = wrapper.like("pcodes", "%[" + sysMenu.getCode() + "]%");
        List<SysMenu> menus = this.baseMapper.selectList(wrapper);
        for (SysMenu temp : menus) {
        	deleteMenu(temp.getId());
        }
    }
    
	public List<Map<String, Object>> selectMenus(String condition, String level) {
		return this.baseMapper.selectMenus(condition, level);
	}
	
    public List<Long> getMenuIdsByRoleId(Long roleId) {
        return this.baseMapper.getMenuIdsByRoleId(roleId);
    }

	public List<ZTreeNode> getMenuTreeList() {
		return this.baseMapper.getMenuTreeList();
	}

	public List<ZTreeNode> getMenuTreeListByMenuIds(List<Long> menuIds) {
		return this.baseMapper.getMenuTreeListByMenuIds(menuIds);
	}

    public List<String> getResUrlsByRoleId(Long roleId) {
    	return this.baseMapper.getResUrlsByRoleId(roleId);
    }

    public List<MenuNode> getMenusByRoleIds(List<Long> roleIds) {
    	return this.baseMapper.getMenusByRoleIds(roleIds);
    }
}
