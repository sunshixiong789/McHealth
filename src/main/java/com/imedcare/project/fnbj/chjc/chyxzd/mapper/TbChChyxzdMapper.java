package com.imedcare.project.fnbj.chjc.chyxzd.mapper;

import com.imedcare.project.fnbj.chjc.chyxzd.domain.TbChChyxzd;
import java.util.List;

/**
 * 产后42天医学指导Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
public interface TbChChyxzdMapper 
{
    /**
     * 查询产后42天医学指导
     * 
     * @param id 产后42天医学指导ID
     * @return 产后42天医学指导
     */
    public TbChChyxzd selectTbChChyxzdById(Long id);

    /**
     * 查询产后42天医学指导列表
     * 
     * @param tbChChyxzd 产后42天医学指导
     * @return 产后42天医学指导集合
     */
    public List<TbChChyxzd> selectTbChChyxzdList(TbChChyxzd tbChChyxzd);

    /**
     * 新增产后42天医学指导
     * 
     * @param tbChChyxzd 产后42天医学指导
     * @return 结果
     */
    public int insertTbChChyxzd(TbChChyxzd tbChChyxzd);

    /**
     * 修改产后42天医学指导
     * 
     * @param tbChChyxzd 产后42天医学指导
     * @return 结果
     */
    public int updateTbChChyxzd(TbChChyxzd tbChChyxzd);

    /**
     * 删除产后42天医学指导
     * 
     * @param id 产后42天医学指导ID
     * @return 结果
     */
    public int deleteTbChChyxzdById(Long id);

    /**
     * 批量删除产后42天医学指导
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChChyxzdByIds(String[] ids);
}
