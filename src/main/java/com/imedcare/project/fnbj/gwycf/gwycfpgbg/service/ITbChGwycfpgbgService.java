package com.imedcare.project.fnbj.gwycf.gwycfpgbg.service;

import com.imedcare.project.fnbj.gwycf.gwycfpgbg.domain.TbChGwycfpgbg;
import java.util.List;

/**
 * 高危孕产妇评估报告Service接口
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public interface ITbChGwycfpgbgService 
{
    /**
     * 查询高危孕产妇评估报告
     * 
     * @param id 高危孕产妇评估报告ID
     * @return 高危孕产妇评估报告
     */
    public TbChGwycfpgbg selectTbChGwycfpgbgById(Long id);

    /**
     * 查询高危孕产妇评估报告列表
     * 
     * @param tbChGwycfpgbg 高危孕产妇评估报告
     * @return 高危孕产妇评估报告集合
     */
    public List<TbChGwycfpgbg> selectTbChGwycfpgbgList(TbChGwycfpgbg tbChGwycfpgbg);

    /**
     * 新增高危孕产妇评估报告
     * 
     * @param tbChGwycfpgbg 高危孕产妇评估报告
     * @return 结果
     */
    public int insertTbChGwycfpgbg(TbChGwycfpgbg tbChGwycfpgbg);

    /**
     * 修改高危孕产妇评估报告
     * 
     * @param tbChGwycfpgbg 高危孕产妇评估报告
     * @return 结果
     */
    public int updateTbChGwycfpgbg(TbChGwycfpgbg tbChGwycfpgbg);

    /**
     * 批量删除高危孕产妇评估报告
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChGwycfpgbgByIds(String ids);

    /**
     * 删除高危孕产妇评估报告信息
     * 
     * @param id 高危孕产妇评估报告ID
     * @return 结果
     */
    public int deleteTbChGwycfpgbgById(Long id);
}
