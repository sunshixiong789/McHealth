package com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.service;

import com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.domain.TbChCqzdsysjyjl;
import java.util.List;

/**
 * 产前诊断实验室检验记录Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface ITbChCqzdsysjyjlService 
{
    /**
     * 查询产前诊断实验室检验记录
     * 
     * @param id 产前诊断实验室检验记录ID
     * @return 产前诊断实验室检验记录
     */
    public TbChCqzdsysjyjl selectTbChCqzdsysjyjlById(Long id);

    /**
     * 查询产前诊断实验室检验记录列表
     * 
     * @param tbChCqzdsysjyjl 产前诊断实验室检验记录
     * @return 产前诊断实验室检验记录集合
     */
    public List<TbChCqzdsysjyjl> selectTbChCqzdsysjyjlList(TbChCqzdsysjyjl tbChCqzdsysjyjl);

    /**
     * 新增产前诊断实验室检验记录
     * 
     * @param tbChCqzdsysjyjl 产前诊断实验室检验记录
     * @return 结果
     */
    public int insertTbChCqzdsysjyjl(TbChCqzdsysjyjl tbChCqzdsysjyjl);

    /**
     * 修改产前诊断实验室检验记录
     * 
     * @param tbChCqzdsysjyjl 产前诊断实验室检验记录
     * @return 结果
     */
    public int updateTbChCqzdsysjyjl(TbChCqzdsysjyjl tbChCqzdsysjyjl);

    /**
     * 批量删除产前诊断实验室检验记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqzdsysjyjlByIds(String ids);

    /**
     * 删除产前诊断实验室检验记录信息
     * 
     * @param id 产前诊断实验室检验记录ID
     * @return 结果
     */
    public int deleteTbChCqzdsysjyjlById(Long id);
}
