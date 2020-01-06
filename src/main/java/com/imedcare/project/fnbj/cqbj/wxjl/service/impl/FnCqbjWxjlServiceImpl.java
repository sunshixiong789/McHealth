package com.imedcare.project.fnbj.cqbj.wxjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqbj.wxjl.mapper.FnCqbjWxjlMapper;
import com.imedcare.project.fnbj.cqbj.wxjl.domain.FnCqbjWxjl;
import com.imedcare.project.fnbj.cqbj.wxjl.service.IFnCqbjWxjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前保健问询记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Service
public class FnCqbjWxjlServiceImpl implements IFnCqbjWxjlService 
{
    @Autowired
    private FnCqbjWxjlMapper fnCqbjWxjlMapper;

    /**
     * 查询产前保健问询记录
     * 
     * @param id 产前保健问询记录ID
     * @return 产前保健问询记录
     */
    @Override
    public FnCqbjWxjl selectFnCqbjWxjlById(Long id)
    {
        return fnCqbjWxjlMapper.selectFnCqbjWxjlById(id);
    }

    /**
     * 查询产前保健问询记录列表
     * 
     * @param fnCqbjWxjl 产前保健问询记录
     * @return 产前保健问询记录
     */
    @Override
    public List<FnCqbjWxjl> selectFnCqbjWxjlList(FnCqbjWxjl fnCqbjWxjl)
    {
        return fnCqbjWxjlMapper.selectFnCqbjWxjlList(fnCqbjWxjl);
    }

    /**
     * 新增产前保健问询记录
     * 
     * @param fnCqbjWxjl 产前保健问询记录
     * @return 结果
     */
    @Override
    public int insertFnCqbjWxjl(FnCqbjWxjl fnCqbjWxjl)
    {
        return fnCqbjWxjlMapper.insertFnCqbjWxjl(fnCqbjWxjl);
    }

    /**
     * 修改产前保健问询记录
     * 
     * @param fnCqbjWxjl 产前保健问询记录
     * @return 结果
     */
    @Override
    public int updateFnCqbjWxjl(FnCqbjWxjl fnCqbjWxjl)
    {
        return fnCqbjWxjlMapper.updateFnCqbjWxjl(fnCqbjWxjl);
    }

    /**
     * 删除产前保健问询记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjWxjlByIds(String ids)
    {
        return fnCqbjWxjlMapper.deleteFnCqbjWxjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前保健问询记录信息
     * 
     * @param id 产前保健问询记录ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjWxjlById(Long id)
    {
        return fnCqbjWxjlMapper.deleteFnCqbjWxjlById(id);
    }
}
