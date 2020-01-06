package com.imedcare.project.etbj.xsefs.xsefsdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.xsefs.xsefsdj.mapper.TbEtXsefsdjMapper;
import com.imedcare.project.etbj.xsefs.xsefsdj.domain.TbEtXsefsdj;
import com.imedcare.project.etbj.xsefs.xsefsdj.service.ITbEtXsefsdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 新生儿随访登记Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-11
 */
@Service
public class TbEtXsefsdjServiceImpl implements ITbEtXsefsdjService 
{
    @Autowired
    private TbEtXsefsdjMapper tbEtXsefsdjMapper;

    /**
     * 查询新生儿随访登记
     * 
     * @param id 新生儿随访登记ID
     * @return 新生儿随访登记
     */
    @Override
    public TbEtXsefsdj selectTbEtXsefsdjById(Long id)
    {
        return tbEtXsefsdjMapper.selectTbEtXsefsdjById(id);
    }

    /**
     * 查询新生儿随访登记列表
     * 
     * @param tbEtXsefsdj 新生儿随访登记
     * @return 新生儿随访登记
     */
    @Override
    public List<TbEtXsefsdj> selectTbEtXsefsdjList(TbEtXsefsdj tbEtXsefsdj)
    {
        return tbEtXsefsdjMapper.selectTbEtXsefsdjList(tbEtXsefsdj);
    }

    /**
     * 新增新生儿随访登记
     * 
     * @param tbEtXsefsdj 新生儿随访登记
     * @return 结果
     */
    @Override
    public int insertTbEtXsefsdj(TbEtXsefsdj tbEtXsefsdj)
    {
        return tbEtXsefsdjMapper.insertTbEtXsefsdj(tbEtXsefsdj);
    }

    /**
     * 修改新生儿随访登记
     * 
     * @param tbEtXsefsdj 新生儿随访登记
     * @return 结果
     */
    @Override
    public int updateTbEtXsefsdj(TbEtXsefsdj tbEtXsefsdj)
    {
        return tbEtXsefsdjMapper.updateTbEtXsefsdj(tbEtXsefsdj);
    }

    /**
     * 删除新生儿随访登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtXsefsdjByIds(String ids)
    {
        return tbEtXsefsdjMapper.deleteTbEtXsefsdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新生儿随访登记信息
     * 
     * @param id 新生儿随访登记ID
     * @return 结果
     */
    @Override
    public int deleteTbEtXsefsdjById(Long id)
    {
        return tbEtXsefsdjMapper.deleteTbEtXsefsdjById(id);
    }
}
