package com.imedcare.project.etbj.etjktj.jktjyxzd.service.impl;

import java.util.List;

import com.imedcare.project.etbj.etjktj.jktjyxzd.domain.TbEtJktjyxzdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.etjktj.jktjyxzd.mapper.TbEtJktjyxzdMapper;
import com.imedcare.project.etbj.etjktj.jktjyxzd.domain.TbEtJktjyxzd;
import com.imedcare.project.etbj.etjktj.jktjyxzd.service.ITbEtJktjyxzdService;
import com.imedcare.common.utils.text.Convert;

/**
 * 儿童健康体检医学指导Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Service
public class TbEtJktjyxzdServiceImpl implements ITbEtJktjyxzdService 
{
    @Autowired
    private TbEtJktjyxzdMapper tbEtJktjyxzdMapper;

    /**
     * 查询儿童健康体检医学指导
     * 
     * @param id 儿童健康体检医学指导ID
     * @return 儿童健康体检医学指导
     */
    @Override
    public TbEtJktjyxzdVo selectTbEtJktjyxzdById(Long id)
    {
        return tbEtJktjyxzdMapper.selectTbEtJktjyxzdById(id);
    }

    /**
     * 查询儿童健康体检医学指导列表
     * 
     * @param tbEtJktjyxzd 儿童健康体检医学指导
     * @return 儿童健康体检医学指导
     */
    @Override
    public List<TbEtJktjyxzdVo> selectTbEtJktjyxzdList(TbEtJktjyxzdVo tbEtJktjyxzd)
    {
        return tbEtJktjyxzdMapper.selectTbEtJktjyxzdList(tbEtJktjyxzd);
    }

    /**
     * 新增儿童健康体检医学指导
     * 
     * @param tbEtJktjyxzd 儿童健康体检医学指导
     * @return 结果
     */
    @Override
    public int insertTbEtJktjyxzd(TbEtJktjyxzd tbEtJktjyxzd)
    {
        return tbEtJktjyxzdMapper.insertTbEtJktjyxzd(tbEtJktjyxzd);
    }

    /**
     * 修改儿童健康体检医学指导
     * 
     * @param tbEtJktjyxzd 儿童健康体检医学指导
     * @return 结果
     */
    @Override
    public int updateTbEtJktjyxzd(TbEtJktjyxzd tbEtJktjyxzd)
    {
        return tbEtJktjyxzdMapper.updateTbEtJktjyxzd(tbEtJktjyxzd);
    }

    /**
     * 删除儿童健康体检医学指导对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjyxzdByIds(String ids)
    {
        return tbEtJktjyxzdMapper.deleteTbEtJktjyxzdByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除儿童健康体检医学指导信息
     * 
     * @param id 儿童健康体检医学指导ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjyxzdById(Long id)
    {
        return tbEtJktjyxzdMapper.deleteTbEtJktjyxzdById(id);
    }
}
