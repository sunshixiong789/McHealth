package com.imedcare.project.fn.cqsczdxx.mapper;

import com.imedcare.project.fn.cqsczdxx.domain.TbFbCqsczdxx;
import java.util.List;

/**
 * 产前筛查诊断信息Mapper接口
 * 
 * @author maqilin
 * @date 2019-11-08
 */
public interface TbFbCqsczdxxMapper 
{
    /**
     * 查询产前筛查诊断信息
     * 
     * @param id 产前筛查诊断信息ID
     * @return 产前筛查诊断信息
     */
    public TbFbCqsczdxx selectTbFbCqsczdxxById(Long id);

    /**
     * 查询产前筛查诊断信息列表
     * 
     * @param tbFbCqsczdxx 产前筛查诊断信息
     * @return 产前筛查诊断信息集合
     */
    public List<TbFbCqsczdxx> selectTbFbCqsczdxxList(TbFbCqsczdxx tbFbCqsczdxx);

    /**
     * 新增产前筛查诊断信息
     * 
     * @param tbFbCqsczdxx 产前筛查诊断信息
     * @return 结果
     */
    public int insertTbFbCqsczdxx(TbFbCqsczdxx tbFbCqsczdxx);

    /**
     * 修改产前筛查诊断信息
     * 
     * @param tbFbCqsczdxx 产前筛查诊断信息
     * @return 结果
     */
    public int updateTbFbCqsczdxx(TbFbCqsczdxx tbFbCqsczdxx);

    /**
     * 删除产前筛查诊断信息
     * 
     * @param id 产前筛查诊断信息ID
     * @return 结果
     */
    public int deleteTbFbCqsczdxxById(Long id);

    /**
     * 批量删除产前筛查诊断信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbCqsczdxxByIds(String[] ids);
}
