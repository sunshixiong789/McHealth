package com.imedcare.project.fnbj.cqsc.cqscwxjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqsc.cqscwxjl.mapper.TbChCqscwxjlMapper;
import com.imedcare.project.fnbj.cqsc.cqscwxjl.domain.TbChCqscwxjl;
import com.imedcare.project.fnbj.cqsc.cqscwxjl.service.ITbChCqscwxjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前筛查问询记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqscwxjlServiceImpl implements ITbChCqscwxjlService 
{
    @Autowired
    private TbChCqscwxjlMapper tbChCqscwxjlMapper;

    /**
     * 查询产前筛查问询记录
     * 
     * @param id 产前筛查问询记录ID
     * @return 产前筛查问询记录
     */
    @Override
    public TbChCqscwxjl selectTbChCqscwxjlById(Long id)
    {
        return tbChCqscwxjlMapper.selectTbChCqscwxjlById(id);
    }

    /**
     * 查询产前筛查问询记录列表
     * 
     * @param tbChCqscwxjl 产前筛查问询记录
     * @return 产前筛查问询记录
     */
    @Override
    public List<TbChCqscwxjl> selectTbChCqscwxjlList(TbChCqscwxjl tbChCqscwxjl)
    {
        return tbChCqscwxjlMapper.selectTbChCqscwxjlList(tbChCqscwxjl);
    }

    /**
     * 新增产前筛查问询记录
     * 
     * @param tbChCqscwxjl 产前筛查问询记录
     * @return 结果
     */
    @Override
    public int insertTbChCqscwxjl(TbChCqscwxjl tbChCqscwxjl)
    {
        return tbChCqscwxjlMapper.insertTbChCqscwxjl(tbChCqscwxjl);
    }

    /**
     * 修改产前筛查问询记录
     * 
     * @param tbChCqscwxjl 产前筛查问询记录
     * @return 结果
     */
    @Override
    public int updateTbChCqscwxjl(TbChCqscwxjl tbChCqscwxjl)
    {
        return tbChCqscwxjlMapper.updateTbChCqscwxjl(tbChCqscwxjl);
    }

    /**
     * 删除产前筛查问询记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqscwxjlByIds(String ids)
    {
        return tbChCqscwxjlMapper.deleteTbChCqscwxjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前筛查问询记录信息
     * 
     * @param id 产前筛查问询记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqscwxjlById(Long id)
    {
        return tbChCqscwxjlMapper.deleteTbChCqscwxjlById(id);
    }
}
