package com.imedcare.project.etbj.tlsc.tlscdj.mapper;

import com.imedcare.project.etbj.tlsc.tlscdj.domain.TbEtTlsc;
import java.util.List;

/**
 * 新生儿听力筛查Mapper接口
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
public interface TbEtTlscMapper 
{
    /**
     * 查询新生儿听力筛查
     * 
     * @param id 新生儿听力筛查ID
     * @return 新生儿听力筛查
     */
    public TbEtTlsc selectTbEtTlscById(Long id);

    /**
     * 查询新生儿听力筛查列表
     * 
     * @param tbEtTlsc 新生儿听力筛查
     * @return 新生儿听力筛查集合
     */
    public List<TbEtTlsc> selectTbEtTlscList(TbEtTlsc tbEtTlsc);

    /**
     * 新增新生儿听力筛查
     * 
     * @param tbEtTlsc 新生儿听力筛查
     * @return 结果
     */
    public int insertTbEtTlsc(TbEtTlsc tbEtTlsc);

    /**
     * 修改新生儿听力筛查
     * 
     * @param tbEtTlsc 新生儿听力筛查
     * @return 结果
     */
    public int updateTbEtTlsc(TbEtTlsc tbEtTlsc);

    /**
     * 删除新生儿听力筛查
     * 
     * @param id 新生儿听力筛查ID
     * @return 结果
     */
    public int deleteTbEtTlscById(Long id);

    /**
     * 批量删除新生儿听力筛查
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbEtTlscByIds(String[] ids);
}
