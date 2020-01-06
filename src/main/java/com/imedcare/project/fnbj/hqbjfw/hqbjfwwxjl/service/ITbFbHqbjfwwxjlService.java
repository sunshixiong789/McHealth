package com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.service;

import com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.domain.TbFbHqbjfwwxjl;
import java.util.List;

/**
 * 婚前保健服务问询记录Service接口
 * 
 * @author imedcare
 * @date 2019-11-18
 */
public interface ITbFbHqbjfwwxjlService 
{
    /**
     * 查询婚前保健服务问询记录
     * 
     * @param id 婚前保健服务问询记录ID
     * @return 婚前保健服务问询记录
     */
    public TbFbHqbjfwwxjl selectTbFbHqbjfwwxjlById(Long id);

    /**
     * 查询婚前保健服务问询记录列表
     * 
     * @param tbFbHqbjfwwxjl 婚前保健服务问询记录
     * @return 婚前保健服务问询记录集合
     */
    public List<TbFbHqbjfwwxjl> selectTbFbHqbjfwwxjlList(TbFbHqbjfwwxjl tbFbHqbjfwwxjl);

    /**
     * 新增婚前保健服务问询记录
     * 
     * @param tbFbHqbjfwwxjl 婚前保健服务问询记录
     * @return 结果
     */
    public int insertTbFbHqbjfwwxjl(TbFbHqbjfwwxjl tbFbHqbjfwwxjl);

    /**
     * 修改婚前保健服务问询记录
     * 
     * @param tbFbHqbjfwwxjl 婚前保健服务问询记录
     * @return 结果
     */
    public int updateTbFbHqbjfwwxjl(TbFbHqbjfwwxjl tbFbHqbjfwwxjl);

    /**
     * 批量删除婚前保健服务问询记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwwxjlByIds(String ids);

    /**
     * 删除婚前保健服务问询记录信息
     * 
     * @param id 婚前保健服务问询记录ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwwxjlById(Long id);
}
