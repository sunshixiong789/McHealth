package com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.mapper.TbChGwycfyxjcjlMapper;
import com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.domain.TbChGwycfyxjcjl;
import com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.service.ITbChGwycfyxjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 高危孕产妇影像检查记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Service
public class TbChGwycfyxjcjlServiceImpl implements ITbChGwycfyxjcjlService 
{
    @Autowired
    private TbChGwycfyxjcjlMapper tbChGwycfyxjcjlMapper;

    /**
     * 查询高危孕产妇影像检查记录
     * 
     * @param id 高危孕产妇影像检查记录ID
     * @return 高危孕产妇影像检查记录
     */
    @Override
    public TbChGwycfyxjcjl selectTbChGwycfyxjcjlById(Long id)
    {
        return tbChGwycfyxjcjlMapper.selectTbChGwycfyxjcjlById(id);
    }

    /**
     * 查询高危孕产妇影像检查记录列表
     * 
     * @param tbChGwycfyxjcjl 高危孕产妇影像检查记录
     * @return 高危孕产妇影像检查记录
     */
    @Override
    public List<TbChGwycfyxjcjl> selectTbChGwycfyxjcjlList(TbChGwycfyxjcjl tbChGwycfyxjcjl)
    {
        return tbChGwycfyxjcjlMapper.selectTbChGwycfyxjcjlList(tbChGwycfyxjcjl);
    }

    /**
     * 新增高危孕产妇影像检查记录
     * 
     * @param tbChGwycfyxjcjl 高危孕产妇影像检查记录
     * @return 结果
     */
    @Override
    public int insertTbChGwycfyxjcjl(TbChGwycfyxjcjl tbChGwycfyxjcjl)
    {
        return tbChGwycfyxjcjlMapper.insertTbChGwycfyxjcjl(tbChGwycfyxjcjl);
    }

    /**
     * 修改高危孕产妇影像检查记录
     * 
     * @param tbChGwycfyxjcjl 高危孕产妇影像检查记录
     * @return 结果
     */
    @Override
    public int updateTbChGwycfyxjcjl(TbChGwycfyxjcjl tbChGwycfyxjcjl)
    {
        return tbChGwycfyxjcjlMapper.updateTbChGwycfyxjcjl(tbChGwycfyxjcjl);
    }

    /**
     * 删除高危孕产妇影像检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfyxjcjlByIds(String ids)
    {
        return tbChGwycfyxjcjlMapper.deleteTbChGwycfyxjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高危孕产妇影像检查记录信息
     * 
     * @param id 高危孕产妇影像检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfyxjcjlById(Long id)
    {
        return tbChGwycfyxjcjlMapper.deleteTbChGwycfyxjcjlById(id);
    }
}
