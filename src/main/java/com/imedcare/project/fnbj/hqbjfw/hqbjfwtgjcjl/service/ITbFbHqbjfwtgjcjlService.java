package com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.service;

import com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.domain.TbFbHqbjfwtgjcjl;
import java.util.List;

/**
 * 婚前保健服务体格检查记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-19
 */
public interface ITbFbHqbjfwtgjcjlService 
{
    /**
     * 查询婚前保健服务体格检查记录
     * 
     * @param id 婚前保健服务体格检查记录ID
     * @return 婚前保健服务体格检查记录
     */
    public TbFbHqbjfwtgjcjl selectTbFbHqbjfwtgjcjlById(Long id);

    /**
     * 查询婚前保健服务体格检查记录列表
     * 
     * @param tbFbHqbjfwtgjcjl 婚前保健服务体格检查记录
     * @return 婚前保健服务体格检查记录集合
     */
    public List<TbFbHqbjfwtgjcjl> selectTbFbHqbjfwtgjcjlList(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl);

    /**
     * 新增婚前保健服务体格检查记录
     * 
     * @param tbFbHqbjfwtgjcjl 婚前保健服务体格检查记录
     * @return 结果
     */
    public int insertTbFbHqbjfwtgjcjl(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl);

    /**
     * 修改婚前保健服务体格检查记录
     * 
     * @param tbFbHqbjfwtgjcjl 婚前保健服务体格检查记录
     * @return 结果
     */
    public int updateTbFbHqbjfwtgjcjl(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl);

    /**
     * 批量删除婚前保健服务体格检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwtgjcjlByIds(String ids);

    /**
     * 删除婚前保健服务体格检查记录信息
     * 
     * @param id 婚前保健服务体格检查记录ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwtgjcjlById(Long id);
}
