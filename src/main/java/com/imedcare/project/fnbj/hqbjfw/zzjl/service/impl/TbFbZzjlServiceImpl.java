package com.imedcare.project.fnbj.hqbjfw.zzjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.hqbjfw.zzjl.mapper.TbFbZzjlMapper;
import com.imedcare.project.fnbj.hqbjfw.zzjl.domain.TbFbZzjl;
import com.imedcare.project.fnbj.hqbjfw.zzjl.service.ITbFbZzjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 转诊记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-20
 */
@Service
public class TbFbZzjlServiceImpl implements ITbFbZzjlService 
{
    @Autowired
    private TbFbZzjlMapper tbFbZzjlMapper;

    /**
     * 查询转诊记录
     * 
     * @param id 转诊记录ID
     * @return 转诊记录
     */
    @Override
    public TbFbZzjl selectTbFbZzjlById(Long id)
    {
        return tbFbZzjlMapper.selectTbFbZzjlById(id);
    }

    /**
     * 查询转诊记录列表
     * 
     * @param tbFbZzjl 转诊记录
     * @return 转诊记录
     */
    @Override
    public List<TbFbZzjl> selectTbFbZzjlList(TbFbZzjl tbFbZzjl)
    {
        return tbFbZzjlMapper.selectTbFbZzjlList(tbFbZzjl);
    }

    /**
     * 新增转诊记录
     * 
     * @param tbFbZzjl 转诊记录
     * @return 结果
     */
    @Override
    public int insertTbFbZzjl(TbFbZzjl tbFbZzjl)
    {
        return tbFbZzjlMapper.insertTbFbZzjl(tbFbZzjl);
    }

    /**
     * 修改转诊记录
     * 
     * @param tbFbZzjl 转诊记录
     * @return 结果
     */
    @Override
    public int updateTbFbZzjl(TbFbZzjl tbFbZzjl)
    {
        return tbFbZzjlMapper.updateTbFbZzjl(tbFbZzjl);
    }

    /**
     * 删除转诊记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbZzjlByIds(String ids)
    {
        return tbFbZzjlMapper.deleteTbFbZzjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除转诊记录信息
     * 
     * @param id 转诊记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbZzjlById(Long id)
    {
        return tbFbZzjlMapper.deleteTbFbZzjlById(id);
    }
}
