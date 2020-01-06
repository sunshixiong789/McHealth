package com.imedcare.project.fnbj.chjc.chpgbg.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.chjc.chpgbg.mapper.TbChChpgbgMapper;
import com.imedcare.project.fnbj.chjc.chpgbg.domain.TbChChpgbg;
import com.imedcare.project.fnbj.chjc.chpgbg.service.ITbChChpgbgService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产后42天评估报告（孕产妇保健管理结案）Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Service
public class TbChChpgbgServiceImpl implements ITbChChpgbgService 
{
    @Autowired
    private TbChChpgbgMapper tbChChpgbgMapper;

    /**
     * 查询产后42天评估报告（孕产妇保健管理结案）
     * 
     * @param id 产后42天评估报告（孕产妇保健管理结案）ID
     * @return 产后42天评估报告（孕产妇保健管理结案）
     */
    @Override
    public TbChChpgbg selectTbChChpgbgById(Long id)
    {
        return tbChChpgbgMapper.selectTbChChpgbgById(id);
    }

    /**
     * 查询产后42天评估报告（孕产妇保健管理结案）列表
     * 
     * @param tbChChpgbg 产后42天评估报告（孕产妇保健管理结案）
     * @return 产后42天评估报告（孕产妇保健管理结案）
     */
    @Override
    public List<TbChChpgbg> selectTbChChpgbgList(TbChChpgbg tbChChpgbg)
    {
        return tbChChpgbgMapper.selectTbChChpgbgList(tbChChpgbg);
    }

    /**
     * 新增产后42天评估报告（孕产妇保健管理结案）
     * 
     * @param tbChChpgbg 产后42天评估报告（孕产妇保健管理结案）
     * @return 结果
     */
    @Override
    public int insertTbChChpgbg(TbChChpgbg tbChChpgbg)
    {
        return tbChChpgbgMapper.insertTbChChpgbg(tbChChpgbg);
    }

    /**
     * 修改产后42天评估报告（孕产妇保健管理结案）
     * 
     * @param tbChChpgbg 产后42天评估报告（孕产妇保健管理结案）
     * @return 结果
     */
    @Override
    public int updateTbChChpgbg(TbChChpgbg tbChChpgbg)
    {
        return tbChChpgbgMapper.updateTbChChpgbg(tbChChpgbg);
    }

    /**
     * 删除产后42天评估报告（孕产妇保健管理结案）对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChChpgbgByIds(String ids)
    {
        return tbChChpgbgMapper.deleteTbChChpgbgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产后42天评估报告（孕产妇保健管理结案）信息
     * 
     * @param id 产后42天评估报告（孕产妇保健管理结案）ID
     * @return 结果
     */
    @Override
    public int deleteTbChChpgbgById(Long id)
    {
        return tbChChpgbgMapper.deleteTbChChpgbgById(id);
    }
}
