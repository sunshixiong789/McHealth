package com.imedcare.project.fnbj.cqbj.tgjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqbj.tgjcjl.mapper.FnCqbjTgjcjlMapper;
import com.imedcare.project.fnbj.cqbj.tgjcjl.domain.FnCqbjTgjcjl;
import com.imedcare.project.fnbj.cqbj.tgjcjl.service.IFnCqbjTgjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前保健体格检查记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Service
public class FnCqbjTgjcjlServiceImpl implements IFnCqbjTgjcjlService 
{
    @Autowired
    private FnCqbjTgjcjlMapper fnCqbjTgjcjlMapper;

    /**
     * 查询产前保健体格检查记录
     * 
     * @param id 产前保健体格检查记录ID
     * @return 产前保健体格检查记录
     */
    @Override
    public FnCqbjTgjcjl selectFnCqbjTgjcjlById(Long id)
    {
        return fnCqbjTgjcjlMapper.selectFnCqbjTgjcjlById(id);
    }

    /**
     * 查询产前保健体格检查记录列表
     * 
     * @param fnCqbjTgjcjl 产前保健体格检查记录
     * @return 产前保健体格检查记录
     */
    @Override
    public List<FnCqbjTgjcjl> selectFnCqbjTgjcjlList(FnCqbjTgjcjl fnCqbjTgjcjl)
    {
        return fnCqbjTgjcjlMapper.selectFnCqbjTgjcjlList(fnCqbjTgjcjl);
    }

    /**
     * 新增产前保健体格检查记录
     * 
     * @param fnCqbjTgjcjl 产前保健体格检查记录
     * @return 结果
     */
    @Override
    public int insertFnCqbjTgjcjl(FnCqbjTgjcjl fnCqbjTgjcjl)
    {
        return fnCqbjTgjcjlMapper.insertFnCqbjTgjcjl(fnCqbjTgjcjl);
    }

    /**
     * 修改产前保健体格检查记录
     * 
     * @param fnCqbjTgjcjl 产前保健体格检查记录
     * @return 结果
     */
    @Override
    public int updateFnCqbjTgjcjl(FnCqbjTgjcjl fnCqbjTgjcjl)
    {
        return fnCqbjTgjcjlMapper.updateFnCqbjTgjcjl(fnCqbjTgjcjl);
    }

    /**
     * 删除产前保健体格检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjTgjcjlByIds(String ids)
    {
        return fnCqbjTgjcjlMapper.deleteFnCqbjTgjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前保健体格检查记录信息
     * 
     * @param id 产前保健体格检查记录ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjTgjcjlById(Long id)
    {
        return fnCqbjTgjcjlMapper.deleteFnCqbjTgjcjlById(id);
    }
}
