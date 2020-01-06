package com.imedcare.project.fnbj.cqzd.cqzdyxzd.mapper;

import com.imedcare.project.fnbj.cqzd.cqzdyxzd.domain.TbChCqzdyxzd;
import java.util.List;

/**
 * 产前诊断医学指导Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqzdyxzdMapper 
{
    /**
     * 查询产前诊断医学指导
     * 
     * @param id 产前诊断医学指导ID
     * @return 产前诊断医学指导
     */
    public TbChCqzdyxzd selectTbChCqzdyxzdById(Long id);

    /**
     * 查询产前诊断医学指导列表
     * 
     * @param tbChCqzdyxzd 产前诊断医学指导
     * @return 产前诊断医学指导集合
     */
    public List<TbChCqzdyxzd> selectTbChCqzdyxzdList(TbChCqzdyxzd tbChCqzdyxzd);

    /**
     * 新增产前诊断医学指导
     * 
     * @param tbChCqzdyxzd 产前诊断医学指导
     * @return 结果
     */
    public int insertTbChCqzdyxzd(TbChCqzdyxzd tbChCqzdyxzd);

    /**
     * 修改产前诊断医学指导
     * 
     * @param tbChCqzdyxzd 产前诊断医学指导
     * @return 结果
     */
    public int updateTbChCqzdyxzd(TbChCqzdyxzd tbChCqzdyxzd);

    /**
     * 删除产前诊断医学指导
     * 
     * @param id 产前诊断医学指导ID
     * @return 结果
     */
    public int deleteTbChCqzdyxzdById(Long id);

    /**
     * 批量删除产前诊断医学指导
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqzdyxzdByIds(String[] ids);
}
