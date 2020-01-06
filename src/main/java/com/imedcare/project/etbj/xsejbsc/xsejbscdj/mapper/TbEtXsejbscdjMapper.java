package com.imedcare.project.etbj.xsejbsc.xsejbscdj.mapper;

import com.imedcare.project.etbj.xsejbsc.xsejbscdj.domain.TbEtXsejbscdj;
import java.util.List;

/**
 * 新生儿疾病筛查登记Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-19
 */
public interface TbEtXsejbscdjMapper 
{
    /**
     * 查询新生儿疾病筛查登记
     * 
     * @param id 新生儿疾病筛查登记ID
     * @return 新生儿疾病筛查登记
     */
    public TbEtXsejbscdj selectTbEtXsejbscdjById(Long id);

    /**
     * 查询新生儿疾病筛查登记列表
     * 
     * @param tbEtXsejbscdj 新生儿疾病筛查登记
     * @return 新生儿疾病筛查登记集合
     */
    public List<TbEtXsejbscdj> selectTbEtXsejbscdjList(TbEtXsejbscdj tbEtXsejbscdj);

    /**
     * 新增新生儿疾病筛查登记
     * 
     * @param tbEtXsejbscdj 新生儿疾病筛查登记
     * @return 结果
     */
    public int insertTbEtXsejbscdj(TbEtXsejbscdj tbEtXsejbscdj);

    /**
     * 修改新生儿疾病筛查登记
     * 
     * @param tbEtXsejbscdj 新生儿疾病筛查登记
     * @return 结果
     */
    public int updateTbEtXsejbscdj(TbEtXsejbscdj tbEtXsejbscdj);

    /**
     * 删除新生儿疾病筛查登记
     * 
     * @param id 新生儿疾病筛查登记ID
     * @return 结果
     */
    public int deleteTbEtXsejbscdjById(Long id);

    /**
     * 批量删除新生儿疾病筛查登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtXsejbscdjByIds(String[] ids);
}
