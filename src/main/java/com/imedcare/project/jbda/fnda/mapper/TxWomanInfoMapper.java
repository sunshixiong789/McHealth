package com.imedcare.project.jbda.fnda.mapper;

import com.imedcare.project.jbda.fnda.domain.TxWomanInfo;
import java.util.List;

/**
 * 妇女档案Mapper接口
 *
 * @author liuyang
 * @date 2019-11-14
 */
public interface TxWomanInfoMapper
{
    /**
     * 查询妇女档案
     *
     * @param healthFileId 妇女档案ID
     * @return 妇女档案
     */
    public TxWomanInfo selectTxWomanInfoById(Long healthFileId);

    /**
     * 查询妇女档案列表
     *
     * @param txWomanInfo 妇女档案
     * @return 妇女档案集合
     */
    public List<TxWomanInfo> selectTxWomanInfoList(TxWomanInfo txWomanInfo);

    /**
     * 新增妇女档案
     *
     * @param txWomanInfo 妇女档案
     * @return 结果
     */
    public int insertTxWomanInfo(TxWomanInfo txWomanInfo);

    /**
     * 修改妇女档案
     *
     * @param txWomanInfo 妇女档案
     * @return 结果
     */
    public int updateTxWomanInfo(TxWomanInfo txWomanInfo);

    /**
     * 删除妇女档案
     *
     * @param healthFileId 妇女档案ID
     * @return 结果
     */
    public int deleteTxWomanInfoById(Long healthFileId);

    /**
     * 批量删除妇女档案
     *
     * @param healthFileIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTxWomanInfoByIds(String[] healthFileIds);
}
