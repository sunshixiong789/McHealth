package com.imedcare.project.fnbj.cqsc.cqscdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqsc.cqscdj.mapper.TbChCqscdjMapper;
import com.imedcare.project.fnbj.cqsc.cqscdj.domain.TbChCqscdj;
import com.imedcare.project.fnbj.cqsc.cqscdj.service.ITbChCqscdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前筛查登记Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqscdjServiceImpl implements ITbChCqscdjService 
{
    @Autowired
    private TbChCqscdjMapper tbChCqscdjMapper;

    /**
     * 查询产前筛查登记
     * 
     * @param id 产前筛查登记ID
     * @return 产前筛查登记
     */
    @Override
    public TbChCqscdj selectTbChCqscdjById(Long id)
    {
        return tbChCqscdjMapper.selectTbChCqscdjById(id);
    }

    /**
     * 查询产前筛查登记列表
     * 
     * @param tbChCqscdj 产前筛查登记
     * @return 产前筛查登记
     */
    @Override
    public List<TbChCqscdj> selectTbChCqscdjList(TbChCqscdj tbChCqscdj)
    {
        return tbChCqscdjMapper.selectTbChCqscdjList(tbChCqscdj);
    }

    /**
     * 新增产前筛查登记
     * 
     * @param tbChCqscdj 产前筛查登记
     * @return 结果
     */
    @Override
    public int insertTbChCqscdj(TbChCqscdj tbChCqscdj)
    {
        return tbChCqscdjMapper.insertTbChCqscdj(tbChCqscdj);
    }

    /**
     * 修改产前筛查登记
     * 
     * @param tbChCqscdj 产前筛查登记
     * @return 结果
     */
    @Override
    public int updateTbChCqscdj(TbChCqscdj tbChCqscdj)
    {
        return tbChCqscdjMapper.updateTbChCqscdj(tbChCqscdj);
    }

    /**
     * 删除产前筛查登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqscdjByIds(String ids)
    {
        return tbChCqscdjMapper.deleteTbChCqscdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前筛查登记信息
     * 
     * @param id 产前筛查登记ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqscdjById(Long id)
    {
        return tbChCqscdjMapper.deleteTbChCqscdjById(id);
    }
}
