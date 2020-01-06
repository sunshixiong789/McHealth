package com.imedcare.project.fnbpc.fnbpctgjcjl.service;

import com.imedcare.project.fnbpc.fnbpctgjcjl.domain.TbFbFnbpctgjcjl;
import java.util.List;

/**
 * 妇女病普查体格检查记录Service接口
 * 
 * @author liuyang
 * @date 2019-11-21
 */
public interface ITbFbFnbpctgjcjlService 
{
    /**
     * 查询妇女病普查体格检查记录
     * 
     * @param id 妇女病普查体格检查记录ID
     * @return 妇女病普查体格检查记录
     */
    public TbFbFnbpctgjcjl selectTbFbFnbpctgjcjlById(Long id);

    /**
     * 查询妇女病普查体格检查记录列表
     * 
     * @param tbFbFnbpctgjcjl 妇女病普查体格检查记录
     * @return 妇女病普查体格检查记录集合
     */
    public List<TbFbFnbpctgjcjl> selectTbFbFnbpctgjcjlList(TbFbFnbpctgjcjl tbFbFnbpctgjcjl);

    /**
     * 新增妇女病普查体格检查记录
     * 
     * @param tbFbFnbpctgjcjl 妇女病普查体格检查记录
     * @return 结果
     */
    public int insertTbFbFnbpctgjcjl(TbFbFnbpctgjcjl tbFbFnbpctgjcjl);

    /**
     * 修改妇女病普查体格检查记录
     * 
     * @param tbFbFnbpctgjcjl 妇女病普查体格检查记录
     * @return 结果
     */
    public int updateTbFbFnbpctgjcjl(TbFbFnbpctgjcjl tbFbFnbpctgjcjl);

    /**
     * 批量删除妇女病普查体格检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbFnbpctgjcjlByIds(String ids);

    /**
     * 删除妇女病普查体格检查记录信息
     * 
     * @param id 妇女病普查体格检查记录ID
     * @return 结果
     */
    public int deleteTbFbFnbpctgjcjlById(Long id);
}
