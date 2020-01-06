package com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.mapper.TbFbHqbjyxjcjlMapper;
import com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.domain.TbFbHqbjyxjcjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.service.ITbFbHqbjyxjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 婚前保健影像检查记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-19
 */
@Service
public class TbFbHqbjyxjcjlServiceImpl implements ITbFbHqbjyxjcjlService 
{
    @Autowired
    private TbFbHqbjyxjcjlMapper tbFbHqbjyxjcjlMapper;

    /**
     * 查询婚前保健影像检查记录
     * 
     * @param id 婚前保健影像检查记录ID
     * @return 婚前保健影像检查记录
     */
    @Override
    public TbFbHqbjyxjcjl selectTbFbHqbjyxjcjlById(Long id)
    {
        return tbFbHqbjyxjcjlMapper.selectTbFbHqbjyxjcjlById(id);
    }

    /**
     * 查询婚前保健影像检查记录列表
     * 
     * @param tbFbHqbjyxjcjl 婚前保健影像检查记录
     * @return 婚前保健影像检查记录
     */
    @Override
    public List<TbFbHqbjyxjcjl> selectTbFbHqbjyxjcjlList(TbFbHqbjyxjcjl tbFbHqbjyxjcjl)
    {
        return tbFbHqbjyxjcjlMapper.selectTbFbHqbjyxjcjlList(tbFbHqbjyxjcjl);
    }

    /**
     * 新增婚前保健影像检查记录
     * 
     * @param tbFbHqbjyxjcjl 婚前保健影像检查记录
     * @return 结果
     */
    @Override
    public int insertTbFbHqbjyxjcjl(TbFbHqbjyxjcjl tbFbHqbjyxjcjl)
    {
        return tbFbHqbjyxjcjlMapper.insertTbFbHqbjyxjcjl(tbFbHqbjyxjcjl);
    }

    /**
     * 修改婚前保健影像检查记录
     * 
     * @param tbFbHqbjyxjcjl 婚前保健影像检查记录
     * @return 结果
     */
    @Override
    public int updateTbFbHqbjyxjcjl(TbFbHqbjyxjcjl tbFbHqbjyxjcjl)
    {
        return tbFbHqbjyxjcjlMapper.updateTbFbHqbjyxjcjl(tbFbHqbjyxjcjl);
    }

    /**
     * 删除婚前保健影像检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjyxjcjlByIds(String ids)
    {
        return tbFbHqbjyxjcjlMapper.deleteTbFbHqbjyxjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除婚前保健影像检查记录信息
     * 
     * @param id 婚前保健影像检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjyxjcjlById(Long id)
    {
        return tbFbHqbjyxjcjlMapper.deleteTbFbHqbjyxjcjlById(id);
    }
}
