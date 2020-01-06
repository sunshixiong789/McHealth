package com.imedcare.project.etbj.xsefs.xsefsjl.service.impl;

import java.util.List;

import com.imedcare.project.etbj.xsefs.xsefsjl.domain.TbEtXsefsjlVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.xsefs.xsefsjl.mapper.TbEtXsefsjlMapper;
import com.imedcare.project.etbj.xsefs.xsefsjl.domain.TbEtXsefsjl;
import com.imedcare.project.etbj.xsefs.xsefsjl.service.ITbEtXsefsjlService;
import com.imedcare.common.utils.text.Convert;

import javax.annotation.Resource;

/**
 * 新生儿访视记录Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-12
 */
@Service
public class TbEtXsefsjlServiceImpl implements ITbEtXsefsjlService 
{
    @Resource
    private TbEtXsefsjlMapper tbEtXsefsjlMapper;

    /**
     * 查询新生儿访视记录
     * 
     * @param id 新生儿访视记录ID
     * @return 新生儿访视记录
     */
    @Override
    public TbEtXsefsjlVo selectTbEtXsefsjlById(Long id)
    {
        return tbEtXsefsjlMapper.selectTbEtXsefsjlById(id);
    }

    /**
     * 查询新生儿访视记录列表
     * 
     * @param tbEtXsefsjl 新生儿访视记录
     * @return 新生儿访视记录
     */
    @Override
    public List<TbEtXsefsjlVo> selectTbEtXsefsjlList(TbEtXsefsjlVo tbEtXsefsjl)
    {
        return tbEtXsefsjlMapper.selectTbEtXsefsjlList(tbEtXsefsjl);
    }

    /**
     * 新增新生儿访视记录
     * 
     * @param tbEtXsefsjl 新生儿访视记录
     * @return 结果
     */
    @Override
    public int insertTbEtXsefsjl(TbEtXsefsjl tbEtXsefsjl)
    {
        return tbEtXsefsjlMapper.insertTbEtXsefsjl(tbEtXsefsjl);
    }

    /**
     * 修改新生儿访视记录
     * 
     * @param tbEtXsefsjl 新生儿访视记录
     * @return 结果
     */
    @Override
    public int updateTbEtXsefsjl(TbEtXsefsjl tbEtXsefsjl)
    {
        return tbEtXsefsjlMapper.updateTbEtXsefsjl(tbEtXsefsjl);
    }

    /**
     * 删除新生儿访视记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtXsefsjlByIds(String ids)
    {
        return tbEtXsefsjlMapper.deleteTbEtXsefsjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新生儿访视记录信息
     * 
     * @param id 新生儿访视记录ID
     * @return 结果
     */
    @Override
    public int deleteTbEtXsefsjlById(Long id)
    {
        return tbEtXsefsjlMapper.deleteTbEtXsefsjlById(id);
    }
}
