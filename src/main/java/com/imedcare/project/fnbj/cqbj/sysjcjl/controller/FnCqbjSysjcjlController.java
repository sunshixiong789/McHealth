package com.imedcare.project.fnbj.cqbj.sysjcjl.controller;

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
import com.imedcare.project.fnbj.cqbj.sysjcjl.domain.FnCqbjSysjcjl;
import com.imedcare.project.fnbj.cqbj.sysjcjl.service.IFnCqbjSysjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前保健实验室检查记录Controller
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/cqbj/sysjcjl")
public class FnCqbjSysjcjlController extends BaseController
{
    private String prefix = "cqbj/sysjcjl";

    @Autowired
    private IFnCqbjSysjcjlService fnCqbjSysjcjlService;

    @RequiresPermissions("cqbj:sysjcjl:view")
    @GetMapping()
    public String sysjcjl()
    {
        return prefix + "/sysjcjl";
    }

    /**
     * 查询产前保健实验室检查记录列表
     */
    @RequiresPermissions("cqbj:sysjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FnCqbjSysjcjl fnCqbjSysjcjl)
    {
        startPage();
        List<FnCqbjSysjcjl> list = fnCqbjSysjcjlService.selectFnCqbjSysjcjlList(fnCqbjSysjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产前保健实验室检查记录列表
     */
    @RequiresPermissions("cqbj:sysjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FnCqbjSysjcjl fnCqbjSysjcjl)
    {
        List<FnCqbjSysjcjl> list = fnCqbjSysjcjlService.selectFnCqbjSysjcjlList(fnCqbjSysjcjl);
        ExcelUtil<FnCqbjSysjcjl> util = new ExcelUtil<FnCqbjSysjcjl>(FnCqbjSysjcjl.class);
        return util.exportExcel(list, "sysjcjl");
    }

    /**
     * 新增产前保健实验室检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前保健实验室检查记录
     */
    @RequiresPermissions("cqbj:sysjcjl:add")
    @Log(title = "产前保健实验室检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FnCqbjSysjcjl fnCqbjSysjcjl)
    {
        return toAjax(fnCqbjSysjcjlService.insertFnCqbjSysjcjl(fnCqbjSysjcjl));
    }

    /**
     * 修改产前保健实验室检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FnCqbjSysjcjl fnCqbjSysjcjl = fnCqbjSysjcjlService.selectFnCqbjSysjcjlById(id);
        mmap.put("fnCqbjSysjcjl", fnCqbjSysjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前保健实验室检查记录
     */
    @RequiresPermissions("cqbj:sysjcjl:edit")
    @Log(title = "产前保健实验室检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FnCqbjSysjcjl fnCqbjSysjcjl)
    {
        return toAjax(fnCqbjSysjcjlService.updateFnCqbjSysjcjl(fnCqbjSysjcjl));
    }

    /**
     * 删除产前保健实验室检查记录
     */
    @RequiresPermissions("cqbj:sysjcjl:remove")
    @Log(title = "产前保健实验室检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fnCqbjSysjcjlService.deleteFnCqbjSysjcjlByIds(ids));
    }
}
