package com.imedcare.project.fnbj.cffs.cffssfjl.mapper;

import com.imedcare.project.fnbj.cffs.cffssfjl.domain.TbChCffssfjl;
import java.util.List;

/**
 * 产妇访视随访记录Mapper接口
 * 
 * @author zsl
 * @date 2019-11-18
 */
public interface TbChCffssfjlMapper 
{
    /**
     * 查询产妇访视随访记录
     * 
     * @param chId 产妇访视随访记录ID
     * @return 产妇访视随访记录
     */
    public TbChCffssfjl selectTbChCffssfjlById(Long chId);

    /**
     * 查询产妇访视随访记录列表
     * 
     * @param tbChCffssfjl 产妇访视随访记录
     * @return 产妇访视随访记录集合
     */
    public List<TbChCffssfjl> selectTbChCffssfjlList(TbChCffssfjl tbChCffssfjl);

    /**
     * 新增产妇访视随访记录
     * 
     * @param tbChCffssfjl 产妇访视随访记录
     * @return 结果
     */
    public int insertTbChCffssfjl(TbChCffssfjl tbChCffssfjl);

    /**
     * 修改产妇访视随访记录
     * 
     * @param tbChCffssfjl 产妇访视随访记录
     * @return 结果
     */
    public int updateTbChCffssfjl(TbChCffssfjl tbChCffssfjl);

    /**
     * 删除产妇访视随访记录
     * 
     * @param chId 产妇访视随访记录ID
     * @return 结果
     */
    public int deleteTbChCffssfjlById(Long chId);

    /**
     * 批量删除产妇访视随访记录
     * 
     * @param chIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCffssfjlByIds(String[] chIds);
}
