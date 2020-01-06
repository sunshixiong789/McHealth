package com.imedcare.project.fnbj.cqzd.cqzdyxzd.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.cqzd.cqzdyxzd.mapper.TbChCqzdyxzdMapper;
import com.imedcare.project.fnbj.cqzd.cqzdyxzd.domain.TbChCqzdyxzd;
import com.imedcare.project.fnbj.cqzd.cqzdyxzd.service.ITbChCqzdyxzdService;
import com.imedcare.common.utils.text.Convert;

/**
 * 产前诊断医学指导Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Service
public class TbChCqzdyxzdServiceImpl implements ITbChCqzdyxzdService 
{
    @Autowired
    private TbChCqzdyxzdMapper tbChCqzdyxzdMapper;

    /**
     * 查询产前诊断医学指导
     * 
     * @param id 产前诊断医学指导ID
     * @return 产前诊断医学指导
     */
    @Override
    public TbChCqzdyxzd selectTbChCqzdyxzdById(Long id)
    {
        return tbChCqzdyxzdMapper.selectTbChCqzdyxzdById(id);
    }

    /**
     * 查询产前诊断医学指导列表
     * 
     * @param tbChCqzdyxzd 产前诊断医学指导
     * @return 产前诊断医学指导
     */
    @Override
    public List<TbChCqzdyxzd> selectTbChCqzdyxzdList(TbChCqzdyxzd tbChCqzdyxzd)
    {
        return tbChCqzdyxzdMapper.selectTbChCqzdyxzdList(tbChCqzdyxzd);
    }

    /**
     * 新增产前诊断医学指导
     * 
     * @param tbChCqzdyxzd 产前诊断医学指导
     * @return 结果
     */
    @Override
    public int insertTbChCqzdyxzd(TbChCqzdyxzd tbChCqzdyxzd)
    {
        return tbChCqzdyxzdMapper.insertTbChCqzdyxzd(tbChCqzdyxzd);
    }

    /**
     * 修改产前诊断医学指导
     * 
     * @param tbChCqzdyxzd 产前诊断医学指导
     * @return 结果
     */
    @Override
    public int updateTbChCqzdyxzd(TbChCqzdyxzd tbChCqzdyxzd)
    {
        return tbChCqzdyxzdMapper.updateTbChCqzdyxzd(tbChCqzdyxzd);
    }

    /**
     * 删除产前诊断医学指导对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdyxzdByIds(String ids)
    {
        return tbChCqzdyxzdMapper.deleteTbChCqzdyxzdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产前诊断医学指导信息
     * 
     * @param id 产前诊断医学指导ID
     * @return 结果
     */
    @Override
    public int deleteTbChCqzdyxzdById(Long id)
    {
        return tbChCqzdyxzdMapper.deleteTbChCqzdyxzdById(id);
    }
}
