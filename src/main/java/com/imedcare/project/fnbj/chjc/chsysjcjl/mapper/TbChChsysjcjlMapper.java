package com.imedcare.project.fnbj.chjc.chsysjcjl.mapper;

import com.imedcare.project.fnbj.chjc.chsysjcjl.domain.TbChChsysjcjl;
import java.util.List;

/**
 * 产后42天实验室检查记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
public interface TbChChsysjcjlMapper 
{
    /**
     * 查询产后42天实验室检查记录
     * 
     * @param id 产后42天实验室检查记录ID
     * @return 产后42天实验室检查记录
     */
    public TbChChsysjcjl selectTbChChsysjcjlById(Long id);

    /**
     * 查询产后42天实验室检查记录列表
     * 
     * @param tbChChsysjcjl 产后42天实验室检查记录
     * @return 产后42天实验室检查记录集合
     */
    public List<TbChChsysjcjl> selectTbChChsysjcjlList(TbChChsysjcjl tbChChsysjcjl);

    /**
     * 新增产后42天实验室检查记录
     * 
     * @param tbChChsysjcjl 产后42天实验室检查记录
     * @return 结果
     */
    public int insertTbChChsysjcjl(TbChChsysjcjl tbChChsysjcjl);

    /**
     * 修改产后42天实验室检查记录
     * 
     * @param tbChChsysjcjl 产后42天实验室检查记录
     * @return 结果
     */
    public int updateTbChChsysjcjl(TbChChsysjcjl tbChChsysjcjl);

    /**
     * 删除产后42天实验室检查记录
     * 
     * @param id 产后42天实验室检查记录ID
     * @return 结果
     */
    public int deleteTbChChsysjcjlById(Long id);

    /**
     * 批量删除产后42天实验室检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChChsysjcjlByIds(String[] ids);
}
