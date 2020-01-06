package com.imedcare.project.fnbj.gwycf.gwycftgjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.gwycf.gwycftgjcjl.mapper.TbChGwycftgjcjlMapper;
import com.imedcare.project.fnbj.gwycf.gwycftgjcjl.domain.TbChGwycftgjcjl;
import com.imedcare.project.fnbj.gwycf.gwycftgjcjl.service.ITbChGwycftgjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 高危孕产妇体格检查记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Service
public class TbChGwycftgjcjlServiceImpl implements ITbChGwycftgjcjlService 
{
    @Autowired
    private TbChGwycftgjcjlMapper tbChGwycftgjcjlMapper;

    /**
     * 查询高危孕产妇体格检查记录
     * 
     * @param id 高危孕产妇体格检查记录ID
     * @return 高危孕产妇体格检查记录
     */
    @Override
    public TbChGwycftgjcjl selectTbChGwycftgjcjlById(Long id)
    {
        return tbChGwycftgjcjlMapper.selectTbChGwycftgjcjlById(id);
    }

    /**
     * 查询高危孕产妇体格检查记录列表
     * 
     * @param tbChGwycftgjcjl 高危孕产妇体格检查记录
     * @return 高危孕产妇体格检查记录
     */
    @Override
    public List<TbChGwycftgjcjl> selectTbChGwycftgjcjlList(TbChGwycftgjcjl tbChGwycftgjcjl)
    {
        return tbChGwycftgjcjlMapper.selectTbChGwycftgjcjlList(tbChGwycftgjcjl);
    }

    /**
     * 新增高危孕产妇体格检查记录
     * 
     * @param tbChGwycftgjcjl 高危孕产妇体格检查记录
     * @return 结果
     */
    @Override
    public int insertTbChGwycftgjcjl(TbChGwycftgjcjl tbChGwycftgjcjl)
    {
        return tbChGwycftgjcjlMapper.insertTbChGwycftgjcjl(tbChGwycftgjcjl);
    }

    /**
     * 修改高危孕产妇体格检查记录
     * 
     * @param tbChGwycftgjcjl 高危孕产妇体格检查记录
     * @return 结果
     */
    @Override
    public int updateTbChGwycftgjcjl(TbChGwycftgjcjl tbChGwycftgjcjl)
    {
        return tbChGwycftgjcjlMapper.updateTbChGwycftgjcjl(tbChGwycftgjcjl);
    }

    /**
     * 删除高危孕产妇体格检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycftgjcjlByIds(String ids)
    {
        return tbChGwycftgjcjlMapper.deleteTbChGwycftgjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高危孕产妇体格检查记录信息
     * 
     * @param id 高危孕产妇体格检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycftgjcjlById(Long id)
    {
        return tbChGwycftgjcjlMapper.deleteTbChGwycftgjcjlById(id);
    }
}
