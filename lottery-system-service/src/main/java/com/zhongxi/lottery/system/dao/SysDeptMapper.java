package com.zhongxi.lottery.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.system.model.SysDept;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 系统部门表 Mapper接口
 * </p>
 *
 * @author shenxh
 * @since 2018-05-03
 */
public interface SysDeptMapper extends BaseMapper<SysDept> {

    /**
     * 获取部门列表树
     */
	public List<ZTreeNode> getDeptTreeList();

    /**
     * 根据条件查询部门列表
     */
	public List<Map<String, Object>> selectDepts(@Param("condition") String condition);

}