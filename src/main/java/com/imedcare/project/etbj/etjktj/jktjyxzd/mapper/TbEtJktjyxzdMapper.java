package com.imedcare.project.etbj.etjktj.jktjyxzd.mapper;

import com.imedcare.project.etbj.etjktj.jktjyxzd.domain.TbEtJktjyxzd;
import com.imedcare.project.etbj.etjktj.jktjyxzd.domain.TbEtJktjyxzdVo;

import java.util.List;

/**
 * 儿童健康体检医学指导Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface TbEtJktjyxzdMapper 
{
    /**
     * 查询儿童健康体检医学指导
     * 
     * @param id 儿童健康体检医学指导ID
     * @return 儿童健康体检医学指导
     */
    public TbEtJktjyxzdVo selectTbEtJktjyxzdById(Long id);

    /**
     * 查询儿童健康体检医学指导列表
     * 
     * @param tbEtJktjyxzd 儿童健康体检医学指导
     * @return 儿童健康体检医学指导集合
     */
    public List<TbEtJktjyxzdVo> selectTbEtJktjyxzdList(TbEtJktjyxzdVo tbEtJktjyxzd);

    /**
     * 新增儿童健康体检医学指导
     * 
     * @param tbEtJktjyxzd 儿童健康体检医学指导
     * @return 结果
     */
    public int insertTbEtJktjyxzd(TbEtJktjyxzd tbEtJktjyxzd);

    /**
     * 修改儿童健康体检医学指导
     * 
     * @param tbEtJktjyxzd 儿童健康体检医学指导
     * @return 结果
     */
    public int updateTbEtJktjyxzd(TbEtJktjyxzd tbEtJktjyxzd);

    /**
     * 删除儿童健康体检医学指导
     * 
     * @param id 儿童健康体检医学指导ID
     * @return 结果
     */
    public int deleteTbEtJktjyxzdById(Long id);

    /**
     * 批量删除儿童健康体检医学指导
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtJktjyxzdByIds(String[] ids);
}
