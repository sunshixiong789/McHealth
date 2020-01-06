package com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.mapper.TbChCqzdsysjyjlMapper;
import com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.domain.TbChCqzdsysjyjl;
import com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.service.ITbChCqzdsysjyjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前诊断实验室检验记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqzdsysjyjlServiceImpl implements ITbChCqzdsysjyjlService 
{
    @Autowired
    private TbChCqzdsysjyjlMapper tbChCqzdsysjyjlMapper;

    /**
     * 查询产前诊断实验室检验记录
     * 
     * @param id 产前诊断实验室检验记录ID
     * @return 产前诊断实验室检验记录
     */
    @Override
    public TbChCqzdsysjyjl selectTbChCqzdsysjyjlById(Long id)
    {
        return tbChCqzdsysjyjlMapper.selectTbChCqzdsysjyjlById(id);
    }

    /**
     * 查询产前诊断实验室检验记录列表
     * 
     * @param tbChCqzdsysjyjl 产前诊断实验室检验记录
     * @return 产前诊断实验室检验记录
     */
    @Override
    public List<TbChCqzdsysjyjl> selectTbChCqzdsysjyjlList(TbChCqzdsysjyjl tbChCqzdsysjyjl)
    {
        return tbChCqzdsysjyjlMapper.selectTbChCqzdsysjyjlList(tbChCqzdsysjyjl);
    }

    /**
     * 新增产前诊断实验室检验记录
     * 
     * @param tbChCqzdsysjyjl 产前诊断实验室检验记录
     * @return 结果
     */
    @Override
    public int insertTbChCqzdsysjyjl(TbChCqzdsysjyjl tbChCqzdsysjyjl)
    {
        return tbChCqzdsysjyjlMapper.insertTbChCqzdsysjyjl(tbChCqzdsysjyjl);
    }

    /**
     * 修改产前诊断实验室检验记录
     * 
     * @param tbChCqzdsysjyjl 产前诊断实验室检验记录
     * @return 结果
     */
    @Override
    public int updateTbChCqzdsysjyjl(TbChCqzdsysjyjl tbChCqzdsysjyjl)
    {
        return tbChCqzdsysjyjlMapper.updateTbChCqzdsysjyjl(tbChCqzdsysjyjl);
    }

    /**
     * 删除产前诊断实验室检验记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdsysjyjlByIds(String ids)
    {
        return tbChCqzdsysjyjlMapper.deleteTbChCqzdsysjyjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前诊断实验室检验记录信息
     * 
     * @param id 产前诊断实验室检验记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdsysjyjlById(Long id)
    {
        return tbChCqzdsysjyjlMapper.deleteTbChCqzdsysjyjlById(id);
    }
}
