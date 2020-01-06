package com.imedcare.project.fnbj.jhsy.jhsydj.controller;

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
import com.imedcare.project.fnbj.jhsy.jhsydj.domain.TbChJhsy;
import com.imedcare.project.fnbj.jhsy.jhsydj.service.ITbChJhsyService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 计划生育技术服务Controller
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
@Controller
@RequestMapping("/jhsy/jhsydj")
public class TbChJhsyController extends BaseController
{
    private String prefix = "jhsy/jhsydj";

    @Autowired
    private ITbChJhsyService tbChJhsyService;

    @RequiresPermissions("jhsy:jhsydj:view")
    @GetMapping()
    public String jhsydj()
    {
        return prefix + "/jhsydj";
    }

    /**
     * 查询计划生育技术服务列表
     */
    @RequiresPermissions("jhsy:jhsydj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChJhsy tbChJhsy)
    {
        startPage();
        List<TbChJhsy> list = tbChJhsyService.selectTbChJhsyList(tbChJhsy);
        return getDataTable(list);
    }

    /**
     * 导出计划生育技术服务列表
     */
    @RequiresPermissions("jhsy:jhsydj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChJhsy tbChJhsy)
    {
        List<TbChJhsy> list = tbChJhsyService.selectTbChJhsyList(tbChJhsy);
        ExcelUtil<TbChJhsy> util = new ExcelUtil<TbChJhsy>(TbChJhsy.class);
        return util.exportExcel(list, "jhsydj");
    }

    /**
     * 新增计划生育技术服务
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存计划生育技术服务
     */
    @RequiresPermissions("jhsy:jhsydj:add")
    @Log(title = "计划生育技术服务", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChJhsy tbChJhsy)
    {
        return toAjax(tbChJhsyService.insertTbChJhsy(tbChJhsy));
    }

    /**
     * 修改计划生育技术服务
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChJhsy tbChJhsy = tbChJhsyService.selectTbChJhsyById(id);
        mmap.put("tbChJhsy", tbChJhsy);
        return prefix + "/edit";
    }

    /**
     * 修改保存计划生育技术服务
     */
    @RequiresPermissions("jhsy:jhsydj:edit")
    @Log(title = "计划生育技术服务", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChJhsy tbChJhsy)
    {
        return toAjax(tbChJhsyService.updateTbChJhsy(tbChJhsy));
    }

    /**
     * 删除计划生育技术服务
     */
    @RequiresPermissions("jhsy:jhsydj:remove")
    @Log(title = "计划生育技术服务", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChJhsyService.deleteTbChJhsyByIds(ids));
    }
}
