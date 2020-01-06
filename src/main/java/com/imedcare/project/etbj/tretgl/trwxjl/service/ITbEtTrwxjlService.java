package com.imedcare.project.etbj.tretgl.trwxjl.service;

import com.imedcare.project.etbj.tretgl.trwxjl.domain.TbEtTrwxjl;
import com.imedcare.project.etbj.tretgl.trwxjl.domain.TbEtTrwxjlVo;

import java.util.List;

/**
 * 体弱儿童问询记录Service接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface ITbEtTrwxjlService 
{
    /**
     * 查询体弱儿童问询记录
     * 
     * @param id 体弱儿童问询记录ID
     * @return 体弱儿童问询记录
     */
    public TbEtTrwxjlVo selectTbEtTrwxjlById(Long id);

    /**
     * 查询体弱儿童问询记录列表
     * 
     * @param tbEtTrwxjl 体弱儿童问询记录
     * @return 体弱儿童问询记录集合
     */
    public List<TbEtTrwxjlVo> selectTbEtTrwxjlList(TbEtTrwxjlVo tbEtTrwxjl);

    /**
     * 新增体弱儿童问询记录
     * 
     * @param tbEtTrwxjl 体弱儿童问询记录
     * @return 结果
     */
    public int insertTbEtTrwxjl(TbEtTrwxjl tbEtTrwxjl);

    /**
     * 修改体弱儿童问询记录
     * 
     * @param tbEtTrwxjl 体弱儿童问询记录
     * @return 结果
     */
    public int updateTbEtTrwxjl(TbEtTrwxjl tbEtTrwxjl);

    /**
     * 批量删除体弱儿童问询记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtTrwxjlByIds(String ids);

    /**
     * 删除体弱儿童问询记录信息
     * 
     * @param id 体弱儿童问询记录ID
     * @return 结果
     */
    public int deleteTbEtTrwxjlById(Long id);
}
