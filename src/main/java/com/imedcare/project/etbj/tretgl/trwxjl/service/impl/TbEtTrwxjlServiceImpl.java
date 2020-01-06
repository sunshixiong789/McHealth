package com.imedcare.project.etbj.tretgl.trwxjl.service.impl;

import java.util.List;

import com.imedcare.project.etbj.tretgl.trwxjl.domain.TbEtTrwxjlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.tretgl.trwxjl.mapper.TbEtTrwxjlMapper;
import com.imedcare.project.etbj.tretgl.trwxjl.domain.TbEtTrwxjl;
import com.imedcare.project.etbj.tretgl.trwxjl.service.ITbEtTrwxjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 体弱儿童问询记录Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Service
public class TbEtTrwxjlServiceImpl implements ITbEtTrwxjlService 
{
    @Autowired
    private TbEtTrwxjlMapper tbEtTrwxjlMapper;

    /**
     * 查询体弱儿童问询记录
     * 
     * @param id 体弱儿童问询记录ID
     * @return 体弱儿童问询记录
     */
    @Override
    public TbEtTrwxjlVo selectTbEtTrwxjlById(Long id)
    {
        return tbEtTrwxjlMapper.selectTbEtTrwxjlById(id);
    }

    /**
     * 查询体弱儿童问询记录列表
     * 
     * @param tbEtTrwxjl 体弱儿童问询记录
     * @return 体弱儿童问询记录
     */
    @Override
    public List<TbEtTrwxjlVo> selectTbEtTrwxjlList(TbEtTrwxjlVo tbEtTrwxjl)
    {
        return tbEtTrwxjlMapper.selectTbEtTrwxjlList(tbEtTrwxjl);
    }

    /**
     * 新增体弱儿童问询记录
     * 
     * @param tbEtTrwxjl 体弱儿童问询记录
     * @return 结果
     */
    @Override
    public int insertTbEtTrwxjl(TbEtTrwxjl tbEtTrwxjl)
    {
        return tbEtTrwxjlMapper.insertTbEtTrwxjl(tbEtTrwxjl);
    }

    /**
     * 修改体弱儿童问询记录
     * 
     * @param tbEtTrwxjl 体弱儿童问询记录
     * @return 结果
     */
    @Override
    public int updateTbEtTrwxjl(TbEtTrwxjl tbEtTrwxjl)
    {
        return tbEtTrwxjlMapper.updateTbEtTrwxjl(tbEtTrwxjl);
    }

    /**
     * 删除体弱儿童问询记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTrwxjlByIds(String ids)
    {
        return tbEtTrwxjlMapper.deleteTbEtTrwxjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除体弱儿童问询记录信息
     * 
     * @param id 体弱儿童问询记录ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTrwxjlById(Long id)
    {
        return tbEtTrwxjlMapper.deleteTbEtTrwxjlById(id);
    }
}
