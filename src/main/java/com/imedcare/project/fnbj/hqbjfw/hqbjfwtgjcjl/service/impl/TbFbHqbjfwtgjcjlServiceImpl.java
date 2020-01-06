package com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.mapper.TbFbHqbjfwtgjcjlMapper;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.domain.TbFbHqbjfwtgjcjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.service.ITbFbHqbjfwtgjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 婚前保健服务体格检查记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-19
 */
@Service
public class TbFbHqbjfwtgjcjlServiceImpl implements ITbFbHqbjfwtgjcjlService 
{
    @Autowired
    private TbFbHqbjfwtgjcjlMapper tbFbHqbjfwtgjcjlMapper;

    /**
     * 查询婚前保健服务体格检查记录
     * 
     * @param id 婚前保健服务体格检查记录ID
     * @return 婚前保健服务体格检查记录
     */
    @Override
    public TbFbHqbjfwtgjcjl selectTbFbHqbjfwtgjcjlById(Long id)
    {
        return tbFbHqbjfwtgjcjlMapper.selectTbFbHqbjfwtgjcjlById(id);
    }

    /**
     * 查询婚前保健服务体格检查记录列表
     * 
     * @param tbFbHqbjfwtgjcjl 婚前保健服务体格检查记录
     * @return 婚前保健服务体格检查记录
     */
    @Override
    public List<TbFbHqbjfwtgjcjl> selectTbFbHqbjfwtgjcjlList(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl)
    {
        return tbFbHqbjfwtgjcjlMapper.selectTbFbHqbjfwtgjcjlList(tbFbHqbjfwtgjcjl);
    }

    /**
     * 新增婚前保健服务体格检查记录
     * 
     * @param tbFbHqbjfwtgjcjl 婚前保健服务体格检查记录
     * @return 结果
     */
    @Override
    public int insertTbFbHqbjfwtgjcjl(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl)
    {
        return tbFbHqbjfwtgjcjlMapper.insertTbFbHqbjfwtgjcjl(tbFbHqbjfwtgjcjl);
    }

    /**
     * 修改婚前保健服务体格检查记录
     * 
     * @param tbFbHqbjfwtgjcjl 婚前保健服务体格检查记录
     * @return 结果
     */
    @Override
    public int updateTbFbHqbjfwtgjcjl(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl)
    {
        return tbFbHqbjfwtgjcjlMapper.updateTbFbHqbjfwtgjcjl(tbFbHqbjfwtgjcjl);
    }

    /**
     * 删除婚前保健服务体格检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwtgjcjlByIds(String ids)
    {
        return tbFbHqbjfwtgjcjlMapper.deleteTbFbHqbjfwtgjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除婚前保健服务体格检查记录信息
     * 
     * @param id 婚前保健服务体格检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwtgjcjlById(Long id)
    {
        return tbFbHqbjfwtgjcjlMapper.deleteTbFbHqbjfwtgjcjlById(id);
    }
}
