package com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.service;

import com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.domain.TbFbHqbjfwzdjl;
import java.util.List;

/**
 * 婚前保健服务诊断记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-19
 */
public interface ITbFbHqbjfwzdjlService 
{
    /**
     * 查询婚前保健服务诊断记录
     * 
     * @param id 婚前保健服务诊断记录ID
     * @return 婚前保健服务诊断记录
     */
    public TbFbHqbjfwzdjl selectTbFbHqbjfwzdjlById(Long id);

    /**
     * 查询婚前保健服务诊断记录列表
     * 
     * @param tbFbHqbjfwzdjl 婚前保健服务诊断记录
     * @return 婚前保健服务诊断记录集合
     */
    public List<TbFbHqbjfwzdjl> selectTbFbHqbjfwzdjlList(TbFbHqbjfwzdjl tbFbHqbjfwzdjl);

    /**
     * 新增婚前保健服务诊断记录
     * 
     * @param tbFbHqbjfwzdjl 婚前保健服务诊断记录
     * @return 结果
     */
    public int insertTbFbHqbjfwzdjl(TbFbHqbjfwzdjl tbFbHqbjfwzdjl);

    /**
     * 修改婚前保健服务诊断记录
     * 
     * @param tbFbHqbjfwzdjl 婚前保健服务诊断记录
     * @return 结果
     */
    public int updateTbFbHqbjfwzdjl(TbFbHqbjfwzdjl tbFbHqbjfwzdjl);

    /**
     * 批量删除婚前保健服务诊断记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwzdjlByIds(String ids);

    /**
     * 删除婚前保健服务诊断记录信息
     * 
     * @param id 婚前保健服务诊断记录ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwzdjlById(Long id);
}
