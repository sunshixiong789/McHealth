package com.imedcare.project.etbj.xsejbsc.jbsczd.service;

import com.imedcare.project.etbj.xsejbsc.jbsczd.domain.TbEtJbsczd;
import com.imedcare.project.etbj.xsejbsc.jbsczd.domain.TbEtJbsczdVo;

import java.util.List;

/**
 * 新生儿疾病筛查诊断记录Service接口
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
public interface ITbEtJbsczdService 
{
    /**
     * 查询新生儿疾病筛查诊断记录
     * 
     * @param id 新生儿疾病筛查诊断记录ID
     * @return 新生儿疾病筛查诊断记录
     */
    public TbEtJbsczdVo selectTbEtJbsczdById(Long id);

    /**
     * 查询新生儿疾病筛查诊断记录列表
     * 
     * @param tbEtJbsczd 新生儿疾病筛查诊断记录
     * @return 新生儿疾病筛查诊断记录集合
     */
    public List<TbEtJbsczdVo> selectTbEtJbsczdList(TbEtJbsczdVo tbEtJbsczd);

    /**
     * 新增新生儿疾病筛查诊断记录
     * 
     * @param tbEtJbsczd 新生儿疾病筛查诊断记录
     * @return 结果
     */
    public int insertTbEtJbsczd(TbEtJbsczd tbEtJbsczd);

    /**
     * 修改新生儿疾病筛查诊断记录
     * 
     * @param tbEtJbsczd 新生儿疾病筛查诊断记录
     * @return 结果
     */
    public int updateTbEtJbsczd(TbEtJbsczd tbEtJbsczd);

    /**
     * 批量删除新生儿疾病筛查诊断记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtJbsczdByIds(String ids);

    /**
     * 删除新生儿疾病筛查诊断记录信息
     * 
     * @param id 新生儿疾病筛查诊断记录ID
     * @return 结果
     */
    public int deleteTbEtJbsczdById(Long id);
}
