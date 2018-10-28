package com.zhongxi.lottery.system.dao;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zhongxi.lottery.system.model.SysRelation;

/**
 * <p>
 * 系统角色和菜单关联表 Mapper接口
 * </p>
 *
 * @author shenxh
 * @since 2018-05-03
 */
public interface SysRelationMapper extends BaseMapper<SysRelation> {
	
    /**
     * 删除roleId关联的relation
     */
	public int deleteRelationByRoleId(@Param("roleId") Long roleId);
	
    /**
     * 删除menuId关联的relation
     */
    public int deleteRelationByMenuId(@Param("menuId") Long menuId);

}