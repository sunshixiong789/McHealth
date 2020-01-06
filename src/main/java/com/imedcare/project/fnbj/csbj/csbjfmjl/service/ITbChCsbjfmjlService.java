package com.imedcare.project.fnbj.csbj.csbjfmjl.service;

import com.imedcare.project.fnbj.csbj.csbjfmjl.domain.TbChCsbjfmjl;
import java.util.List;

/**
 * 分娩记录Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface ITbChCsbjfmjlService 
{
    /**
     * 查询分娩记录
     * 
     * @param id 分娩记录ID
     * @return 分娩记录
     */
    public TbChCsbjfmjl selectTbChCsbjfmjlById(Long id);

    /**
     * 查询分娩记录列表
     * 
     * @param tbChCsbjfmjl 分娩记录
     * @return 分娩记录集合
     */
    public List<TbChCsbjfmjl> selectTbChCsbjfmjlList(TbChCsbjfmjl tbChCsbjfmjl);

    /**
     * 新增分娩记录
     * 
     * @param tbChCsbjfmjl 分娩记录
     * @return 结果
     */
    public int insertTbChCsbjfmjl(TbChCsbjfmjl tbChCsbjfmjl);

    /**
     * 修改分娩记录
     * 
     * @param tbChCsbjfmjl 分娩记录
     * @return 结果
     */
    public int updateTbChCsbjfmjl(TbChCsbjfmjl tbChCsbjfmjl);

    /**
     * 批量删除分娩记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCsbjfmjlByIds(String ids);

    /**
     * 删除分娩记录信息
     * 
     * @param id 分娩记录ID
     * @return 结果
     */
    public int deleteTbChCsbjfmjlById(Long id);
}
