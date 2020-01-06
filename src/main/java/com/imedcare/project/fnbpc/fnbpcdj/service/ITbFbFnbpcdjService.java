package com.imedcare.project.fnbpc.fnbpcdj.service;

import com.imedcare.project.fnbpc.fnbpcdj.domain.TbFbFnbpcdj;
import java.util.List;

/**
 * 妇女病普查登记Service接口
 * 
 * @author imedcare
 * @date 2019-11-20
 */
public interface ITbFbFnbpcdjService 
{
    /**
     * 查询妇女病普查登记
     * 
     * @param id 妇女病普查登记ID
     * @return 妇女病普查登记
     */
    public TbFbFnbpcdj selectTbFbFnbpcdjById(Long id);

    /**
     * 查询妇女病普查登记列表
     * 
     * @param tbFbFnbpcdj 妇女病普查登记
     * @return 妇女病普查登记集合
     */
    public List<TbFbFnbpcdj> selectTbFbFnbpcdjList(TbFbFnbpcdj tbFbFnbpcdj);

    /**
     * 新增妇女病普查登记
     * 
     * @param tbFbFnbpcdj 妇女病普查登记
     * @return 结果
     */
    public int insertTbFbFnbpcdj(TbFbFnbpcdj tbFbFnbpcdj);

    /**
     * 修改妇女病普查登记
     * 
     * @param tbFbFnbpcdj 妇女病普查登记
     * @return 结果
     */
    public int updateTbFbFnbpcdj(TbFbFnbpcdj tbFbFnbpcdj);

    /**
     * 批量删除妇女病普查登记
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbFnbpcdjByIds(String ids);

    /**
     * 删除妇女病普查登记信息
     * 
     * @param id 妇女病普查登记ID
     * @return 结果
     */
    public int deleteTbFbFnbpcdjById(Long id);
}
