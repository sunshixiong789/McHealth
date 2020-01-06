package com.imedcare.project.fnbj.cqbj.yixzd.service;

import com.imedcare.project.fnbj.cqbj.yixzd.domain.FnCqbjYixzd;
import java.util.List;

/**
 * 产前保健医学指导Service接口
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public interface IFnCqbjYixzdService 
{
    /**
     * 查询产前保健医学指导
     * 
     * @param id 产前保健医学指导ID
     * @return 产前保健医学指导
     */
    public FnCqbjYixzd selectFnCqbjYixzdById(Long id);

    /**
     * 查询产前保健医学指导列表
     * 
     * @param fnCqbjYixzd 产前保健医学指导
     * @return 产前保健医学指导集合
     */
    public List<FnCqbjYixzd> selectFnCqbjYixzdList(FnCqbjYixzd fnCqbjYixzd);

    /**
     * 新增产前保健医学指导
     * 
     * @param fnCqbjYixzd 产前保健医学指导
     * @return 结果
     */
    public int insertFnCqbjYixzd(FnCqbjYixzd fnCqbjYixzd);

    /**
     * 修改产前保健医学指导
     * 
     * @param fnCqbjYixzd 产前保健医学指导
     * @return 结果
     */
    public int updateFnCqbjYixzd(FnCqbjYixzd fnCqbjYixzd);

    /**
     * 批量删除产前保健医学指导
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFnCqbjYixzdByIds(String ids);

    /**
     * 删除产前保健医学指导信息
     * 
     * @param id 产前保健医学指导ID
     * @return 结果
     */
    public int deleteFnCqbjYixzdById(Long id);
}
