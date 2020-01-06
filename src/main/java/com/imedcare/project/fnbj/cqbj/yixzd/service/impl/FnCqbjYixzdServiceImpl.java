package com.imedcare.project.fnbj.cqbj.yixzd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqbj.yixzd.mapper.FnCqbjYixzdMapper;
import com.imedcare.project.fnbj.cqbj.yixzd.domain.FnCqbjYixzd;
import com.imedcare.project.fnbj.cqbj.yixzd.service.IFnCqbjYixzdService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前保健医学指导Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Service
public class FnCqbjYixzdServiceImpl implements IFnCqbjYixzdService 
{
    @Autowired
    private FnCqbjYixzdMapper fnCqbjYixzdMapper;

    /**
     * 查询产前保健医学指导
     * 
     * @param id 产前保健医学指导ID
     * @return 产前保健医学指导
     */
    @Override
    public FnCqbjYixzd selectFnCqbjYixzdById(Long id)
    {
        return fnCqbjYixzdMapper.selectFnCqbjYixzdById(id);
    }

    /**
     * 查询产前保健医学指导列表
     * 
     * @param fnCqbjYixzd 产前保健医学指导
     * @return 产前保健医学指导
     */
    @Override
    public List<FnCqbjYixzd> selectFnCqbjYixzdList(FnCqbjYixzd fnCqbjYixzd)
    {
        return fnCqbjYixzdMapper.selectFnCqbjYixzdList(fnCqbjYixzd);
    }

    /**
     * 新增产前保健医学指导
     * 
     * @param fnCqbjYixzd 产前保健医学指导
     * @return 结果
     */
    @Override
    public int insertFnCqbjYixzd(FnCqbjYixzd fnCqbjYixzd)
    {
        return fnCqbjYixzdMapper.insertFnCqbjYixzd(fnCqbjYixzd);
    }

    /**
     * 修改产前保健医学指导
     * 
     * @param fnCqbjYixzd 产前保健医学指导
     * @return 结果
     */
    @Override
    public int updateFnCqbjYixzd(FnCqbjYixzd fnCqbjYixzd)
    {
        return fnCqbjYixzdMapper.updateFnCqbjYixzd(fnCqbjYixzd);
    }

    /**
     * 删除产前保健医学指导对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjYixzdByIds(String ids)
    {
        return fnCqbjYixzdMapper.deleteFnCqbjYixzdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前保健医学指导信息
     * 
     * @param id 产前保健医学指导ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjYixzdById(Long id)
    {
        return fnCqbjYixzdMapper.deleteFnCqbjYixzdById(id);
    }
}
