package com.imedcare.project.fnbj.cqsc.cqsctgjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqsc.cqsctgjcjl.mapper.TbChCqsctgjcjlMapper;
import com.imedcare.project.fnbj.cqsc.cqsctgjcjl.domain.TbChCqsctgjcjl;
import com.imedcare.project.fnbj.cqsc.cqsctgjcjl.service.ITbChCqsctgjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前筛查体格检查记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqsctgjcjlServiceImpl implements ITbChCqsctgjcjlService 
{
    @Autowired
    private TbChCqsctgjcjlMapper tbChCqsctgjcjlMapper;

    /**
     * 查询产前筛查体格检查记录
     * 
     * @param id 产前筛查体格检查记录ID
     * @return 产前筛查体格检查记录
     */
    @Override
    public TbChCqsctgjcjl selectTbChCqsctgjcjlById(Long id)
    {
        return tbChCqsctgjcjlMapper.selectTbChCqsctgjcjlById(id);
    }

    /**
     * 查询产前筛查体格检查记录列表
     * 
     * @param tbChCqsctgjcjl 产前筛查体格检查记录
     * @return 产前筛查体格检查记录
     */
    @Override
    public List<TbChCqsctgjcjl> selectTbChCqsctgjcjlList(TbChCqsctgjcjl tbChCqsctgjcjl)
    {
        return tbChCqsctgjcjlMapper.selectTbChCqsctgjcjlList(tbChCqsctgjcjl);
    }

    /**
     * 新增产前筛查体格检查记录
     * 
     * @param tbChCqsctgjcjl 产前筛查体格检查记录
     * @return 结果
     */
    @Override
    public int insertTbChCqsctgjcjl(TbChCqsctgjcjl tbChCqsctgjcjl)
    {
        return tbChCqsctgjcjlMapper.insertTbChCqsctgjcjl(tbChCqsctgjcjl);
    }

    /**
     * 修改产前筛查体格检查记录
     * 
     * @param tbChCqsctgjcjl 产前筛查体格检查记录
     * @return 结果
     */
    @Override
    public int updateTbChCqsctgjcjl(TbChCqsctgjcjl tbChCqsctgjcjl)
    {
        return tbChCqsctgjcjlMapper.updateTbChCqsctgjcjl(tbChCqsctgjcjl);
    }

    /**
     * 删除产前筛查体格检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqsctgjcjlByIds(String ids)
    {
        return tbChCqsctgjcjlMapper.deleteTbChCqsctgjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前筛查体格检查记录信息
     * 
     * @param id 产前筛查体格检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqsctgjcjlById(Long id)
    {
        return tbChCqsctgjcjlMapper.deleteTbChCqsctgjcjlById(id);
    }
}
