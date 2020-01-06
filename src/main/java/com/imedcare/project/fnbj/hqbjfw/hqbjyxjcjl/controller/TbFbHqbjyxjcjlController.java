package com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.controller;

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
import com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.domain.TbFbHqbjyxjcjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.service.ITbFbHqbjyxjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 婚前保健影像检查记录Controller
 * 
 * @author liuyang
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/hqbjfw/hqbjyxjcjl")
public class TbFbHqbjyxjcjlController extends BaseController
{
    private String prefix = "hqbjfw/hqbjyxjcjl";

    @Autowired
    private ITbFbHqbjyxjcjlService tbFbHqbjyxjcjlService;

    @RequiresPermissions("hqbjfw:hqbjyxjcjl:view")
    @GetMapping()
    public String hqbjyxjcjl()
    {
        return prefix + "/hqbjyxjcjl";
    }

    /**
     * 查询婚前保健影像检查记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjyxjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbHqbjyxjcjl tbFbHqbjyxjcjl)
    {
        startPage();
        List<TbFbHqbjyxjcjl> list = tbFbHqbjyxjcjlService.selectTbFbHqbjyxjcjlList(tbFbHqbjyxjcjl);
        return getDataTable(list);
    }

    /**
     * 导出婚前保健影像检查记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjyxjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbHqbjyxjcjl tbFbHqbjyxjcjl)
    {
        List<TbFbHqbjyxjcjl> list = tbFbHqbjyxjcjlService.selectTbFbHqbjyxjcjlList(tbFbHqbjyxjcjl);
        ExcelUtil<TbFbHqbjyxjcjl> util = new ExcelUtil<TbFbHqbjyxjcjl>(TbFbHqbjyxjcjl.class);
        return util.exportExcel(list, "hqbjyxjcjl");
    }

    /**
     * 新增婚前保健影像检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存婚前保健影像检查记录
     */
    @RequiresPermissions("hqbjfw:hqbjyxjcjl:add")
    @Log(title = "婚前保健影像检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbHqbjyxjcjl tbFbHqbjyxjcjl)
    {
        return toAjax(tbFbHqbjyxjcjlService.insertTbFbHqbjyxjcjl(tbFbHqbjyxjcjl));
    }

    /**
     * 修改婚前保健影像检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbHqbjyxjcjl tbFbHqbjyxjcjl = tbFbHqbjyxjcjlService.selectTbFbHqbjyxjcjlById(id);
        mmap.put("tbFbHqbjyxjcjl", tbFbHqbjyxjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存婚前保健影像检查记录
     */
    @RequiresPermissions("hqbjfw:hqbjyxjcjl:edit")
    @Log(title = "婚前保健影像检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbHqbjyxjcjl tbFbHqbjyxjcjl)
    {
        return toAjax(tbFbHqbjyxjcjlService.updateTbFbHqbjyxjcjl(tbFbHqbjyxjcjl));
    }

    /**
     * 删除婚前保健影像检查记录
     */
    @RequiresPermissions("hqbjfw:hqbjyxjcjl:remove")
    @Log(title = "婚前保健影像检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbHqbjyxjcjlService.deleteTbFbHqbjyxjcjlByIds(ids));
    }
}
