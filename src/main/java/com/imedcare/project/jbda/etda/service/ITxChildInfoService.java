package com.imedcare.project.jbda.etda.service;

import com.imedcare.project.jbda.etda.domain.TxChildInfo;
import java.util.List;

/**
 * 儿童档案Service接口
 * 
 * @author imedcare
 * @date 2019-11-13
 */
public interface ITxChildInfoService 
{
    /**
     * 查询儿童档案
     * 
     * @param healthFileId 儿童档案ID
     * @return 儿童档案
     */
    public TxChildInfo selectTxChildInfoById(Long healthFileId);

    /**
     * 查询儿童档案列表
     * 
     * @param txChildInfo 儿童档案
     * @return 儿童档案集合
     */
    public List<TxChildInfo> selectTxChildInfoList(TxChildInfo txChildInfo);

    /**
     * 新增儿童档案
     * 
     * @param txChildInfo 儿童档案
     * @return 结果
     */
    public int insertTxChildInfo(TxChildInfo txChildInfo);

    /**
     * 修改儿童档案
     * 
     * @param txChildInfo 儿童档案
     * @return 结果
     */
    public int updateTxChildInfo(TxChildInfo txChildInfo);

    /**
     * 批量删除儿童档案
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTxChildInfoByIds(String ids);

    /**
     * 删除儿童档案信息
     * 
     * @param healthFileId 儿童档案ID
     * @return 结果
     */
    public int deleteTxChildInfoById(Long healthFileId);
}
