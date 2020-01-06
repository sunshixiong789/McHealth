package com.imedcare.project.etbj.xsefs.xsefsdj.mapper;

import com.imedcare.project.etbj.xsefs.xsefsdj.domain.TbEtXsefsdj;
import java.util.List;

/**
 * 新生儿随访登记Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-11
 */
public interface TbEtXsefsdjMapper 
{
    /**
     * 查询新生儿随访登记
     * 
     * @param id 新生儿随访登记ID
     * @return 新生儿随访登记
     */
    public TbEtXsefsdj selectTbEtXsefsdjById(Long id);

    /**
     * 查询新生儿随访登记列表
     * 
     * @param tbEtXsefsdj 新生儿随访登记
     * @return 新生儿随访登记集合
     */
    public List<TbEtXsefsdj> selectTbEtXsefsdjList(TbEtXsefsdj tbEtXsefsdj);

    /**
     * 新增新生儿随访登记
     * 
     * @param tbEtXsefsdj 新生儿随访登记
     * @return 结果
     */
    public int insertTbEtXsefsdj(TbEtXsefsdj tbEtXsefsdj);

    /**
     * 修改新生儿随访登记
     * 
     * @param tbEtXsefsdj 新生儿随访登记
     * @return 结果
     */
    public int updateTbEtXsefsdj(TbEtXsefsdj tbEtXsefsdj);

    /**
     * 删除新生儿随访登记
     * 
     * @param id 新生儿随访登记ID
     * @return 结果
     */
    public int deleteTbEtXsefsdjById(Long id);

    /**
     * 批量删除新生儿随访登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtXsefsdjByIds(String[] ids);
}
