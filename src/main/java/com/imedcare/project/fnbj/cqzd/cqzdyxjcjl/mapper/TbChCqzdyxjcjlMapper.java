package com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.mapper;

import com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.domain.TbChCqzdyxjcjl;
import java.util.List;

/**
 * 产前诊断影像检查记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqzdyxjcjlMapper 
{
    /**
     * 查询产前诊断影像检查记录
     * 
     * @param id 产前诊断影像检查记录ID
     * @return 产前诊断影像检查记录
     */
    public TbChCqzdyxjcjl selectTbChCqzdyxjcjlById(Long id);

    /**
     * 查询产前诊断影像检查记录列表
     * 
     * @param tbChCqzdyxjcjl 产前诊断影像检查记录
     * @return 产前诊断影像检查记录集合
     */
    public List<TbChCqzdyxjcjl> selectTbChCqzdyxjcjlList(TbChCqzdyxjcjl tbChCqzdyxjcjl);

    /**
     * 新增产前诊断影像检查记录
     * 
     * @param tbChCqzdyxjcjl 产前诊断影像检查记录
     * @return 结果
     */
    public int insertTbChCqzdyxjcjl(TbChCqzdyxjcjl tbChCqzdyxjcjl);

    /**
     * 修改产前诊断影像检查记录
     * 
     * @param tbChCqzdyxjcjl 产前诊断影像检查记录
     * @return 结果
     */
    public int updateTbChCqzdyxjcjl(TbChCqzdyxjcjl tbChCqzdyxjcjl);

    /**
     * 删除产前诊断影像检查记录
     * 
     * @param id 产前诊断影像检查记录ID
     * @return 结果
     */
    public int deleteTbChCqzdyxjcjlById(Long id);

    /**
     * 批量删除产前诊断影像检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqzdyxjcjlByIds(String[] ids);
}
