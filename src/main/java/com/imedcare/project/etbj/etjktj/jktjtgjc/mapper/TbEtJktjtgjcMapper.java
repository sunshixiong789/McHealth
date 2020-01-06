package com.imedcare.project.etbj.etjktj.jktjtgjc.mapper;

import com.imedcare.project.etbj.etjktj.jktjtgjc.domain.TbEtJktjtgjc;
import com.imedcare.project.etbj.etjktj.jktjtgjc.domain.TbEtJktjtgjcVo;

import java.util.List;

/**
 * 儿童健康体检问询记录Mapper接口
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public interface TbEtJktjtgjcMapper 
{
    /**
     * 查询儿童健康体检问询记录
     * 
     * @param id 儿童健康体检问询记录ID
     * @return 儿童健康体检问询记录
     */
    public TbEtJktjtgjcVo selectTbEtJktjtgjcById(Long id);

    /**
     * 查询儿童健康体检问询记录列表
     * 
     * @param tbEtJktjtgjc 儿童健康体检问询记录
     * @return 儿童健康体检问询记录集合
     */
    public List<TbEtJktjtgjcVo> selectTbEtJktjtgjcList(TbEtJktjtgjcVo tbEtJktjtgjc);

    /**
     * 新增儿童健康体检问询记录
     * 
     * @param tbEtJktjtgjc 儿童健康体检问询记录
     * @return 结果
     */
    public int insertTbEtJktjtgjc(TbEtJktjtgjc tbEtJktjtgjc);

    /**
     * 修改儿童健康体检问询记录
     * 
     * @param tbEtJktjtgjc 儿童健康体检问询记录
     * @return 结果
     */
    public int updateTbEtJktjtgjc(TbEtJktjtgjc tbEtJktjtgjc);

    /**
     * 删除儿童健康体检问询记录
     * 
     * @param id 儿童健康体检问询记录ID
     * @return 结果
     */
    public int deleteTbEtJktjtgjcById(Long id);

    /**
     * 批量删除儿童健康体检问询记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtJktjtgjcByIds(String[] ids);
}
