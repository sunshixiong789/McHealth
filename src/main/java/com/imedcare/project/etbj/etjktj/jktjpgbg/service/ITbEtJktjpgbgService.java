package com.imedcare.project.etbj.etjktj.jktjpgbg.service;

import com.imedcare.project.etbj.etjktj.jktjpgbg.domain.TbEtJktjpgbg;
import com.imedcare.project.etbj.etjktj.jktjpgbg.domain.TbEtJktjpgbgVo;

import java.util.List;

/**
 * 儿童健康体检评估报告Service接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface ITbEtJktjpgbgService 
{
    /**
     * 查询儿童健康体检评估报告
     * 
     * @param id 儿童健康体检评估报告ID
     * @return 儿童健康体检评估报告
     */
    public TbEtJktjpgbgVo selectTbEtJktjpgbgById(Long id);

    /**
     * 查询儿童健康体检评估报告列表
     * 
     * @param tbEtJktjpgbg 儿童健康体检评估报告
     * @return 儿童健康体检评估报告集合
     */
    public List<TbEtJktjpgbgVo> selectTbEtJktjpgbgList(TbEtJktjpgbgVo tbEtJktjpgbg);

    /**
     * 新增儿童健康体检评估报告
     * 
     * @param tbEtJktjpgbg 儿童健康体检评估报告
     * @return 结果
     */
    public int insertTbEtJktjpgbg(TbEtJktjpgbg tbEtJktjpgbg);

    /**
     * 修改儿童健康体检评估报告
     * 
     * @param tbEtJktjpgbg 儿童健康体检评估报告
     * @return 结果
     */
    public int updateTbEtJktjpgbg(TbEtJktjpgbg tbEtJktjpgbg);

    /**
     * 批量删除儿童健康体检评估报告
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtJktjpgbgByIds(String ids);

    /**
     * 删除儿童健康体检评估报告信息
     * 
     * @param id 儿童健康体检评估报告ID
     * @return 结果
     */
    public int deleteTbEtJktjpgbgById(Long id);
}
