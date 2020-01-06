package com.imedcare.project.fnbj.cqbj.yxjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqbj.yxjcjl.mapper.FnCqbjYxjcjlMapper;
import com.imedcare.project.fnbj.cqbj.yxjcjl.domain.FnCqbjYxjcjl;
import com.imedcare.project.fnbj.cqbj.yxjcjl.service.IFnCqbjYxjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前保健影像检查记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Service
public class FnCqbjYxjcjlServiceImpl implements IFnCqbjYxjcjlService 
{
    @Autowired
    private FnCqbjYxjcjlMapper fnCqbjYxjcjlMapper;

    /**
     * 查询产前保健影像检查记录
     * 
     * @param id 产前保健影像检查记录ID
     * @return 产前保健影像检查记录
     */
    @Override
    public FnCqbjYxjcjl selectFnCqbjYxjcjlById(Long id)
    {
        return fnCqbjYxjcjlMapper.selectFnCqbjYxjcjlById(id);
    }

    /**
     * 查询产前保健影像检查记录列表
     * 
     * @param fnCqbjYxjcjl 产前保健影像检查记录
     * @return 产前保健影像检查记录
     */
    @Override
    public List<FnCqbjYxjcjl> selectFnCqbjYxjcjlList(FnCqbjYxjcjl fnCqbjYxjcjl)
    {
        return fnCqbjYxjcjlMapper.selectFnCqbjYxjcjlList(fnCqbjYxjcjl);
    }

    /**
     * 新增产前保健影像检查记录
     * 
     * @param fnCqbjYxjcjl 产前保健影像检查记录
     * @return 结果
     */
    @Override
    public int insertFnCqbjYxjcjl(FnCqbjYxjcjl fnCqbjYxjcjl)
    {
        return fnCqbjYxjcjlMapper.insertFnCqbjYxjcjl(fnCqbjYxjcjl);
    }

    /**
     * 修改产前保健影像检查记录
     * 
     * @param fnCqbjYxjcjl 产前保健影像检查记录
     * @return 结果
     */
    @Override
    public int updateFnCqbjYxjcjl(FnCqbjYxjcjl fnCqbjYxjcjl)
    {
        return fnCqbjYxjcjlMapper.updateFnCqbjYxjcjl(fnCqbjYxjcjl);
    }

    /**
     * 删除产前保健影像检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjYxjcjlByIds(String ids)
    {
        return fnCqbjYxjcjlMapper.deleteFnCqbjYxjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前保健影像检查记录信息
     * 
     * @param id 产前保健影像检查记录ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjYxjcjlById(Long id)
    {
        return fnCqbjYxjcjlMapper.deleteFnCqbjYxjcjlById(id);
    }
}
