package com.imedcare.project.fnbj.cqsc.cqscsysjyjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqsc.cqscsysjyjl.mapper.TbChCqscsysjyjlMapper;
import com.imedcare.project.fnbj.cqsc.cqscsysjyjl.domain.TbChCqscsysjyjl;
import com.imedcare.project.fnbj.cqsc.cqscsysjyjl.service.ITbChCqscsysjyjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前筛查实验室检验记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqscsysjyjlServiceImpl implements ITbChCqscsysjyjlService 
{
    @Autowired
    private TbChCqscsysjyjlMapper tbChCqscsysjyjlMapper;

    /**
     * 查询产前筛查实验室检验记录
     * 
     * @param id 产前筛查实验室检验记录ID
     * @return 产前筛查实验室检验记录
     */
    @Override
    public TbChCqscsysjyjl selectTbChCqscsysjyjlById(Long id)
    {
        return tbChCqscsysjyjlMapper.selectTbChCqscsysjyjlById(id);
    }

    /**
     * 查询产前筛查实验室检验记录列表
     * 
     * @param tbChCqscsysjyjl 产前筛查实验室检验记录
     * @return 产前筛查实验室检验记录
     */
    @Override
    public List<TbChCqscsysjyjl> selectTbChCqscsysjyjlList(TbChCqscsysjyjl tbChCqscsysjyjl)
    {
        return tbChCqscsysjyjlMapper.selectTbChCqscsysjyjlList(tbChCqscsysjyjl);
    }

    /**
     * 新增产前筛查实验室检验记录
     * 
     * @param tbChCqscsysjyjl 产前筛查实验室检验记录
     * @return 结果
     */
    @Override
    public int insertTbChCqscsysjyjl(TbChCqscsysjyjl tbChCqscsysjyjl)
    {
        return tbChCqscsysjyjlMapper.insertTbChCqscsysjyjl(tbChCqscsysjyjl);
    }

    /**
     * 修改产前筛查实验室检验记录
     * 
     * @param tbChCqscsysjyjl 产前筛查实验室检验记录
     * @return 结果
     */
    @Override
    public int updateTbChCqscsysjyjl(TbChCqscsysjyjl tbChCqscsysjyjl)
    {
        return tbChCqscsysjyjlMapper.updateTbChCqscsysjyjl(tbChCqscsysjyjl);
    }

    /**
     * 删除产前筛查实验室检验记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqscsysjyjlByIds(String ids)
    {
        return tbChCqscsysjyjlMapper.deleteTbChCqscsysjyjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前筛查实验室检验记录信息
     * 
     * @param id 产前筛查实验室检验记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqscsysjyjlById(Long id)
    {
        return tbChCqscsysjyjlMapper.deleteTbChCqscsysjyjlById(id);
    }
}
