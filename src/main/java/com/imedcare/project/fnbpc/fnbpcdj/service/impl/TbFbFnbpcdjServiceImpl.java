package com.imedcare.project.fnbpc.fnbpcdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbpc.fnbpcdj.mapper.TbFbFnbpcdjMapper;
import com.imedcare.project.fnbpc.fnbpcdj.domain.TbFbFnbpcdj;
import com.imedcare.project.fnbpc.fnbpcdj.service.ITbFbFnbpcdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 妇女病普查登记Service业务层处理
 * 
 * @author imedcare
 * @date 2019-11-20
 */
@Service
public class TbFbFnbpcdjServiceImpl implements ITbFbFnbpcdjService 
{
    @Autowired
    private TbFbFnbpcdjMapper tbFbFnbpcdjMapper;

    /**
     * 查询妇女病普查登记
     * 
     * @param id 妇女病普查登记ID
     * @return 妇女病普查登记
     */
    @Override
    public TbFbFnbpcdj selectTbFbFnbpcdjById(Long id)
    {
        return tbFbFnbpcdjMapper.selectTbFbFnbpcdjById(id);
    }

    /**
     * 查询妇女病普查登记列表
     * 
     * @param tbFbFnbpcdj 妇女病普查登记
     * @return 妇女病普查登记
     */
    @Override
    public List<TbFbFnbpcdj> selectTbFbFnbpcdjList(TbFbFnbpcdj tbFbFnbpcdj)
    {
        return tbFbFnbpcdjMapper.selectTbFbFnbpcdjList(tbFbFnbpcdj);
    }

    /**
     * 新增妇女病普查登记
     * 
     * @param tbFbFnbpcdj 妇女病普查登记
     * @return 结果
     */
    @Override
    public int insertTbFbFnbpcdj(TbFbFnbpcdj tbFbFnbpcdj)
    {
        return tbFbFnbpcdjMapper.insertTbFbFnbpcdj(tbFbFnbpcdj);
    }

    /**
     * 修改妇女病普查登记
     * 
     * @param tbFbFnbpcdj 妇女病普查登记
     * @return 结果
     */
    @Override
    public int updateTbFbFnbpcdj(TbFbFnbpcdj tbFbFnbpcdj)
    {
        return tbFbFnbpcdjMapper.updateTbFbFnbpcdj(tbFbFnbpcdj);
    }

    /**
     * 删除妇女病普查登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpcdjByIds(String ids)
    {
        return tbFbFnbpcdjMapper.deleteTbFbFnbpcdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除妇女病普查登记信息
     * 
     * @param id 妇女病普查登记ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpcdjById(Long id)
    {
        return tbFbFnbpcdjMapper.deleteTbFbFnbpcdjById(id);
    }
}
