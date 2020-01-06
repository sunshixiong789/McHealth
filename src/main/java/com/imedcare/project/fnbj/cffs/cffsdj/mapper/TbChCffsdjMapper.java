package com.imedcare.project.fnbj.cffs.cffsdj.mapper;

import com.imedcare.project.fnbj.cffs.cffsdj.domain.TbChCffsdj;
import java.util.List;

/**
 * 产妇访视登记Mapper接口
 * 
 * @author zsl
 * @date 2019-11-15
 */
public interface TbChCffsdjMapper 
{
    /**
     * 查询产妇访视登记
     * 
     * @param id 产妇访视登记ID
     * @return 产妇访视登记
     */
    public TbChCffsdj selectTbChCffsdjById(Long id);

    /**
     * 查询产妇访视登记列表
     * 
     * @param tbChCffsdj 产妇访视登记
     * @return 产妇访视登记集合
     */
    public List<TbChCffsdj> selectTbChCffsdjList(TbChCffsdj tbChCffsdj);

    /**
     * 新增产妇访视登记
     * 
     * @param tbChCffsdj 产妇访视登记
     * @return 结果
     */
    public int insertTbChCffsdj(TbChCffsdj tbChCffsdj);

    /**
     * 修改产妇访视登记
     * 
     * @param tbChCffsdj 产妇访视登记
     * @return 结果
     */
    public int updateTbChCffsdj(TbChCffsdj tbChCffsdj);

    /**
     * 删除产妇访视登记
     * 
     * @param id 产妇访视登记ID
     * @return 结果
     */
    public int deleteTbChCffsdjById(Long id);

    /**
     * 批量删除产妇访视登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCffsdjByIds(String[] ids);
}
