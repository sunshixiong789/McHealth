package com.imedcare.project.etbj.tretgl.trtgjc.mapper;

import com.imedcare.project.etbj.tretgl.trtgjc.domain.TbEtTrtgjc;
import com.imedcare.project.etbj.tretgl.trtgjc.domain.TbEtTrtgjcVo;

import java.util.List;

/**
 * 体弱儿童体格检查记录Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface TbEtTrtgjcMapper 
{
    /**
     * 查询体弱儿童体格检查记录
     * 
     * @param id 体弱儿童体格检查记录ID
     * @return 体弱儿童体格检查记录
     */
    public TbEtTrtgjcVo selectTbEtTrtgjcById(Long id);

    /**
     * 查询体弱儿童体格检查记录列表
     * 
     * @param tbEtTrtgjc 体弱儿童体格检查记录
     * @return 体弱儿童体格检查记录集合
     */
    public List<TbEtTrtgjcVo> selectTbEtTrtgjcList(TbEtTrtgjcVo tbEtTrtgjc);

    /**
     * 新增体弱儿童体格检查记录
     * 
     * @param tbEtTrtgjc 体弱儿童体格检查记录
     * @return 结果
     */
    public int insertTbEtTrtgjc(TbEtTrtgjc tbEtTrtgjc);

    /**
     * 修改体弱儿童体格检查记录
     * 
     * @param tbEtTrtgjc 体弱儿童体格检查记录
     * @return 结果
     */
    public int updateTbEtTrtgjc(TbEtTrtgjc tbEtTrtgjc);

    /**
     * 删除体弱儿童体格检查记录
     * 
     * @param id 体弱儿童体格检查记录ID
     * @return 结果
     */
    public int deleteTbEtTrtgjcById(Long id);

    /**
     * 批量删除体弱儿童体格检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtTrtgjcByIds(String[] ids);
}
