package com.imedcare.project.fnbj.cqbj.wxjl.controller;

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
import com.imedcare.project.fnbj.cqbj.wxjl.domain.FnCqbjWxjl;
import com.imedcare.project.fnbj.cqbj.wxjl.service.IFnCqbjWxjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前保健问询记录Controller
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/cqbj/wxjl")
public class FnCqbjWxjlController extends BaseController
{
    private String prefix = "cqbj/wxjl";

    @Autowired
    private IFnCqbjWxjlService fnCqbjWxjlService;

    @RequiresPermissions("cqbj:wxjl:view")
    @GetMapping()
    public String wxjl()
    {
        return prefix + "/wxjl";
    }

    /**
     * 查询产前保健问询记录列表
     */
    @RequiresPermissions("cqbj:wxjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FnCqbjWxjl fnCqbjWxjl)
    {
        startPage();
        List<FnCqbjWxjl> list = fnCqbjWxjlService.selectFnCqbjWxjlList(fnCqbjWxjl);
        return getDataTable(list);
    }

    /**
     * 导出产前保健问询记录列表
     */
    @RequiresPermissions("cqbj:wxjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FnCqbjWxjl fnCqbjWxjl)
    {
        List<FnCqbjWxjl> list = fnCqbjWxjlService.selectFnCqbjWxjlList(fnCqbjWxjl);
        ExcelUtil<FnCqbjWxjl> util = new ExcelUtil<FnCqbjWxjl>(FnCqbjWxjl.class);
        return util.exportExcel(list, "wxjl");
    }

    /**
     * 新增产前保健问询记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前保健问询记录
     */
    @RequiresPermissions("cqbj:wxjl:add")
    @Log(title = "产前保健问询记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FnCqbjWxjl fnCqbjWxjl)
    {
        return toAjax(fnCqbjWxjlService.insertFnCqbjWxjl(fnCqbjWxjl));
    }

    /**
     * 修改产前保健问询记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FnCqbjWxjl fnCqbjWxjl = fnCqbjWxjlService.selectFnCqbjWxjlById(id);
        mmap.put("fnCqbjWxjl", fnCqbjWxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前保健问询记录
     */
    @RequiresPermissions("cqbj:wxjl:edit")
    @Log(title = "产前保健问询记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FnCqbjWxjl fnCqbjWxjl)
    {
        return toAjax(fnCqbjWxjlService.updateFnCqbjWxjl(fnCqbjWxjl));
    }

    /**
     * 删除产前保健问询记录
     */
    @RequiresPermissions("cqbj:wxjl:remove")
    @Log(title = "产前保健问询记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fnCqbjWxjlService.deleteFnCqbjWxjlByIds(ids));
    }
}
