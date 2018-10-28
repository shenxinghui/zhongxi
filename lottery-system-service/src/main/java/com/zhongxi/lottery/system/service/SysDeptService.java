package com.zhongxi.lottery.system.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.service.IService;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.system.model.SysDept;

/**
 * <p>
 * 系统部门服务类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
public interface SysDeptService extends IService<SysDept> {
    
    /**
     * 删除部门
     */
	public void deleteDept(Long deptId);
	
	/**
     * 获取部门列表树
     */
	public List<ZTreeNode> getDeptTreeList();

    /**
     * 根据条件查询部门列表
     */
	public List<Map<String, Object>> selectDepts(String condition);
}
