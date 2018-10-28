package com.zhongxi.lottery.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhongxi.lottery.system.dao.SysLoginLogMapper;
import com.zhongxi.lottery.system.model.SysLoginLog;
import com.zhongxi.lottery.system.service.SysLoginLogService;

/**
 * <p>
 * 系统登陆日志服务实现类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
@Service
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogMapper,SysLoginLog> implements SysLoginLogService {
	
	public List<Map<String, Object>> selectLoginLogs(Page<SysLoginLog> page, String beginTime, String endTime, String logName, String orderByField, boolean isAsc) {
		return this.baseMapper.selectLoginLogs(page, beginTime, endTime, logName, orderByField, isAsc);
	}
}
