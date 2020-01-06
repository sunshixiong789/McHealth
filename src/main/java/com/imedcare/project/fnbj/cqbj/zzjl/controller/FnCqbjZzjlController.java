package com.imedcare.project.fnbj.cqbj.zzjl.controller;

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
import com.imedcare.project.fnbj.cqbj.zzjl.domain.FnCqbjZzjl;
import com.imedcare.project.fnbj.cqbj.zzjl.service.IFnCqbjZzjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前保健转诊记录Controller
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/cqbj/zzjl")
public class FnCqbjZzjlController extends BaseController
{
    private String prefix = "cqbj/zzjl";

    @Autowired
    private IFnCqbjZzjlService fnCqbjZzjlService;

    @RequiresPermissions("cqbj:zzjl:view")
    @GetMapping()
    public String zzjl()
    {
        return prefix + "/zzjl";
    }

    /**
     * 查询产前保健转诊记录列表
     */
    @RequiresPermissions("cqbj:zzjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FnCqbjZzjl fnCqbjZzjl)
    {
        startPage();
        List<FnCqbjZzjl> list = fnCqbjZzjlService.selectFnCqbjZzjlList(fnCqbjZzjl);
        return getDataTable(list);
    }

    /**
     * 导出产前保健转诊记录列表
     */
    @RequiresPermissions("cqbj:zzjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FnCqbjZzjl fnCqbjZzjl)
    {
        List<FnCqbjZzjl> list = fnCqbjZzjlService.selectFnCqbjZzjlList(fnCqbjZzjl);
        ExcelUtil<FnCqbjZzjl> util = new ExcelUtil<FnCqbjZzjl>(FnCqbjZzjl.class);
        return util.exportExcel(list, "zzjl");
    }

    /**
     * 新增产前保健转诊记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前保健转诊记录
     */
    @RequiresPermissions("cqbj:zzjl:add")
    @Log(title = "产前保健转诊记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FnCqbjZzjl fnCqbjZzjl)
    {
        return toAjax(fnCqbjZzjlService.insertFnCqbjZzjl(fnCqbjZzjl));
    }

    /**
     * 修改产前保健转诊记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FnCqbjZzjl fnCqbjZzjl = fnCqbjZzjlService.selectFnCqbjZzjlById(id);
        mmap.put("fnCqbjZzjl", fnCqbjZzjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前保健转诊记录
     */
    @RequiresPermissions("cqbj:zzjl:edit")
    @Log(title = "产前保健转诊记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FnCqbjZzjl fnCqbjZzjl)
    {
        return toAjax(fnCqbjZzjlService.updateFnCqbjZzjl(fnCqbjZzjl));
    }

    /**
     * 删除产前保健转诊记录
     */
    @RequiresPermissions("cqbj:zzjl:remove")
    @Log(title = "产前保健转诊记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fnCqbjZzjlService.deleteFnCqbjZzjlByIds(ids));
    }
}
