package com.imedcare.project.fnbpc.fnbpcfzjcjl.controller;

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
import com.imedcare.project.fnbpc.fnbpcfzjcjl.domain.TbFbFnbpcfzjcjl;
import com.imedcare.project.fnbpc.fnbpcfzjcjl.service.ITbFbFnbpcfzjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 妇女病普查辅助检查记录Controller
 * 
 * @author imedcare
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/fnbpc/fnbpcfzjcjl")
public class TbFbFnbpcfzjcjlController extends BaseController
{
    private String prefix = "fnbpc/fnbpcfzjcjl";

    @Autowired
    private ITbFbFnbpcfzjcjlService tbFbFnbpcfzjcjlService;

    @RequiresPermissions("fnbpc:fnbpcfzjcjl:view")
    @GetMapping()
    public String fnbpcfzjcjl()
    {
        return prefix + "/fnbpcfzjcjl";
    }

    /**
     * 查询妇女病普查辅助检查记录列表
     */
    @RequiresPermissions("fnbpc:fnbpcfzjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl)
    {
        startPage();
        List<TbFbFnbpcfzjcjl> list = tbFbFnbpcfzjcjlService.selectTbFbFnbpcfzjcjlList(tbFbFnbpcfzjcjl);
        return getDataTable(list);
    }

    /**
     * 导出妇女病普查辅助检查记录列表
     */
    @RequiresPermissions("fnbpc:fnbpcfzjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl)
    {
        List<TbFbFnbpcfzjcjl> list = tbFbFnbpcfzjcjlService.selectTbFbFnbpcfzjcjlList(tbFbFnbpcfzjcjl);
        ExcelUtil<TbFbFnbpcfzjcjl> util = new ExcelUtil<TbFbFnbpcfzjcjl>(TbFbFnbpcfzjcjl.class);
        return util.exportExcel(list, "fnbpcfzjcjl");
    }

    /**
     * 新增妇女病普查辅助检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存妇女病普查辅助检查记录
     */
    @RequiresPermissions("fnbpc:fnbpcfzjcjl:add")
    @Log(title = "妇女病普查辅助检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl)
    {
        return toAjax(tbFbFnbpcfzjcjlService.insertTbFbFnbpcfzjcjl(tbFbFnbpcfzjcjl));
    }

    /**
     * 修改妇女病普查辅助检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl = tbFbFnbpcfzjcjlService.selectTbFbFnbpcfzjcjlById(id);
        mmap.put("tbFbFnbpcfzjcjl", tbFbFnbpcfzjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存妇女病普查辅助检查记录
     */
    @RequiresPermissions("fnbpc:fnbpcfzjcjl:edit")
    @Log(title = "妇女病普查辅助检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbFnbpcfzjcjl tbFbFnbpcfzjcjl)
    {
        return toAjax(tbFbFnbpcfzjcjlService.updateTbFbFnbpcfzjcjl(tbFbFnbpcfzjcjl));
    }

    /**
     * 删除妇女病普查辅助检查记录
     */
    @RequiresPermissions("fnbpc:fnbpcfzjcjl:remove")
    @Log(title = "妇女病普查辅助检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbFnbpcfzjcjlService.deleteTbFbFnbpcfzjcjlByIds(ids));
    }
}
