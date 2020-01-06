package com.imedcare.project.fnbpc.fnbpcwxjl.controller;

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
import com.imedcare.project.fnbpc.fnbpcwxjl.domain.TbFbFnbpcwxjl;
import com.imedcare.project.fnbpc.fnbpcwxjl.service.ITbFbFnbpcwxjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 妇女病普查问询记录Controller
 * 
 * @author liuyang
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/fnbpc/fnbpcwxjl")
public class TbFbFnbpcwxjlController extends BaseController
{
    private String prefix = "fnbpc/fnbpcwxjl";

    @Autowired
    private ITbFbFnbpcwxjlService tbFbFnbpcwxjlService;

    @RequiresPermissions("fnbpc:fnbpcwxjl:view")
    @GetMapping()
    public String fnbpcwxjl()
    {
        return prefix + "/fnbpcwxjl";
    }

    /**
     * 查询妇女病普查问询记录列表
     */
    @RequiresPermissions("fnbpc:fnbpcwxjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbFnbpcwxjl tbFbFnbpcwxjl)
    {
        startPage();
        List<TbFbFnbpcwxjl> list = tbFbFnbpcwxjlService.selectTbFbFnbpcwxjlList(tbFbFnbpcwxjl);
        return getDataTable(list);
    }

    /**
     * 导出妇女病普查问询记录列表
     */
    @RequiresPermissions("fnbpc:fnbpcwxjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbFnbpcwxjl tbFbFnbpcwxjl)
    {
        List<TbFbFnbpcwxjl> list = tbFbFnbpcwxjlService.selectTbFbFnbpcwxjlList(tbFbFnbpcwxjl);
        ExcelUtil<TbFbFnbpcwxjl> util = new ExcelUtil<TbFbFnbpcwxjl>(TbFbFnbpcwxjl.class);
        return util.exportExcel(list, "fnbpcwxjl");
    }

    /**
     * 新增妇女病普查问询记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存妇女病普查问询记录
     */
    @RequiresPermissions("fnbpc:fnbpcwxjl:add")
    @Log(title = "妇女病普查问询记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbFnbpcwxjl tbFbFnbpcwxjl)
    {
        return toAjax(tbFbFnbpcwxjlService.insertTbFbFnbpcwxjl(tbFbFnbpcwxjl));
    }

    /**
     * 修改妇女病普查问询记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbFnbpcwxjl tbFbFnbpcwxjl = tbFbFnbpcwxjlService.selectTbFbFnbpcwxjlById(id);
        mmap.put("tbFbFnbpcwxjl", tbFbFnbpcwxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存妇女病普查问询记录
     */
    @RequiresPermissions("fnbpc:fnbpcwxjl:edit")
    @Log(title = "妇女病普查问询记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbFnbpcwxjl tbFbFnbpcwxjl)
    {
        return toAjax(tbFbFnbpcwxjlService.updateTbFbFnbpcwxjl(tbFbFnbpcwxjl));
    }

    /**
     * 删除妇女病普查问询记录
     */
    @RequiresPermissions("fnbpc:fnbpcwxjl:remove")
    @Log(title = "妇女病普查问询记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbFnbpcwxjlService.deleteTbFbFnbpcwxjlByIds(ids));
    }
}
