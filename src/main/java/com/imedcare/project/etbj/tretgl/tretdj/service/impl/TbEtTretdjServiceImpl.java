package com.imedcare.project.etbj.tretgl.tretdj.service.impl;

import java.util.List;

import com.imedcare.project.etbj.tretgl.tretdj.domain.TbEtTretdj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.tretgl.tretdj.mapper.TbEtTretdjMapper;
import com.imedcare.project.etbj.tretgl.tretdj.service.TbIEtTretdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 体弱儿童登记Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Service
public class TbEtTretdjServiceImpl implements TbIEtTretdjService
{
    @Autowired
    private TbEtTretdjMapper tbEtTretdjMapper;

    /**
     * 查询体弱儿童登记
     * 
     * @param id 体弱儿童登记ID
     * @return 体弱儿童登记
     */
    @Override
    public TbEtTretdj selectEtTretdjById(Long id)
    {
        return tbEtTretdjMapper.selectTbEtTretdjById(id);
    }

    /**
     * 查询体弱儿童登记列表
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 体弱儿童登记
     */
    @Override
    public List<TbEtTretdj> selectEtTretdjList(TbEtTretdj tbEtTretdj)
    {
        return tbEtTretdjMapper.selectTbEtTretdjList(tbEtTretdj);
    }

    /**
     * 新增体弱儿童登记
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 结果
     */
    @Override
    public int insertEtTretdj(TbEtTretdj tbEtTretdj)
    {
        return tbEtTretdjMapper.insertTbEtTretdj(tbEtTretdj);
    }

    /**
     * 修改体弱儿童登记
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 结果
     */
    @Override
    public int updateEtTretdj(TbEtTretdj tbEtTretdj)
    {
        return tbEtTretdjMapper.updateTbEtTretdj(tbEtTretdj);
    }

    /**
     * 删除体弱儿童登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEtTretdjByIds(String ids)
    {
        return tbEtTretdjMapper.deleteTbEtTretdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除体弱儿童登记信息
     * 
     * @param id 体弱儿童登记ID
     * @return 结果
     */
    @Override
    public int deleteEtTretdjById(Long id)
    {
        return tbEtTretdjMapper.deleteTbEtTretdjById(id);
    }
}
