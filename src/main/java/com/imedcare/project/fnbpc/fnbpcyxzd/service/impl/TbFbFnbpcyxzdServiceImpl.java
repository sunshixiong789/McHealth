package com.imedcare.project.fnbpc.fnbpcyxzd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbpc.fnbpcyxzd.mapper.TbFbFnbpcyxzdMapper;
import com.imedcare.project.fnbpc.fnbpcyxzd.domain.TbFbFnbpcyxzd;
import com.imedcare.project.fnbpc.fnbpcyxzd.service.ITbFbFnbpcyxzdService;
import com.imedcare.common.utils.text.Convert;

/**
 * 妇女病普查医学指导Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-21
 */
@Service
public class TbFbFnbpcyxzdServiceImpl implements ITbFbFnbpcyxzdService 
{
    @Autowired
    private TbFbFnbpcyxzdMapper tbFbFnbpcyxzdMapper;

    /**
     * 查询妇女病普查医学指导
     * 
     * @param id 妇女病普查医学指导ID
     * @return 妇女病普查医学指导
     */
    @Override
    public TbFbFnbpcyxzd selectTbFbFnbpcyxzdById(Long id)
    {
        return tbFbFnbpcyxzdMapper.selectTbFbFnbpcyxzdById(id);
    }

    /**
     * 查询妇女病普查医学指导列表
     * 
     * @param tbFbFnbpcyxzd 妇女病普查医学指导
     * @return 妇女病普查医学指导
     */
    @Override
    public List<TbFbFnbpcyxzd> selectTbFbFnbpcyxzdList(TbFbFnbpcyxzd tbFbFnbpcyxzd)
    {
        return tbFbFnbpcyxzdMapper.selectTbFbFnbpcyxzdList(tbFbFnbpcyxzd);
    }

    /**
     * 新增妇女病普查医学指导
     * 
     * @param tbFbFnbpcyxzd 妇女病普查医学指导
     * @return 结果
     */
    @Override
    public int insertTbFbFnbpcyxzd(TbFbFnbpcyxzd tbFbFnbpcyxzd)
    {
        return tbFbFnbpcyxzdMapper.insertTbFbFnbpcyxzd(tbFbFnbpcyxzd);
    }

    /**
     * 修改妇女病普查医学指导
     * 
     * @param tbFbFnbpcyxzd 妇女病普查医学指导
     * @return 结果
     */
    @Override
    public int updateTbFbFnbpcyxzd(TbFbFnbpcyxzd tbFbFnbpcyxzd)
    {
        return tbFbFnbpcyxzdMapper.updateTbFbFnbpcyxzd(tbFbFnbpcyxzd);
    }

    /**
     * 删除妇女病普查医学指导对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpcyxzdByIds(String ids)
    {
        return tbFbFnbpcyxzdMapper.deleteTbFbFnbpcyxzdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除妇女病普查医学指导信息
     * 
     * @param id 妇女病普查医学指导ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpcyxzdById(Long id)
    {
        return tbFbFnbpcyxzdMapper.deleteTbFbFnbpcyxzdById(id);
    }
}
