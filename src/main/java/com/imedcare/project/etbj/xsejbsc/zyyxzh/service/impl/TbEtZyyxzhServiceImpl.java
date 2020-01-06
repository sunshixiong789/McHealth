package com.imedcare.project.etbj.xsejbsc.zyyxzh.service.impl;

import java.util.List;

import com.imedcare.project.etbj.xsejbsc.zyyxzh.domain.TbEtZyyxzhVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.xsejbsc.zyyxzh.mapper.TbEtZyyxzhMapper;
import com.imedcare.project.etbj.xsejbsc.zyyxzh.domain.TbEtZyyxzh;
import com.imedcare.project.etbj.xsejbsc.zyyxzh.service.ITbEtZyyxzhService;
import com.imedcare.common.utils.text.Convert;

/**
 * 新生儿疾病筛查可疑阳性召回Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
@Service
public class TbEtZyyxzhServiceImpl implements ITbEtZyyxzhService 
{
    @Autowired
    private TbEtZyyxzhMapper tbEtZyyxzhMapper;

    /**
     * 查询新生儿疾病筛查可疑阳性召回
     * 
     * @param id 新生儿疾病筛查可疑阳性召回ID
     * @return 新生儿疾病筛查可疑阳性召回
     */
    @Override
    public TbEtZyyxzhVo selectTbEtZyyxzhById(Long id)
    {
        return tbEtZyyxzhMapper.selectTbEtZyyxzhById(id);
    }

    /**
     * 查询新生儿疾病筛查可疑阳性召回列表
     * 
     * @param tbEtZyyxzh 新生儿疾病筛查可疑阳性召回
     * @return 新生儿疾病筛查可疑阳性召回
     */
    @Override
    public List<TbEtZyyxzhVo> selectTbEtZyyxzhList(TbEtZyyxzhVo tbEtZyyxzh)
    {
        return tbEtZyyxzhMapper.selectTbEtZyyxzhList(tbEtZyyxzh);
    }

    /**
     * 新增新生儿疾病筛查可疑阳性召回
     * 
     * @param tbEtZyyxzh 新生儿疾病筛查可疑阳性召回
     * @return 结果
     */
    @Override
    public int insertTbEtZyyxzh(TbEtZyyxzh tbEtZyyxzh)
    {
        return tbEtZyyxzhMapper.insertTbEtZyyxzh(tbEtZyyxzh);
    }

    /**
     * 修改新生儿疾病筛查可疑阳性召回
     * 
     * @param tbEtZyyxzh 新生儿疾病筛查可疑阳性召回
     * @return 结果
     */
    @Override
    public int updateTbEtZyyxzh(TbEtZyyxzh tbEtZyyxzh)
    {
        return tbEtZyyxzhMapper.updateTbEtZyyxzh(tbEtZyyxzh);
    }

    /**
     * 删除新生儿疾病筛查可疑阳性召回对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtZyyxzhByIds(String ids)
    {
        return tbEtZyyxzhMapper.deleteTbEtZyyxzhByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新生儿疾病筛查可疑阳性召回信息
     * 
     * @param id 新生儿疾病筛查可疑阳性召回ID
     * @return 结果
     */
    @Override
    public int deleteTbEtZyyxzhById(Long id)
    {
        return tbEtZyyxzhMapper.deleteTbEtZyyxzhById(id);
    }
}
