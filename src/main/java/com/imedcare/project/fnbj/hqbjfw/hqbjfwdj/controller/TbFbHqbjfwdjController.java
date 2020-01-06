package com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.domain.TbFbHqbjfwdj;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.service.ITbFbHqbjfwdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 婚前保健服务登记Controller
 *
 * @author liuyang
 * @date 2019-11-18
 */
@Controller
@RequestMapping("/hqbjfw/hqbjfwdj")
public class TbFbHqbjfwdjController extends BaseController
{
    private String prefix = "hqbjfw/hqbjfwdj";

    @Autowired
    private ITbFbHqbjfwdjService tbFbHqbjfwdjService;
    /***
     * @Description: 妇女登记信息调用
     * @Param: []
     * @return: java.lang.String
     * @Author: liuyang
     */
    @RequiresPermissions("hqbjfw:hqbjfwdj:view")
    @GetMapping("/listhqbjfwdj")
    public String getHqbjfwdj()
    {
        return prefix+"/list";
    }
    @RequiresPermissions("hqbjfw:hqbjfwdj:view")
    @GetMapping()
    public String hqbjfwdj()
    {
        return prefix + "/hqbjfwdj";
    }

    /**
     * 查询婚前保健服务登记列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbHqbjfwdj tbFbHqbjfwdj)
    {
        startPage();
        List<TbFbHqbjfwdj> list = tbFbHqbjfwdjService.selectTbFbHqbjfwdjList(tbFbHqbjfwdj);
        return getDataTable(list);
    }

    /**
     * 导出婚前保健服务登记列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbHqbjfwdj tbFbHqbjfwdj)
    {
        List<TbFbHqbjfwdj> list = tbFbHqbjfwdjService.selectTbFbHqbjfwdjList(tbFbHqbjfwdj);
        ExcelUtil<TbFbHqbjfwdj> util = new ExcelUtil<TbFbHqbjfwdj>(TbFbHqbjfwdj.class);
        return util.exportExcel(list, "hqbjfwdj");
    }

    /**
     * 新增婚前保健服务登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存婚前保健服务登记
     */
    @RequiresPermissions("hqbjfw:hqbjfwdj:add")
    @Log(title = "婚前保健服务登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbHqbjfwdj tbFbHqbjfwdj)
    {
        return toAjax(tbFbHqbjfwdjService.insertTbFbHqbjfwdj(tbFbHqbjfwdj));
    }

    /**
     * 修改婚前保健服务登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbHqbjfwdj tbFbHqbjfwdj = tbFbHqbjfwdjService.selectTbFbHqbjfwdjById(id);
        mmap.put("tbFbHqbjfwdj", tbFbHqbjfwdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存婚前保健服务登记
     */
    @RequiresPermissions("hqbjfw:hqbjfwdj:edit")
    @Log(title = "婚前保健服务登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbHqbjfwdj tbFbHqbjfwdj)
    {
        return toAjax(tbFbHqbjfwdjService.updateTbFbHqbjfwdj(tbFbHqbjfwdj));
    }

    /**
     * 删除婚前保健服务登记
     */
    @RequiresPermissions("hqbjfw:hqbjfwdj:remove")
    @Log(title = "婚前保健服务登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbHqbjfwdjService.deleteTbFbHqbjfwdjByIds(ids));
    }
}
