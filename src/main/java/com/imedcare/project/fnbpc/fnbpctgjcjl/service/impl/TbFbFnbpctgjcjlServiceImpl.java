package com.imedcare.project.fnbpc.fnbpctgjcjl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imedcare.project.fnbpc.fnbpctgjcjl.mapper.TbFbFnbpctgjcjlMapper;
import com.imedcare.project.fnbpc.fnbpctgjcjl.domain.TbFbFnbpctgjcjl;
import com.imedcare.project.fnbpc.fnbpctgjcjl.service.ITbFbFnbpctgjcjlService;
import com.imedcare.common.utils.text.Convert;

/**
 * 妇女病普查体格检查记录Service业务层处理
 * 
 * @author liuyang
 * @date 2019-11-21
 */
@Service
public class TbFbFnbpctgjcjlServiceImpl implements ITbFbFnbpctgjcjlService 
{
    @Autowired
    private TbFbFnbpctgjcjlMapper tbFbFnbpctgjcjlMapper;

    /**
     * 查询妇女病普查体格检查记录
     * 
     * @param id 妇女病普查体格检查记录ID
     * @return 妇女病普查体格检查记录
     */
    @Override
    public TbFbFnbpctgjcjl selectTbFbFnbpctgjcjlById(Long id)
    {
        return tbFbFnbpctgjcjlMapper.selectTbFbFnbpctgjcjlById(id);
    }

    /**
     * 查询妇女病普查体格检查记录列表
     * 
     * @param tbFbFnbpctgjcjl 妇女病普查体格检查记录
     * @return 妇女病普查体格检查记录
     */
    @Override
    public List<TbFbFnbpctgjcjl> selectTbFbFnbpctgjcjlList(TbFbFnbpctgjcjl tbFbFnbpctgjcjl)
    {
        return tbFbFnbpctgjcjlMapper.selectTbFbFnbpctgjcjlList(tbFbFnbpctgjcjl);
    }

    /**
     * 新增妇女病普查体格检查记录
     * 
     * @param tbFbFnbpctgjcjl 妇女病普查体格检查记录
     * @return 结果
     */
    @Override
    public int insertTbFbFnbpctgjcjl(TbFbFnbpctgjcjl tbFbFnbpctgjcjl)
    {
        return tbFbFnbpctgjcjlMapper.insertTbFbFnbpctgjcjl(tbFbFnbpctgjcjl);
    }

    /**
     * 修改妇女病普查体格检查记录
     * 
     * @param tbFbFnbpctgjcjl 妇女病普查体格检查记录
     * @return 结果
     */
    @Override
    public int updateTbFbFnbpctgjcjl(TbFbFnbpctgjcjl tbFbFnbpctgjcjl)
    {
        return tbFbFnbpctgjcjlMapper.updateTbFbFnbpctgjcjl(tbFbFnbpctgjcjl);
    }

    /**
     * 删除妇女病普查体格检查记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpctgjcjlByIds(String ids)
    {
        return tbFbFnbpctgjcjlMapper.deleteTbFbFnbpctgjcjlByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除妇女病普查体格检查记录信息
     * 
     * @param id 妇女病普查体格检查记录ID
     * @return 结果
     */
    @Override
    public int deleteTbFbFnbpctgjcjlById(Long id)
    {
        return tbFbFnbpctgjcjlMapper.deleteTbFbFnbpctgjcjlById(id);
    }
}
