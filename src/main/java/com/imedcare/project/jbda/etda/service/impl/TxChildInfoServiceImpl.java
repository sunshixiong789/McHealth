package com.imedcare.project.jbda.etda.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.jbda.etda.mapper.TxChildInfoMapper;
import com.imedcare.project.jbda.etda.domain.TxChildInfo;
import com.imedcare.project.jbda.etda.service.ITxChildInfoService;
import com.imedcare.common.utils.text.Convert;

/**
 * 儿童档案Service业务层处理
 * 
 * @author imedcare
 * @date 2019-11-13
 */
@Service
public class TxChildInfoServiceImpl implements ITxChildInfoService 
{
    @Autowired
    private TxChildInfoMapper txChildInfoMapper;

    /**
     * 查询儿童档案
     * 
     * @param healthFileId 儿童档案ID
     * @return 儿童档案
     */
    @Override
    public TxChildInfo selectTxChildInfoById(Long healthFileId)
    {
        return txChildInfoMapper.selectTxChildInfoById(healthFileId);
    }

    /**
     * 查询儿童档案列表
     * 
     * @param txChildInfo 儿童档案
     * @return 儿童档案
     */
    @Override
    public List<TxChildInfo> selectTxChildInfoList(TxChildInfo txChildInfo)
    {
        return txChildInfoMapper.selectTxChildInfoList(txChildInfo);
    }

    /**
     * 新增儿童档案
     * 
     * @param txChildInfo 儿童档案
     * @return 结果
     */
    @Override
    public int insertTxChildInfo(TxChildInfo txChildInfo)
    {
        return txChildInfoMapper.insertTxChildInfo(txChildInfo);
    }

    /**
     * 修改儿童档案
     * 
     * @param txChildInfo 儿童档案
     * @return 结果
     */
    @Override
    public int updateTxChildInfo(TxChildInfo txChildInfo)
    {
        return txChildInfoMapper.updateTxChildInfo(txChildInfo);
    }

    /**
     * 删除儿童档案对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTxChildInfoByIds(String ids)
    {
        return txChildInfoMapper.deleteTxChildInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除儿童档案信息
     * 
     * @param healthFileId 儿童档案ID
     * @return 结果
     */
    @Override
    public int deleteTxChildInfoById(Long healthFileId)
    {
        return txChildInfoMapper.deleteTxChildInfoById(healthFileId);
    }
}
