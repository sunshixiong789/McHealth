package com.imedcare.project.fnbj.cqzd.cqzdzdjl.service;

import com.imedcare.project.fnbj.cqzd.cqzdzdjl.domain.TbChCqzdzdjl;
import java.util.List;

/**
 * 产前诊断诊断记录Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface ITbChCqzdzdjlService 
{
    /**
     * 查询产前诊断诊断记录
     * 
     * @param id 产前诊断诊断记录ID
     * @return 产前诊断诊断记录
     */
    public TbChCqzdzdjl selectTbChCqzdzdjlById(Long id);

    /**
     * 查询产前诊断诊断记录列表
     * 
     * @param tbChCqzdzdjl 产前诊断诊断记录
     * @return 产前诊断诊断记录集合
     */
    public List<TbChCqzdzdjl> selectTbChCqzdzdjlList(TbChCqzdzdjl tbChCqzdzdjl);

    /**
     * 新增产前诊断诊断记录
     * 
     * @param tbChCqzdzdjl 产前诊断诊断记录
     * @return 结果
     */
    public int insertTbChCqzdzdjl(TbChCqzdzdjl tbChCqzdzdjl);

    /**
     * 修改产前诊断诊断记录
     * 
     * @param tbChCqzdzdjl 产前诊断诊断记录
     * @return 结果
     */
    public int updateTbChCqzdzdjl(TbChCqzdzdjl tbChCqzdzdjl);

    /**
     * 批量删除产前诊断诊断记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqzdzdjlByIds(String ids);

    /**
     * 删除产前诊断诊断记录信息
     * 
     * @param id 产前诊断诊断记录ID
     * @return 结果
     */
    public int deleteTbChCqzdzdjlById(Long id);
}
