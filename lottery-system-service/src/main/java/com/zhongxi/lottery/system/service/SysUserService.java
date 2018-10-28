package com.zhongxi.lottery.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.zhongxi.lottery.common.datascope.DataScope;
import com.zhongxi.lottery.system.model.SysUser;

/**
 * <p>
 * 系统用户服务类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
public interface SysUserService extends IService<SysUser> {
	 /**
     * 修改用户状态
     */
    public int updateStatus(Long userId, int status);

    /**
     * 修改密码
     */
    public int updatePwd(Long userId, String pwd);

    /**
     * 根据条件查询用户列表
     */
    public List<Map<String, Object>> selectUsers(DataScope dataScope, String name, String beginTime, String endTime, Long deptId);

    /**
     * 修改用户的角色
     */
    public int updateRoles(Long userId, String roleIds);

    /**
     * 通过账号获取用户
     */
    public SysUser getByAccount(String account);
}
