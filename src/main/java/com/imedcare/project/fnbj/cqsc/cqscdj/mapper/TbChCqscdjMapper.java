package com.imedcare.project.fnbj.cqsc.cqscdj.mapper;

import com.imedcare.project.fnbj.cqsc.cqscdj.domain.TbChCqscdj;
import java.util.List;

/**
 * 产前筛查登记Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqscdjMapper 
{
    /**
     * 查询产前筛查登记
     * 
     * @param id 产前筛查登记ID
     * @return 产前筛查登记
     */
    public TbChCqscdj selectTbChCqscdjById(Long id);

    /**
     * 查询产前筛查登记列表
     * 
     * @param tbChCqscdj 产前筛查登记
     * @return 产前筛查登记集合
     */
    public List<TbChCqscdj> selectTbChCqscdjList(TbChCqscdj tbChCqscdj);

    /**
     * 新增产前筛查登记
     * 
     * @param tbChCqscdj 产前筛查登记
     * @return 结果
     */
    public int insertTbChCqscdj(TbChCqscdj tbChCqscdj);

    /**
     * 修改产前筛查登记
     * 
     * @param tbChCqscdj 产前筛查登记
     * @return 结果
     */
    public int updateTbChCqscdj(TbChCqscdj tbChCqscdj);

    /**
     * 删除产前筛查登记
     * 
     * @param id 产前筛查登记ID
     * @return 结果
     */
    public int deleteTbChCqscdjById(Long id);

    /**
     * 批量删除产前筛查登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqscdjByIds(String[] ids);
}
