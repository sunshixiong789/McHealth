package com.imedcare.project.etbj.xsejbsc.sysjyjl.service.impl;

import java.util.List;

import com.imedcare.project.etbj.xsejbsc.sysjyjl.domain.TbEtSysjyjlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.xsejbsc.sysjyjl.mapper.TbEtSysjyjlMapper;
import com.imedcare.project.etbj.xsejbsc.sysjyjl.domain.TbEtSysjyjl;
import com.imedcare.project.etbj.xsejbsc.sysjyjl.service.ITbEtSysjyjlService;
import com.imedcare.common.utils.text.Convert;

import javax.annotation.Resource;

/**
 * 新生儿疾病筛查实验室检查记录Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-20
 */
@Service
public class TbEtSysjyjlServiceImpl implements ITbEtSysjyjlService 
{
    @Resource
    private TbEtSysjyjlMapper tbEtSysjyjlMapper;

    /**
     * 查询新生儿疾病筛查实验室检查记录
     * 
     * @param id 新生儿疾病筛查实验室检查记录ID
     * @return 新生儿疾病筛查实验室检查记录
     */
    @Override
    public TbEtSysjyjlVo selectTbEtSysjyjlById(Long id)
    {
        return tbEtSysjyjlMapper.selectTbEtSysjyjlById(id);
    }

    /**
     * 查询新生儿疾病筛查实验室检查记录列表
     * 
     * @param tbEtSysjyjl 新生儿疾病筛查实验室检查记录
     * @return 新生儿疾病筛查实验室检查记录
     */
    @Override
    public List<TbEtSysjyjlVo> selectTbEtSysjyjlList(TbEtSysjyjl tbEtSysjyjl)
    {
        return tbEtSysjyjlMapper.selectTbEtSysjyjlList(tbEtSysjyjl);
    }

    /**
     * 新增新生儿疾病筛查实验室检查记录
     * 
     * @param tbEtSysjyjl 新生儿疾病筛查实验室检查记录
     * @return 结果
     */
    @Override
    public int insertTbEtSysjyjl(TbEtSysjyjl tbEtSysjyjl)
    {
        return tbEtSysjyjlMapper.insertTbEtSysjyjl(tbEtSysjyjl);
    }

    /**
     * 修改新生儿疾病筛查实验室检查记录
     * 
     * @param tbEtSysjyjl 新生儿疾病筛查实验室检查记录
     * @return 结果
     */
    @Override
    public int updateTbEtSysjyjl(TbEtSysjyjl tbEtSysjyjl)
    {
        return tbEtSysjyjlMapper.updateTbEtSysjyjl(tbEtSysjyjl);
    }

    /**
     * 删除新生儿疾病筛查实验室检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtSysjyjlByIds(String ids)
    {
        return tbEtSysjyjlMapper.deleteTbEtSysjyjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新生儿疾病筛查实验室检查记录信息
     * 
     * @param id 新生儿疾病筛查实验室检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbEtSysjyjlById(Long id)
    {
        return tbEtSysjyjlMapper.deleteTbEtSysjyjlById(id);
    }
}
