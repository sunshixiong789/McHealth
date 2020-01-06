package com.imedcare.project.jbda.fnda.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.jbda.fnda.mapper.TxWomanInfoMapper;
import com.imedcare.project.jbda.fnda.domain.TxWomanInfo;
import com.imedcare.project.jbda.fnda.service.ITxWomanInfoService;
import com.imedcare.common.utils.text.Convert;

/**
 * 妇女档案Service业务层处理
 *
 * @author liuyang
 * @date 2019-11-14
 */
@Service
public class TxWomanInfoServiceImpl implements ITxWomanInfoService
{
    @Autowired
    private TxWomanInfoMapper txWomanInfoMapper;

    /**
     * 查询妇女档案
     *
     * @param healthFileId 妇女档案ID
     * @return 妇女档案
     */
    @Override
    public TxWomanInfo selectTxWomanInfoById(Long healthFileId)
    {
        return txWomanInfoMapper.selectTxWomanInfoById(healthFileId);
    }

    /**
     * 查询妇女档案列表
     *
     * @param txWomanInfo 妇女档案
     * @return 妇女档案
     */
    @Override
    public List<TxWomanInfo> selectTxWomanInfoList(TxWomanInfo txWomanInfo)
    {
        return txWomanInfoMapper.selectTxWomanInfoList(txWomanInfo);
    }

    /**
     * 新增妇女档案
     *
     * @param txWomanInfo 妇女档案
     * @return 结果
     */
    @Override
    public int insertTxWomanInfo(TxWomanInfo txWomanInfo)
    {
        return txWomanInfoMapper.insertTxWomanInfo(txWomanInfo);
    }

    /**
     * 修改妇女档案
     *
     * @param txWomanInfo 妇女档案
     * @return 结果
     */
    @Override
    public int updateTxWomanInfo(TxWomanInfo txWomanInfo)
    {
        return txWomanInfoMapper.updateTxWomanInfo(txWomanInfo);
    }

    /**
     * 删除妇女档案对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTxWomanInfoByIds(String ids)
    {
        return txWomanInfoMapper.deleteTxWomanInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除妇女档案信息
     *
     * @param healthFileId 妇女档案ID
     * @return 结果
     */
    @Override
    public int deleteTxWomanInfoById(Long healthFileId)
    {
        return txWomanInfoMapper.deleteTxWomanInfoById(healthFileId);
    }
}
