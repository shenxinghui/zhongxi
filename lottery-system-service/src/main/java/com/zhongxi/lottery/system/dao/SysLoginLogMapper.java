package com.zhongxi.lottery.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.zhongxi.lottery.system.model.SysLoginLog;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 系统登陆日志表 Mapper接口
 * </p>
 *
 * @author shenxh
 * @since 2018-05-03
 */
public interface SysLoginLogMapper extends BaseMapper<SysLoginLog> {

    /**
     * 根据参数查询登录日志列表
     */
	public List<Map<String, Object>> selectLoginLogs(@Param("page") Page<SysLoginLog> page, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("logName") String logName, @Param("orderByField") String orderByField, @Param("isAsc") boolean isAsc);

}