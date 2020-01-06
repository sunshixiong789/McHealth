package com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.service;

import com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.domain.TbFbHqbjfwsysjyjl;
import java.util.List;

/**
 * 婚前保健服务实验室检验记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-19
 */
public interface ITbFbHqbjfwsysjyjlService 
{
    /**
     * 查询婚前保健服务实验室检验记录
     * 
     * @param id 婚前保健服务实验室检验记录ID
     * @return 婚前保健服务实验室检验记录
     */
    public TbFbHqbjfwsysjyjl selectTbFbHqbjfwsysjyjlById(Long id);

    /**
     * 查询婚前保健服务实验室检验记录列表
     * 
     * @param tbFbHqbjfwsysjyjl 婚前保健服务实验室检验记录
     * @return 婚前保健服务实验室检验记录集合
     */
    public List<TbFbHqbjfwsysjyjl> selectTbFbHqbjfwsysjyjlList(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl);

    /**
     * 新增婚前保健服务实验室检验记录
     * 
     * @param tbFbHqbjfwsysjyjl 婚前保健服务实验室检验记录
     * @return 结果
     */
    public int insertTbFbHqbjfwsysjyjl(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl);

    /**
     * 修改婚前保健服务实验室检验记录
     * 
     * @param tbFbHqbjfwsysjyjl 婚前保健服务实验室检验记录
     * @return 结果
     */
    public int updateTbFbHqbjfwsysjyjl(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl);

    /**
     * 批量删除婚前保健服务实验室检验记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwsysjyjlByIds(String ids);

    /**
     * 删除婚前保健服务实验室检验记录信息
     * 
     * @param id 婚前保健服务实验室检验记录ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwsysjyjlById(Long id);
}
