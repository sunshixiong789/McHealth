package com.imedcare.project.etbj.etjktj.jktjdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.etjktj.jktjdj.mapper.TbEtJktjdjMapper;
import com.imedcare.project.etbj.etjktj.jktjdj.domain.TbEtJktjdj;
import com.imedcare.project.etbj.etjktj.jktjdj.service.ITbEtJktjdjService;
import com.imedcare.common.utils.text.Convert;

/**
 * 儿童健康体检登记Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
@Service
public class TbEtJktjdjServiceImpl implements ITbEtJktjdjService 
{
    @Autowired
    private TbEtJktjdjMapper tbEtJktjdjMapper;

    /**
     * 查询儿童健康体检登记
     * 
     * @param id 儿童健康体检登记ID
     * @return 儿童健康体检登记
     */
    @Override
    public TbEtJktjdj selectTbEtJktjdjById(Long id)
    {
        return tbEtJktjdjMapper.selectTbEtJktjdjById(id);
    }

    /**
     * 查询儿童健康体检登记列表
     * 
     * @param tbEtJktjdj 儿童健康体检登记
     * @return 儿童健康体检登记
     */
    @Override
    public List<TbEtJktjdj> selectTbEtJktjdjList(TbEtJktjdj tbEtJktjdj)
    {
        return tbEtJktjdjMapper.selectTbEtJktjdjList(tbEtJktjdj);
    }

    /**
     * 新增儿童健康体检登记
     * 
     * @param tbEtJktjdj 儿童健康体检登记
     * @return 结果
     */
    @Override
    public int insertTbEtJktjdj(TbEtJktjdj tbEtJktjdj)
    {
        return tbEtJktjdjMapper.insertTbEtJktjdj(tbEtJktjdj);
    }

    /**
     * 修改儿童健康体检登记
     * 
     * @param tbEtJktjdj 儿童健康体检登记
     * @return 结果
     */
    @Override
    public int updateTbEtJktjdj(TbEtJktjdj tbEtJktjdj)
    {
        return tbEtJktjdjMapper.updateTbEtJktjdj(tbEtJktjdj);
    }

    /**
     * 删除儿童健康体检登记对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjdjByIds(String ids)
    {
        return tbEtJktjdjMapper.deleteTbEtJktjdjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除儿童健康体检登记信息
     * 
     * @param id 儿童健康体检登记ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjdjById(Long id)
    {
        return tbEtJktjdjMapper.deleteTbEtJktjdjById(id);
    }
}
