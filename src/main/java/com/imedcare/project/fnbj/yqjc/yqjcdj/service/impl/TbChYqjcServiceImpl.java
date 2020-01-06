package com.imedcare.project.fnbj.yqjc.yqjcdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.yqjc.yqjcdj.mapper.TbChYqjcMapper;
import com.imedcare.project.fnbj.yqjc.yqjcdj.domain.TbChYqjc;
import com.imedcare.project.fnbj.yqjc.yqjcdj.service.ITbChYqjcService;
import com.imedcare.common.utils.text.Convert;

/**
 * 孕前优生健康检查Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
@Service
public class TbChYqjcServiceImpl implements ITbChYqjcService 
{
    @Autowired
    private TbChYqjcMapper tbChYqjcMapper;

    /**
     * 查询孕前优生健康检查
     * 
     * @param id 孕前优生健康检查ID
     * @return 孕前优生健康检查
     */
    @Override
    public TbChYqjc selectTbChYqjcById(Long id)
    {
        return tbChYqjcMapper.selectTbChYqjcById(id);
    }

    /**
     * 查询孕前优生健康检查列表
     * 
     * @param tbChYqjc 孕前优生健康检查
     * @return 孕前优生健康检查
     */
    @Override
    public List<TbChYqjc> selectTbChYqjcList(TbChYqjc tbChYqjc)
    {
        return tbChYqjcMapper.selectTbChYqjcList(tbChYqjc);
    }

    /**
     * 新增孕前优生健康检查
     * 
     * @param tbChYqjc 孕前优生健康检查
     * @return 结果
     */
    @Override
    public int insertTbChYqjc(TbChYqjc tbChYqjc)
    {
        return tbChYqjcMapper.insertTbChYqjc(tbChYqjc);
    }

    /**
     * 修改孕前优生健康检查
     * 
     * @param tbChYqjc 孕前优生健康检查
     * @return 结果
     */
    @Override
    public int updateTbChYqjc(TbChYqjc tbChYqjc)
    {
        return tbChYqjcMapper.updateTbChYqjc(tbChYqjc);
    }

    /**
     * 删除孕前优生健康检查对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChYqjcByIds(String ids)
    {
        return tbChYqjcMapper.deleteTbChYqjcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除孕前优生健康检查信息
     * 
     * @param id 孕前优生健康检查ID
     * @return 结果
     */
    @Override
    public int deleteTbChYqjcById(Long id)
    {
        return tbChYqjcMapper.deleteTbChYqjcById(id);
    }
}
