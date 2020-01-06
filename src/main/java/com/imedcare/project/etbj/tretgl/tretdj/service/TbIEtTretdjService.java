package com.imedcare.project.etbj.tretgl.tretdj.service;

import com.imedcare.project.etbj.tretgl.tretdj.domain.TbEtTretdj;
import java.util.List;

/**
 * 体弱儿童登记Service接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface TbIEtTretdjService
{
    /**
     * 查询体弱儿童登记
     * 
     * @param id 体弱儿童登记ID
     * @return 体弱儿童登记
     */
    public TbEtTretdj selectEtTretdjById(Long id);

    /**
     * 查询体弱儿童登记列表
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 体弱儿童登记集合
     */
    public List<TbEtTretdj> selectEtTretdjList(TbEtTretdj tbEtTretdj);

    /**
     * 新增体弱儿童登记
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 结果
     */
    public int insertEtTretdj(TbEtTretdj tbEtTretdj);

    /**
     * 修改体弱儿童登记
     * 
     * @param tbEtTretdj 体弱儿童登记
     * @return 结果
     */
    public int updateEtTretdj(TbEtTretdj tbEtTretdj);

    /**
     * 批量删除体弱儿童登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteEtTretdjByIds(String ids);

    /**
     * 删除体弱儿童登记信息
     * 
     * @param id 体弱儿童登记ID
     * @return 结果
     */
    public int deleteEtTretdjById(Long id);
}
