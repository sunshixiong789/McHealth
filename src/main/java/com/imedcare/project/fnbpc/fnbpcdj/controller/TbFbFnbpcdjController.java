package com.imedcare.project.fnbpc.fnbpcdj.controller;

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
import com.imedcare.project.fnbpc.fnbpcdj.domain.TbFbFnbpcdj;
import com.imedcare.project.fnbpc.fnbpcdj.service.ITbFbFnbpcdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 妇女病普查登记Controller
 * 
 * @author imedcare
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/fnbpc/fnbpcdj")
public class TbFbFnbpcdjController extends BaseController
{
    private String prefix = "fnbpc/fnbpcdj";

    @Autowired
    private ITbFbFnbpcdjService tbFbFnbpcdjService;

    @RequiresPermissions("fnbpc:fnbpcdj:view")
    @GetMapping()
    public String fnbpcdj()
    {
        return prefix + "/fnbpcdj";
    }

    /**
     * 查询妇女病普查登记列表
     */
    @RequiresPermissions("fnbpc:fnbpcdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbFnbpcdj tbFbFnbpcdj)
    {
        startPage();
        List<TbFbFnbpcdj> list = tbFbFnbpcdjService.selectTbFbFnbpcdjList(tbFbFnbpcdj);
        return getDataTable(list);
    }

    /**
     * 导出妇女病普查登记列表
     */
    @RequiresPermissions("fnbpc:fnbpcdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbFnbpcdj tbFbFnbpcdj)
    {
        List<TbFbFnbpcdj> list = tbFbFnbpcdjService.selectTbFbFnbpcdjList(tbFbFnbpcdj);
        ExcelUtil<TbFbFnbpcdj> util = new ExcelUtil<TbFbFnbpcdj>(TbFbFnbpcdj.class);
        return util.exportExcel(list, "fnbpcdj");
    }

    /**
     * 新增妇女病普查登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存妇女病普查登记
     */
    @RequiresPermissions("fnbpc:fnbpcdj:add")
    @Log(title = "妇女病普查登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbFnbpcdj tbFbFnbpcdj)
    {
        return toAjax(tbFbFnbpcdjService.insertTbFbFnbpcdj(tbFbFnbpcdj));
    }

    /**
     * 修改妇女病普查登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbFnbpcdj tbFbFnbpcdj = tbFbFnbpcdjService.selectTbFbFnbpcdjById(id);
        mmap.put("tbFbFnbpcdj", tbFbFnbpcdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存妇女病普查登记
     */
    @RequiresPermissions("fnbpc:fnbpcdj:edit")
    @Log(title = "妇女病普查登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbFnbpcdj tbFbFnbpcdj)
    {
        return toAjax(tbFbFnbpcdjService.updateTbFbFnbpcdj(tbFbFnbpcdj));
    }

    /**
     * 删除妇女病普查登记
     */
    @RequiresPermissions("fnbpc:fnbpcdj:remove")
    @Log(title = "妇女病普查登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbFnbpcdjService.deleteTbFbFnbpcdjByIds(ids));
    }
}
