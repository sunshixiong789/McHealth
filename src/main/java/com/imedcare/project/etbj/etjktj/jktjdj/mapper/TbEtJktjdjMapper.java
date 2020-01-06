package com.imedcare.project.etbj.etjktj.jktjdj.mapper;

import com.imedcare.project.etbj.etjktj.jktjdj.domain.TbEtJktjdj;
import java.util.List;

/**
 * 儿童健康体检登记Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
public interface TbEtJktjdjMapper 
{
    /**
     * 查询儿童健康体检登记
     * 
     * @param id 儿童健康体检登记ID
     * @return 儿童健康体检登记
     */
    public TbEtJktjdj selectTbEtJktjdjById(Long id);

    /**
     * 查询儿童健康体检登记列表
     * 
     * @param tbEtJktjdj 儿童健康体检登记
     * @return 儿童健康体检登记集合
     */
    public List<TbEtJktjdj> selectTbEtJktjdjList(TbEtJktjdj tbEtJktjdj);

    /**
     * 新增儿童健康体检登记
     * 
     * @param tbEtJktjdj 儿童健康体检登记
     * @return 结果
     */
    public int insertTbEtJktjdj(TbEtJktjdj tbEtJktjdj);

    /**
     * 修改儿童健康体检登记
     * 
     * @param tbEtJktjdj 儿童健康体检登记
     * @return 结果
     */
    public int updateTbEtJktjdj(TbEtJktjdj tbEtJktjdj);

    /**
     * 删除儿童健康体检登记
     * 
     * @param id 儿童健康体检登记ID
     * @return 结果
     */
    public int deleteTbEtJktjdjById(Long id);

    /**
     * 批量删除儿童健康体检登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtJktjdjByIds(String[] ids);
}
