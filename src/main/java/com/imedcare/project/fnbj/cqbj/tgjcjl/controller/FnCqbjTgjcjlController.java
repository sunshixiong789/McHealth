package com.imedcare.project.fnbj.cqbj.tgjcjl.controller;

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
import com.imedcare.project.fnbj.cqbj.tgjcjl.domain.FnCqbjTgjcjl;
import com.imedcare.project.fnbj.cqbj.tgjcjl.service.IFnCqbjTgjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前保健体格检查记录Controller
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/cqbj/tgjcjl")
public class FnCqbjTgjcjlController extends BaseController
{
    private String prefix = "cqbj/tgjcjl";

    @Autowired
    private IFnCqbjTgjcjlService fnCqbjTgjcjlService;

    @RequiresPermissions("cqbj:tgjcjl:view")
    @GetMapping()
    public String tgjcjl()
    {
        return prefix + "/tgjcjl";
    }

    /**
     * 查询产前保健体格检查记录列表
     */
    @RequiresPermissions("cqbj:tgjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FnCqbjTgjcjl fnCqbjTgjcjl)
    {
        startPage();
        List<FnCqbjTgjcjl> list = fnCqbjTgjcjlService.selectFnCqbjTgjcjlList(fnCqbjTgjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产前保健体格检查记录列表
     */
    @RequiresPermissions("cqbj:tgjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FnCqbjTgjcjl fnCqbjTgjcjl)
    {
        List<FnCqbjTgjcjl> list = fnCqbjTgjcjlService.selectFnCqbjTgjcjlList(fnCqbjTgjcjl);
        ExcelUtil<FnCqbjTgjcjl> util = new ExcelUtil<FnCqbjTgjcjl>(FnCqbjTgjcjl.class);
        return util.exportExcel(list, "tgjcjl");
    }

    /**
     * 新增产前保健体格检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前保健体格检查记录
     */
    @RequiresPermissions("cqbj:tgjcjl:add")
    @Log(title = "产前保健体格检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FnCqbjTgjcjl fnCqbjTgjcjl)
    {
        return toAjax(fnCqbjTgjcjlService.insertFnCqbjTgjcjl(fnCqbjTgjcjl));
    }

    /**
     * 修改产前保健体格检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FnCqbjTgjcjl fnCqbjTgjcjl = fnCqbjTgjcjlService.selectFnCqbjTgjcjlById(id);
        mmap.put("fnCqbjTgjcjl", fnCqbjTgjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前保健体格检查记录
     */
    @RequiresPermissions("cqbj:tgjcjl:edit")
    @Log(title = "产前保健体格检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FnCqbjTgjcjl fnCqbjTgjcjl)
    {
        return toAjax(fnCqbjTgjcjlService.updateFnCqbjTgjcjl(fnCqbjTgjcjl));
    }

    /**
     * 删除产前保健体格检查记录
     */
    @RequiresPermissions("cqbj:tgjcjl:remove")
    @Log(title = "产前保健体格检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fnCqbjTgjcjlService.deleteFnCqbjTgjcjlByIds(ids));
    }
}
