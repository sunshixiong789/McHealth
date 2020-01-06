package com.imedcare.project.fnbj.cqsc.cqscyxjcjl.mapper;

import com.imedcare.project.fnbj.cqsc.cqscyxjcjl.domain.TbChCqscyxjcjl;
import java.util.List;

/**
 * 产前筛查影像检查记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqscyxjcjlMapper 
{
    /**
     * 查询产前筛查影像检查记录
     * 
     * @param id 产前筛查影像检查记录ID
     * @return 产前筛查影像检查记录
     */
    public TbChCqscyxjcjl selectTbChCqscyxjcjlById(Long id);

    /**
     * 查询产前筛查影像检查记录列表
     * 
     * @param tbChCqscyxjcjl 产前筛查影像检查记录
     * @return 产前筛查影像检查记录集合
     */
    public List<TbChCqscyxjcjl> selectTbChCqscyxjcjlList(TbChCqscyxjcjl tbChCqscyxjcjl);

    /**
     * 新增产前筛查影像检查记录
     * 
     * @param tbChCqscyxjcjl 产前筛查影像检查记录
     * @return 结果
     */
    public int insertTbChCqscyxjcjl(TbChCqscyxjcjl tbChCqscyxjcjl);

    /**
     * 修改产前筛查影像检查记录
     * 
     * @param tbChCqscyxjcjl 产前筛查影像检查记录
     * @return 结果
     */
    public int updateTbChCqscyxjcjl(TbChCqscyxjcjl tbChCqscyxjcjl);

    /**
     * 删除产前筛查影像检查记录
     * 
     * @param id 产前筛查影像检查记录ID
     * @return 结果
     */
    public int deleteTbChCqscyxjcjlById(Long id);

    /**
     * 批量删除产前筛查影像检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqscyxjcjlByIds(String[] ids);
}
