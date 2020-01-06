package com.imedcare.project.fnbj.cffs.cffsdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cffs.cffsdj.mapper.TbChCffsdjMapper;
import com.imedcare.project.fnbj.cffs.cffsdj.domain.TbChCffsdj;
import com.imedcare.project.fnbj.cffs.cffsdj.service.ITbChCffsdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产妇访视登记Service业务层处理
 * 
 * @author zsl
 * @date 2019-11-15
 */
@Service
public class TbChCffsdjServiceImpl implements ITbChCffsdjService 
{
    @Autowired
    private TbChCffsdjMapper tbChCffsdjMapper;

    /**
     * 查询产妇访视登记
     * 
     * @param id 产妇访视登记ID
     * @return 产妇访视登记
     */
    @Override
    public TbChCffsdj selectTbChCffsdjById(Long id)
    {
        return tbChCffsdjMapper.selectTbChCffsdjById(id);
    }

    /**
     * 查询产妇访视登记列表
     * 
     * @param tbChCffsdj 产妇访视登记
     * @return 产妇访视登记
     */
    @Override
    public List<TbChCffsdj> selectTbChCffsdjList(TbChCffsdj tbChCffsdj)
    {
        return tbChCffsdjMapper.selectTbChCffsdjList(tbChCffsdj);
    }

    /**
     * 新增产妇访视登记
     * 
     * @param tbChCffsdj 产妇访视登记
     * @return 结果
     */
    @Override
    public int insertTbChCffsdj(TbChCffsdj tbChCffsdj)
    {
        return tbChCffsdjMapper.insertTbChCffsdj(tbChCffsdj);
    }

    /**
     * 修改产妇访视登记
     * 
     * @param tbChCffsdj 产妇访视登记
     * @return 结果
     */
    @Override
    public int updateTbChCffsdj(TbChCffsdj tbChCffsdj)
    {
        return tbChCffsdjMapper.updateTbChCffsdj(tbChCffsdj);
    }

    /**
     * 删除产妇访视登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCffsdjByIds(String ids)
    {
        return tbChCffsdjMapper.deleteTbChCffsdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产妇访视登记信息
     * 
     * @param id 产妇访视登记ID
     * @return 结果
     */
    @Override
    public int deleteTbChCffsdjById(Long id)
    {
        return tbChCffsdjMapper.deleteTbChCffsdjById(id);
    }
}
