package com.imedcare.project.etbj.xsejbsc.zyyxzh.service;

import com.imedcare.project.etbj.xsejbsc.zyyxzh.domain.TbEtZyyxzh;
import com.imedcare.project.etbj.xsejbsc.zyyxzh.domain.TbEtZyyxzhVo;

import java.util.List;

/**
 * 新生儿疾病筛查可疑阳性召回Service接口
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
public interface ITbEtZyyxzhService 
{
    /**
     * 查询新生儿疾病筛查可疑阳性召回
     * 
     * @param id 新生儿疾病筛查可疑阳性召回ID
     * @return 新生儿疾病筛查可疑阳性召回
     */
    public TbEtZyyxzhVo selectTbEtZyyxzhById(Long id);

    /**
     * 查询新生儿疾病筛查可疑阳性召回列表
     * 
     * @param tbEtZyyxzh 新生儿疾病筛查可疑阳性召回
     * @return 新生儿疾病筛查可疑阳性召回集合
     */
    public List<TbEtZyyxzhVo> selectTbEtZyyxzhList(TbEtZyyxzhVo tbEtZyyxzh);

    /**
     * 新增新生儿疾病筛查可疑阳性召回
     * 
     * @param tbEtZyyxzh 新生儿疾病筛查可疑阳性召回
     * @return 结果
     */
    public int insertTbEtZyyxzh(TbEtZyyxzh tbEtZyyxzh);

    /**
     * 修改新生儿疾病筛查可疑阳性召回
     * 
     * @param tbEtZyyxzh 新生儿疾病筛查可疑阳性召回
     * @return 结果
     */
    public int updateTbEtZyyxzh(TbEtZyyxzh tbEtZyyxzh);

    /**
     * 批量删除新生儿疾病筛查可疑阳性召回
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtZyyxzhByIds(String ids);

    /**
     * 删除新生儿疾病筛查可疑阳性召回信息
     * 
     * @param id 新生儿疾病筛查可疑阳性召回ID
     * @return 结果
     */
    public int deleteTbEtZyyxzhById(Long id);
}
