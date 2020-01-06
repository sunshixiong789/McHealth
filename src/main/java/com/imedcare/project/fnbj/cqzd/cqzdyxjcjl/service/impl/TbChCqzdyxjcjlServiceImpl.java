package com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.mapper.TbChCqzdyxjcjlMapper;
import com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.domain.TbChCqzdyxjcjl;
import com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.service.ITbChCqzdyxjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前诊断影像检查记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqzdyxjcjlServiceImpl implements ITbChCqzdyxjcjlService 
{
    @Autowired
    private TbChCqzdyxjcjlMapper tbChCqzdyxjcjlMapper;

    /**
     * 查询产前诊断影像检查记录
     * 
     * @param id 产前诊断影像检查记录ID
     * @return 产前诊断影像检查记录
     */
    @Override
    public TbChCqzdyxjcjl selectTbChCqzdyxjcjlById(Long id)
    {
        return tbChCqzdyxjcjlMapper.selectTbChCqzdyxjcjlById(id);
    }

    /**
     * 查询产前诊断影像检查记录列表
     * 
     * @param tbChCqzdyxjcjl 产前诊断影像检查记录
     * @return 产前诊断影像检查记录
     */
    @Override
    public List<TbChCqzdyxjcjl> selectTbChCqzdyxjcjlList(TbChCqzdyxjcjl tbChCqzdyxjcjl)
    {
        return tbChCqzdyxjcjlMapper.selectTbChCqzdyxjcjlList(tbChCqzdyxjcjl);
    }

    /**
     * 新增产前诊断影像检查记录
     * 
     * @param tbChCqzdyxjcjl 产前诊断影像检查记录
     * @return 结果
     */
    @Override
    public int insertTbChCqzdyxjcjl(TbChCqzdyxjcjl tbChCqzdyxjcjl)
    {
        return tbChCqzdyxjcjlMapper.insertTbChCqzdyxjcjl(tbChCqzdyxjcjl);
    }

    /**
     * 修改产前诊断影像检查记录
     * 
     * @param tbChCqzdyxjcjl 产前诊断影像检查记录
     * @return 结果
     */
    @Override
    public int updateTbChCqzdyxjcjl(TbChCqzdyxjcjl tbChCqzdyxjcjl)
    {
        return tbChCqzdyxjcjlMapper.updateTbChCqzdyxjcjl(tbChCqzdyxjcjl);
    }

    /**
     * 删除产前诊断影像检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdyxjcjlByIds(String ids)
    {
        return tbChCqzdyxjcjlMapper.deleteTbChCqzdyxjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前诊断影像检查记录信息
     * 
     * @param id 产前诊断影像检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdyxjcjlById(Long id)
    {
        return tbChCqzdyxjcjlMapper.deleteTbChCqzdyxjcjlById(id);
    }
}
