package com.zhongxi.lottery.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhongxi.lottery.common.node.ZTreeNode;
import com.zhongxi.lottery.system.dao.SysDeptMapper;
import com.zhongxi.lottery.system.model.SysDept;
import com.zhongxi.lottery.system.service.SysDeptService;

/**
 * <p>
 * 系统部门服务实现类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
@Service
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper,SysDept> implements SysDeptService {

	@Transactional
	public void deleteDept(Long deptId) {
		SysDept sysDept = this.baseMapper.selectById(deptId);

        Wrapper<SysDept> wrapper = new EntityWrapper<>();
        wrapper = wrapper.like("pids", "%[" + sysDept.getId() + "]%");
        List<SysDept> subDepts = this.baseMapper.selectList(wrapper);
        for (SysDept temp : subDepts) {
            temp.deleteById();
        }

        sysDept.deleteById();
	}
	
	public List<ZTreeNode> getDeptTreeList() {
		return this.baseMapper.getDeptTreeList();
	}

	public List<Map<String, Object>> selectDepts(String condition) {
		return this.baseMapper.selectDepts(condition);
	}
}
