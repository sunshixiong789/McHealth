package com.imedcare.project.fnbj.cqbj.bdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqbj.bdj.mapper.FnCqbjBdjMapper;
import com.imedcare.project.fnbj.cqbj.bdj.domain.FnCqbjBdj;
import com.imedcare.project.fnbj.cqbj.bdj.service.IFnCqbjBdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前保健登记Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Service
public class FnCqbjBdjServiceImpl implements IFnCqbjBdjService 
{
    @Autowired
    private FnCqbjBdjMapper fnCqbjBdjMapper;

    /**
     * 查询产前保健登记
     * 
     * @param id 产前保健登记ID
     * @return 产前保健登记
     */
    @Override
    public FnCqbjBdj selectFnCqbjBdjById(Long id)
    {
        return fnCqbjBdjMapper.selectFnCqbjBdjById(id);
    }

    /**
     * 查询产前保健登记列表
     * 
     * @param fnCqbjBdj 产前保健登记
     * @return 产前保健登记
     */
    @Override
    public List<FnCqbjBdj> selectFnCqbjBdjList(FnCqbjBdj fnCqbjBdj)
    {
        return fnCqbjBdjMapper.selectFnCqbjBdjList(fnCqbjBdj);
    }

    /**
     * 新增产前保健登记
     * 
     * @param fnCqbjBdj 产前保健登记
     * @return 结果
     */
    @Override
    public int insertFnCqbjBdj(FnCqbjBdj fnCqbjBdj)
    {
        return fnCqbjBdjMapper.insertFnCqbjBdj(fnCqbjBdj);
    }

    /**
     * 修改产前保健登记
     * 
     * @param fnCqbjBdj 产前保健登记
     * @return 结果
     */
    @Override
    public int updateFnCqbjBdj(FnCqbjBdj fnCqbjBdj)
    {
        return fnCqbjBdjMapper.updateFnCqbjBdj(fnCqbjBdj);
    }

    /**
     * 删除产前保健登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjBdjByIds(String ids)
    {
        return fnCqbjBdjMapper.deleteFnCqbjBdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前保健登记信息
     * 
     * @param id 产前保健登记ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjBdjById(Long id)
    {
        return fnCqbjBdjMapper.deleteFnCqbjBdjById(id);
    }
}
