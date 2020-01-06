package com.imedcare.project.fnbj.gwycf.gwycfyxzd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.gwycf.gwycfyxzd.mapper.TbChGwycfyxzdMapper;
import com.imedcare.project.fnbj.gwycf.gwycfyxzd.domain.TbChGwycfyxzd;
import com.imedcare.project.fnbj.gwycf.gwycfyxzd.service.ITbChGwycfyxzdService;
import com.imedcare.common.utils.text.Convert;

/**
 * 高危孕产妇医学指导Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Service
public class TbChGwycfyxzdServiceImpl implements ITbChGwycfyxzdService 
{
    @Autowired
    private TbChGwycfyxzdMapper tbChGwycfyxzdMapper;

    /**
     * 查询高危孕产妇医学指导
     * 
     * @param id 高危孕产妇医学指导ID
     * @return 高危孕产妇医学指导
     */
    @Override
    public TbChGwycfyxzd selectTbChGwycfyxzdById(Long id)
    {
        return tbChGwycfyxzdMapper.selectTbChGwycfyxzdById(id);
    }

    /**
     * 查询高危孕产妇医学指导列表
     * 
     * @param tbChGwycfyxzd 高危孕产妇医学指导
     * @return 高危孕产妇医学指导
     */
    @Override
    public List<TbChGwycfyxzd> selectTbChGwycfyxzdList(TbChGwycfyxzd tbChGwycfyxzd)
    {
        return tbChGwycfyxzdMapper.selectTbChGwycfyxzdList(tbChGwycfyxzd);
    }

    /**
     * 新增高危孕产妇医学指导
     * 
     * @param tbChGwycfyxzd 高危孕产妇医学指导
     * @return 结果
     */
    @Override
    public int insertTbChGwycfyxzd(TbChGwycfyxzd tbChGwycfyxzd)
    {
        return tbChGwycfyxzdMapper.insertTbChGwycfyxzd(tbChGwycfyxzd);
    }

    /**
     * 修改高危孕产妇医学指导
     * 
     * @param tbChGwycfyxzd 高危孕产妇医学指导
     * @return 结果
     */
    @Override
    public int updateTbChGwycfyxzd(TbChGwycfyxzd tbChGwycfyxzd)
    {
        return tbChGwycfyxzdMapper.updateTbChGwycfyxzd(tbChGwycfyxzd);
    }

    /**
     * 删除高危孕产妇医学指导对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfyxzdByIds(String ids)
    {
        return tbChGwycfyxzdMapper.deleteTbChGwycfyxzdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高危孕产妇医学指导信息
     * 
     * @param id 高危孕产妇医学指导ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfyxzdById(Long id)
    {
        return tbChGwycfyxzdMapper.deleteTbChGwycfyxzdById(id);
    }
}
