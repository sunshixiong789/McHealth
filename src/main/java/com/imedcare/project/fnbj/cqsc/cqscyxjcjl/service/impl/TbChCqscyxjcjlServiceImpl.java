package com.imedcare.project.fnbj.cqsc.cqscyxjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqsc.cqscyxjcjl.mapper.TbChCqscyxjcjlMapper;
import com.imedcare.project.fnbj.cqsc.cqscyxjcjl.domain.TbChCqscyxjcjl;
import com.imedcare.project.fnbj.cqsc.cqscyxjcjl.service.ITbChCqscyxjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前筛查影像检查记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqscyxjcjlServiceImpl implements ITbChCqscyxjcjlService 
{
    @Autowired
    private TbChCqscyxjcjlMapper tbChCqscyxjcjlMapper;

    /**
     * 查询产前筛查影像检查记录
     * 
     * @param id 产前筛查影像检查记录ID
     * @return 产前筛查影像检查记录
     */
    @Override
    public TbChCqscyxjcjl selectTbChCqscyxjcjlById(Long id)
    {
        return tbChCqscyxjcjlMapper.selectTbChCqscyxjcjlById(id);
    }

    /**
     * 查询产前筛查影像检查记录列表
     * 
     * @param tbChCqscyxjcjl 产前筛查影像检查记录
     * @return 产前筛查影像检查记录
     */
    @Override
    public List<TbChCqscyxjcjl> selectTbChCqscyxjcjlList(TbChCqscyxjcjl tbChCqscyxjcjl)
    {
        return tbChCqscyxjcjlMapper.selectTbChCqscyxjcjlList(tbChCqscyxjcjl);
    }

    /**
     * 新增产前筛查影像检查记录
     * 
     * @param tbChCqscyxjcjl 产前筛查影像检查记录
     * @return 结果
     */
    @Override
    public int insertTbChCqscyxjcjl(TbChCqscyxjcjl tbChCqscyxjcjl)
    {
        return tbChCqscyxjcjlMapper.insertTbChCqscyxjcjl(tbChCqscyxjcjl);
    }

    /**
     * 修改产前筛查影像检查记录
     * 
     * @param tbChCqscyxjcjl 产前筛查影像检查记录
     * @return 结果
     */
    @Override
    public int updateTbChCqscyxjcjl(TbChCqscyxjcjl tbChCqscyxjcjl)
    {
        return tbChCqscyxjcjlMapper.updateTbChCqscyxjcjl(tbChCqscyxjcjl);
    }

    /**
     * 删除产前筛查影像检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqscyxjcjlByIds(String ids)
    {
        return tbChCqscyxjcjlMapper.deleteTbChCqscyxjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前筛查影像检查记录信息
     * 
     * @param id 产前筛查影像检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqscyxjcjlById(Long id)
    {
        return tbChCqscyxjcjlMapper.deleteTbChCqscyxjcjlById(id);
    }
}
