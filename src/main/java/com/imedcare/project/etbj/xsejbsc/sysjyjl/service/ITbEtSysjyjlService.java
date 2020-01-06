package com.imedcare.project.etbj.xsejbsc.sysjyjl.service;

import com.imedcare.project.etbj.xsejbsc.sysjyjl.domain.TbEtSysjyjl;
import com.imedcare.project.etbj.xsejbsc.sysjyjl.domain.TbEtSysjyjlVo;

import java.util.List;

/**
 * 新生儿疾病筛查实验室检查记录Service接口
 * 
 * @author 黄维业
 * @date 2019-11-20
 */
public interface ITbEtSysjyjlService 
{
    /**
     * 查询新生儿疾病筛查实验室检查记录
     * 
     * @param id 新生儿疾病筛查实验室检查记录ID
     * @return 新生儿疾病筛查实验室检查记录
     */
    public TbEtSysjyjlVo selectTbEtSysjyjlById(Long id);

    /**
     * 查询新生儿疾病筛查实验室检查记录列表
     * 
     * @param tbEtSysjyjl 新生儿疾病筛查实验室检查记录
     * @return 新生儿疾病筛查实验室检查记录集合
     */
    public List<TbEtSysjyjlVo> selectTbEtSysjyjlList(TbEtSysjyjl tbEtSysjyjl);

    /**
     * 新增新生儿疾病筛查实验室检查记录
     * 
     * @param tbEtSysjyjl 新生儿疾病筛查实验室检查记录
     * @return 结果
     */
    public int insertTbEtSysjyjl(TbEtSysjyjl tbEtSysjyjl);

    /**
     * 修改新生儿疾病筛查实验室检查记录
     * 
     * @param tbEtSysjyjl 新生儿疾病筛查实验室检查记录
     * @return 结果
     */
    public int updateTbEtSysjyjl(TbEtSysjyjl tbEtSysjyjl);

    /**
     * 批量删除新生儿疾病筛查实验室检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtSysjyjlByIds(String ids);

    /**
     * 删除新生儿疾病筛查实验室检查记录信息
     * 
     * @param id 新生儿疾病筛查实验室检查记录ID
     * @return 结果
     */
    public int deleteTbEtSysjyjlById(Long id);
}
