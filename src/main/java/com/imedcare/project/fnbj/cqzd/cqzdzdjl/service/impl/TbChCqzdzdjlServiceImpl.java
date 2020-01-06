package com.imedcare.project.fnbj.cqzd.cqzdzdjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqzd.cqzdzdjl.mapper.TbChCqzdzdjlMapper;
import com.imedcare.project.fnbj.cqzd.cqzdzdjl.domain.TbChCqzdzdjl;
import com.imedcare.project.fnbj.cqzd.cqzdzdjl.service.ITbChCqzdzdjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前诊断诊断记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqzdzdjlServiceImpl implements ITbChCqzdzdjlService 
{
    @Autowired
    private TbChCqzdzdjlMapper tbChCqzdzdjlMapper;

    /**
     * 查询产前诊断诊断记录
     * 
     * @param id 产前诊断诊断记录ID
     * @return 产前诊断诊断记录
     */
    @Override
    public TbChCqzdzdjl selectTbChCqzdzdjlById(Long id)
    {
        return tbChCqzdzdjlMapper.selectTbChCqzdzdjlById(id);
    }

    /**
     * 查询产前诊断诊断记录列表
     * 
     * @param tbChCqzdzdjl 产前诊断诊断记录
     * @return 产前诊断诊断记录
     */
    @Override
    public List<TbChCqzdzdjl> selectTbChCqzdzdjlList(TbChCqzdzdjl tbChCqzdzdjl)
    {
        return tbChCqzdzdjlMapper.selectTbChCqzdzdjlList(tbChCqzdzdjl);
    }

    /**
     * 新增产前诊断诊断记录
     * 
     * @param tbChCqzdzdjl 产前诊断诊断记录
     * @return 结果
     */
    @Override
    public int insertTbChCqzdzdjl(TbChCqzdzdjl tbChCqzdzdjl)
    {
        return tbChCqzdzdjlMapper.insertTbChCqzdzdjl(tbChCqzdzdjl);
    }

    /**
     * 修改产前诊断诊断记录
     * 
     * @param tbChCqzdzdjl 产前诊断诊断记录
     * @return 结果
     */
    @Override
    public int updateTbChCqzdzdjl(TbChCqzdzdjl tbChCqzdzdjl)
    {
        return tbChCqzdzdjlMapper.updateTbChCqzdzdjl(tbChCqzdzdjl);
    }

    /**
     * 删除产前诊断诊断记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdzdjlByIds(String ids)
    {
        return tbChCqzdzdjlMapper.deleteTbChCqzdzdjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前诊断诊断记录信息
     * 
     * @param id 产前诊断诊断记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdzdjlById(Long id)
    {
        return tbChCqzdzdjlMapper.deleteTbChCqzdzdjlById(id);
    }
}
