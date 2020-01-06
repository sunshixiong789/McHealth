package com.imedcare.project.fnbj.chjc.chsysjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.chjc.chsysjcjl.mapper.TbChChsysjcjlMapper;
import com.imedcare.project.fnbj.chjc.chsysjcjl.domain.TbChChsysjcjl;
import com.imedcare.project.fnbj.chjc.chsysjcjl.service.ITbChChsysjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产后42天实验室检查记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Service
public class TbChChsysjcjlServiceImpl implements ITbChChsysjcjlService 
{
    @Autowired
    private TbChChsysjcjlMapper tbChChsysjcjlMapper;

    /**
     * 查询产后42天实验室检查记录
     * 
     * @param id 产后42天实验室检查记录ID
     * @return 产后42天实验室检查记录
     */
    @Override
    public TbChChsysjcjl selectTbChChsysjcjlById(Long id)
    {
        return tbChChsysjcjlMapper.selectTbChChsysjcjlById(id);
    }

    /**
     * 查询产后42天实验室检查记录列表
     * 
     * @param tbChChsysjcjl 产后42天实验室检查记录
     * @return 产后42天实验室检查记录
     */
    @Override
    public List<TbChChsysjcjl> selectTbChChsysjcjlList(TbChChsysjcjl tbChChsysjcjl)
    {
        return tbChChsysjcjlMapper.selectTbChChsysjcjlList(tbChChsysjcjl);
    }

    /**
     * 新增产后42天实验室检查记录
     * 
     * @param tbChChsysjcjl 产后42天实验室检查记录
     * @return 结果
     */
    @Override
    public int insertTbChChsysjcjl(TbChChsysjcjl tbChChsysjcjl)
    {
        return tbChChsysjcjlMapper.insertTbChChsysjcjl(tbChChsysjcjl);
    }

    /**
     * 修改产后42天实验室检查记录
     * 
     * @param tbChChsysjcjl 产后42天实验室检查记录
     * @return 结果
     */
    @Override
    public int updateTbChChsysjcjl(TbChChsysjcjl tbChChsysjcjl)
    {
        return tbChChsysjcjlMapper.updateTbChChsysjcjl(tbChChsysjcjl);
    }

    /**
     * 删除产后42天实验室检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChChsysjcjlByIds(String ids)
    {
        return tbChChsysjcjlMapper.deleteTbChChsysjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产后42天实验室检查记录信息
     * 
     * @param id 产后42天实验室检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChChsysjcjlById(Long id)
    {
        return tbChChsysjcjlMapper.deleteTbChChsysjcjlById(id);
    }
}
