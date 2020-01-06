package com.imedcare.project.fnbj.cqbj.zzjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqbj.zzjl.mapper.FnCqbjZzjlMapper;
import com.imedcare.project.fnbj.cqbj.zzjl.domain.FnCqbjZzjl;
import com.imedcare.project.fnbj.cqbj.zzjl.service.IFnCqbjZzjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前保健转诊记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Service
public class FnCqbjZzjlServiceImpl implements IFnCqbjZzjlService 
{
    @Autowired
    private FnCqbjZzjlMapper fnCqbjZzjlMapper;

    /**
     * 查询产前保健转诊记录
     * 
     * @param id 产前保健转诊记录ID
     * @return 产前保健转诊记录
     */
    @Override
    public FnCqbjZzjl selectFnCqbjZzjlById(Long id)
    {
        return fnCqbjZzjlMapper.selectFnCqbjZzjlById(id);
    }

    /**
     * 查询产前保健转诊记录列表
     * 
     * @param fnCqbjZzjl 产前保健转诊记录
     * @return 产前保健转诊记录
     */
    @Override
    public List<FnCqbjZzjl> selectFnCqbjZzjlList(FnCqbjZzjl fnCqbjZzjl)
    {
        return fnCqbjZzjlMapper.selectFnCqbjZzjlList(fnCqbjZzjl);
    }

    /**
     * 新增产前保健转诊记录
     * 
     * @param fnCqbjZzjl 产前保健转诊记录
     * @return 结果
     */
    @Override
    public int insertFnCqbjZzjl(FnCqbjZzjl fnCqbjZzjl)
    {
        return fnCqbjZzjlMapper.insertFnCqbjZzjl(fnCqbjZzjl);
    }

    /**
     * 修改产前保健转诊记录
     * 
     * @param fnCqbjZzjl 产前保健转诊记录
     * @return 结果
     */
    @Override
    public int updateFnCqbjZzjl(FnCqbjZzjl fnCqbjZzjl)
    {
        return fnCqbjZzjlMapper.updateFnCqbjZzjl(fnCqbjZzjl);
    }

    /**
     * 删除产前保健转诊记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjZzjlByIds(String ids)
    {
        return fnCqbjZzjlMapper.deleteFnCqbjZzjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前保健转诊记录信息
     * 
     * @param id 产前保健转诊记录ID
     * @return 结果
     */
    @Override
    public int deleteFnCqbjZzjlById(Long id)
    {
        return fnCqbjZzjlMapper.deleteFnCqbjZzjlById(id);
    }
}
