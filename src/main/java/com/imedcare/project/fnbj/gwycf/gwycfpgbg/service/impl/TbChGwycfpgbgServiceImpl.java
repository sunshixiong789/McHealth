package com.imedcare.project.fnbj.gwycf.gwycfpgbg.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbj.gwycf.gwycfpgbg.mapper.TbChGwycfpgbgMapper;
import com.imedcare.project.fnbj.gwycf.gwycfpgbg.domain.TbChGwycfpgbg;
import com.imedcare.project.fnbj.gwycf.gwycfpgbg.service.ITbChGwycfpgbgService;
import com.imedcare.common.utils.text.Convert;

/**
 * 高危孕产妇评估报告Service业务层处理
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Service
public class TbChGwycfpgbgServiceImpl implements ITbChGwycfpgbgService 
{
    @Autowired
    private TbChGwycfpgbgMapper tbChGwycfpgbgMapper;

    /**
     * 查询高危孕产妇评估报告
     * 
     * @param id 高危孕产妇评估报告ID
     * @return 高危孕产妇评估报告
     */
    @Override
    public TbChGwycfpgbg selectTbChGwycfpgbgById(Long id)
    {
        return tbChGwycfpgbgMapper.selectTbChGwycfpgbgById(id);
    }

    /**
     * 查询高危孕产妇评估报告列表
     * 
     * @param tbChGwycfpgbg 高危孕产妇评估报告
     * @return 高危孕产妇评估报告
     */
    @Override
    public List<TbChGwycfpgbg> selectTbChGwycfpgbgList(TbChGwycfpgbg tbChGwycfpgbg)
    {
        return tbChGwycfpgbgMapper.selectTbChGwycfpgbgList(tbChGwycfpgbg);
    }

    /**
     * 新增高危孕产妇评估报告
     * 
     * @param tbChGwycfpgbg 高危孕产妇评估报告
     * @return 结果
     */
    @Override
    public int insertTbChGwycfpgbg(TbChGwycfpgbg tbChGwycfpgbg)
    {
        return tbChGwycfpgbgMapper.insertTbChGwycfpgbg(tbChGwycfpgbg);
    }

    /**
     * 修改高危孕产妇评估报告
     * 
     * @param tbChGwycfpgbg 高危孕产妇评估报告
     * @return 结果
     */
    @Override
    public int updateTbChGwycfpgbg(TbChGwycfpgbg tbChGwycfpgbg)
    {
        return tbChGwycfpgbgMapper.updateTbChGwycfpgbg(tbChGwycfpgbg);
    }

    /**
     * 删除高危孕产妇评估报告对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfpgbgByIds(String ids)
    {
        return tbChGwycfpgbgMapper.deleteTbChGwycfpgbgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除高危孕产妇评估报告信息
     * 
     * @param id 高危孕产妇评估报告ID
     * @return 结果
     */
    @Override
    public int deleteTbChGwycfpgbgById(Long id)
    {
        return tbChGwycfpgbgMapper.deleteTbChGwycfpgbgById(id);
    }
}
