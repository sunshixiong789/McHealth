package com.imedcare.project.jbda.etda.mapper;

import com.imedcare.project.jbda.etda.domain.TxChildInfo;
import java.util.List;

/**
 * 儿童档案Mapper接口
 * 
 * @author imedcare
 * @date 2019-11-13
 */
public interface TxChildInfoMapper 
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
     * 删除儿童档案
     * 
     * @param healthFileId 儿童档案ID
     * @return 结果
     */
    public int deleteTxChildInfoById(Long healthFileId);

    /**
     * 批量删除儿童档案
     * 
     * @param healthFileIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTxChildInfoByIds(String[] healthFileIds);
}
