package com.imedcare.project.etbj.etjktj.jktjtgjc.service.impl;

import java.util.List;

import com.imedcare.project.etbj.etjktj.jktjtgjc.domain.TbEtJktjtgjcVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.etbj.etjktj.jktjtgjc.mapper.TbEtJktjtgjcMapper;
import com.imedcare.project.etbj.etjktj.jktjtgjc.domain.TbEtJktjtgjc;
import com.imedcare.project.etbj.etjktj.jktjtgjc.service.ITbEtJktjtgjcService;
import com.imedcare.common.utils.text.Convert;

/**
 * 儿童健康体检问询记录Service业务层处理
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Service
public class TbEtJktjtgjcServiceImpl implements ITbEtJktjtgjcService 
{
    @Autowired
    private TbEtJktjtgjcMapper tbEtJktjtgjcMapper;

    /**
     * 查询儿童健康体检问询记录
     * 
     * @param id 儿童健康体检问询记录ID
     * @return 儿童健康体检问询记录
     */
    @Override
    public TbEtJktjtgjcVo selectTbEtJktjtgjcById(Long id)
    {
        return tbEtJktjtgjcMapper.selectTbEtJktjtgjcById(id);
    }

    /**
     * 查询儿童健康体检问询记录列表
     * 
     * @param tbEtJktjtgjc 儿童健康体检问询记录
     * @return 儿童健康体检问询记录
     */
    @Override
    public List<TbEtJktjtgjcVo> selectTbEtJktjtgjcList(TbEtJktjtgjcVo tbEtJktjtgjc)
    {
        return tbEtJktjtgjcMapper.selectTbEtJktjtgjcList(tbEtJktjtgjc);
    }

    /**
     * 新增儿童健康体检问询记录
     * 
     * @param tbEtJktjtgjc 儿童健康体检问询记录
     * @return 结果
     */
    @Override
    public int insertTbEtJktjtgjc(TbEtJktjtgjc tbEtJktjtgjc)
    {
        return tbEtJktjtgjcMapper.insertTbEtJktjtgjc(tbEtJktjtgjc);
    }

    /**
     * 修改儿童健康体检问询记录
     * 
     * @param tbEtJktjtgjc 儿童健康体检问询记录
     * @return 结果
     */
    @Override
    public int updateTbEtJktjtgjc(TbEtJktjtgjc tbEtJktjtgjc)
    {
        return tbEtJktjtgjcMapper.updateTbEtJktjtgjc(tbEtJktjtgjc);
    }

    /**
     * 删除儿童健康体检问询记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjtgjcByIds(String ids)
    {
        return tbEtJktjtgjcMapper.deleteTbEtJktjtgjcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除儿童健康体检问询记录信息
     * 
     * @param id 儿童健康体检问询记录ID
     * @return 结果
     */
    @Override
    public int deleteTbEtJktjtgjcById(Long id)
    {
        return tbEtJktjtgjcMapper.deleteTbEtJktjtgjcById(id);
    }
}
