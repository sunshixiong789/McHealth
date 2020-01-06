package com.imedcare.project.etbj.etjktj.jktjpgbg.service.impl;

import java.util.List;

import com.imedcare.project.etbj.etjktj.jktjpgbg.domain.TbEtJktjpgbgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.etjktj.jktjpgbg.mapper.TbEtJktjpgbgMapper;
import com.imedcare.project.etbj.etjktj.jktjpgbg.domain.TbEtJktjpgbg;
import com.imedcare.project.etbj.etjktj.jktjpgbg.service.ITbEtJktjpgbgService;
import com.imedcare.common.utils.text.Convert;

/**
 * 儿童健康体检评估报告Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Service
public class TbEtJktjpgbgServiceImpl implements ITbEtJktjpgbgService 
{
    @Autowired
    private TbEtJktjpgbgMapper tbEtJktjpgbgMapper;

    /**
     * 查询儿童健康体检评估报告
     * 
     * @param id 儿童健康体检评估报告ID
     * @return 儿童健康体检评估报告
     */
    @Override
    public TbEtJktjpgbgVo selectTbEtJktjpgbgById(Long id)
    {
        return tbEtJktjpgbgMapper.selectTbEtJktjpgbgById(id);
    }

    /**
     * 查询儿童健康体检评估报告列表
     * 
     * @param tbEtJktjpgbg 儿童健康体检评估报告
     * @return 儿童健康体检评估报告
     */
    @Override
    public List<TbEtJktjpgbgVo> selectTbEtJktjpgbgList(TbEtJktjpgbgVo tbEtJktjpgbg)
    {
        return tbEtJktjpgbgMapper.selectTbEtJktjpgbgList(tbEtJktjpgbg);
    }

    /**
     * 新增儿童健康体检评估报告
     * 
     * @param tbEtJktjpgbg 儿童健康体检评估报告
     * @return 结果
     */
    @Override
    public int insertTbEtJktjpgbg(TbEtJktjpgbg tbEtJktjpgbg)
    {
        return tbEtJktjpgbgMapper.insertTbEtJktjpgbg(tbEtJktjpgbg);
    }

    /**
     * 修改儿童健康体检评估报告
     * 
     * @param tbEtJktjpgbg 儿童健康体检评估报告
     * @return 结果
     */
    @Override
    public int updateTbEtJktjpgbg(TbEtJktjpgbg tbEtJktjpgbg)
    {
        return tbEtJktjpgbgMapper.updateTbEtJktjpgbg(tbEtJktjpgbg);
    }

    /**
     * 删除儿童健康体检评估报告对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjpgbgByIds(String ids)
    {
        return tbEtJktjpgbgMapper.deleteTbEtJktjpgbgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除儿童健康体检评估报告信息
     * 
     * @param id 儿童健康体检评估报告ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjpgbgById(Long id)
    {
        return tbEtJktjpgbgMapper.deleteTbEtJktjpgbgById(id);
    }
}
