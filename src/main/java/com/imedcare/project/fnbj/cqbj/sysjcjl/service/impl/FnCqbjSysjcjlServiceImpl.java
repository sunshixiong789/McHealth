package com.imedcare.project.fnbj.cqbj.sysjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqbj.sysjcjl.mapper.FnCqbjSysjcjlMapper;
import com.imedcare.project.fnbj.cqbj.sysjcjl.domain.FnCqbjSysjcjl;
import com.imedcare.project.fnbj.cqbj.sysjcjl.service.IFnCqbjSysjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前保健实验室检查记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Service
public class FnCqbjSysjcjlServiceImpl implements IFnCqbjSysjcjlService 
{
    @Autowired
    private FnCqbjSysjcjlMapper fnCqbjSysjcjlMapper;

    /**
     * 查询产前保健实验室检查记录
     * 
     * @param id 产前保健实验室检查记录ID
     * @return 产前保健实验室检查记录
     */
    @Override
    public FnCqbjSysjcjl selectFnCqbjSysjcjlById(Long id)
    {
        return fnCqbjSysjcjlMapper.selectFnCqbjSysjcjlById(id);
    }

    /**
     * 查询产前保健实验室检查记录列表
     * 
     * @param fnCqbjSysjcjl 产前保健实验室检查记录
     * @return 产前保健实验室检查记录
     */
    @Override
    public List<FnCqbjSysjcjl> selectFnCqbjSysjcjlList(FnCqbjSysjcjl fnCqbjSysjcjl)
    {
        return fnCqbjSysjcjlMapper.selectFnCqbjSysjcjlList(fnCqbjSysjcjl);
    }

    /**
     * 新增产前保健实验室检查记录
     * 
     * @param fnCqbjSysjcjl 产前保健实验室检查记录
     * @return 结果
     */
    @Override
    public int insertFnCqbjSysjcjl(FnCqbjSysjcjl fnCqbjSysjcjl)
    {
        return fnCqbjSysjcjlMapper.insertFnCqbjSysjcjl(fnCqbjSysjcjl);
    }

    /**
     * 修改产前保健实验室检查记录
     * 
     * @param fnCqbjSysjcjl 产前保健实验室检查记录
     * @return 结果
     */
    @Override
    public int updateFnCqbjSysjcjl(FnCqbjSysjcjl fnCqbjSysjcjl)
    {
        return fnCqbjSysjcjlMapper.updateFnCqbjSysjcjl(fnCqbjSysjcjl);
    }

    /**
     * 删除产前保健实验室检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjSysjcjlByIds(String ids)
    {
        return fnCqbjSysjcjlMapper.deleteFnCqbjSysjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前保健实验室检查记录信息
     * 
     * @param id 产前保健实验室检查记录ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjSysjcjlById(Long id)
    {
        return fnCqbjSysjcjlMapper.deleteFnCqbjSysjcjlById(id);
    }
}
