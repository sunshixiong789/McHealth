package com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.service;

import com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.domain.TbFbHqbjfwdj;
import java.util.List;

/**
 * 婚前保健服务登记Service接口
 *
 * @author liuyang
 * @date 2019-11-18
 */
public interface ITbFbHqbjfwdjService
{
    /**
     * 查询婚前保健服务登记
     *
     * @param id 婚前保健服务登记ID
     * @return 婚前保健服务登记
     */
    public TbFbHqbjfwdj selectTbFbHqbjfwdjById(Long id);

    /**
     * 查询婚前保健服务登记列表
     *
     * @param tbFbHqbjfwdj 婚前保健服务登记
     * @return 婚前保健服务登记集合
     */
    public List<TbFbHqbjfwdj> selectTbFbHqbjfwdjList(TbFbHqbjfwdj tbFbHqbjfwdj);

    /**
     * 新增婚前保健服务登记
     *
     * @param tbFbHqbjfwdj 婚前保健服务登记
     * @return 结果
     */
    public int insertTbFbHqbjfwdj(TbFbHqbjfwdj tbFbHqbjfwdj);

    /**
     * 修改婚前保健服务登记
     *
     * @param tbFbHqbjfwdj 婚前保健服务登记
     * @return 结果
     */
    public int updateTbFbHqbjfwdj(TbFbHqbjfwdj tbFbHqbjfwdj);

    /**
     * 批量删除婚前保健服务登记
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwdjByIds(String ids);

    /**
     * 删除婚前保健服务登记信息
     *
     * @param id 婚前保健服务登记ID
     * @return 结果
     */
    public int deleteTbFbHqbjfwdjById(Long id);
}
