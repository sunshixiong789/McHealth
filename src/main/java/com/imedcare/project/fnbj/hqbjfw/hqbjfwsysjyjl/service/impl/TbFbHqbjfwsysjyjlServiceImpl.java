package com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.mapper.TbFbHqbjfwsysjyjlMapper;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.domain.TbFbHqbjfwsysjyjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.service.ITbFbHqbjfwsysjyjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 婚前保健服务实验室检验记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-19
 */
@Service
public class TbFbHqbjfwsysjyjlServiceImpl implements ITbFbHqbjfwsysjyjlService 
{
    @Autowired
    private TbFbHqbjfwsysjyjlMapper tbFbHqbjfwsysjyjlMapper;

    /**
     * 查询婚前保健服务实验室检验记录
     * 
     * @param id 婚前保健服务实验室检验记录ID
     * @return 婚前保健服务实验室检验记录
     */
    @Override
    public TbFbHqbjfwsysjyjl selectTbFbHqbjfwsysjyjlById(Long id)
    {
        return tbFbHqbjfwsysjyjlMapper.selectTbFbHqbjfwsysjyjlById(id);
    }

    /**
     * 查询婚前保健服务实验室检验记录列表
     * 
     * @param tbFbHqbjfwsysjyjl 婚前保健服务实验室检验记录
     * @return 婚前保健服务实验室检验记录
     */
    @Override
    public List<TbFbHqbjfwsysjyjl> selectTbFbHqbjfwsysjyjlList(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl)
    {
        return tbFbHqbjfwsysjyjlMapper.selectTbFbHqbjfwsysjyjlList(tbFbHqbjfwsysjyjl);
    }

    /**
     * 新增婚前保健服务实验室检验记录
     * 
     * @param tbFbHqbjfwsysjyjl 婚前保健服务实验室检验记录
     * @return 结果
     */
    @Override
    public int insertTbFbHqbjfwsysjyjl(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl)
    {
        return tbFbHqbjfwsysjyjlMapper.insertTbFbHqbjfwsysjyjl(tbFbHqbjfwsysjyjl);
    }

    /**
     * 修改婚前保健服务实验室检验记录
     * 
     * @param tbFbHqbjfwsysjyjl 婚前保健服务实验室检验记录
     * @return 结果
     */
    @Override
    public int updateTbFbHqbjfwsysjyjl(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl)
    {
        return tbFbHqbjfwsysjyjlMapper.updateTbFbHqbjfwsysjyjl(tbFbHqbjfwsysjyjl);
    }

    /**
     * 删除婚前保健服务实验室检验记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwsysjyjlByIds(String ids)
    {
        return tbFbHqbjfwsysjyjlMapper.deleteTbFbHqbjfwsysjyjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除婚前保健服务实验室检验记录信息
     * 
     * @param id 婚前保健服务实验室检验记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwsysjyjlById(Long id)
    {
        return tbFbHqbjfwsysjyjlMapper.deleteTbFbHqbjfwsysjyjlById(id);
    }
}
