package com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.mapper.TbChCqzdtgjcjlMapper;
import com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.domain.TbChCqzdtgjcjl;
import com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.service.ITbChCqzdtgjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前诊断体格检查记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqzdtgjcjlServiceImpl implements ITbChCqzdtgjcjlService 
{
    @Autowired
    private TbChCqzdtgjcjlMapper tbChCqzdtgjcjlMapper;

    /**
     * 查询产前诊断体格检查记录
     * 
     * @param id 产前诊断体格检查记录ID
     * @return 产前诊断体格检查记录
     */
    @Override
    public TbChCqzdtgjcjl selectTbChCqzdtgjcjlById(Long id)
    {
        return tbChCqzdtgjcjlMapper.selectTbChCqzdtgjcjlById(id);
    }

    /**
     * 查询产前诊断体格检查记录列表
     * 
     * @param tbChCqzdtgjcjl 产前诊断体格检查记录
     * @return 产前诊断体格检查记录
     */
    @Override
    public List<TbChCqzdtgjcjl> selectTbChCqzdtgjcjlList(TbChCqzdtgjcjl tbChCqzdtgjcjl)
    {
        return tbChCqzdtgjcjlMapper.selectTbChCqzdtgjcjlList(tbChCqzdtgjcjl);
    }

    /**
     * 新增产前诊断体格检查记录
     * 
     * @param tbChCqzdtgjcjl 产前诊断体格检查记录
     * @return 结果
     */
    @Override
    public int insertTbChCqzdtgjcjl(TbChCqzdtgjcjl tbChCqzdtgjcjl)
    {
        return tbChCqzdtgjcjlMapper.insertTbChCqzdtgjcjl(tbChCqzdtgjcjl);
    }

    /**
     * 修改产前诊断体格检查记录
     * 
     * @param tbChCqzdtgjcjl 产前诊断体格检查记录
     * @return 结果
     */
    @Override
    public int updateTbChCqzdtgjcjl(TbChCqzdtgjcjl tbChCqzdtgjcjl)
    {
        return tbChCqzdtgjcjlMapper.updateTbChCqzdtgjcjl(tbChCqzdtgjcjl);
    }

    /**
     * 删除产前诊断体格检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdtgjcjlByIds(String ids)
    {
        return tbChCqzdtgjcjlMapper.deleteTbChCqzdtgjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前诊断体格检查记录信息
     * 
     * @param id 产前诊断体格检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdtgjcjlById(Long id)
    {
        return tbChCqzdtgjcjlMapper.deleteTbChCqzdtgjcjlById(id);
    }
}
