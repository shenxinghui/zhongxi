package com.zhongxi.lottery.system.service.impl;

import static com.zhongxi.lottery.common.constant.factory.MutiStrFactory.*;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zhongxi.lottery.common.exception.GlobalException;
import com.zhongxi.lottery.system.dao.SysDictMapper;
import com.zhongxi.lottery.system.exception.SysExceptionEnum;
import com.zhongxi.lottery.system.model.SysDict;
import com.zhongxi.lottery.system.service.SysDictService;

/**
 * <p>
 * 系统字典服务实现类
 * </p>
 *
 * @author shenxh
 * @since 2018-05-15
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper,SysDict> implements SysDictService {
	
	@Transactional
    public void saveSysDict(String dictName, String dictValues) {
        //判断有没有该字典
        List<SysDict> dicts = this.baseMapper.selectList(new EntityWrapper<SysDict>().eq("name", dictName).and().eq("pid", 0));
        if (dicts != null && dicts.size() > 0) {
            throw new GlobalException(SysExceptionEnum.DICT_EXISTED);
        }
        
        //添加字典
        SysDict sysDict = new SysDict();
        sysDict.setSerialNumber(0);
        sysDict.setPid(0l);
        sysDict.setDictName(dictName);
        this.baseMapper.insert(sysDict);
        
        //解析dictValues
        List<Map<String, String>> items = parseKeyValue(dictValues);

        //添加字典条目
        for (Map<String, String> item : items) {
            String num = item.get(MUTI_STR_KEY);
            String name = item.get(MUTI_STR_VALUE);
            SysDict itemSysDict = new SysDict();
            itemSysDict.setPid(sysDict.getId());
            itemSysDict.setDictName(name);
            try {
            	itemSysDict.setSerialNumber(Integer.valueOf(num));
            } catch (NumberFormatException e) {
                throw new GlobalException(SysExceptionEnum.DICT_MUST_BE_NUMBER);
            }
            this.baseMapper.insert(itemSysDict);
        }
    }

    @Transactional
    public void updateSysDict(Long dictId, String dictName, String dictValues) {
        //删除之前的字典
        this.deleteSysDict(dictId);

        //重新添加新的字典
        this.saveSysDict(dictName, dictValues);
    }

    @Transactional
    public void deleteSysDict(Long dictId) {
        //删除这个字典的子词典
        Wrapper<SysDict> dictEntityWrapper = new EntityWrapper<>();
        dictEntityWrapper = dictEntityWrapper.eq("pid", dictId);
        this.baseMapper.delete(dictEntityWrapper);

        //删除这个词典
        this.baseMapper.deleteById(dictId);
    }

    public List<Map<String, Object>> selectDicts(String conditiion) {
        return this.baseMapper.selectDicts(conditiion);
    }
}
