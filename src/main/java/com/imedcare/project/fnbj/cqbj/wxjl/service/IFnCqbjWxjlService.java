package com.imedcare.project.fnbj.cqbj.wxjl.service;

import com.imedcare.project.fnbj.cqbj.wxjl.domain.FnCqbjWxjl;
import java.util.List;

/**
 * 产前保健问询记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public interface IFnCqbjWxjlService 
{
    /**
     * 查询产前保健问询记录
     * 
     * @param id 产前保健问询记录ID
     * @return 产前保健问询记录
     */
    public FnCqbjWxjl selectFnCqbjWxjlById(Long id);

    /**
     * 查询产前保健问询记录列表
     * 
     * @param fnCqbjWxjl 产前保健问询记录
     * @return 产前保健问询记录集合
     */
    public List<FnCqbjWxjl> selectFnCqbjWxjlList(FnCqbjWxjl fnCqbjWxjl);

    /**
     * 新增产前保健问询记录
     * 
     * @param fnCqbjWxjl 产前保健问询记录
     * @return 结果
     */
    public int insertFnCqbjWxjl(FnCqbjWxjl fnCqbjWxjl);

    /**
     * 修改产前保健问询记录
     * 
     * @param fnCqbjWxjl 产前保健问询记录
     * @return 结果
     */
    public int updateFnCqbjWxjl(FnCqbjWxjl fnCqbjWxjl);

    /**
     * 批量删除产前保健问询记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFnCqbjWxjlByIds(String ids);

    /**
     * 删除产前保健问询记录信息
     * 
     * @param id 产前保健问询记录ID
     * @return 结果
     */
    public int deleteFnCqbjWxjlById(Long id);
}
