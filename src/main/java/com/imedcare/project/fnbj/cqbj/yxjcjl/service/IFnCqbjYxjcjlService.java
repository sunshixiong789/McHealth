package com.imedcare.project.fnbj.cqbj.yxjcjl.service;

import com.imedcare.project.fnbj.cqbj.yxjcjl.domain.FnCqbjYxjcjl;
import java.util.List;

/**
 * 产前保健影像检查记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public interface IFnCqbjYxjcjlService 
{
    /**
     * 查询产前保健影像检查记录
     * 
     * @param id 产前保健影像检查记录ID
     * @return 产前保健影像检查记录
     */
    public FnCqbjYxjcjl selectFnCqbjYxjcjlById(Long id);

    /**
     * 查询产前保健影像检查记录列表
     * 
     * @param fnCqbjYxjcjl 产前保健影像检查记录
     * @return 产前保健影像检查记录集合
     */
    public List<FnCqbjYxjcjl> selectFnCqbjYxjcjlList(FnCqbjYxjcjl fnCqbjYxjcjl);

    /**
     * 新增产前保健影像检查记录
     * 
     * @param fnCqbjYxjcjl 产前保健影像检查记录
     * @return 结果
     */
    public int insertFnCqbjYxjcjl(FnCqbjYxjcjl fnCqbjYxjcjl);

    /**
     * 修改产前保健影像检查记录
     * 
     * @param fnCqbjYxjcjl 产前保健影像检查记录
     * @return 结果
     */
    public int updateFnCqbjYxjcjl(FnCqbjYxjcjl fnCqbjYxjcjl);

    /**
     * 批量删除产前保健影像检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFnCqbjYxjcjlByIds(String ids);

    /**
     * 删除产前保健影像检查记录信息
     * 
     * @param id 产前保健影像检查记录ID
     * @return 结果
     */
    public int deleteFnCqbjYxjcjlById(Long id);
}
