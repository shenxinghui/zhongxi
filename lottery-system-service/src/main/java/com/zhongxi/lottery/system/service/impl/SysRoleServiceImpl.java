package com.zhongxi.lottery.system.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.common.util.Convert;
import com.zhongxi.lottery.system.dao.SysRelationMapper;
import com.zhongxi.lottery.system.dao.SysRoleMapper;
import com.zhongxi.lottery.system.model.SysRelation;
import com.zhongxi.lottery.system.model.SysRole;
import com.zhongxi.lottery.system.service.SysRoleService;

/**
 * <p>
 * 系统角色服务实现类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper,SysRole> implements SysRoleService {

	@Resource
	private SysRelationMapper sysRelationMapper;
	
	@Transactional
	public void setAuthority(Long roleId, String ids) {
		//删除roleId关联的relation
        this.sysRelationMapper.deleteRelationByRoleId(roleId);

        //添加新的关联权限
        for (Long id : Convert.toLongArray(true, Convert.toStrArray(",", ids))) {
            SysRelation sysRelation = new SysRelation();
            sysRelation.setRoleId(roleId);
            sysRelation.setMenuId(id);
            this.sysRelationMapper.insert(sysRelation);
        }
	}
	
	@Transactional
    public void deleteRolesById(Long roleId) {
    	//删除角色
		this.baseMapper.deleteById(roleId);
		
		//删除roleId关联的relation
		this.sysRelationMapper.deleteRelationByRoleId(roleId);
    }
    
	public List<Map<String, Object>> selectRoles(String condition) {
		return this.baseMapper.selectRoles(condition);
	}

	public List<ZTreeNode> getRoleTreeList() {
		return this.baseMapper.getRoleTreeList();
	}

	public List<ZTreeNode> getRoleTreeListByRoleId(String[] roleId) {
		return this.baseMapper.getRoleTreeListByRoleId(roleId);
	}
}
