package com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.service;

import com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.domain.TbChGwycfyxjcjl;
import java.util.List;

/**
 * 高危孕产妇影像检查记录Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public interface ITbChGwycfyxjcjlService 
{
    /**
     * 查询高危孕产妇影像检查记录
     * 
     * @param id 高危孕产妇影像检查记录ID
     * @return 高危孕产妇影像检查记录
     */
    public TbChGwycfyxjcjl selectTbChGwycfyxjcjlById(Long id);

    /**
     * 查询高危孕产妇影像检查记录列表
     * 
     * @param tbChGwycfyxjcjl 高危孕产妇影像检查记录
     * @return 高危孕产妇影像检查记录集合
     */
    public List<TbChGwycfyxjcjl> selectTbChGwycfyxjcjlList(TbChGwycfyxjcjl tbChGwycfyxjcjl);

    /**
     * 新增高危孕产妇影像检查记录
     * 
     * @param tbChGwycfyxjcjl 高危孕产妇影像检查记录
     * @return 结果
     */
    public int insertTbChGwycfyxjcjl(TbChGwycfyxjcjl tbChGwycfyxjcjl);

    /**
     * 修改高危孕产妇影像检查记录
     * 
     * @param tbChGwycfyxjcjl 高危孕产妇影像检查记录
     * @return 结果
     */
    public int updateTbChGwycfyxjcjl(TbChGwycfyxjcjl tbChGwycfyxjcjl);

    /**
     * 批量删除高危孕产妇影像检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChGwycfyxjcjlByIds(String ids);

    /**
     * 删除高危孕产妇影像检查记录信息
     * 
     * @param id 高危孕产妇影像检查记录ID
     * @return 结果
     */
    public int deleteTbChGwycfyxjcjlById(Long id);
}
