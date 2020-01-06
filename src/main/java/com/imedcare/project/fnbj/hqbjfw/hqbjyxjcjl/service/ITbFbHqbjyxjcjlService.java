package com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.service;

import com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.domain.TbFbHqbjyxjcjl;
import java.util.List;

/**
 * 婚前保健影像检查记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-19
 */
public interface ITbFbHqbjyxjcjlService 
{
    /**
     * 查询婚前保健影像检查记录
     * 
     * @param id 婚前保健影像检查记录ID
     * @return 婚前保健影像检查记录
     */
    public TbFbHqbjyxjcjl selectTbFbHqbjyxjcjlById(Long id);

    /**
     * 查询婚前保健影像检查记录列表
     * 
     * @param tbFbHqbjyxjcjl 婚前保健影像检查记录
     * @return 婚前保健影像检查记录集合
     */
    public List<TbFbHqbjyxjcjl> selectTbFbHqbjyxjcjlList(TbFbHqbjyxjcjl tbFbHqbjyxjcjl);

    /**
     * 新增婚前保健影像检查记录
     * 
     * @param tbFbHqbjyxjcjl 婚前保健影像检查记录
     * @return 结果
     */
    public int insertTbFbHqbjyxjcjl(TbFbHqbjyxjcjl tbFbHqbjyxjcjl);

    /**
     * 修改婚前保健影像检查记录
     * 
     * @param tbFbHqbjyxjcjl 婚前保健影像检查记录
     * @return 结果
     */
    public int updateTbFbHqbjyxjcjl(TbFbHqbjyxjcjl tbFbHqbjyxjcjl);

    /**
     * 批量删除婚前保健影像检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbHqbjyxjcjlByIds(String ids);

    /**
     * 删除婚前保健影像检查记录信息
     * 
     * @param id 婚前保健影像检查记录ID
     * @return 结果
     */
    public int deleteTbFbHqbjyxjcjlById(Long id);
}
