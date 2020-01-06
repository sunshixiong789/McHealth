package com.imedcare.project.fnbj.chjc.chjcdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.chjc.chjcdj.mapper.TbChChjcdjMapper;
import com.imedcare.project.fnbj.chjc.chjcdj.domain.TbChChjcdj;
import com.imedcare.project.fnbj.chjc.chjcdj.service.ITbChChjcdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产后42天检查登记Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Service
public class TbChChjcdjServiceImpl implements ITbChChjcdjService 
{
    @Autowired
    private TbChChjcdjMapper tbChChjcdjMapper;

    /**
     * 查询产后42天检查登记
     * 
     * @param id 产后42天检查登记ID
     * @return 产后42天检查登记
     */
    @Override
    public TbChChjcdj selectTbChChjcdjById(Long id)
    {
        return tbChChjcdjMapper.selectTbChChjcdjById(id);
    }

    /**
     * 查询产后42天检查登记列表
     * 
     * @param tbChChjcdj 产后42天检查登记
     * @return 产后42天检查登记
     */
    @Override
    public List<TbChChjcdj> selectTbChChjcdjList(TbChChjcdj tbChChjcdj)
    {
        return tbChChjcdjMapper.selectTbChChjcdjList(tbChChjcdj);
    }

    /**
     * 新增产后42天检查登记
     * 
     * @param tbChChjcdj 产后42天检查登记
     * @return 结果
     */
    @Override
    public int insertTbChChjcdj(TbChChjcdj tbChChjcdj)
    {
        return tbChChjcdjMapper.insertTbChChjcdj(tbChChjcdj);
    }

    /**
     * 修改产后42天检查登记
     * 
     * @param tbChChjcdj 产后42天检查登记
     * @return 结果
     */
    @Override
    public int updateTbChChjcdj(TbChChjcdj tbChChjcdj)
    {
        return tbChChjcdjMapper.updateTbChChjcdj(tbChChjcdj);
    }

    /**
     * 删除产后42天检查登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChChjcdjByIds(String ids)
    {
        return tbChChjcdjMapper.deleteTbChChjcdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产后42天检查登记信息
     * 
     * @param id 产后42天检查登记ID
     * @return 结果
     */
    @Override
    public int deleteTbChChjcdjById(Long id)
    {
        return tbChChjcdjMapper.deleteTbChChjcdjById(id);
    }
}
