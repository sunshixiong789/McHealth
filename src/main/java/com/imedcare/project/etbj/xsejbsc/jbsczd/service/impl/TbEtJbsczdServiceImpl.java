package com.imedcare.project.etbj.xsejbsc.jbsczd.service.impl;

import java.util.List;

import com.imedcare.project.etbj.xsejbsc.jbsczd.domain.TbEtJbsczdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.xsejbsc.jbsczd.mapper.TbEtJbsczdMapper;
import com.imedcare.project.etbj.xsejbsc.jbsczd.domain.TbEtJbsczd;
import com.imedcare.project.etbj.xsejbsc.jbsczd.service.ITbEtJbsczdService;
import com.imedcare.common.utils.text.Convert;

import javax.annotation.Resource;

/**
 * 新生儿疾病筛查诊断记录Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
@Service
public class TbEtJbsczdServiceImpl implements ITbEtJbsczdService 
{
    @Resource
    private TbEtJbsczdMapper tbEtJbsczdMapper;

    /**
     * 查询新生儿疾病筛查诊断记录
     * 
     * @param id 新生儿疾病筛查诊断记录ID
     * @return 新生儿疾病筛查诊断记录
     */
    @Override
    public TbEtJbsczdVo selectTbEtJbsczdById(Long id)
    {
        return tbEtJbsczdMapper.selectTbEtJbsczdById(id);
    }

    /**
     * 查询新生儿疾病筛查诊断记录列表
     * 
     * @param tbEtJbsczd 新生儿疾病筛查诊断记录
     * @return 新生儿疾病筛查诊断记录
     */
    @Override
    public List<TbEtJbsczdVo> selectTbEtJbsczdList(TbEtJbsczdVo tbEtJbsczd)
    {
        return tbEtJbsczdMapper.selectTbEtJbsczdList(tbEtJbsczd);
    }

    /**
     * 新增新生儿疾病筛查诊断记录
     * 
     * @param tbEtJbsczd 新生儿疾病筛查诊断记录
     * @return 结果
     */
    @Override
    public int insertTbEtJbsczd(TbEtJbsczd tbEtJbsczd)
    {
        return tbEtJbsczdMapper.insertTbEtJbsczd(tbEtJbsczd);
    }

    /**
     * 修改新生儿疾病筛查诊断记录
     * 
     * @param tbEtJbsczd 新生儿疾病筛查诊断记录
     * @return 结果
     */
    @Override
    public int updateTbEtJbsczd(TbEtJbsczd tbEtJbsczd)
    {
        return tbEtJbsczdMapper.updateTbEtJbsczd(tbEtJbsczd);
    }

    /**
     * 删除新生儿疾病筛查诊断记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJbsczdByIds(String ids)
    {
        return tbEtJbsczdMapper.deleteTbEtJbsczdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新生儿疾病筛查诊断记录信息
     * 
     * @param id 新生儿疾病筛查诊断记录ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJbsczdById(Long id)
    {
        return tbEtJbsczdMapper.deleteTbEtJbsczdById(id);
    }
}
