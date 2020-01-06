package com.imedcare.project.fnbj.cqzd.cqzddj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqzd.cqzddj.mapper.TbChCqzddjMapper;
import com.imedcare.project.fnbj.cqzd.cqzddj.domain.TbChCqzddj;
import com.imedcare.project.fnbj.cqzd.cqzddj.service.ITbChCqzddjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前诊断登记Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqzddjServiceImpl implements ITbChCqzddjService 
{
    @Autowired
    private TbChCqzddjMapper tbChCqzddjMapper;

    /**
     * 查询产前诊断登记
     * 
     * @param id 产前诊断登记ID
     * @return 产前诊断登记
     */
    @Override
    public TbChCqzddj selectTbChCqzddjById(Long id)
    {
        return tbChCqzddjMapper.selectTbChCqzddjById(id);
    }

    /**
     * 查询产前诊断登记列表
     * 
     * @param tbChCqzddj 产前诊断登记
     * @return 产前诊断登记
     */
    @Override
    public List<TbChCqzddj> selectTbChCqzddjList(TbChCqzddj tbChCqzddj)
    {
        return tbChCqzddjMapper.selectTbChCqzddjList(tbChCqzddj);
    }

    /**
     * 新增产前诊断登记
     * 
     * @param tbChCqzddj 产前诊断登记
     * @return 结果
     */
    @Override
    public int insertTbChCqzddj(TbChCqzddj tbChCqzddj)
    {
        return tbChCqzddjMapper.insertTbChCqzddj(tbChCqzddj);
    }

    /**
     * 修改产前诊断登记
     * 
     * @param tbChCqzddj 产前诊断登记
     * @return 结果
     */
    @Override
    public int updateTbChCqzddj(TbChCqzddj tbChCqzddj)
    {
        return tbChCqzddjMapper.updateTbChCqzddj(tbChCqzddj);
    }

    /**
     * 删除产前诊断登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzddjByIds(String ids)
    {
        return tbChCqzddjMapper.deleteTbChCqzddjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前诊断登记信息
     * 
     * @param id 产前诊断登记ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzddjById(Long id)
    {
        return tbChCqzddjMapper.deleteTbChCqzddjById(id);
    }
}
