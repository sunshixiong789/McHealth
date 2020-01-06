package com.imedcare.project.fnbj.chjc.chtgjcjl.mapper;

import com.imedcare.project.fnbj.chjc.chtgjcjl.domain.TbChChtgjcjl;
import java.util.List;

/**
 * 产后42天体格检查记录Mapper接口
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
public interface TbChChtgjcjlMapper 
{
    /**
     * 查询产后42天体格检查记录
     * 
     * @param id 产后42天体格检查记录ID
     * @return 产后42天体格检查记录
     */
    public TbChChtgjcjl selectTbChChtgjcjlById(Long id);

    /**
     * 查询产后42天体格检查记录列表
     * 
     * @param tbChChtgjcjl 产后42天体格检查记录
     * @return 产后42天体格检查记录集合
     */
    public List<TbChChtgjcjl> selectTbChChtgjcjlList(TbChChtgjcjl tbChChtgjcjl);

    /**
     * 新增产后42天体格检查记录
     * 
     * @param tbChChtgjcjl 产后42天体格检查记录
     * @return 结果
     */
    public int insertTbChChtgjcjl(TbChChtgjcjl tbChChtgjcjl);

    /**
     * 修改产后42天体格检查记录
     * 
     * @param tbChChtgjcjl 产后42天体格检查记录
     * @return 结果
     */
    public int updateTbChChtgjcjl(TbChChtgjcjl tbChChtgjcjl);

    /**
     * 删除产后42天体格检查记录
     * 
     * @param id 产后42天体格检查记录ID
     * @return 结果
     */
    public int deleteTbChChtgjcjlById(Long id);

    /**
     * 批量删除产后42天体格检查记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbChChtgjcjlByIds(String[] ids);
}
