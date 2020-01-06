package com.imedcare.project.fnbj.cqbj.yixzd.controller;

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
import com.imedcare.project.fnbj.cqbj.yixzd.domain.FnCqbjYixzd;
import com.imedcare.project.fnbj.cqbj.yixzd.service.IFnCqbjYixzdService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前保健医学指导Controller
 * 
 * @author liuyang
 * @date 2019-11-22
 */
@Controller
@RequestMapping("/cqbj/yixzd")
public class FnCqbjYixzdController extends BaseController
{
    private String prefix = "cqbj/yixzd";

    @Autowired
    private IFnCqbjYixzdService fnCqbjYixzdService;

    @RequiresPermissions("cqbj:yixzd:view")
    @GetMapping()
    public String yixzd()
    {
        return prefix + "/yixzd";
    }

    /**
     * 查询产前保健医学指导列表
     */
    @RequiresPermissions("cqbj:yixzd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FnCqbjYixzd fnCqbjYixzd)
    {
        startPage();
        List<FnCqbjYixzd> list = fnCqbjYixzdService.selectFnCqbjYixzdList(fnCqbjYixzd);
        return getDataTable(list);
    }

    /**
     * 导出产前保健医学指导列表
     */
    @RequiresPermissions("cqbj:yixzd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FnCqbjYixzd fnCqbjYixzd)
    {
        List<FnCqbjYixzd> list = fnCqbjYixzdService.selectFnCqbjYixzdList(fnCqbjYixzd);
        ExcelUtil<FnCqbjYixzd> util = new ExcelUtil<FnCqbjYixzd>(FnCqbjYixzd.class);
        return util.exportExcel(list, "yixzd");
    }

    /**
     * 新增产前保健医学指导
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前保健医学指导
     */
    @RequiresPermissions("cqbj:yixzd:add")
    @Log(title = "产前保健医学指导", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FnCqbjYixzd fnCqbjYixzd)
    {
        return toAjax(fnCqbjYixzdService.insertFnCqbjYixzd(fnCqbjYixzd));
    }

    /**
     * 修改产前保健医学指导
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        FnCqbjYixzd fnCqbjYixzd = fnCqbjYixzdService.selectFnCqbjYixzdById(id);
        mmap.put("fnCqbjYixzd", fnCqbjYixzd);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前保健医学指导
     */
    @RequiresPermissions("cqbj:yixzd:edit")
    @Log(title = "产前保健医学指导", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FnCqbjYixzd fnCqbjYixzd)
    {
        return toAjax(fnCqbjYixzdService.updateFnCqbjYixzd(fnCqbjYixzd));
    }

    /**
     * 删除产前保健医学指导
     */
    @RequiresPermissions("cqbj:yixzd:remove")
    @Log(title = "产前保健医学指导", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fnCqbjYixzdService.deleteFnCqbjYixzdByIds(ids));
    }
}
