package com.imedcare.project.fnbj.cqbj.tgjcjl.mapper;

import com.imedcare.project.fnbj.cqbj.tgjcjl.domain.FnCqbjTgjcjl;
import java.util.List;

/**
 * 产前保健体格检查记录Mapper接口
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public interface FnCqbjTgjcjlMapper 
{
    /**
     * 查询产前保健体格检查记录
     * 
     * @param id 产前保健体格检查记录ID
     * @return 产前保健体格检查记录
     */
    public FnCqbjTgjcjl selectFnCqbjTgjcjlById(Long id);

    /**
     * 查询产前保健体格检查记录列表
     * 
     * @param fnCqbjTgjcjl 产前保健体格检查记录
     * @return 产前保健体格检查记录集合
     */
    public List<FnCqbjTgjcjl> selectFnCqbjTgjcjlList(FnCqbjTgjcjl fnCqbjTgjcjl);

    /**
     * 新增产前保健体格检查记录
     * 
     * @param fnCqbjTgjcjl 产前保健体格检查记录
     * @return 结果
     */
    public int insertFnCqbjTgjcjl(FnCqbjTgjcjl fnCqbjTgjcjl);

    /**
     * 修改产前保健体格检查记录
     * 
     * @param fnCqbjTgjcjl 产前保健体格检查记录
     * @return 结果
     */
    public int updateFnCqbjTgjcjl(FnCqbjTgjcjl fnCqbjTgjcjl);

    /**
     * 删除产前保健体格检查记录
     * 
     * @param id 产前保健体格检查记录ID
     * @return 结果
     */
    public int deleteFnCqbjTgjcjlById(Long id);

    /**
     * 批量删除产前保健体格检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteFnCqbjTgjcjlByIds(String[] ids);
}
