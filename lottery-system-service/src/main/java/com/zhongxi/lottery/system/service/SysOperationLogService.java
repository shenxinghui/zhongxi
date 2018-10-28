package com.zhongxi.lottery.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.zhongxi.lottery.system.model.SysOperationLog;

/**
 * <p>
 * 系统操作日志服务类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
public interface SysOperationLogService extends IService<SysOperationLog> {
    /**
     * 根据参数查询操作日志列表
     */
	public List<Map<String, Object>> selectOperationLogs(Page<SysOperationLog> page, String beginTime, String endTime, String logName, String logType, String orderByField, boolean isAsc);

}
