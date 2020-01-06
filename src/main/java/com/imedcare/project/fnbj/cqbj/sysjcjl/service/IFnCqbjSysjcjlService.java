package com.imedcare.project.fnbj.cqbj.sysjcjl.service;

import com.imedcare.project.fnbj.cqbj.sysjcjl.domain.FnCqbjSysjcjl;
import java.util.List;

/**
 * 产前保健实验室检查记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public interface IFnCqbjSysjcjlService 
{
    /**
     * 查询产前保健实验室检查记录
     * 
     * @param id 产前保健实验室检查记录ID
     * @return 产前保健实验室检查记录
     */
    public FnCqbjSysjcjl selectFnCqbjSysjcjlById(Long id);

    /**
     * 查询产前保健实验室检查记录列表
     * 
     * @param fnCqbjSysjcjl 产前保健实验室检查记录
     * @return 产前保健实验室检查记录集合
     */
    public List<FnCqbjSysjcjl> selectFnCqbjSysjcjlList(FnCqbjSysjcjl fnCqbjSysjcjl);

    /**
     * 新增产前保健实验室检查记录
     * 
     * @param fnCqbjSysjcjl 产前保健实验室检查记录
     * @return 结果
     */
    public int insertFnCqbjSysjcjl(FnCqbjSysjcjl fnCqbjSysjcjl);

    /**
     * 修改产前保健实验室检查记录
     * 
     * @param fnCqbjSysjcjl 产前保健实验室检查记录
     * @return 结果
     */
    public int updateFnCqbjSysjcjl(FnCqbjSysjcjl fnCqbjSysjcjl);

    /**
     * 批量删除产前保健实验室检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFnCqbjSysjcjlByIds(String ids);

    /**
     * 删除产前保健实验室检查记录信息
     * 
     * @param id 产前保健实验室检查记录ID
     * @return 结果
     */
    public int deleteFnCqbjSysjcjlById(Long id);
}
