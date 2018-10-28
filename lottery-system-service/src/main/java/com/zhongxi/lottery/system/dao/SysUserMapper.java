package com.zhongxi.lottery.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zhongxi.lottery.common.datascope.DataScope;
import com.zhongxi.lottery.system.model.SysUser;

/**
 * <p>
 * 系统用户表 Mapper接口
 * </p>
 *
 * @author shenxh
 * @since 2018-05-03
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
	
	 /**
     * 修改用户状态
     */
	public int updateStatus(@Param("userId") Long userId, @Param("status") int status);

    /**
     * 修改密码
     */
	public int updatePwd(@Param("userId") Long userId, @Param("pwd") String pwd);

    /**
     * 根据条件查询用户列表
     */
	public List<Map<String, Object>> selectUsers(@Param("dataScope") DataScope dataScope, @Param("name") String name, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("deptId") Long deptId);

    /**
     * 修改用户的角色
     */
	public int updateRoles(@Param("userId") Long userId, @Param("roleIds") String roleIds);

    /**
     * 通过账号获取用户
     */
	public SysUser getByAccount(@Param("account") String account);
}
