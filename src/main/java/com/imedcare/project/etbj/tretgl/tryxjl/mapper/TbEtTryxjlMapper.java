package com.imedcare.project.etbj.tretgl.tryxjl.mapper;

import com.imedcare.project.etbj.tretgl.tryxjl.domain.TbEtTryxjl;
import com.imedcare.project.etbj.tretgl.tryxjl.domain.TbEtTryxjlVo;

import java.util.List;

/**
 * 体弱儿童影像检查记录Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface TbEtTryxjlMapper 
{
    /**
     * 查询体弱儿童影像检查记录
     * 
     * @param id 体弱儿童影像检查记录ID
     * @return 体弱儿童影像检查记录
     */
    public TbEtTryxjlVo selectTbEtTryxjlById(Long id);

    /**
     * 查询体弱儿童影像检查记录列表
     * 
     * @param tbEtTryxjl 体弱儿童影像检查记录
     * @return 体弱儿童影像检查记录集合
     */
    public List<TbEtTryxjlVo> selectTbEtTryxjlList(TbEtTryxjlVo tbEtTryxjl);

    /**
     * 新增体弱儿童影像检查记录
     * 
     * @param tbEtTryxjl 体弱儿童影像检查记录
     * @return 结果
     */
    public int insertTbEtTryxjl(TbEtTryxjl tbEtTryxjl);

    /**
     * 修改体弱儿童影像检查记录
     * 
     * @param tbEtTryxjl 体弱儿童影像检查记录
     * @return 结果
     */
    public int updateTbEtTryxjl(TbEtTryxjl tbEtTryxjl);

    /**
     * 删除体弱儿童影像检查记录
     * 
     * @param id 体弱儿童影像检查记录ID
     * @return 结果
     */
    public int deleteTbEtTryxjlById(Long id);

    /**
     * 批量删除体弱儿童影像检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtTryxjlByIds(String[] ids);
}
