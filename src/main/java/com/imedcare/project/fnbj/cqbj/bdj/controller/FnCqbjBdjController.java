package com.imedcare.project.fnbj.cqbj.bdj.controller;

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
import com.imedcare.project.fnbj.cqbj.bdj.domain.FnCqbjBdj;
import com.imedcare.project.fnbj.cqbj.bdj.service.IFnCqbjBdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前保健登记Controller
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/cqbj/bdj")
public class FnCqbjBdjController extends BaseController
{
    private String prefix = "cqbj/bdj";

    @Autowired
    private IFnCqbjBdjService fnCqbjBdjService;

    @RequiresPermissions("cqbj:bdj:view")
    @GetMapping()
    public String bdj()
    {
        return prefix + "/bdj";
    }

    /**
     * 查询产前保健登记列表
     */
    @RequiresPermissions("cqbj:bdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FnCqbjBdj fnCqbjBdj)
    {
        startPage();
        List<FnCqbjBdj> list = fnCqbjBdjService.selectFnCqbjBdjList(fnCqbjBdj);
        return getDataTable(list);
    }

    /**
     * 导出产前保健登记列表
     */
    @RequiresPermissions("cqbj:bdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FnCqbjBdj fnCqbjBdj)
    {
        List<FnCqbjBdj> list = fnCqbjBdjService.selectFnCqbjBdjList(fnCqbjBdj);
        ExcelUtil<FnCqbjBdj> util = new ExcelUtil<FnCqbjBdj>(FnCqbjBdj.class);
        return util.exportExcel(list, "bdj");
    }

    /**
     * 新增产前保健登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前保健登记
     */
    @RequiresPermissions("cqbj:bdj:add")
    @Log(title = "产前保健登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FnCqbjBdj fnCqbjBdj)
    {
        return toAjax(fnCqbjBdjService.insertFnCqbjBdj(fnCqbjBdj));
    }

    /**
     * 修改产前保健登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FnCqbjBdj fnCqbjBdj = fnCqbjBdjService.selectFnCqbjBdjById(id);
        mmap.put("fnCqbjBdj", fnCqbjBdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前保健登记
     */
    @RequiresPermissions("cqbj:bdj:edit")
    @Log(title = "产前保健登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FnCqbjBdj fnCqbjBdj)
    {
        return toAjax(fnCqbjBdjService.updateFnCqbjBdj(fnCqbjBdj));
    }

    /**
     * 删除产前保健登记
     */
    @RequiresPermissions("cqbj:bdj:remove")
    @Log(title = "产前保健登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fnCqbjBdjService.deleteFnCqbjBdjByIds(ids));
    }
}
