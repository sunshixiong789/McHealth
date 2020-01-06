package com.imedcare.project.fnbpc.fnbpcwxjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbpc.fnbpcwxjl.mapper.TbFbFnbpcwxjlMapper;
import com.imedcare.project.fnbpc.fnbpcwxjl.domain.TbFbFnbpcwxjl;
import com.imedcare.project.fnbpc.fnbpcwxjl.service.ITbFbFnbpcwxjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 妇女病普查问询记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-20
 */
@Service
public class TbFbFnbpcwxjlServiceImpl implements ITbFbFnbpcwxjlService 
{
    @Autowired
    private TbFbFnbpcwxjlMapper tbFbFnbpcwxjlMapper;

    /**
     * 查询妇女病普查问询记录
     * 
     * @param id 妇女病普查问询记录ID
     * @return 妇女病普查问询记录
     */
    @Override
    public TbFbFnbpcwxjl selectTbFbFnbpcwxjlById(Long id)
    {
        return tbFbFnbpcwxjlMapper.selectTbFbFnbpcwxjlById(id);
    }

    /**
     * 查询妇女病普查问询记录列表
     * 
     * @param tbFbFnbpcwxjl 妇女病普查问询记录
     * @return 妇女病普查问询记录
     */
    @Override
    public List<TbFbFnbpcwxjl> selectTbFbFnbpcwxjlList(TbFbFnbpcwxjl tbFbFnbpcwxjl)
    {
        return tbFbFnbpcwxjlMapper.selectTbFbFnbpcwxjlList(tbFbFnbpcwxjl);
    }

    /**
     * 新增妇女病普查问询记录
     * 
     * @param tbFbFnbpcwxjl 妇女病普查问询记录
     * @return 结果
     */
    @Override
    public int insertTbFbFnbpcwxjl(TbFbFnbpcwxjl tbFbFnbpcwxjl)
    {
        return tbFbFnbpcwxjlMapper.insertTbFbFnbpcwxjl(tbFbFnbpcwxjl);
    }

    /**
     * 修改妇女病普查问询记录
     * 
     * @param tbFbFnbpcwxjl 妇女病普查问询记录
     * @return 结果
     */
    @Override
    public int updateTbFbFnbpcwxjl(TbFbFnbpcwxjl tbFbFnbpcwxjl)
    {
        return tbFbFnbpcwxjlMapper.updateTbFbFnbpcwxjl(tbFbFnbpcwxjl);
    }

    /**
     * 删除妇女病普查问询记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpcwxjlByIds(String ids)
    {
        return tbFbFnbpcwxjlMapper.deleteTbFbFnbpcwxjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除妇女病普查问询记录信息
     * 
     * @param id 妇女病普查问询记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpcwxjlById(Long id)
    {
        return tbFbFnbpcwxjlMapper.deleteTbFbFnbpcwxjlById(id);
    }
}
