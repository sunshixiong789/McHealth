package com.imedcare.project.etbj.xsejbsc.xsejbscdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.xsejbsc.xsejbscdj.mapper.TbEtXsejbscdjMapper;
import com.imedcare.project.etbj.xsejbsc.xsejbscdj.domain.TbEtXsejbscdj;
import com.imedcare.project.etbj.xsejbsc.xsejbscdj.service.ITbEtXsejbscdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 新生儿疾病筛查登记Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-19
 */
@Service
public class TbEtXsejbscdjServiceImpl implements ITbEtXsejbscdjService 
{
    @Autowired
    private TbEtXsejbscdjMapper tbEtXsejbscdjMapper;

    /**
     * 查询新生儿疾病筛查登记
     * 
     * @param id 新生儿疾病筛查登记ID
     * @return 新生儿疾病筛查登记
     */
    @Override
    public TbEtXsejbscdj selectTbEtXsejbscdjById(Long id)
    {
        return tbEtXsejbscdjMapper.selectTbEtXsejbscdjById(id);
    }

    /**
     * 查询新生儿疾病筛查登记列表
     * 
     * @param tbEtXsejbscdj 新生儿疾病筛查登记
     * @return 新生儿疾病筛查登记
     */
    @Override
    public List<TbEtXsejbscdj> selectTbEtXsejbscdjList(TbEtXsejbscdj tbEtXsejbscdj)
    {
        return tbEtXsejbscdjMapper.selectTbEtXsejbscdjList(tbEtXsejbscdj);
    }

    /**
     * 新增新生儿疾病筛查登记
     * 
     * @param tbEtXsejbscdj 新生儿疾病筛查登记
     * @return 结果
     */
    @Override
    public int insertTbEtXsejbscdj(TbEtXsejbscdj tbEtXsejbscdj)
    {
        return tbEtXsejbscdjMapper.insertTbEtXsejbscdj(tbEtXsejbscdj);
    }

    /**
     * 修改新生儿疾病筛查登记
     * 
     * @param tbEtXsejbscdj 新生儿疾病筛查登记
     * @return 结果
     */
    @Override
    public int updateTbEtXsejbscdj(TbEtXsejbscdj tbEtXsejbscdj)
    {
        return tbEtXsejbscdjMapper.updateTbEtXsejbscdj(tbEtXsejbscdj);
    }

    /**
     * 删除新生儿疾病筛查登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtXsejbscdjByIds(String ids)
    {
        return tbEtXsejbscdjMapper.deleteTbEtXsejbscdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新生儿疾病筛查登记信息
     * 
     * @param id 新生儿疾病筛查登记ID
     * @return 结果
     */
    @Override
    public int deleteTbEtXsejbscdjById(Long id)
    {
        return tbEtXsejbscdjMapper.deleteTbEtXsejbscdjById(id);
    }
}
