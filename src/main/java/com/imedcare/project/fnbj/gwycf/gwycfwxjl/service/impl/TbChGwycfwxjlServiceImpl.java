package com.imedcare.project.fnbj.gwycf.gwycfwxjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.gwycf.gwycfwxjl.mapper.TbChGwycfwxjlMapper;
import com.imedcare.project.fnbj.gwycf.gwycfwxjl.domain.TbChGwycfwxjl;
import com.imedcare.project.fnbj.gwycf.gwycfwxjl.service.ITbChGwycfwxjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 高危孕产妇问询记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Service
public class TbChGwycfwxjlServiceImpl implements ITbChGwycfwxjlService 
{
    @Autowired
    private TbChGwycfwxjlMapper tbChGwycfwxjlMapper;

    /**
     * 查询高危孕产妇问询记录
     * 
     * @param id 高危孕产妇问询记录ID
     * @return 高危孕产妇问询记录
     */
    @Override
    public TbChGwycfwxjl selectTbChGwycfwxjlById(Long id)
    {
        return tbChGwycfwxjlMapper.selectTbChGwycfwxjlById(id);
    }

    /**
     * 查询高危孕产妇问询记录列表
     * 
     * @param tbChGwycfwxjl 高危孕产妇问询记录
     * @return 高危孕产妇问询记录
     */
    @Override
    public List<TbChGwycfwxjl> selectTbChGwycfwxjlList(TbChGwycfwxjl tbChGwycfwxjl)
    {
        return tbChGwycfwxjlMapper.selectTbChGwycfwxjlList(tbChGwycfwxjl);
    }

    /**
     * 新增高危孕产妇问询记录
     * 
     * @param tbChGwycfwxjl 高危孕产妇问询记录
     * @return 结果
     */
    @Override
    public int insertTbChGwycfwxjl(TbChGwycfwxjl tbChGwycfwxjl)
    {
        return tbChGwycfwxjlMapper.insertTbChGwycfwxjl(tbChGwycfwxjl);
    }

    /**
     * 修改高危孕产妇问询记录
     * 
     * @param tbChGwycfwxjl 高危孕产妇问询记录
     * @return 结果
     */
    @Override
    public int updateTbChGwycfwxjl(TbChGwycfwxjl tbChGwycfwxjl)
    {
        return tbChGwycfwxjlMapper.updateTbChGwycfwxjl(tbChGwycfwxjl);
    }

    /**
     * 删除高危孕产妇问询记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfwxjlByIds(String ids)
    {
        return tbChGwycfwxjlMapper.deleteTbChGwycfwxjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高危孕产妇问询记录信息
     * 
     * @param id 高危孕产妇问询记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfwxjlById(Long id)
    {
        return tbChGwycfwxjlMapper.deleteTbChGwycfwxjlById(id);
    }
}
