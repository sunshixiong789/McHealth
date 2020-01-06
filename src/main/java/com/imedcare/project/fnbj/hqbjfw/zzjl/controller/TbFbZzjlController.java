package com.imedcare.project.fnbj.hqbjfw.zzjl.controller;

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
import com.imedcare.project.fnbj.hqbjfw.zzjl.domain.TbFbZzjl;
import com.imedcare.project.fnbj.hqbjfw.zzjl.service.ITbFbZzjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 转诊记录Controller
 * 
 * @author liuyang
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/hqbjfw/zzjl")
public class TbFbZzjlController extends BaseController
{
    private String prefix = "hqbjfw/zzjl";

    @Autowired
    private ITbFbZzjlService tbFbZzjlService;

    @RequiresPermissions("hqbjfw:zzjl:view")
    @GetMapping()
    public String zzjl()
    {
        return prefix + "/zzjl";
    }

    /**
     * 查询转诊记录列表
     */
    @RequiresPermissions("hqbjfw:zzjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbZzjl tbFbZzjl)
    {
        startPage();
        List<TbFbZzjl> list = tbFbZzjlService.selectTbFbZzjlList(tbFbZzjl);
        return getDataTable(list);
    }

    /**
     * 导出转诊记录列表
     */
    @RequiresPermissions("hqbjfw:zzjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbZzjl tbFbZzjl)
    {
        List<TbFbZzjl> list = tbFbZzjlService.selectTbFbZzjlList(tbFbZzjl);
        ExcelUtil<TbFbZzjl> util = new ExcelUtil<TbFbZzjl>(TbFbZzjl.class);
        return util.exportExcel(list, "zzjl");
    }

    /**
     * 新增转诊记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存转诊记录
     */
    @RequiresPermissions("hqbjfw:zzjl:add")
    @Log(title = "转诊记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbZzjl tbFbZzjl)
    {
        return toAjax(tbFbZzjlService.insertTbFbZzjl(tbFbZzjl));
    }

    /**
     * 修改转诊记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbZzjl tbFbZzjl = tbFbZzjlService.selectTbFbZzjlById(id);
        mmap.put("tbFbZzjl", tbFbZzjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存转诊记录
     */
    @RequiresPermissions("hqbjfw:zzjl:edit")
    @Log(title = "转诊记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbZzjl tbFbZzjl)
    {
        return toAjax(tbFbZzjlService.updateTbFbZzjl(tbFbZzjl));
    }

    /**
     * 删除转诊记录
     */
    @RequiresPermissions("hqbjfw:zzjl:remove")
    @Log(title = "转诊记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbZzjlService.deleteTbFbZzjlByIds(ids));
    }
}
