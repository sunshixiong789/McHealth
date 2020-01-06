package com.imedcare.project.fnbj.hqbjfw.hqzxzd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.hqbjfw.hqzxzd.mapper.TbFbHqzxzdMapper;
import com.imedcare.project.fnbj.hqbjfw.hqzxzd.domain.TbFbHqzxzd;
import com.imedcare.project.fnbj.hqbjfw.hqzxzd.service.ITbFbHqzxzdService;
import com.imedcare.common.utils.text.Convert;

/**
 * 婚前卫生咨询和指导Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-20
 */
@Service
public class TbFbHqzxzdServiceImpl implements ITbFbHqzxzdService 
{
    @Autowired
    private TbFbHqzxzdMapper tbFbHqzxzdMapper;

    /**
     * 查询婚前卫生咨询和指导
     * 
     * @param id 婚前卫生咨询和指导ID
     * @return 婚前卫生咨询和指导
     */
    @Override
    public TbFbHqzxzd selectTbFbHqzxzdById(Long id)
    {
        return tbFbHqzxzdMapper.selectTbFbHqzxzdById(id);
    }

    /**
     * 查询婚前卫生咨询和指导列表
     * 
     * @param tbFbHqzxzd 婚前卫生咨询和指导
     * @return 婚前卫生咨询和指导
     */
    @Override
    public List<TbFbHqzxzd> selectTbFbHqzxzdList(TbFbHqzxzd tbFbHqzxzd)
    {
        return tbFbHqzxzdMapper.selectTbFbHqzxzdList(tbFbHqzxzd);
    }

    /**
     * 新增婚前卫生咨询和指导
     * 
     * @param tbFbHqzxzd 婚前卫生咨询和指导
     * @return 结果
     */
    @Override
    public int insertTbFbHqzxzd(TbFbHqzxzd tbFbHqzxzd)
    {
        return tbFbHqzxzdMapper.insertTbFbHqzxzd(tbFbHqzxzd);
    }

    /**
     * 修改婚前卫生咨询和指导
     * 
     * @param tbFbHqzxzd 婚前卫生咨询和指导
     * @return 结果
     */
    @Override
    public int updateTbFbHqzxzd(TbFbHqzxzd tbFbHqzxzd)
    {
        return tbFbHqzxzdMapper.updateTbFbHqzxzd(tbFbHqzxzd);
    }

    /**
     * 删除婚前卫生咨询和指导对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqzxzdByIds(String ids)
    {
        return tbFbHqzxzdMapper.deleteTbFbHqzxzdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除婚前卫生咨询和指导信息
     * 
     * @param id 婚前卫生咨询和指导ID
     * @return 结果
     */
    @Override
    public int deleteTbFbHqzxzdById(Long id)
    {
        return tbFbHqzxzdMapper.deleteTbFbHqzxzdById(id);
    }
}
