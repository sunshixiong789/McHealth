package com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.mapper.TbFbHqbjfwzdjlMapper;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.domain.TbFbHqbjfwzdjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.service.ITbFbHqbjfwzdjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 婚前保健服务诊断记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-19
 */
@Service
public class TbFbHqbjfwzdjlServiceImpl implements ITbFbHqbjfwzdjlService 
{
    @Autowired
    private TbFbHqbjfwzdjlMapper tbFbHqbjfwzdjlMapper;

    /**
     * 查询婚前保健服务诊断记录
     * 
     * @param id 婚前保健服务诊断记录ID
     * @return 婚前保健服务诊断记录
     */
    @Override
    public TbFbHqbjfwzdjl selectTbFbHqbjfwzdjlById(Long id)
    {
        return tbFbHqbjfwzdjlMapper.selectTbFbHqbjfwzdjlById(id);
    }

    /**
     * 查询婚前保健服务诊断记录列表
     * 
     * @param tbFbHqbjfwzdjl 婚前保健服务诊断记录
     * @return 婚前保健服务诊断记录
     */
    @Override
    public List<TbFbHqbjfwzdjl> selectTbFbHqbjfwzdjlList(TbFbHqbjfwzdjl tbFbHqbjfwzdjl)
    {
        return tbFbHqbjfwzdjlMapper.selectTbFbHqbjfwzdjlList(tbFbHqbjfwzdjl);
    }

    /**
     * 新增婚前保健服务诊断记录
     * 
     * @param tbFbHqbjfwzdjl 婚前保健服务诊断记录
     * @return 结果
     */
    @Override
    public int insertTbFbHqbjfwzdjl(TbFbHqbjfwzdjl tbFbHqbjfwzdjl)
    {
        return tbFbHqbjfwzdjlMapper.insertTbFbHqbjfwzdjl(tbFbHqbjfwzdjl);
    }

    /**
     * 修改婚前保健服务诊断记录
     * 
     * @param tbFbHqbjfwzdjl 婚前保健服务诊断记录
     * @return 结果
     */
    @Override
    public int updateTbFbHqbjfwzdjl(TbFbHqbjfwzdjl tbFbHqbjfwzdjl)
    {
        return tbFbHqbjfwzdjlMapper.updateTbFbHqbjfwzdjl(tbFbHqbjfwzdjl);
    }

    /**
     * 删除婚前保健服务诊断记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwzdjlByIds(String ids)
    {
        return tbFbHqbjfwzdjlMapper.deleteTbFbHqbjfwzdjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除婚前保健服务诊断记录信息
     * 
     * @param id 婚前保健服务诊断记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwzdjlById(Long id)
    {
        return tbFbHqbjfwzdjlMapper.deleteTbFbHqbjfwzdjlById(id);
    }
}
