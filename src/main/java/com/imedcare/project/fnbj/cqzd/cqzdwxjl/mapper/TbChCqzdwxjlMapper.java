package com.imedcare.project.fnbj.cqzd.cqzdwxjl.mapper;

import com.imedcare.project.fnbj.cqzd.cqzdwxjl.domain.TbChCqzdwxjl;
import java.util.List;

/**
 * 产前诊断问询记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqzdwxjlMapper 
{
    /**
     * 查询产前诊断问询记录
     * 
     * @param id 产前诊断问询记录ID
     * @return 产前诊断问询记录
     */
    public TbChCqzdwxjl selectTbChCqzdwxjlById(Long id);

    /**
     * 查询产前诊断问询记录列表
     * 
     * @param tbChCqzdwxjl 产前诊断问询记录
     * @return 产前诊断问询记录集合
     */
    public List<TbChCqzdwxjl> selectTbChCqzdwxjlList(TbChCqzdwxjl tbChCqzdwxjl);

    /**
     * 新增产前诊断问询记录
     * 
     * @param tbChCqzdwxjl 产前诊断问询记录
     * @return 结果
     */
    public int insertTbChCqzdwxjl(TbChCqzdwxjl tbChCqzdwxjl);

    /**
     * 修改产前诊断问询记录
     * 
     * @param tbChCqzdwxjl 产前诊断问询记录
     * @return 结果
     */
    public int updateTbChCqzdwxjl(TbChCqzdwxjl tbChCqzdwxjl);

    /**
     * 删除产前诊断问询记录
     * 
     * @param id 产前诊断问询记录ID
     * @return 结果
     */
    public int deleteTbChCqzdwxjlById(Long id);

    /**
     * 批量删除产前诊断问询记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqzdwxjlByIds(String[] ids);
}
