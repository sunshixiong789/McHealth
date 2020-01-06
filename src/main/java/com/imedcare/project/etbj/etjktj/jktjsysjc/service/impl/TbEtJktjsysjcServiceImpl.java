package com.imedcare.project.etbj.etjktj.jktjsysjc.service.impl;

import java.util.List;

import com.imedcare.project.etbj.etjktj.jktjsysjc.domain.TbEtJktjsysjcVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.etjktj.jktjsysjc.mapper.TbEtJktjsysjcMapper;
import com.imedcare.project.etbj.etjktj.jktjsysjc.domain.TbEtJktjsysjc;
import com.imedcare.project.etbj.etjktj.jktjsysjc.service.ITbEtJktjsysjcService;
import com.imedcare.common.utils.text.Convert;

/**
 * 儿童健康体检实验室记录Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Service
public class TbEtJktjsysjcServiceImpl implements ITbEtJktjsysjcService 
{
    @Autowired
    private TbEtJktjsysjcMapper tbEtJktjsysjcMapper;

    /**
     * 查询儿童健康体检实验室记录
     * 
     * @param id 儿童健康体检实验室记录ID
     * @return 儿童健康体检实验室记录
     */
    @Override
    public TbEtJktjsysjcVo selectTbEtJktjsysjcById(Long id)
    {
        return tbEtJktjsysjcMapper.selectTbEtJktjsysjcById(id);
    }

    /**
     * 查询儿童健康体检实验室记录列表
     * 
     * @param tbEtJktjsysjc 儿童健康体检实验室记录
     * @return 儿童健康体检实验室记录
     */
    @Override
    public List<TbEtJktjsysjcVo> selectTbEtJktjsysjcList(TbEtJktjsysjcVo tbEtJktjsysjc)
    {
        return tbEtJktjsysjcMapper.selectTbEtJktjsysjcList(tbEtJktjsysjc);
    }

    /**
     * 新增儿童健康体检实验室记录
     * 
     * @param tbEtJktjsysjc 儿童健康体检实验室记录
     * @return 结果
     */
    @Override
    public int insertTbEtJktjsysjc(TbEtJktjsysjc tbEtJktjsysjc)
    {
        return tbEtJktjsysjcMapper.insertTbEtJktjsysjc(tbEtJktjsysjc);
    }

    /**
     * 修改儿童健康体检实验室记录
     * 
     * @param tbEtJktjsysjc 儿童健康体检实验室记录
     * @return 结果
     */
    @Override
    public int updateTbEtJktjsysjc(TbEtJktjsysjc tbEtJktjsysjc)
    {
        return tbEtJktjsysjcMapper.updateTbEtJktjsysjc(tbEtJktjsysjc);
    }

    /**
     * 删除儿童健康体检实验室记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjsysjcByIds(String ids)
    {
        return tbEtJktjsysjcMapper.deleteTbEtJktjsysjcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除儿童健康体检实验室记录信息
     * 
     * @param id 儿童健康体检实验室记录ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjsysjcById(Long id)
    {
        return tbEtJktjsysjcMapper.deleteTbEtJktjsysjcById(id);
    }
}
