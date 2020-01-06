package com.imedcare.project.fnbj.cqsc.cqsctgjcjl.mapper;

import com.imedcare.project.fnbj.cqsc.cqsctgjcjl.domain.TbChCqsctgjcjl;
import java.util.List;

/**
 * 产前筛查体格检查记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public interface TbChCqsctgjcjlMapper 
{
    /**
     * 查询产前筛查体格检查记录
     * 
     * @param id 产前筛查体格检查记录ID
     * @return 产前筛查体格检查记录
     */
    public TbChCqsctgjcjl selectTbChCqsctgjcjlById(Long id);

    /**
     * 查询产前筛查体格检查记录列表
     * 
     * @param tbChCqsctgjcjl 产前筛查体格检查记录
     * @return 产前筛查体格检查记录集合
     */
    public List<TbChCqsctgjcjl> selectTbChCqsctgjcjlList(TbChCqsctgjcjl tbChCqsctgjcjl);

    /**
     * 新增产前筛查体格检查记录
     * 
     * @param tbChCqsctgjcjl 产前筛查体格检查记录
     * @return 结果
     */
    public int insertTbChCqsctgjcjl(TbChCqsctgjcjl tbChCqsctgjcjl);

    /**
     * 修改产前筛查体格检查记录
     * 
     * @param tbChCqsctgjcjl 产前筛查体格检查记录
     * @return 结果
     */
    public int updateTbChCqsctgjcjl(TbChCqsctgjcjl tbChCqsctgjcjl);

    /**
     * 删除产前筛查体格检查记录
     * 
     * @param id 产前筛查体格检查记录ID
     * @return 结果
     */
    public int deleteTbChCqsctgjcjlById(Long id);

    /**
     * 批量删除产前筛查体格检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChCqsctgjcjlByIds(String[] ids);
}
