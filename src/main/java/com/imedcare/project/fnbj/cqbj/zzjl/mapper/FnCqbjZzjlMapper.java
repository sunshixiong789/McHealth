package com.imedcare.project.fnbj.cqbj.zzjl.mapper;

import com.imedcare.project.fnbj.cqbj.zzjl.domain.FnCqbjZzjl;
import java.util.List;

/**
 * 产前保健转诊记录Mapper接口
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public interface FnCqbjZzjlMapper 
{
    /**
     * 查询产前保健转诊记录
     * 
     * @param id 产前保健转诊记录ID
     * @return 产前保健转诊记录
     */
    public FnCqbjZzjl selectFnCqbjZzjlById(Long id);

    /**
     * 查询产前保健转诊记录列表
     * 
     * @param fnCqbjZzjl 产前保健转诊记录
     * @return 产前保健转诊记录集合
     */
    public List<FnCqbjZzjl> selectFnCqbjZzjlList(FnCqbjZzjl fnCqbjZzjl);

    /**
     * 新增产前保健转诊记录
     * 
     * @param fnCqbjZzjl 产前保健转诊记录
     * @return 结果
     */
    public int insertFnCqbjZzjl(FnCqbjZzjl fnCqbjZzjl);

    /**
     * 修改产前保健转诊记录
     * 
     * @param fnCqbjZzjl 产前保健转诊记录
     * @return 结果
     */
    public int updateFnCqbjZzjl(FnCqbjZzjl fnCqbjZzjl);

    /**
     * 删除产前保健转诊记录
     * 
     * @param id 产前保健转诊记录ID
     * @return 结果
     */
    public int deleteFnCqbjZzjlById(Long id);

    /**
     * 批量删除产前保健转诊记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFnCqbjZzjlByIds(String[] ids);
}
