package com.imedcare.project.fnbj.chjc.chjcdj.mapper;

import com.imedcare.project.fnbj.chjc.chjcdj.domain.TbChChjcdj;
import java.util.List;

/**
 * 产后42天检查登记Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
public interface TbChChjcdjMapper 
{
    /**
     * 查询产后42天检查登记
     * 
     * @param id 产后42天检查登记ID
     * @return 产后42天检查登记
     */
    public TbChChjcdj selectTbChChjcdjById(Long id);

    /**
     * 查询产后42天检查登记列表
     * 
     * @param tbChChjcdj 产后42天检查登记
     * @return 产后42天检查登记集合
     */
    public List<TbChChjcdj> selectTbChChjcdjList(TbChChjcdj tbChChjcdj);

    /**
     * 新增产后42天检查登记
     * 
     * @param tbChChjcdj 产后42天检查登记
     * @return 结果
     */
    public int insertTbChChjcdj(TbChChjcdj tbChChjcdj);

    /**
     * 修改产后42天检查登记
     * 
     * @param tbChChjcdj 产后42天检查登记
     * @return 结果
     */
    public int updateTbChChjcdj(TbChChjcdj tbChChjcdj);

    /**
     * 删除产后42天检查登记
     * 
     * @param id 产后42天检查登记ID
     * @return 结果
     */
    public int deleteTbChChjcdjById(Long id);

    /**
     * 批量删除产后42天检查登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChChjcdjByIds(String[] ids);
}
