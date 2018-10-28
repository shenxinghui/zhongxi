package com.zhongxi.lottery.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.zhongxi.lottery.system.model.SysLoginLog;

/**
 * <p>
 * 系统登陆日志服务类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
public interface SysLoginLogService extends IService<SysLoginLog> {
	  /**
     * 根据参数查询登录日志列表
     */
	public List<Map<String, Object>> selectLoginLogs(Page<SysLoginLog> page, String beginTime, String endTime, String logName, String orderByField, boolean isAsc);
}
