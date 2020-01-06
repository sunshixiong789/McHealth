package com.imedcare.project.fnbpc.fnbpcfzjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbpc.fnbpcfzjcjl.mapper.TbFbFnbpcfzjcjlMapper;
import com.imedcare.project.fnbpc.fnbpcfzjcjl.domain.TbFbFnbpcfzjcjl;
import com.imedcare.project.fnbpc.fnbpcfzjcjl.service.ITbFbFnbpcfzjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 妇女病普查辅助检查记录Service业务层处理
 * 
 * @author imedcare
 * @date 2019-11-21
 */
@Service
public class TbFbFnbpcfzjcjlServiceImpl implements ITbFbFnbpcfzjcjlService 
{
    @Autowired
    private TbFbFnbpcfzjcjlMapper tbFbFnbpcfzjcjlMapper;

    /**
     * 查询妇女病普查辅助检查记录
     * 
     * @param id 妇女病普查辅助检查记录ID
     * @return 妇女病普查辅助检查记录
     */
    @Override
    public TbFbFnbpcfzjcjl selectTbFbFnbpcfzjcjlById(Long id)
    {
        return tbFbFnbpcfzjcjlMapper.selectTbFbFnbpcfzjcjlById(id);
    }

    /**
     * 查询妇女病普查辅助检查记录列表
     * 
     * @param tbFbFnbpcfzjcjl 妇女病普查辅助检查记录
     * @return 妇女病普查辅助检查记录
     */
    @Override
    public List<TbFbFnbpcfzjcjl> selectTbFbFnbpcfzjcjlList(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl)
    {
        return tbFbFnbpcfzjcjlMapper.selectTbFbFnbpcfzjcjlList(tbFbFnbpcfzjcjl);
    }

    /**
     * 新增妇女病普查辅助检查记录
     * 
     * @param tbFbFnbpcfzjcjl 妇女病普查辅助检查记录
     * @return 结果
     */
    @Override
    public int insertTbFbFnbpcfzjcjl(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl)
    {
        return tbFbFnbpcfzjcjlMapper.insertTbFbFnbpcfzjcjl(tbFbFnbpcfzjcjl);
    }

    /**
     * 修改妇女病普查辅助检查记录
     * 
     * @param tbFbFnbpcfzjcjl 妇女病普查辅助检查记录
     * @return 结果
     */
    @Override
    public int updateTbFbFnbpcfzjcjl(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl)
    {
        return tbFbFnbpcfzjcjlMapper.updateTbFbFnbpcfzjcjl(tbFbFnbpcfzjcjl);
    }

    /**
     * 删除妇女病普查辅助检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpcfzjcjlByIds(String ids)
    {
        return tbFbFnbpcfzjcjlMapper.deleteTbFbFnbpcfzjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除妇女病普查辅助检查记录信息
     * 
     * @param id 妇女病普查辅助检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpcfzjcjlById(Long id)
    {
        return tbFbFnbpcfzjcjlMapper.deleteTbFbFnbpcfzjcjlById(id);
    }
}
