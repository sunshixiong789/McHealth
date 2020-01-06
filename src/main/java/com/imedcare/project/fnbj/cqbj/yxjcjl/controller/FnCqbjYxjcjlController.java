package com.imedcare.project.fnbj.cqbj.yxjcjl.controller;

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
import com.imedcare.project.fnbj.cqbj.yxjcjl.domain.FnCqbjYxjcjl;
import com.imedcare.project.fnbj.cqbj.yxjcjl.service.IFnCqbjYxjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前保健影像检查记录Controller
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/cqbj/yxjcjl")
public class FnCqbjYxjcjlController extends BaseController
{
    private String prefix = "cqbj/yxjcjl";

    @Autowired
    private IFnCqbjYxjcjlService fnCqbjYxjcjlService;

    @RequiresPermissions("cqbj:yxjcjl:view")
    @GetMapping()
    public String yxjcjl()
    {
        return prefix + "/yxjcjl";
    }

    /**
     * 查询产前保健影像检查记录列表
     */
    @RequiresPermissions("cqbj:yxjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FnCqbjYxjcjl fnCqbjYxjcjl)
    {
        startPage();
        List<FnCqbjYxjcjl> list = fnCqbjYxjcjlService.selectFnCqbjYxjcjlList(fnCqbjYxjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产前保健影像检查记录列表
     */
    @RequiresPermissions("cqbj:yxjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FnCqbjYxjcjl fnCqbjYxjcjl)
    {
        List<FnCqbjYxjcjl> list = fnCqbjYxjcjlService.selectFnCqbjYxjcjlList(fnCqbjYxjcjl);
        ExcelUtil<FnCqbjYxjcjl> util = new ExcelUtil<FnCqbjYxjcjl>(FnCqbjYxjcjl.class);
        return util.exportExcel(list, "yxjcjl");
    }

    /**
     * 新增产前保健影像检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前保健影像检查记录
     */
    @RequiresPermissions("cqbj:yxjcjl:add")
    @Log(title = "产前保健影像检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FnCqbjYxjcjl fnCqbjYxjcjl)
    {
        return toAjax(fnCqbjYxjcjlService.insertFnCqbjYxjcjl(fnCqbjYxjcjl));
    }

    /**
     * 修改产前保健影像检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FnCqbjYxjcjl fnCqbjYxjcjl = fnCqbjYxjcjlService.selectFnCqbjYxjcjlById(id);
        mmap.put("fnCqbjYxjcjl", fnCqbjYxjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前保健影像检查记录
     */
    @RequiresPermissions("cqbj:yxjcjl:edit")
    @Log(title = "产前保健影像检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FnCqbjYxjcjl fnCqbjYxjcjl)
    {
        return toAjax(fnCqbjYxjcjlService.updateFnCqbjYxjcjl(fnCqbjYxjcjl));
    }

    /**
     * 删除产前保健影像检查记录
     */
    @RequiresPermissions("cqbj:yxjcjl:remove")
    @Log(title = "产前保健影像检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fnCqbjYxjcjlService.deleteFnCqbjYxjcjlByIds(ids));
    }
}
