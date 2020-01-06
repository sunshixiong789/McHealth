package com.imedcare.project.fnbj.gwycf.gwycftgjcjl.mapper;

import com.imedcare.project.fnbj.gwycf.gwycftgjcjl.domain.TbChGwycftgjcjl;
import java.util.List;

/**
 * 高危孕产妇体格检查记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public interface TbChGwycftgjcjlMapper 
{
    /**
     * 查询高危孕产妇体格检查记录
     * 
     * @param id 高危孕产妇体格检查记录ID
     * @return 高危孕产妇体格检查记录
     */
    public TbChGwycftgjcjl selectTbChGwycftgjcjlById(Long id);

    /**
     * 查询高危孕产妇体格检查记录列表
     * 
     * @param tbChGwycftgjcjl 高危孕产妇体格检查记录
     * @return 高危孕产妇体格检查记录集合
     */
    public List<TbChGwycftgjcjl> selectTbChGwycftgjcjlList(TbChGwycftgjcjl tbChGwycftgjcjl);

    /**
     * 新增高危孕产妇体格检查记录
     * 
     * @param tbChGwycftgjcjl 高危孕产妇体格检查记录
     * @return 结果
     */
    public int insertTbChGwycftgjcjl(TbChGwycftgjcjl tbChGwycftgjcjl);

    /**
     * 修改高危孕产妇体格检查记录
     * 
     * @param tbChGwycftgjcjl 高危孕产妇体格检查记录
     * @return 结果
     */
    public int updateTbChGwycftgjcjl(TbChGwycftgjcjl tbChGwycftgjcjl);

    /**
     * 删除高危孕产妇体格检查记录
     * 
     * @param id 高危孕产妇体格检查记录ID
     * @return 结果
     */
    public int deleteTbChGwycftgjcjlById(Long id);

    /**
     * 批量删除高危孕产妇体格检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChGwycftgjcjlByIds(String[] ids);
}
