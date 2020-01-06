package com.imedcare.project.fnbj.csbj.csbjfmjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.csbj.csbjfmjl.mapper.TbChCsbjfmjlMapper;
import com.imedcare.project.fnbj.csbj.csbjfmjl.domain.TbChCsbjfmjl;
import com.imedcare.project.fnbj.csbj.csbjfmjl.service.ITbChCsbjfmjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 分娩记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCsbjfmjlServiceImpl implements ITbChCsbjfmjlService 
{
    @Autowired
    private TbChCsbjfmjlMapper tbChCsbjfmjlMapper;

    /**
     * 查询分娩记录
     * 
     * @param id 分娩记录ID
     * @return 分娩记录
     */
    @Override
    public TbChCsbjfmjl selectTbChCsbjfmjlById(Long id)
    {
        return tbChCsbjfmjlMapper.selectTbChCsbjfmjlById(id);
    }

    /**
     * 查询分娩记录列表
     * 
     * @param tbChCsbjfmjl 分娩记录
     * @return 分娩记录
     */
    @Override
    public List<TbChCsbjfmjl> selectTbChCsbjfmjlList(TbChCsbjfmjl tbChCsbjfmjl)
    {
        return tbChCsbjfmjlMapper.selectTbChCsbjfmjlList(tbChCsbjfmjl);
    }

    /**
     * 新增分娩记录
     * 
     * @param tbChCsbjfmjl 分娩记录
     * @return 结果
     */
    @Override
    public int insertTbChCsbjfmjl(TbChCsbjfmjl tbChCsbjfmjl)
    {
        return tbChCsbjfmjlMapper.insertTbChCsbjfmjl(tbChCsbjfmjl);
    }

    /**
     * 修改分娩记录
     * 
     * @param tbChCsbjfmjl 分娩记录
     * @return 结果
     */
    @Override
    public int updateTbChCsbjfmjl(TbChCsbjfmjl tbChCsbjfmjl)
    {
        return tbChCsbjfmjlMapper.updateTbChCsbjfmjl(tbChCsbjfmjl);
    }

    /**
     * 删除分娩记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCsbjfmjlByIds(String ids)
    {
        return tbChCsbjfmjlMapper.deleteTbChCsbjfmjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除分娩记录信息
     * 
     * @param id 分娩记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCsbjfmjlById(Long id)
    {
        return tbChCsbjfmjlMapper.deleteTbChCsbjfmjlById(id);
    }
}
