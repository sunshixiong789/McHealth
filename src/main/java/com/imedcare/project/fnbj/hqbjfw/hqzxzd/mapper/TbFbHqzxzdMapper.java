package com.imedcare.project.fnbj.hqbjfw.hqzxzd.mapper;

import com.imedcare.project.fnbj.hqbjfw.hqzxzd.domain.TbFbHqzxzd;
import java.util.List;

/**
 * 婚前卫生咨询和指导Mapper接口
 * 
 * @author liuyang
 * @date 2019-11-20
 */
public interface TbFbHqzxzdMapper 
{
    /**
     * 查询婚前卫生咨询和指导
     * 
     * @param id 婚前卫生咨询和指导ID
     * @return 婚前卫生咨询和指导
     */
    public TbFbHqzxzd selectTbFbHqzxzdById(Long id);

    /**
     * 查询婚前卫生咨询和指导列表
     * 
     * @param tbFbHqzxzd 婚前卫生咨询和指导
     * @return 婚前卫生咨询和指导集合
     */
    public List<TbFbHqzxzd> selectTbFbHqzxzdList(TbFbHqzxzd tbFbHqzxzd);

    /**
     * 新增婚前卫生咨询和指导
     * 
     * @param tbFbHqzxzd 婚前卫生咨询和指导
     * @return 结果
     */
    public int insertTbFbHqzxzd(TbFbHqzxzd tbFbHqzxzd);

    /**
     * 修改婚前卫生咨询和指导
     * 
     * @param tbFbHqzxzd 婚前卫生咨询和指导
     * @return 结果
     */
    public int updateTbFbHqzxzd(TbFbHqzxzd tbFbHqzxzd);

    /**
     * 删除婚前卫生咨询和指导
     * 
     * @param id 婚前卫生咨询和指导ID
     * @return 结果
     */
    public int deleteTbFbHqzxzdById(Long id);

    /**
     * 批量删除婚前卫生咨询和指导
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbHqzxzdByIds(String[] ids);
}
