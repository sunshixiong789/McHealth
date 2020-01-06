package com.imedcare.project.fnbpc.fnbpcyxzd.service;

import com.imedcare.project.fnbpc.fnbpcyxzd.domain.TbFbFnbpcyxzd;
import java.util.List;

/**
 * 妇女病普查医学指导Service接口
 * 
 * @author liuyang
 * @date 2019-11-21
 */
public interface ITbFbFnbpcyxzdService 
{
    /**
     * 查询妇女病普查医学指导
     * 
     * @param id 妇女病普查医学指导ID
     * @return 妇女病普查医学指导
     */
    public TbFbFnbpcyxzd selectTbFbFnbpcyxzdById(Long id);

    /**
     * 查询妇女病普查医学指导列表
     * 
     * @param tbFbFnbpcyxzd 妇女病普查医学指导
     * @return 妇女病普查医学指导集合
     */
    public List<TbFbFnbpcyxzd> selectTbFbFnbpcyxzdList(TbFbFnbpcyxzd tbFbFnbpcyxzd);

    /**
     * 新增妇女病普查医学指导
     * 
     * @param tbFbFnbpcyxzd 妇女病普查医学指导
     * @return 结果
     */
    public int insertTbFbFnbpcyxzd(TbFbFnbpcyxzd tbFbFnbpcyxzd);

    /**
     * 修改妇女病普查医学指导
     * 
     * @param tbFbFnbpcyxzd 妇女病普查医学指导
     * @return 结果
     */
    public int updateTbFbFnbpcyxzd(TbFbFnbpcyxzd tbFbFnbpcyxzd);

    /**
     * 批量删除妇女病普查医学指导
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbFnbpcyxzdByIds(String ids);

    /**
     * 删除妇女病普查医学指导信息
     * 
     * @param id 妇女病普查医学指导ID
     * @return 结果
     */
    public int deleteTbFbFnbpcyxzdById(Long id);
}
