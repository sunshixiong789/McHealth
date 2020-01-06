package com.imedcare.project.fnbj.jhsy.jhsydj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.jhsy.jhsydj.mapper.TbChJhsyMapper;
import com.imedcare.project.fnbj.jhsy.jhsydj.domain.TbChJhsy;
import com.imedcare.project.fnbj.jhsy.jhsydj.service.ITbChJhsyService;
import com.imedcare.common.utils.text.Convert;

/**
 * 计划生育技术服务Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
@Service
public class TbChJhsyServiceImpl implements ITbChJhsyService 
{
    @Autowired
    private TbChJhsyMapper tbChJhsyMapper;

    /**
     * 查询计划生育技术服务
     * 
     * @param id 计划生育技术服务ID
     * @return 计划生育技术服务
     */
    @Override
    public TbChJhsy selectTbChJhsyById(Long id)
    {
        return tbChJhsyMapper.selectTbChJhsyById(id);
    }

    /**
     * 查询计划生育技术服务列表
     * 
     * @param tbChJhsy 计划生育技术服务
     * @return 计划生育技术服务
     */
    @Override
    public List<TbChJhsy> selectTbChJhsyList(TbChJhsy tbChJhsy)
    {
        return tbChJhsyMapper.selectTbChJhsyList(tbChJhsy);
    }

    /**
     * 新增计划生育技术服务
     * 
     * @param tbChJhsy 计划生育技术服务
     * @return 结果
     */
    @Override
    public int insertTbChJhsy(TbChJhsy tbChJhsy)
    {
        return tbChJhsyMapper.insertTbChJhsy(tbChJhsy);
    }

    /**
     * 修改计划生育技术服务
     * 
     * @param tbChJhsy 计划生育技术服务
     * @return 结果
     */
    @Override
    public int updateTbChJhsy(TbChJhsy tbChJhsy)
    {
        return tbChJhsyMapper.updateTbChJhsy(tbChJhsy);
    }

    /**
     * 删除计划生育技术服务对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChJhsyByIds(String ids)
    {
        return tbChJhsyMapper.deleteTbChJhsyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除计划生育技术服务信息
     * 
     * @param id 计划生育技术服务ID
     * @return 结果
     */
    @Override
    public int deleteTbChJhsyById(Long id)
    {
        return tbChJhsyMapper.deleteTbChJhsyById(id);
    }
}
