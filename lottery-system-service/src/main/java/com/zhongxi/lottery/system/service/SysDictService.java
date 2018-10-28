package com.zhongxi.lottery.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.zhongxi.lottery.system.model.SysDict;

/**
 * <p>
 * 系统字典服务类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
public interface SysDictService extends IService<SysDict> {
	 /**
     * 保存字典
     */
    void saveSysDict(String dictName, String dictValues);

    /**
     * 更新字典
     */
    void updateSysDict(Long dictId, String dictName, String dictValues);

    /**
     * 删除字典
     */
    void deleteSysDict(Long dictId);

	/**
     * 根据条件查询字典列表
     */
	public List<Map<String, Object>> selectDicts(String conditiion);
}
