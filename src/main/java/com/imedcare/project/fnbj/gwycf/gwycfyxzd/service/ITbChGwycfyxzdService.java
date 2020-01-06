package com.imedcare.project.fnbj.gwycf.gwycfyxzd.service;

import com.imedcare.project.fnbj.gwycf.gwycfyxzd.domain.TbChGwycfyxzd;
import java.util.List;

/**
 * 高危孕产妇医学指导Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public interface ITbChGwycfyxzdService 
{
    /**
     * 查询高危孕产妇医学指导
     * 
     * @param id 高危孕产妇医学指导ID
     * @return 高危孕产妇医学指导
     */
    public TbChGwycfyxzd selectTbChGwycfyxzdById(Long id);

    /**
     * 查询高危孕产妇医学指导列表
     * 
     * @param tbChGwycfyxzd 高危孕产妇医学指导
     * @return 高危孕产妇医学指导集合
     */
    public List<TbChGwycfyxzd> selectTbChGwycfyxzdList(TbChGwycfyxzd tbChGwycfyxzd);

    /**
     * 新增高危孕产妇医学指导
     * 
     * @param tbChGwycfyxzd 高危孕产妇医学指导
     * @return 结果
     */
    public int insertTbChGwycfyxzd(TbChGwycfyxzd tbChGwycfyxzd);

    /**
     * 修改高危孕产妇医学指导
     * 
     * @param tbChGwycfyxzd 高危孕产妇医学指导
     * @return 结果
     */
    public int updateTbChGwycfyxzd(TbChGwycfyxzd tbChGwycfyxzd);

    /**
     * 批量删除高危孕产妇医学指导
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChGwycfyxzdByIds(String ids);

    /**
     * 删除高危孕产妇医学指导信息
     * 
     * @param id 高危孕产妇医学指导ID
     * @return 结果
     */
    public int deleteTbChGwycfyxzdById(Long id);
}
