package com.imedcare.project.fnbj.hqbjfw.zzjl.service;

import com.imedcare.project.fnbj.hqbjfw.zzjl.domain.TbFbZzjl;
import java.util.List;

/**
 * 转诊记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-20
 */
public interface ITbFbZzjlService 
{
    /**
     * 查询转诊记录
     * 
     * @param id 转诊记录ID
     * @return 转诊记录
     */
    public TbFbZzjl selectTbFbZzjlById(Long id);

    /**
     * 查询转诊记录列表
     * 
     * @param tbFbZzjl 转诊记录
     * @return 转诊记录集合
     */
    public List<TbFbZzjl> selectTbFbZzjlList(TbFbZzjl tbFbZzjl);

    /**
     * 新增转诊记录
     * 
     * @param tbFbZzjl 转诊记录
     * @return 结果
     */
    public int insertTbFbZzjl(TbFbZzjl tbFbZzjl);

    /**
     * 修改转诊记录
     * 
     * @param tbFbZzjl 转诊记录
     * @return 结果
     */
    public int updateTbFbZzjl(TbFbZzjl tbFbZzjl);

    /**
     * 批量删除转诊记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbZzjlByIds(String ids);

    /**
     * 删除转诊记录信息
     * 
     * @param id 转诊记录ID
     * @return 结果
     */
    public int deleteTbFbZzjlById(Long id);
}
