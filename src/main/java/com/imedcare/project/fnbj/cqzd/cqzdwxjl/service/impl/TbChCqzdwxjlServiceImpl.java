package com.imedcare.project.fnbj.cqzd.cqzdwxjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqzd.cqzdwxjl.mapper.TbChCqzdwxjlMapper;
import com.imedcare.project.fnbj.cqzd.cqzdwxjl.domain.TbChCqzdwxjl;
import com.imedcare.project.fnbj.cqzd.cqzdwxjl.service.ITbChCqzdwxjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前诊断问询记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqzdwxjlServiceImpl implements ITbChCqzdwxjlService 
{
    @Autowired
    private TbChCqzdwxjlMapper tbChCqzdwxjlMapper;

    /**
     * 查询产前诊断问询记录
     * 
     * @param id 产前诊断问询记录ID
     * @return 产前诊断问询记录
     */
    @Override
    public TbChCqzdwxjl selectTbChCqzdwxjlById(Long id)
    {
        return tbChCqzdwxjlMapper.selectTbChCqzdwxjlById(id);
    }

    /**
     * 查询产前诊断问询记录列表
     * 
     * @param tbChCqzdwxjl 产前诊断问询记录
     * @return 产前诊断问询记录
     */
    @Override
    public List<TbChCqzdwxjl> selectTbChCqzdwxjlList(TbChCqzdwxjl tbChCqzdwxjl)
    {
        return tbChCqzdwxjlMapper.selectTbChCqzdwxjlList(tbChCqzdwxjl);
    }

    /**
     * 新增产前诊断问询记录
     * 
     * @param tbChCqzdwxjl 产前诊断问询记录
     * @return 结果
     */
    @Override
    public int insertTbChCqzdwxjl(TbChCqzdwxjl tbChCqzdwxjl)
    {
        return tbChCqzdwxjlMapper.insertTbChCqzdwxjl(tbChCqzdwxjl);
    }

    /**
     * 修改产前诊断问询记录
     * 
     * @param tbChCqzdwxjl 产前诊断问询记录
     * @return 结果
     */
    @Override
    public int updateTbChCqzdwxjl(TbChCqzdwxjl tbChCqzdwxjl)
    {
        return tbChCqzdwxjlMapper.updateTbChCqzdwxjl(tbChCqzdwxjl);
    }

    /**
     * 删除产前诊断问询记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdwxjlByIds(String ids)
    {
        return tbChCqzdwxjlMapper.deleteTbChCqzdwxjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前诊断问询记录信息
     * 
     * @param id 产前诊断问询记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdwxjlById(Long id)
    {
        return tbChCqzdwxjlMapper.deleteTbChCqzdwxjlById(id);
    }
}
