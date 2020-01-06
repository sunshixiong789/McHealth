package com.imedcare.project.fnbj.cqzd.cqzddj.mapper;

import com.imedcare.project.fnbj.cqzd.cqzddj.domain.TbChCqzddj;
import java.util.List;

/**
 * 产前诊断登记Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqzddjMapper 
{
    /**
     * 查询产前诊断登记
     * 
     * @param id 产前诊断登记ID
     * @return 产前诊断登记
     */
    public TbChCqzddj selectTbChCqzddjById(Long id);

    /**
     * 查询产前诊断登记列表
     * 
     * @param tbChCqzddj 产前诊断登记
     * @return 产前诊断登记集合
     */
    public List<TbChCqzddj> selectTbChCqzddjList(TbChCqzddj tbChCqzddj);

    /**
     * 新增产前诊断登记
     * 
     * @param tbChCqzddj 产前诊断登记
     * @return 结果
     */
    public int insertTbChCqzddj(TbChCqzddj tbChCqzddj);

    /**
     * 修改产前诊断登记
     * 
     * @param tbChCqzddj 产前诊断登记
     * @return 结果
     */
    public int updateTbChCqzddj(TbChCqzddj tbChCqzddj);

    /**
     * 删除产前诊断登记
     * 
     * @param id 产前诊断登记ID
     * @return 结果
     */
    public int deleteTbChCqzddjById(Long id);

    /**
     * 批量删除产前诊断登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqzddjByIds(String[] ids);
}
