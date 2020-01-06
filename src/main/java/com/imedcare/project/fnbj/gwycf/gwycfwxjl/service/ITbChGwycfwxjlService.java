package com.imedcare.project.fnbj.gwycf.gwycfwxjl.service;

import com.imedcare.project.fnbj.gwycf.gwycfwxjl.domain.TbChGwycfwxjl;
import java.util.List;

/**
 * 高危孕产妇问询记录Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public interface ITbChGwycfwxjlService 
{
    /**
     * 查询高危孕产妇问询记录
     * 
     * @param id 高危孕产妇问询记录ID
     * @return 高危孕产妇问询记录
     */
    public TbChGwycfwxjl selectTbChGwycfwxjlById(Long id);

    /**
     * 查询高危孕产妇问询记录列表
     * 
     * @param tbChGwycfwxjl 高危孕产妇问询记录
     * @return 高危孕产妇问询记录集合
     */
    public List<TbChGwycfwxjl> selectTbChGwycfwxjlList(TbChGwycfwxjl tbChGwycfwxjl);

    /**
     * 新增高危孕产妇问询记录
     * 
     * @param tbChGwycfwxjl 高危孕产妇问询记录
     * @return 结果
     */
    public int insertTbChGwycfwxjl(TbChGwycfwxjl tbChGwycfwxjl);

    /**
     * 修改高危孕产妇问询记录
     * 
     * @param tbChGwycfwxjl 高危孕产妇问询记录
     * @return 结果
     */
    public int updateTbChGwycfwxjl(TbChGwycfwxjl tbChGwycfwxjl);

    /**
     * 批量删除高危孕产妇问询记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChGwycfwxjlByIds(String ids);

    /**
     * 删除高危孕产妇问询记录信息
     * 
     * @param id 高危孕产妇问询记录ID
     * @return 结果
     */
    public int deleteTbChGwycfwxjlById(Long id);
}
