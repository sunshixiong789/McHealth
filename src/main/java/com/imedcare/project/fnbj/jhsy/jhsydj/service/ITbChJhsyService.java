package com.imedcare.project.fnbj.jhsy.jhsydj.service;

import com.imedcare.project.fnbj.jhsy.jhsydj.domain.TbChJhsy;
import java.util.List;

/**
 * 计划生育技术服务Service接口
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
public interface ITbChJhsyService 
{
    /**
     * 查询计划生育技术服务
     * 
     * @param id 计划生育技术服务ID
     * @return 计划生育技术服务
     */
    public TbChJhsy selectTbChJhsyById(Long id);

    /**
     * 查询计划生育技术服务列表
     * 
     * @param tbChJhsy 计划生育技术服务
     * @return 计划生育技术服务集合
     */
    public List<TbChJhsy> selectTbChJhsyList(TbChJhsy tbChJhsy);

    /**
     * 新增计划生育技术服务
     * 
     * @param tbChJhsy 计划生育技术服务
     * @return 结果
     */
    public int insertTbChJhsy(TbChJhsy tbChJhsy);

    /**
     * 修改计划生育技术服务
     * 
     * @param tbChJhsy 计划生育技术服务
     * @return 结果
     */
    public int updateTbChJhsy(TbChJhsy tbChJhsy);

    /**
     * 批量删除计划生育技术服务
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChJhsyByIds(String ids);

    /**
     * 删除计划生育技术服务信息
     * 
     * @param id 计划生育技术服务ID
     * @return 结果
     */
    public int deleteTbChJhsyById(Long id);
}
