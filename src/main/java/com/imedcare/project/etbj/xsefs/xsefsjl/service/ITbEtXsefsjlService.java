package com.imedcare.project.etbj.xsefs.xsefsjl.service;

import com.imedcare.project.etbj.xsefs.xsefsjl.domain.TbEtXsefsjl;
import com.imedcare.project.etbj.xsefs.xsefsjl.domain.TbEtXsefsjlVo;

import java.util.List;

/**
 * 新生儿访视记录Service接口
 * 
 * @author 黄维业
 * @date 2019-11-12
 */
public interface ITbEtXsefsjlService 
{
    /**
     * 查询新生儿访视记录
     * 
     * @param id 新生儿访视记录ID
     * @return 新生儿访视记录
     */
    public TbEtXsefsjlVo selectTbEtXsefsjlById(Long id);

    /**
     * 查询新生儿访视记录列表
     * 
     * @param tbEtXsefsjl 新生儿访视记录
     * @return 新生儿访视记录集合
     */
    public List<TbEtXsefsjlVo> selectTbEtXsefsjlList(TbEtXsefsjlVo tbEtXsefsjl);

    /**
     * 新增新生儿访视记录
     * 
     * @param tbEtXsefsjl 新生儿访视记录
     * @return 结果
     */
    public int insertTbEtXsefsjl(TbEtXsefsjl tbEtXsefsjl);

    /**
     * 修改新生儿访视记录
     * 
     * @param tbEtXsefsjl 新生儿访视记录
     * @return 结果
     */
    public int updateTbEtXsefsjl(TbEtXsefsjl tbEtXsefsjl);

    /**
     * 批量删除新生儿访视记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtXsefsjlByIds(String ids);

    /**
     * 删除新生儿访视记录信息
     * 
     * @param id 新生儿访视记录ID
     * @return 结果
     */
    public int deleteTbEtXsefsjlById(Long id);
}
