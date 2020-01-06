package com.imedcare.project.fnbj.chjc.chtgjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.chjc.chtgjcjl.mapper.TbChChtgjcjlMapper;
import com.imedcare.project.fnbj.chjc.chtgjcjl.domain.TbChChtgjcjl;
import com.imedcare.project.fnbj.chjc.chtgjcjl.service.ITbChChtgjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产后42天体格检查记录Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Service
public class TbChChtgjcjlServiceImpl implements ITbChChtgjcjlService 
{
    @Autowired
    private TbChChtgjcjlMapper tbChChtgjcjlMapper;

    /**
     * 查询产后42天体格检查记录
     * 
     * @param id 产后42天体格检查记录ID
     * @return 产后42天体格检查记录
     */
    @Override
    public TbChChtgjcjl selectTbChChtgjcjlById(Long id)
    {
        return tbChChtgjcjlMapper.selectTbChChtgjcjlById(id);
    }

    /**
     * 查询产后42天体格检查记录列表
     * 
     * @param tbChChtgjcjl 产后42天体格检查记录
     * @return 产后42天体格检查记录
     */
    @Override
    public List<TbChChtgjcjl> selectTbChChtgjcjlList(TbChChtgjcjl tbChChtgjcjl)
    {
        return tbChChtgjcjlMapper.selectTbChChtgjcjlList(tbChChtgjcjl);
    }

    /**
     * 新增产后42天体格检查记录
     * 
     * @param tbChChtgjcjl 产后42天体格检查记录
     * @return 结果
     */
    @Override
    public int insertTbChChtgjcjl(TbChChtgjcjl tbChChtgjcjl)
    {
        return tbChChtgjcjlMapper.insertTbChChtgjcjl(tbChChtgjcjl);
    }

    /**
     * 修改产后42天体格检查记录
     * 
     * @param tbChChtgjcjl 产后42天体格检查记录
     * @return 结果
     */
    @Override
    public int updateTbChChtgjcjl(TbChChtgjcjl tbChChtgjcjl)
    {
        return tbChChtgjcjlMapper.updateTbChChtgjcjl(tbChChtgjcjl);
    }

    /**
     * 删除产后42天体格检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChChtgjcjlByIds(String ids)
    {
        return tbChChtgjcjlMapper.deleteTbChChtgjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产后42天体格检查记录信息
     * 
     * @param id 产后42天体格检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbChChtgjcjlById(Long id)
    {
        return tbChChtgjcjlMapper.deleteTbChChtgjcjlById(id);
    }
}
