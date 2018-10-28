package com.zhongxi.lottery.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.zhongxi.lottery.system.model.SysOperationLog;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 系统操作日志表 Mapper接口
 * </p>
 *
 * @author shenxh
 * @since 2018-05-03
 */
public interface SysOperationLogMapper extends BaseMapper<SysOperationLog> {

    /**
     * 根据参数查询操作日志列表
     */
	public List<Map<String, Object>> selectOperationLogs(@Param("page") Page<SysOperationLog> page, @Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("logName") String logName, @Param("logType") String logType, @Param("orderByField") String orderByField, @Param("isAsc") boolean isAsc);

}