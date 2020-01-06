package com.imedcare.project.fn.cqsczdxx.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fn.cqsczdxx.mapper.TbFbCqsczdxxMapper;
import com.imedcare.project.fn.cqsczdxx.domain.TbFbCqsczdxx;
import com.imedcare.project.fn.cqsczdxx.service.ITbFbCqsczdxxService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前筛查诊断信息Service业务层处理
 * 
 * @author maqilin
 * @date 2019-11-08
 */
@Service
public class TbFbCqsczdxxServiceImpl implements ITbFbCqsczdxxService 
{
    @Autowired
    private TbFbCqsczdxxMapper tbFbCqsczdxxMapper;

    /**
     * 查询产前筛查诊断信息
     * 
     * @param id 产前筛查诊断信息ID
     * @return 产前筛查诊断信息
     */
    @Override
    public TbFbCqsczdxx selectTbFbCqsczdxxById(Long id)
    {
        return tbFbCqsczdxxMapper.selectTbFbCqsczdxxById(id);
    }

    /**
     * 查询产前筛查诊断信息列表
     * 
     * @param tbFbCqsczdxx 产前筛查诊断信息
     * @return 产前筛查诊断信息
     */
    @Override
    public List<TbFbCqsczdxx> selectTbFbCqsczdxxList(TbFbCqsczdxx tbFbCqsczdxx)
    {
        return tbFbCqsczdxxMapper.selectTbFbCqsczdxxList(tbFbCqsczdxx);
    }

    /**
     * 新增产前筛查诊断信息
     * 
     * @param tbFbCqsczdxx 产前筛查诊断信息
     * @return 结果
     */
    @Override
    public int insertTbFbCqsczdxx(TbFbCqsczdxx tbFbCqsczdxx) {
        return tbFbCqsczdxxMapper.insertTbFbCqsczdxx(tbFbCqsczdxx);
    }

    /**
     * 修改产前筛查诊断信息
     * 
     * @param tbFbCqsczdxx 产前筛查诊断信息
     * @return 结果
     */
    @Override
    public int updateTbFbCqsczdxx(TbFbCqsczdxx tbFbCqsczdxx)
    {
        tbFbCqsczdxx.setXgbj("2");
        tbFbCqsczdxx.setZgrq(new Date());
        return tbFbCqsczdxxMapper.updateTbFbCqsczdxx(tbFbCqsczdxx);
    }

    /**
     * 删除产前筛查诊断信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbCqsczdxxByIds(String ids)
    {
        return tbFbCqsczdxxMapper.deleteTbFbCqsczdxxByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前筛查诊断信息信息
     * 
     * @param id 产前筛查诊断信息ID
     * @return 结果
     */
    @Override
    public int deleteTbFbCqsczdxxById(Long id)
    {
        return tbFbCqsczdxxMapper.deleteTbFbCqsczdxxById(id);
    }
}
