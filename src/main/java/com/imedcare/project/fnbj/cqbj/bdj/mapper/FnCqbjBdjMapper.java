package com.imedcare.project.fnbj.cqbj.bdj.mapper;

import com.imedcare.project.fnbj.cqbj.bdj.domain.FnCqbjBdj;
import java.util.List;

/**
 * 产前保健登记Mapper接口
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public interface FnCqbjBdjMapper 
{
    /**
     * 查询产前保健登记
     * 
     * @param id 产前保健登记ID
     * @return 产前保健登记
     */
    public FnCqbjBdj selectFnCqbjBdjById(Long id);

    /**
     * 查询产前保健登记列表
     * 
     * @param fnCqbjBdj 产前保健登记
     * @return 产前保健登记集合
     */
    public List<FnCqbjBdj> selectFnCqbjBdjList(FnCqbjBdj fnCqbjBdj);

    /**
     * 新增产前保健登记
     * 
     * @param fnCqbjBdj 产前保健登记
     * @return 结果
     */
    public int insertFnCqbjBdj(FnCqbjBdj fnCqbjBdj);

    /**
     * 修改产前保健登记
     * 
     * @param fnCqbjBdj 产前保健登记
     * @return 结果
     */
    public int updateFnCqbjBdj(FnCqbjBdj fnCqbjBdj);

    /**
     * 删除产前保健登记
     * 
     * @param id 产前保健登记ID
     * @return 结果
     */
    public int deleteFnCqbjBdjById(Long id);

    /**
     * 批量删除产前保健登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFnCqbjBdjByIds(String[] ids);
}
