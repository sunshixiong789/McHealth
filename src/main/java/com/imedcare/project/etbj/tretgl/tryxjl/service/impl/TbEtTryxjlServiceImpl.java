package com.imedcare.project.etbj.tretgl.tryxjl.service.impl;

import java.util.List;

import com.imedcare.project.etbj.tretgl.tryxjl.domain.TbEtTryxjlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.tretgl.tryxjl.mapper.TbEtTryxjlMapper;
import com.imedcare.project.etbj.tretgl.tryxjl.domain.TbEtTryxjl;
import com.imedcare.project.etbj.tretgl.tryxjl.service.ITbEtTryxjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 体弱儿童影像检查记录Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Service
public class TbEtTryxjlServiceImpl implements ITbEtTryxjlService 
{
    @Autowired
    private TbEtTryxjlMapper tbEtTryxjlMapper;

    /**
     * 查询体弱儿童影像检查记录
     * 
     * @param id 体弱儿童影像检查记录ID
     * @return 体弱儿童影像检查记录
     */
    @Override
    public TbEtTryxjlVo selectTbEtTryxjlById(Long id)
    {
        return tbEtTryxjlMapper.selectTbEtTryxjlById(id);
    }

    /**
     * 查询体弱儿童影像检查记录列表
     * 
     * @param tbEtTryxjl 体弱儿童影像检查记录
     * @return 体弱儿童影像检查记录
     */
    @Override
    public List<TbEtTryxjlVo> selectTbEtTryxjlList(TbEtTryxjlVo tbEtTryxjl)
    {
        return tbEtTryxjlMapper.selectTbEtTryxjlList(tbEtTryxjl);
    }

    /**
     * 新增体弱儿童影像检查记录
     * 
     * @param tbEtTryxjl 体弱儿童影像检查记录
     * @return 结果
     */
    @Override
    public int insertTbEtTryxjl(TbEtTryxjl tbEtTryxjl)
    {
        return tbEtTryxjlMapper.insertTbEtTryxjl(tbEtTryxjl);
    }

    /**
     * 修改体弱儿童影像检查记录
     * 
     * @param tbEtTryxjl 体弱儿童影像检查记录
     * @return 结果
     */
    @Override
    public int updateTbEtTryxjl(TbEtTryxjl tbEtTryxjl)
    {
        return tbEtTryxjlMapper.updateTbEtTryxjl(tbEtTryxjl);
    }

    /**
     * 删除体弱儿童影像检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTryxjlByIds(String ids)
    {
        return tbEtTryxjlMapper.deleteTbEtTryxjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除体弱儿童影像检查记录信息
     * 
     * @param id 体弱儿童影像检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTryxjlById(Long id)
    {
        return tbEtTryxjlMapper.deleteTbEtTryxjlById(id);
    }
}
