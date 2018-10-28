package com.zhongxi.lottery.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhongxi.lottery.common.datascope.DataScope;
import com.zhongxi.lottery.system.dao.SysUserMapper;
import com.zhongxi.lottery.system.model.SysUser;
import com.zhongxi.lottery.system.service.SysUserService;

/**
 * <p>
 * 系统用户服务实现类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService {
	
	public int updateStatus(Long userId, int status) {
		return this.baseMapper.updateStatus(userId, status);
	}

	public int updatePwd(Long userId, String pwd) {
		return this.baseMapper.updatePwd(userId, pwd);
	}

	public List<Map<String, Object>> selectUsers(DataScope dataScope, String name, String beginTime, String endTime, Long deptId) {
		return this.baseMapper.selectUsers(dataScope, name, beginTime, endTime, deptId);
	}

	public int updateRoles(Long userId, String roleIds) {
		return this.baseMapper.updateRoles(userId, roleIds);
	}

	public SysUser getByAccount(String account) {
		return this.getByAccount(account);
	}
}
