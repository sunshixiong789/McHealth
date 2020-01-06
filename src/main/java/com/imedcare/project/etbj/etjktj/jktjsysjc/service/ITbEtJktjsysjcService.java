package com.imedcare.project.etbj.etjktj.jktjsysjc.service;

import com.imedcare.project.etbj.etjktj.jktjsysjc.domain.TbEtJktjsysjc;
import com.imedcare.project.etbj.etjktj.jktjsysjc.domain.TbEtJktjsysjcVo;

import java.util.List;

/**
 * 儿童健康体检实验室记录Service接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface ITbEtJktjsysjcService 
{
    /**
     * 查询儿童健康体检实验室记录
     * 
     * @param id 儿童健康体检实验室记录ID
     * @return 儿童健康体检实验室记录
     */
    public TbEtJktjsysjcVo selectTbEtJktjsysjcById(Long id);

    /**
     * 查询儿童健康体检实验室记录列表
     * 
     * @param tbEtJktjsysjc 儿童健康体检实验室记录
     * @return 儿童健康体检实验室记录集合
     */
    public List<TbEtJktjsysjcVo> selectTbEtJktjsysjcList(TbEtJktjsysjcVo tbEtJktjsysjc);

    /**
     * 新增儿童健康体检实验室记录
     * 
     * @param tbEtJktjsysjc 儿童健康体检实验室记录
     * @return 结果
     */
    public int insertTbEtJktjsysjc(TbEtJktjsysjc tbEtJktjsysjc);

    /**
     * 修改儿童健康体检实验室记录
     * 
     * @param tbEtJktjsysjc 儿童健康体检实验室记录
     * @return 结果
     */
    public int updateTbEtJktjsysjc(TbEtJktjsysjc tbEtJktjsysjc);

    /**
     * 批量删除儿童健康体检实验室记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtJktjsysjcByIds(String ids);

    /**
     * 删除儿童健康体检实验室记录信息
     * 
     * @param id 儿童健康体检实验室记录ID
     * @return 结果
     */
    public int deleteTbEtJktjsysjcById(Long id);
}
