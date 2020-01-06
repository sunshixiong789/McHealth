package com.imedcare.project.fnbj.chjc.chpgbg.service;

import com.imedcare.project.fnbj.chjc.chpgbg.domain.TbChChpgbg;
import java.util.List;

/**
 * 产后42天评估报告（孕产妇保健管理结案）Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
public interface ITbChChpgbgService 
{
    /**
     * 查询产后42天评估报告（孕产妇保健管理结案）
     * 
     * @param id 产后42天评估报告（孕产妇保健管理结案）ID
     * @return 产后42天评估报告（孕产妇保健管理结案）
     */
    public TbChChpgbg selectTbChChpgbgById(Long id);

    /**
     * 查询产后42天评估报告（孕产妇保健管理结案）列表
     * 
     * @param tbChChpgbg 产后42天评估报告（孕产妇保健管理结案）
     * @return 产后42天评估报告（孕产妇保健管理结案）集合
     */
    public List<TbChChpgbg> selectTbChChpgbgList(TbChChpgbg tbChChpgbg);

    /**
     * 新增产后42天评估报告（孕产妇保健管理结案）
     * 
     * @param tbChChpgbg 产后42天评估报告（孕产妇保健管理结案）
     * @return 结果
     */
    public int insertTbChChpgbg(TbChChpgbg tbChChpgbg);

    /**
     * 修改产后42天评估报告（孕产妇保健管理结案）
     * 
     * @param tbChChpgbg 产后42天评估报告（孕产妇保健管理结案）
     * @return 结果
     */
    public int updateTbChChpgbg(TbChChpgbg tbChChpgbg);

    /**
     * 批量删除产后42天评估报告（孕产妇保健管理结案）
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChChpgbgByIds(String ids);

    /**
     * 删除产后42天评估报告（孕产妇保健管理结案）信息
     * 
     * @param id 产后42天评估报告（孕产妇保健管理结案）ID
     * @return 结果
     */
    public int deleteTbChChpgbgById(Long id);
}
