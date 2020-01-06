package com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.controller;

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
import com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.domain.TbFbHqbjfwzdjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.service.ITbFbHqbjfwzdjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 婚前保健服务诊断记录Controller
 * 
 * @author liuyang
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/hqbjfw/hqbjfwzdjl")
public class TbFbHqbjfwzdjlController extends BaseController
{
    private String prefix = "hqbjfw/hqbjfwzdjl";

    @Autowired
    private ITbFbHqbjfwzdjlService tbFbHqbjfwzdjlService;

    @RequiresPermissions("hqbjfw:hqbjfwzdjl:view")
    @GetMapping()
    public String hqbjfwzdjl()
    {
        return prefix + "/hqbjfwzdjl";
    }

    /**
     * 查询婚前保健服务诊断记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwzdjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbHqbjfwzdjl tbFbHqbjfwzdjl)
    {
        startPage();
        List<TbFbHqbjfwzdjl> list = tbFbHqbjfwzdjlService.selectTbFbHqbjfwzdjlList(tbFbHqbjfwzdjl);
        return getDataTable(list);
    }

    /**
     * 导出婚前保健服务诊断记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwzdjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbHqbjfwzdjl tbFbHqbjfwzdjl)
    {
        List<TbFbHqbjfwzdjl> list = tbFbHqbjfwzdjlService.selectTbFbHqbjfwzdjlList(tbFbHqbjfwzdjl);
        ExcelUtil<TbFbHqbjfwzdjl> util = new ExcelUtil<TbFbHqbjfwzdjl>(TbFbHqbjfwzdjl.class);
        return util.exportExcel(list, "hqbjfwzdjl");
    }

    /**
     * 新增婚前保健服务诊断记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存婚前保健服务诊断记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwzdjl:add")
    @Log(title = "婚前保健服务诊断记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbHqbjfwzdjl tbFbHqbjfwzdjl)
    {
        return toAjax(tbFbHqbjfwzdjlService.insertTbFbHqbjfwzdjl(tbFbHqbjfwzdjl));
    }

    /**
     * 修改婚前保健服务诊断记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbHqbjfwzdjl tbFbHqbjfwzdjl = tbFbHqbjfwzdjlService.selectTbFbHqbjfwzdjlById(id);
        mmap.put("tbFbHqbjfwzdjl", tbFbHqbjfwzdjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存婚前保健服务诊断记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwzdjl:edit")
    @Log(title = "婚前保健服务诊断记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbHqbjfwzdjl tbFbHqbjfwzdjl)
    {
        return toAjax(tbFbHqbjfwzdjlService.updateTbFbHqbjfwzdjl(tbFbHqbjfwzdjl));
    }

    /**
     * 删除婚前保健服务诊断记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwzdjl:remove")
    @Log(title = "婚前保健服务诊断记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbHqbjfwzdjlService.deleteTbFbHqbjfwzdjlByIds(ids));
    }
}
