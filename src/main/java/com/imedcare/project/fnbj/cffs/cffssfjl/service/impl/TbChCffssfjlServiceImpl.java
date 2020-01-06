package com.imedcare.project.fnbj.cffs.cffssfjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cffs.cffssfjl.mapper.TbChCffssfjlMapper;
import com.imedcare.project.fnbj.cffs.cffssfjl.domain.TbChCffssfjl;
import com.imedcare.project.fnbj.cffs.cffssfjl.service.ITbChCffssfjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产妇访视随访记录Service业务层处理
 * 
 * @author zsl
 * @date 2019-11-18
 */
@Service
public class TbChCffssfjlServiceImpl implements ITbChCffssfjlService 
{
    @Autowired
    private TbChCffssfjlMapper tbChCffssfjlMapper;

    /**
     * 查询产妇访视随访记录
     * 
     * @param chId 产妇访视随访记录ID
     * @return 产妇访视随访记录
     */
    @Override
    public TbChCffssfjl selectTbChCffssfjlById(Long chId)
    {
        return tbChCffssfjlMapper.selectTbChCffssfjlById(chId);
    }

    /**
     * 查询产妇访视随访记录列表
     * 
     * @param tbChCffssfjl 产妇访视随访记录
     * @return 产妇访视随访记录
     */
    @Override
    public List<TbChCffssfjl> selectTbChCffssfjlList(TbChCffssfjl tbChCffssfjl)
    {
        return tbChCffssfjlMapper.selectTbChCffssfjlList(tbChCffssfjl);
    }

    /**
     * 新增产妇访视随访记录
     * 
     * @param tbChCffssfjl 产妇访视随访记录
     * @return 结果
     */
    @Override
    public int insertTbChCffssfjl(TbChCffssfjl tbChCffssfjl)
    {
        return tbChCffssfjlMapper.insertTbChCffssfjl(tbChCffssfjl);
    }

    /**
     * 修改产妇访视随访记录
     * 
     * @param tbChCffssfjl 产妇访视随访记录
     * @return 结果
     */
    @Override
    public int updateTbChCffssfjl(TbChCffssfjl tbChCffssfjl)
    {
        return tbChCffssfjlMapper.updateTbChCffssfjl(tbChCffssfjl);
    }

    /**
     * 删除产妇访视随访记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCffssfjlByIds(String ids)
    {
        return tbChCffssfjlMapper.deleteTbChCffssfjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产妇访视随访记录信息
     * 
     * @param chId 产妇访视随访记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCffssfjlById(Long chId)
    {
        return tbChCffssfjlMapper.deleteTbChCffssfjlById(chId);
    }
}
