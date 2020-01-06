package com.imedcare.project.fnbpc.fnbpcyxzd.controller;

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
import com.imedcare.project.fnbpc.fnbpcyxzd.domain.TbFbFnbpcyxzd;
import com.imedcare.project.fnbpc.fnbpcyxzd.service.ITbFbFnbpcyxzdService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 妇女病普查医学指导Controller
 * 
 * @author liuyang
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/fnbpc/fnbpcyxzd")
public class TbFbFnbpcyxzdController extends BaseController
{
    private String prefix = "fnbpc/fnbpcyxzd";

    @Autowired
    private ITbFbFnbpcyxzdService tbFbFnbpcyxzdService;

    @RequiresPermissions("fnbpc:fnbpcyxzd:view")
    @GetMapping()
    public String fnbpcyxzd()
    {
        return prefix + "/fnbpcyxzd";
    }

    /**
     * 查询妇女病普查医学指导列表
     */
    @RequiresPermissions("fnbpc:fnbpcyxzd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbFnbpcyxzd tbFbFnbpcyxzd)
    {
        startPage();
        List<TbFbFnbpcyxzd> list = tbFbFnbpcyxzdService.selectTbFbFnbpcyxzdList(tbFbFnbpcyxzd);
        return getDataTable(list);
    }

    /**
     * 导出妇女病普查医学指导列表
     */
    @RequiresPermissions("fnbpc:fnbpcyxzd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbFnbpcyxzd tbFbFnbpcyxzd)
    {
        List<TbFbFnbpcyxzd> list = tbFbFnbpcyxzdService.selectTbFbFnbpcyxzdList(tbFbFnbpcyxzd);
        ExcelUtil<TbFbFnbpcyxzd> util = new ExcelUtil<TbFbFnbpcyxzd>(TbFbFnbpcyxzd.class);
        return util.exportExcel(list, "fnbpcyxzd");
    }

    /**
     * 新增妇女病普查医学指导
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存妇女病普查医学指导
     */
    @RequiresPermissions("fnbpc:fnbpcyxzd:add")
    @Log(title = "妇女病普查医学指导", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbFnbpcyxzd tbFbFnbpcyxzd)
    {
        return toAjax(tbFbFnbpcyxzdService.insertTbFbFnbpcyxzd(tbFbFnbpcyxzd));
    }

    /**
     * 修改妇女病普查医学指导
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbFnbpcyxzd tbFbFnbpcyxzd = tbFbFnbpcyxzdService.selectTbFbFnbpcyxzdById(id);
        mmap.put("tbFbFnbpcyxzd", tbFbFnbpcyxzd);
        return prefix + "/edit";
    }

    /**
     * 修改保存妇女病普查医学指导
     */
    @RequiresPermissions("fnbpc:fnbpcyxzd:edit")
    @Log(title = "妇女病普查医学指导", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbFnbpcyxzd tbFbFnbpcyxzd)
    {
        return toAjax(tbFbFnbpcyxzdService.updateTbFbFnbpcyxzd(tbFbFnbpcyxzd));
    }

    /**
     * 删除妇女病普查医学指导
     */
    @RequiresPermissions("fnbpc:fnbpcyxzd:remove")
    @Log(title = "妇女病普查医学指导", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbFnbpcyxzdService.deleteTbFbFnbpcyxzdByIds(ids));
    }
}
