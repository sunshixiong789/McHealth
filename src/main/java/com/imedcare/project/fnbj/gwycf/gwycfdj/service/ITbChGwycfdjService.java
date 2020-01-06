package com.imedcare.project.fnbj.gwycf.gwycfdj.service;

import com.imedcare.project.fnbj.gwycf.gwycfdj.domain.TbChGwycfdj;
import java.util.List;

/**
 * 高危孕产妇登记Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public interface ITbChGwycfdjService 
{
    /**
     * 查询高危孕产妇登记
     * 
     * @param id 高危孕产妇登记ID
     * @return 高危孕产妇登记
     */
    public TbChGwycfdj selectTbChGwycfdjById(Long id);

    /**
     * 查询高危孕产妇登记列表
     * 
     * @param tbChGwycfdj 高危孕产妇登记
     * @return 高危孕产妇登记集合
     */
    public List<TbChGwycfdj> selectTbChGwycfdjList(TbChGwycfdj tbChGwycfdj);

    /**
     * 新增高危孕产妇登记
     * 
     * @param tbChGwycfdj 高危孕产妇登记
     * @return 结果
     */
    public int insertTbChGwycfdj(TbChGwycfdj tbChGwycfdj);

    /**
     * 修改高危孕产妇登记
     * 
     * @param tbChGwycfdj 高危孕产妇登记
     * @return 结果
     */
    public int updateTbChGwycfdj(TbChGwycfdj tbChGwycfdj);

    /**
     * 批量删除高危孕产妇登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChGwycfdjByIds(String ids);

    /**
     * 删除高危孕产妇登记信息
     * 
     * @param id 高危孕产妇登记ID
     * @return 结果
     */
    public int deleteTbChGwycfdjById(Long id);
}
