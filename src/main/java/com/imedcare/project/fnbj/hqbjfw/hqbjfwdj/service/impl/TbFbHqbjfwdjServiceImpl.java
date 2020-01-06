package com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.mapper.TbFbHqbjfwdjMapper;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.domain.TbFbHqbjfwdj;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.service.ITbFbHqbjfwdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 婚前保健服务登记Service业务层处理
 *
 * @author liuyang
 * @date 2019-11-18
 */
@Service
public class TbFbHqbjfwdjServiceImpl implements ITbFbHqbjfwdjService
{
    @Autowired
    private TbFbHqbjfwdjMapper tbFbHqbjfwdjMapper;

    /**
     * 查询婚前保健服务登记
     *
     * @param id 婚前保健服务登记ID
     * @return 婚前保健服务登记
     */
    @Override
    public TbFbHqbjfwdj selectTbFbHqbjfwdjById(Long id)
    {
        return tbFbHqbjfwdjMapper.selectTbFbHqbjfwdjById(id);
    }

    /**
     * 查询婚前保健服务登记列表
     *
     * @param tbFbHqbjfwdj 婚前保健服务登记
     * @return 婚前保健服务登记
     */
    @Override
    public List<TbFbHqbjfwdj> selectTbFbHqbjfwdjList(TbFbHqbjfwdj tbFbHqbjfwdj)
    {
        return tbFbHqbjfwdjMapper.selectTbFbHqbjfwdjList(tbFbHqbjfwdj);
    }

    /**
     * 新增婚前保健服务登记
     *
     * @param tbFbHqbjfwdj 婚前保健服务登记
     * @return 结果
     */
    @Override
    public int insertTbFbHqbjfwdj(TbFbHqbjfwdj tbFbHqbjfwdj)
    {
        return tbFbHqbjfwdjMapper.insertTbFbHqbjfwdj(tbFbHqbjfwdj);
    }

    /**
     * 修改婚前保健服务登记
     *
     * @param tbFbHqbjfwdj 婚前保健服务登记
     * @return 结果
     */
    @Override
    public int updateTbFbHqbjfwdj(TbFbHqbjfwdj tbFbHqbjfwdj)
    {
        return tbFbHqbjfwdjMapper.updateTbFbHqbjfwdj(tbFbHqbjfwdj);
    }

    /**
     * 删除婚前保健服务登记对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwdjByIds(String ids)
    {
        return tbFbHqbjfwdjMapper.deleteTbFbHqbjfwdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除婚前保健服务登记信息
     *
     * @param id 婚前保健服务登记ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwdjById(Long id)
    {
        return tbFbHqbjfwdjMapper.deleteTbFbHqbjfwdjById(id);
    }
}
