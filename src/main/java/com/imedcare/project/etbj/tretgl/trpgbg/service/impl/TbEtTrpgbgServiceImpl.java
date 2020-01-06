package com.imedcare.project.etbj.tretgl.trpgbg.service.impl;

import java.util.List;

import com.imedcare.project.etbj.tretgl.trpgbg.domain.TbEtTrpgbgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.tretgl.trpgbg.mapper.TbEtTrpgbgMapper;
import com.imedcare.project.etbj.tretgl.trpgbg.domain.TbEtTrpgbg;
import com.imedcare.project.etbj.tretgl.trpgbg.service.ITbEtTrpgbgService;
import com.imedcare.common.utils.text.Convert;

/**
 * 体弱儿童评估报告Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-27
 */
@Service
public class TbEtTrpgbgServiceImpl implements ITbEtTrpgbgService 
{
    @Autowired
    private TbEtTrpgbgMapper tbEtTrpgbgMapper;

    /**
     * 查询体弱儿童评估报告
     * 
     * @param id 体弱儿童评估报告ID
     * @return 体弱儿童评估报告
     */
    @Override
    public TbEtTrpgbgVo selectTbEtTrpgbgById(Long id)
    {
        return tbEtTrpgbgMapper.selectTbEtTrpgbgById(id);
    }

    /**
     * 查询体弱儿童评估报告列表
     * 
     * @param tbEtTrpgbg 体弱儿童评估报告
     * @return 体弱儿童评估报告
     */
    @Override
    public List<TbEtTrpgbgVo> selectTbEtTrpgbgList(TbEtTrpgbgVo tbEtTrpgbg)
    {
        return tbEtTrpgbgMapper.selectTbEtTrpgbgList(tbEtTrpgbg);
    }

    /**
     * 新增体弱儿童评估报告
     * 
     * @param tbEtTrpgbg 体弱儿童评估报告
     * @return 结果
     */
    @Override
    public int insertTbEtTrpgbg(TbEtTrpgbg tbEtTrpgbg)
    {
        return tbEtTrpgbgMapper.insertTbEtTrpgbg(tbEtTrpgbg);
    }

    /**
     * 修改体弱儿童评估报告
     * 
     * @param tbEtTrpgbg 体弱儿童评估报告
     * @return 结果
     */
    @Override
    public int updateTbEtTrpgbg(TbEtTrpgbg tbEtTrpgbg)
    {
        return tbEtTrpgbgMapper.updateTbEtTrpgbg(tbEtTrpgbg);
    }

    /**
     * 删除体弱儿童评估报告对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTrpgbgByIds(String ids)
    {
        return tbEtTrpgbgMapper.deleteTbEtTrpgbgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除体弱儿童评估报告信息
     * 
     * @param id 体弱儿童评估报告ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTrpgbgById(Long id)
    {
        return tbEtTrpgbgMapper.deleteTbEtTrpgbgById(id);
    }
}
