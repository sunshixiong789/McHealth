package com.imedcare.project.fnbpc.fnbpcwxjl.mapper;

import com.imedcare.project.fnbpc.fnbpcwxjl.domain.TbFbFnbpcwxjl;
import java.util.List;

/**
 * 妇女病普查问询记录Mapper接口
 * 
 * @author liuyang
 * @date 2019-11-20
 */
public interface TbFbFnbpcwxjlMapper 
{
    /**
     * 查询妇女病普查问询记录
     * 
     * @param id 妇女病普查问询记录ID
     * @return 妇女病普查问询记录
     */
    public TbFbFnbpcwxjl selectTbFbFnbpcwxjlById(Long id);

    /**
     * 查询妇女病普查问询记录列表
     * 
     * @param tbFbFnbpcwxjl 妇女病普查问询记录
     * @return 妇女病普查问询记录集合
     */
    public List<TbFbFnbpcwxjl> selectTbFbFnbpcwxjlList(TbFbFnbpcwxjl tbFbFnbpcwxjl);

    /**
     * 新增妇女病普查问询记录
     * 
     * @param tbFbFnbpcwxjl 妇女病普查问询记录
     * @return 结果
     */
    public int insertTbFbFnbpcwxjl(TbFbFnbpcwxjl tbFbFnbpcwxjl);

    /**
     * 修改妇女病普查问询记录
     * 
     * @param tbFbFnbpcwxjl 妇女病普查问询记录
     * @return 结果
     */
    public int updateTbFbFnbpcwxjl(TbFbFnbpcwxjl tbFbFnbpcwxjl);

    /**
     * 删除妇女病普查问询记录
     * 
     * @param id 妇女病普查问询记录ID
     * @return 结果
     */
    public int deleteTbFbFnbpcwxjlById(Long id);

    /**
     * 批量删除妇女病普查问询记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbFnbpcwxjlByIds(String[] ids);
}
