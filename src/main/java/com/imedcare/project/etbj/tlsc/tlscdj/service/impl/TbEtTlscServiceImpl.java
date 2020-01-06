package com.imedcare.project.etbj.tlsc.tlscdj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.tlsc.tlscdj.mapper.TbEtTlscMapper;
import com.imedcare.project.etbj.tlsc.tlscdj.domain.TbEtTlsc;
import com.imedcare.project.etbj.tlsc.tlscdj.service.ITbEtTlscService;
import com.imedcare.common.utils.text.Convert;

/**
 * 新生儿听力筛查Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
@Service
public class TbEtTlscServiceImpl implements ITbEtTlscService 
{
    @Autowired
    private TbEtTlscMapper tbEtTlscMapper;

    /**
     * 查询新生儿听力筛查
     * 
     * @param id 新生儿听力筛查ID
     * @return 新生儿听力筛查
     */
    @Override
    public TbEtTlsc selectTbEtTlscById(Long id)
    {
        return tbEtTlscMapper.selectTbEtTlscById(id);
    }

    /**
     * 查询新生儿听力筛查列表
     * 
     * @param tbEtTlsc 新生儿听力筛查
     * @return 新生儿听力筛查
     */
    @Override
    public List<TbEtTlsc> selectTbEtTlscList(TbEtTlsc tbEtTlsc)
    {
        return tbEtTlscMapper.selectTbEtTlscList(tbEtTlsc);
    }

    /**
     * 新增新生儿听力筛查
     * 
     * @param tbEtTlsc 新生儿听力筛查
     * @return 结果
     */
    @Override
    public int insertTbEtTlsc(TbEtTlsc tbEtTlsc)
    {
        return tbEtTlscMapper.insertTbEtTlsc(tbEtTlsc);
    }

    /**
     * 修改新生儿听力筛查
     * 
     * @param tbEtTlsc 新生儿听力筛查
     * @return 结果
     */
    @Override
    public int updateTbEtTlsc(TbEtTlsc tbEtTlsc)
    {
        return tbEtTlscMapper.updateTbEtTlsc(tbEtTlsc);
    }

    /**
     * 删除新生儿听力筛查对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTlscByIds(String ids)
    {
        return tbEtTlscMapper.deleteTbEtTlscByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除新生儿听力筛查信息
     * 
     * @param id 新生儿听力筛查ID
     * @return 结果
     */
    @Override
    public int deleteTbEtTlscById(Long id)
    {
        return tbEtTlscMapper.deleteTbEtTlscById(id);
    }
}
