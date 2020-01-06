package com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.mapper;

import com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.domain.TbChGwycfsysjyjl;
import java.util.List;

/**
 * 高危孕产妇实验室检验记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public interface TbChGwycfsysjyjlMapper 
{
    /**
     * 查询高危孕产妇实验室检验记录
     * 
     * @param id 高危孕产妇实验室检验记录ID
     * @return 高危孕产妇实验室检验记录
     */
    public TbChGwycfsysjyjl selectTbChGwycfsysjyjlById(Long id);

    /**
     * 查询高危孕产妇实验室检验记录列表
     * 
     * @param tbChGwycfsysjyjl 高危孕产妇实验室检验记录
     * @return 高危孕产妇实验室检验记录集合
     */
    public List<TbChGwycfsysjyjl> selectTbChGwycfsysjyjlList(TbChGwycfsysjyjl tbChGwycfsysjyjl);

    /**
     * 新增高危孕产妇实验室检验记录
     * 
     * @param tbChGwycfsysjyjl 高危孕产妇实验室检验记录
     * @return 结果
     */
    public int insertTbChGwycfsysjyjl(TbChGwycfsysjyjl tbChGwycfsysjyjl);

    /**
     * 修改高危孕产妇实验室检验记录
     * 
     * @param tbChGwycfsysjyjl 高危孕产妇实验室检验记录
     * @return 结果
     */
    public int updateTbChGwycfsysjyjl(TbChGwycfsysjyjl tbChGwycfsysjyjl);

    /**
     * 删除高危孕产妇实验室检验记录
     * 
     * @param id 高危孕产妇实验室检验记录ID
     * @return 结果
     */
    public int deleteTbChGwycfsysjyjlById(Long id);

    /**
     * 批量删除高危孕产妇实验室检验记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChGwycfsysjyjlByIds(String[] ids);
}
