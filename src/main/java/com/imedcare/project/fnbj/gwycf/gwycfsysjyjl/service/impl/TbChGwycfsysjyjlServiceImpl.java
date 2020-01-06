package com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.mapper.TbChGwycfsysjyjlMapper;
import com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.domain.TbChGwycfsysjyjl;
import com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.service.ITbChGwycfsysjyjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 高危孕产妇实验室检验记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Service
public class TbChGwycfsysjyjlServiceImpl implements ITbChGwycfsysjyjlService 
{
    @Autowired
    private TbChGwycfsysjyjlMapper tbChGwycfsysjyjlMapper;

    /**
     * 查询高危孕产妇实验室检验记录
     * 
     * @param id 高危孕产妇实验室检验记录ID
     * @return 高危孕产妇实验室检验记录
     */
    @Override
    public TbChGwycfsysjyjl selectTbChGwycfsysjyjlById(Long id)
    {
        return tbChGwycfsysjyjlMapper.selectTbChGwycfsysjyjlById(id);
    }

    /**
     * 查询高危孕产妇实验室检验记录列表
     * 
     * @param tbChGwycfsysjyjl 高危孕产妇实验室检验记录
     * @return 高危孕产妇实验室检验记录
     */
    @Override
    public List<TbChGwycfsysjyjl> selectTbChGwycfsysjyjlList(TbChGwycfsysjyjl tbChGwycfsysjyjl)
    {
        return tbChGwycfsysjyjlMapper.selectTbChGwycfsysjyjlList(tbChGwycfsysjyjl);
    }

    /**
     * 新增高危孕产妇实验室检验记录
     * 
     * @param tbChGwycfsysjyjl 高危孕产妇实验室检验记录
     * @return 结果
     */
    @Override
    public int insertTbChGwycfsysjyjl(TbChGwycfsysjyjl tbChGwycfsysjyjl)
    {
        return tbChGwycfsysjyjlMapper.insertTbChGwycfsysjyjl(tbChGwycfsysjyjl);
    }

    /**
     * 修改高危孕产妇实验室检验记录
     * 
     * @param tbChGwycfsysjyjl 高危孕产妇实验室检验记录
     * @return 结果
     */
    @Override
    public int updateTbChGwycfsysjyjl(TbChGwycfsysjyjl tbChGwycfsysjyjl)
    {
        return tbChGwycfsysjyjlMapper.updateTbChGwycfsysjyjl(tbChGwycfsysjyjl);
    }

    /**
     * 删除高危孕产妇实验室检验记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfsysjyjlByIds(String ids)
    {
        return tbChGwycfsysjyjlMapper.deleteTbChGwycfsysjyjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高危孕产妇实验室检验记录信息
     * 
     * @param id 高危孕产妇实验室检验记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfsysjyjlById(Long id)
    {
        return tbChGwycfsysjyjlMapper.deleteTbChGwycfsysjyjlById(id);
    }
}
