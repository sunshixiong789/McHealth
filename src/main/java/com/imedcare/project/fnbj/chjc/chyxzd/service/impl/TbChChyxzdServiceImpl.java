package com.imedcare.project.fnbj.chjc.chyxzd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.chjc.chyxzd.mapper.TbChChyxzdMapper;
import com.imedcare.project.fnbj.chjc.chyxzd.domain.TbChChyxzd;
import com.imedcare.project.fnbj.chjc.chyxzd.service.ITbChChyxzdService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产后42天医学指导Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Service
public class TbChChyxzdServiceImpl implements ITbChChyxzdService 
{
    @Autowired
    private TbChChyxzdMapper tbChChyxzdMapper;

    /**
     * 查询产后42天医学指导
     * 
     * @param id 产后42天医学指导ID
     * @return 产后42天医学指导
     */
    @Override
    public TbChChyxzd selectTbChChyxzdById(Long id)
    {
        return tbChChyxzdMapper.selectTbChChyxzdById(id);
    }

    /**
     * 查询产后42天医学指导列表
     * 
     * @param tbChChyxzd 产后42天医学指导
     * @return 产后42天医学指导
     */
    @Override
    public List<TbChChyxzd> selectTbChChyxzdList(TbChChyxzd tbChChyxzd)
    {
        return tbChChyxzdMapper.selectTbChChyxzdList(tbChChyxzd);
    }

    /**
     * 新增产后42天医学指导
     * 
     * @param tbChChyxzd 产后42天医学指导
     * @return 结果
     */
    @Override
    public int insertTbChChyxzd(TbChChyxzd tbChChyxzd)
    {
        return tbChChyxzdMapper.insertTbChChyxzd(tbChChyxzd);
    }

    /**
     * 修改产后42天医学指导
     * 
     * @param tbChChyxzd 产后42天医学指导
     * @return 结果
     */
    @Override
    public int updateTbChChyxzd(TbChChyxzd tbChChyxzd)
    {
        return tbChChyxzdMapper.updateTbChChyxzd(tbChChyxzd);
    }

    /**
     * 删除产后42天医学指导对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChChyxzdByIds(String ids)
    {
        return tbChChyxzdMapper.deleteTbChChyxzdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产后42天医学指导信息
     * 
     * @param id 产后42天医学指导ID
     * @return 结果
     */
    @Override
    public int deleteTbChChyxzdById(Long id)
    {
        return tbChChyxzdMapper.deleteTbChChyxzdById(id);
    }
}
