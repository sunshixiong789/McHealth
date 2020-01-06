package com.imedcare.project.fnbpc.fnbpcfzjcjl.service;

import com.imedcare.project.fnbpc.fnbpcfzjcjl.domain.TbFbFnbpcfzjcjl;
import java.util.List;

/**
 * 妇女病普查辅助检查记录Service接口
 * 
 * @author imedcare
 * @date 2019-11-21
 */
public interface ITbFbFnbpcfzjcjlService 
{
    /**
     * 查询妇女病普查辅助检查记录
     * 
     * @param id 妇女病普查辅助检查记录ID
     * @return 妇女病普查辅助检查记录
     */
    public TbFbFnbpcfzjcjl selectTbFbFnbpcfzjcjlById(Long id);

    /**
     * 查询妇女病普查辅助检查记录列表
     * 
     * @param tbFbFnbpcfzjcjl 妇女病普查辅助检查记录
     * @return 妇女病普查辅助检查记录集合
     */
    public List<TbFbFnbpcfzjcjl> selectTbFbFnbpcfzjcjlList(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl);

    /**
     * 新增妇女病普查辅助检查记录
     * 
     * @param tbFbFnbpcfzjcjl 妇女病普查辅助检查记录
     * @return 结果
     */
    public int insertTbFbFnbpcfzjcjl(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl);

    /**
     * 修改妇女病普查辅助检查记录
     * 
     * @param tbFbFnbpcfzjcjl 妇女病普查辅助检查记录
     * @return 结果
     */
    public int updateTbFbFnbpcfzjcjl(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl);

    /**
     * 批量删除妇女病普查辅助检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbFnbpcfzjcjlByIds(String ids);

    /**
     * 删除妇女病普查辅助检查记录信息
     * 
     * @param id 妇女病普查辅助检查记录ID
     * @return 结果
     */
    public int deleteTbFbFnbpcfzjcjlById(Long id);
}
