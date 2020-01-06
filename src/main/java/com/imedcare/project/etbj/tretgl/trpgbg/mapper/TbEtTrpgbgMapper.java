package com.imedcare.project.etbj.tretgl.trpgbg.mapper;

import com.imedcare.project.etbj.tretgl.trpgbg.domain.TbEtTrpgbg;
import com.imedcare.project.etbj.tretgl.trpgbg.domain.TbEtTrpgbgVo;

import java.util.List;

/**
 * 体弱儿童评估报告Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-27
 */
public interface TbEtTrpgbgMapper 
{
    /**
     * 查询体弱儿童评估报告
     * 
     * @param id 体弱儿童评估报告ID
     * @return 体弱儿童评估报告
     */
    public TbEtTrpgbgVo selectTbEtTrpgbgById(Long id);

    /**
     * 查询体弱儿童评估报告列表
     * 
     * @param tbEtTrpgbg 体弱儿童评估报告
     * @return 体弱儿童评估报告集合
     */
    public List<TbEtTrpgbgVo> selectTbEtTrpgbgList(TbEtTrpgbgVo tbEtTrpgbg);

    /**
     * 新增体弱儿童评估报告
     * 
     * @param tbEtTrpgbg 体弱儿童评估报告
     * @return 结果
     */
    public int insertTbEtTrpgbg(TbEtTrpgbg tbEtTrpgbg);

    /**
     * 修改体弱儿童评估报告
     * 
     * @param tbEtTrpgbg 体弱儿童评估报告
     * @return 结果
     */
    public int updateTbEtTrpgbg(TbEtTrpgbg tbEtTrpgbg);

    /**
     * 删除体弱儿童评估报告
     * 
     * @param id 体弱儿童评估报告ID
     * @return 结果
     */
    public int deleteTbEtTrpgbgById(Long id);

    /**
     * 批量删除体弱儿童评估报告
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtTrpgbgByIds(String[] ids);
}
