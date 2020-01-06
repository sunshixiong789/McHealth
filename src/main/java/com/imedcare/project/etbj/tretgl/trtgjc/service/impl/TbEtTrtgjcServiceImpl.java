package com.imedcare.project.etbj.tretgl.trtgjc.service.impl;

import java.util.List;

import com.imedcare.project.etbj.tretgl.trtgjc.domain.TbEtTrtgjcVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.tretgl.trtgjc.mapper.TbEtTrtgjcMapper;
import com.imedcare.project.etbj.tretgl.trtgjc.domain.TbEtTrtgjc;
import com.imedcare.project.etbj.tretgl.trtgjc.service.ITbEtTrtgjcService;
import com.imedcare.common.utils.text.Convert;

/**
 * 体弱儿童体格检查记录Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Service
public class TbEtTrtgjcServiceImpl implements ITbEtTrtgjcService 
{
    @Autowired
    private TbEtTrtgjcMapper tbEtTrtgjcMapper;

    /**
     * 查询体弱儿童体格检查记录
     * 
     * @param id 体弱儿童体格检查记录ID
     * @return 体弱儿童体格检查记录
     */
    @Override
    public TbEtTrtgjcVo selectTbEtTrtgjcById(Long id)
    {
        return tbEtTrtgjcMapper.selectTbEtTrtgjcById(id);
    }

    /**
     * 查询体弱儿童体格检查记录列表
     * 
     * @param tbEtTrtgjc 体弱儿童体格检查记录
     * @return 体弱儿童体格检查记录
     */
    @Override
    public List<TbEtTrtgjcVo> selectTbEtTrtgjcList(TbEtTrtgjcVo tbEtTrtgjc)
    {
        return tbEtTrtgjcMapper.selectTbEtTrtgjcList(tbEtTrtgjc);
    }

    /**
     * 新增体弱儿童体格检查记录
     * 
     * @param tbEtTrtgjc 体弱儿童体格检查记录
     * @return 结果
     */
    @Override
    public int insertTbEtTrtgjc(TbEtTrtgjc tbEtTrtgjc)
    {
        return tbEtTrtgjcMapper.insertTbEtTrtgjc(tbEtTrtgjc);
    }

    /**
     * 修改体弱儿童体格检查记录
     * 
     * @param tbEtTrtgjc 体弱儿童体格检查记录
     * @return 结果
     */
    @Override
    public int updateTbEtTrtgjc(TbEtTrtgjc tbEtTrtgjc)
    {
        return tbEtTrtgjcMapper.updateTbEtTrtgjc(tbEtTrtgjc);
    }

    /**
     * 删除体弱儿童体格检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTrtgjcByIds(String ids)
    {
        return tbEtTrtgjcMapper.deleteTbEtTrtgjcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除体弱儿童体格检查记录信息
     * 
     * @param id 体弱儿童体格检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTrtgjcById(Long id)
    {
        return tbEtTrtgjcMapper.deleteTbEtTrtgjcById(id);
    }
}
