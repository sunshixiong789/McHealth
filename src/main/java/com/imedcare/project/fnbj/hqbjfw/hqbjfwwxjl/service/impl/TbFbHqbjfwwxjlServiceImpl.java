package com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.mapper.TbFbHqbjfwwxjlMapper;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.domain.TbFbHqbjfwwxjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.service.ITbFbHqbjfwwxjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 婚前保健服务问询记录Service业务层处理
 * 
 * @author imedcare
 * @date 2019-11-18
 */
@Service
public class TbFbHqbjfwwxjlServiceImpl implements ITbFbHqbjfwwxjlService 
{
    @Autowired
    private TbFbHqbjfwwxjlMapper tbFbHqbjfwwxjlMapper;

    /**
     * 查询婚前保健服务问询记录
     * 
     * @param id 婚前保健服务问询记录ID
     * @return 婚前保健服务问询记录
     */
    @Override
    public TbFbHqbjfwwxjl selectTbFbHqbjfwwxjlById(Long id)
    {
        return tbFbHqbjfwwxjlMapper.selectTbFbHqbjfwwxjlById(id);
    }

    /**
     * 查询婚前保健服务问询记录列表
     * 
     * @param tbFbHqbjfwwxjl 婚前保健服务问询记录
     * @return 婚前保健服务问询记录
     */
    @Override
    public List<TbFbHqbjfwwxjl> selectTbFbHqbjfwwxjlList(TbFbHqbjfwwxjl tbFbHqbjfwwxjl)
    {
        return tbFbHqbjfwwxjlMapper.selectTbFbHqbjfwwxjlList(tbFbHqbjfwwxjl);
    }

    /**
     * 新增婚前保健服务问询记录
     * 
     * @param tbFbHqbjfwwxjl 婚前保健服务问询记录
     * @return 结果
     */
    @Override
    public int insertTbFbHqbjfwwxjl(TbFbHqbjfwwxjl tbFbHqbjfwwxjl)
    {
        return tbFbHqbjfwwxjlMapper.insertTbFbHqbjfwwxjl(tbFbHqbjfwwxjl);
    }

    /**
     * 修改婚前保健服务问询记录
     * 
     * @param tbFbHqbjfwwxjl 婚前保健服务问询记录
     * @return 结果
     */
    @Override
    public int updateTbFbHqbjfwwxjl(TbFbHqbjfwwxjl tbFbHqbjfwwxjl)
    {
        return tbFbHqbjfwwxjlMapper.updateTbFbHqbjfwwxjl(tbFbHqbjfwwxjl);
    }

    /**
     * 删除婚前保健服务问询记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwwxjlByIds(String ids)
    {
        return tbFbHqbjfwwxjlMapper.deleteTbFbHqbjfwwxjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除婚前保健服务问询记录信息
     * 
     * @param id 婚前保健服务问询记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqbjfwwxjlById(Long id)
    {
        return tbFbHqbjfwwxjlMapper.deleteTbFbHqbjfwwxjlById(id);
    }
}
