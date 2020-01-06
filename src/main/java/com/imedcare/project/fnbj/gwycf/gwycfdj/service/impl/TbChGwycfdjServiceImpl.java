package com.imedcare.project.fnbj.gwycf.gwycfdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.gwycf.gwycfdj.mapper.TbChGwycfdjMapper;
import com.imedcare.project.fnbj.gwycf.gwycfdj.domain.TbChGwycfdj;
import com.imedcare.project.fnbj.gwycf.gwycfdj.service.ITbChGwycfdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 高危孕产妇登记Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Service
public class TbChGwycfdjServiceImpl implements ITbChGwycfdjService 
{
    @Autowired
    private TbChGwycfdjMapper tbChGwycfdjMapper;

    /**
     * 查询高危孕产妇登记
     * 
     * @param id 高危孕产妇登记ID
     * @return 高危孕产妇登记
     */
    @Override
    public TbChGwycfdj selectTbChGwycfdjById(Long id)
    {
        return tbChGwycfdjMapper.selectTbChGwycfdjById(id);
    }

    /**
     * 查询高危孕产妇登记列表
     * 
     * @param tbChGwycfdj 高危孕产妇登记
     * @return 高危孕产妇登记
     */
    @Override
    public List<TbChGwycfdj> selectTbChGwycfdjList(TbChGwycfdj tbChGwycfdj)
    {
        return tbChGwycfdjMapper.selectTbChGwycfdjList(tbChGwycfdj);
    }

    /**
     * 新增高危孕产妇登记
     * 
     * @param tbChGwycfdj 高危孕产妇登记
     * @return 结果
     */
    @Override
    public int insertTbChGwycfdj(TbChGwycfdj tbChGwycfdj)
    {
        return tbChGwycfdjMapper.insertTbChGwycfdj(tbChGwycfdj);
    }

    /**
     * 修改高危孕产妇登记
     * 
     * @param tbChGwycfdj 高危孕产妇登记
     * @return 结果
     */
    @Override
    public int updateTbChGwycfdj(TbChGwycfdj tbChGwycfdj)
    {
        return tbChGwycfdjMapper.updateTbChGwycfdj(tbChGwycfdj);
    }

    /**
     * 删除高危孕产妇登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfdjByIds(String ids)
    {
        return tbChGwycfdjMapper.deleteTbChGwycfdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高危孕产妇登记信息
     * 
     * @param id 高危孕产妇登记ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfdjById(Long id)
    {
        return tbChGwycfdjMapper.deleteTbChGwycfdjById(id);
    }
}
