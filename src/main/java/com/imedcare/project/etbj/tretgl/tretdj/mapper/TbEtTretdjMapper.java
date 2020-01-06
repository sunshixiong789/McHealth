package com.imedcare.project.etbj.tretgl.tretdj.mapper;

import com.imedcare.project.etbj.tretgl.tretdj.domain.TbEtTretdj;

import java.util.List;

/**
 * 体弱儿童登记Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface TbEtTretdjMapper
{
    /**
     * 查询体弱儿童登记
     * 
     * @param id 体弱儿童登记ID
     * @return 体弱儿童登记
     */
    public TbEtTretdj selectTbEtTretdjById(Long id);

    /**
     * 查询体弱儿童登记列表
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 体弱儿童登记集合
     */
    public List<TbEtTretdj> selectTbEtTretdjList(TbEtTretdj tbEtTretdj);

    /**
     * 新增体弱儿童登记
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 结果
     */
    public int insertTbEtTretdj(TbEtTretdj tbEtTretdj);

    /**
     * 修改体弱儿童登记
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 结果
     */
    public int updateTbEtTretdj(TbEtTretdj tbEtTretdj);

    /**
     * 删除体弱儿童登记
     * 
     * @param id 体弱儿童登记ID
     * @return 结果
     */
    public int deleteTbEtTretdjById(Long id);

    /**
     * 批量删除体弱儿童登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtTretdjByIds(String[] ids);
}
