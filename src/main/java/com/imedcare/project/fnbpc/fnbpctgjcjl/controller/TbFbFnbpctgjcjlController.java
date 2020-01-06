package com.imedcare.project.fnbpc.fnbpctgjcjl.controller;

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
import com.imedcare.project.fnbpc.fnbpctgjcjl.domain.TbFbFnbpctgjcjl;
import com.imedcare.project.fnbpc.fnbpctgjcjl.service.ITbFbFnbpctgjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 妇女病普查体格检查记录Controller
 * 
 * @author liuyang
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/fnbpc/fnbpctgjcjl")
public class TbFbFnbpctgjcjlController extends BaseController
{
    private String prefix = "fnbpc/fnbpctgjcjl";

    @Autowired
    private ITbFbFnbpctgjcjlService tbFbFnbpctgjcjlService;

    @RequiresPermissions("fnbpc:fnbpctgjcjl:view")
    @GetMapping()
    public String fnbpctgjcjl()
    {
        return prefix + "/fnbpctgjcjl";
    }

    /**
     * 查询妇女病普查体格检查记录列表
     */
    @RequiresPermissions("fnbpc:fnbpctgjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbFnbpctgjcjl tbFbFnbpctgjcjl)
    {
        startPage();
        List<TbFbFnbpctgjcjl> list = tbFbFnbpctgjcjlService.selectTbFbFnbpctgjcjlList(tbFbFnbpctgjcjl);
        return getDataTable(list);
    }

    /**
     * 导出妇女病普查体格检查记录列表
     */
    @RequiresPermissions("fnbpc:fnbpctgjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbFnbpctgjcjl tbFbFnbpctgjcjl)
    {
        List<TbFbFnbpctgjcjl> list = tbFbFnbpctgjcjlService.selectTbFbFnbpctgjcjlList(tbFbFnbpctgjcjl);
        ExcelUtil<TbFbFnbpctgjcjl> util = new ExcelUtil<TbFbFnbpctgjcjl>(TbFbFnbpctgjcjl.class);
        return util.exportExcel(list, "fnbpctgjcjl");
    }

    /**
     * 新增妇女病普查体格检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存妇女病普查体格检查记录
     */
    @RequiresPermissions("fnbpc:fnbpctgjcjl:add")
    @Log(title = "妇女病普查体格检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbFnbpctgjcjl tbFbFnbpctgjcjl)
    {
        return toAjax(tbFbFnbpctgjcjlService.insertTbFbFnbpctgjcjl(tbFbFnbpctgjcjl));
    }

    /**
     * 修改妇女病普查体格检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbFnbpctgjcjl tbFbFnbpctgjcjl = tbFbFnbpctgjcjlService.selectTbFbFnbpctgjcjlById(id);
        mmap.put("tbFbFnbpctgjcjl", tbFbFnbpctgjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存妇女病普查体格检查记录
     */
    @RequiresPermissions("fnbpc:fnbpctgjcjl:edit")
    @Log(title = "妇女病普查体格检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbFnbpctgjcjl tbFbFnbpctgjcjl)
    {
        return toAjax(tbFbFnbpctgjcjlService.updateTbFbFnbpctgjcjl(tbFbFnbpctgjcjl));
    }

    /**
     * 删除妇女病普查体格检查记录
     */
    @RequiresPermissions("fnbpc:fnbpctgjcjl:remove")
    @Log(title = "妇女病普查体格检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbFnbpctgjcjlService.deleteTbFbFnbpctgjcjlByIds(ids));
    }
}
