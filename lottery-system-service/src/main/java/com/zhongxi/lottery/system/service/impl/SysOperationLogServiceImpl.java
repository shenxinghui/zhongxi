package com.zhongxi.lottery.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhongxi.lottery.system.dao.SysOperationLogMapper;
import com.zhongxi.lottery.system.model.SysOperationLog;
import com.zhongxi.lottery.system.service.SysOperationLogService;

/**
 * <p>
 * 系统操作日志服务实现类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
@Service
public class SysOperationLogServiceImpl extends ServiceImpl<SysOperationLogMapper,SysOperationLog> implements SysOperationLogService {
	
	public List<Map<String, Object>> selectOperationLogs(Page<SysOperationLog> page, String beginTime, String endTime, String logName, String logType, String orderByField, boolean isAsc) {
		return this.baseMapper.selectOperationLogs(page, beginTime, endTime, logName, logType, orderByField, isAsc);
	}

}
