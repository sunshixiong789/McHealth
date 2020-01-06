package com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.mapper;

import com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.domain.TbChCqzdtgjcjl;
import java.util.List;

/**
 * 产前诊断体格检查记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqzdtgjcjlMapper 
{
    /**
     * 查询产前诊断体格检查记录
     * 
     * @param id 产前诊断体格检查记录ID
     * @return 产前诊断体格检查记录
     */
    public TbChCqzdtgjcjl selectTbChCqzdtgjcjlById(Long id);

    /**
     * 查询产前诊断体格检查记录列表
     * 
     * @param tbChCqzdtgjcjl 产前诊断体格检查记录
     * @return 产前诊断体格检查记录集合
     */
    public List<TbChCqzdtgjcjl> selectTbChCqzdtgjcjlList(TbChCqzdtgjcjl tbChCqzdtgjcjl);

    /**
     * 新增产前诊断体格检查记录
     * 
     * @param tbChCqzdtgjcjl 产前诊断体格检查记录
     * @return 结果
     */
    public int insertTbChCqzdtgjcjl(TbChCqzdtgjcjl tbChCqzdtgjcjl);

    /**
     * 修改产前诊断体格检查记录
     * 
     * @param tbChCqzdtgjcjl 产前诊断体格检查记录
     * @return 结果
     */
    public int updateTbChCqzdtgjcjl(TbChCqzdtgjcjl tbChCqzdtgjcjl);

    /**
     * 删除产前诊断体格检查记录
     * 
     * @param id 产前诊断体格检查记录ID
     * @return 结果
     */
    public int deleteTbChCqzdtgjcjlById(Long id);

    /**
     * 批量删除产前诊断体格检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqzdtgjcjlByIds(String[] ids);
}
