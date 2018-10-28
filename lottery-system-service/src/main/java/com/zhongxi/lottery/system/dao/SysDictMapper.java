package com.zhongxi.lottery.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zhongxi.lottery.system.model.SysDict;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 系统字典表 Mapper接口
 * </p>
 *
 * @author shenxh
 * @since 2018-05-03
 */
public interface SysDictMapper extends BaseMapper<SysDict> {

    /**
     * 根据条件查询字典列表
     */
	public List<Map<String, Object>> selectDicts(@Param("condition") String conditiion);
}