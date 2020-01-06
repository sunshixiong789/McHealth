package com.imedcare.project.fnbj.cqsc.cqscwxjl.mapper;

import com.imedcare.project.fnbj.cqsc.cqscwxjl.domain.TbChCqscwxjl;
import java.util.List;

/**
 * 产前筛查问询记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqscwxjlMapper 
{
    /**
     * 查询产前筛查问询记录
     * 
     * @param id 产前筛查问询记录ID
     * @return 产前筛查问询记录
     */
    public TbChCqscwxjl selectTbChCqscwxjlById(Long id);

    /**
     * 查询产前筛查问询记录列表
     * 
     * @param tbChCqscwxjl 产前筛查问询记录
     * @return 产前筛查问询记录集合
     */
    public List<TbChCqscwxjl> selectTbChCqscwxjlList(TbChCqscwxjl tbChCqscwxjl);

    /**
     * 新增产前筛查问询记录
     * 
     * @param tbChCqscwxjl 产前筛查问询记录
     * @return 结果
     */
    public int insertTbChCqscwxjl(TbChCqscwxjl tbChCqscwxjl);

    /**
     * 修改产前筛查问询记录
     * 
     * @param tbChCqscwxjl 产前筛查问询记录
     * @return 结果
     */
    public int updateTbChCqscwxjl(TbChCqscwxjl tbChCqscwxjl);

    /**
     * 删除产前筛查问询记录
     * 
     * @param id 产前筛查问询记录ID
     * @return 结果
     */
    public int deleteTbChCqscwxjlById(Long id);

    /**
     * 批量删除产前筛查问询记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqscwxjlByIds(String[] ids);
}
