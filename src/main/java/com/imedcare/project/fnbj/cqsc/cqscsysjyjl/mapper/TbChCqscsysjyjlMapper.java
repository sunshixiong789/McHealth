package com.imedcare.project.fnbj.cqsc.cqscsysjyjl.mapper;

import com.imedcare.project.fnbj.cqsc.cqscsysjyjl.domain.TbChCqscsysjyjl;
import java.util.List;

/**
 * 产前筛查实验室检验记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqscsysjyjlMapper 
{
    /**
     * 查询产前筛查实验室检验记录
     * 
     * @param id 产前筛查实验室检验记录ID
     * @return 产前筛查实验室检验记录
     */
    public TbChCqscsysjyjl selectTbChCqscsysjyjlById(Long id);

    /**
     * 查询产前筛查实验室检验记录列表
     * 
     * @param tbChCqscsysjyjl 产前筛查实验室检验记录
     * @return 产前筛查实验室检验记录集合
     */
    public List<TbChCqscsysjyjl> selectTbChCqscsysjyjlList(TbChCqscsysjyjl tbChCqscsysjyjl);

    /**
     * 新增产前筛查实验室检验记录
     * 
     * @param tbChCqscsysjyjl 产前筛查实验室检验记录
     * @return 结果
     */
    public int insertTbChCqscsysjyjl(TbChCqscsysjyjl tbChCqscsysjyjl);

    /**
     * 修改产前筛查实验室检验记录
     * 
     * @param tbChCqscsysjyjl 产前筛查实验室检验记录
     * @return 结果
     */
    public int updateTbChCqscsysjyjl(TbChCqscsysjyjl tbChCqscsysjyjl);

    /**
     * 删除产前筛查实验室检验记录
     * 
     * @param id 产前筛查实验室检验记录ID
     * @return 结果
     */
    public int deleteTbChCqscsysjyjlById(Long id);

    /**
     * 批量删除产前筛查实验室检验记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqscsysjyjlByIds(String[] ids);
}
