package com.imedcare.project.fnbj.yqjc.yqjcdj.service;

import com.imedcare.project.fnbj.yqjc.yqjcdj.domain.TbChYqjc;
import java.util.List;

/**
 * 孕前优生健康检查Service接口
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
public interface ITbChYqjcService 
{
    /**
     * 查询孕前优生健康检查
     * 
     * @param id 孕前优生健康检查ID
     * @return 孕前优生健康检查
     */
    public TbChYqjc selectTbChYqjcById(Long id);

    /**
     * 查询孕前优生健康检查列表
     * 
     * @param tbChYqjc 孕前优生健康检查
     * @return 孕前优生健康检查集合
     */
    public List<TbChYqjc> selectTbChYqjcList(TbChYqjc tbChYqjc);

    /**
     * 新增孕前优生健康检查
     * 
     * @param tbChYqjc 孕前优生健康检查
     * @return 结果
     */
    public int insertTbChYqjc(TbChYqjc tbChYqjc);

    /**
     * 修改孕前优生健康检查
     * 
     * @param tbChYqjc 孕前优生健康检查
     * @return 结果
     */
    public int updateTbChYqjc(TbChYqjc tbChYqjc);

    /**
     * 批量删除孕前优生健康检查
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChYqjcByIds(String ids);

    /**
     * 删除孕前优生健康检查信息
     * 
     * @param id 孕前优生健康检查ID
     * @return 结果
     */
    public int deleteTbChYqjcById(Long id);
}
