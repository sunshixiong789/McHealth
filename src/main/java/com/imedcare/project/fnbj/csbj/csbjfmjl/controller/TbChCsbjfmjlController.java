package com.imedcare.project.fnbj.csbj.csbjfmjl.controller;

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
import com.imedcare.project.fnbj.csbj.csbjfmjl.domain.TbChCsbjfmjl;
import com.imedcare.project.fnbj.csbj.csbjfmjl.service.ITbChCsbjfmjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 分娩记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/csbjfmjl")
public class TbChCsbjfmjlController extends BaseController
{
    private String prefix = "cffs/csbjfmjl";

    @Autowired
    private ITbChCsbjfmjlService tbChCsbjfmjlService;

    @RequiresPermissions("cffs:csbjfmjl:view")
    @GetMapping()
    public String csbjfmjl()
    {
        return prefix + "/csbjfmjl";
    }

    /**
     * 查询分娩记录列表
     */
    @RequiresPermissions("cffs:csbjfmjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCsbjfmjl tbChCsbjfmjl)
    {
        startPage();
        List<TbChCsbjfmjl> list = tbChCsbjfmjlService.selectTbChCsbjfmjlList(tbChCsbjfmjl);
        return getDataTable(list);
    }

    /**
     * 导出分娩记录列表
     */
    @RequiresPermissions("cffs:csbjfmjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCsbjfmjl tbChCsbjfmjl)
    {
        List<TbChCsbjfmjl> list = tbChCsbjfmjlService.selectTbChCsbjfmjlList(tbChCsbjfmjl);
        ExcelUtil<TbChCsbjfmjl> util = new ExcelUtil<TbChCsbjfmjl>(TbChCsbjfmjl.class);
        return util.exportExcel(list, "csbjfmjl");
    }

    /**
     * 新增分娩记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存分娩记录
     */
    @RequiresPermissions("cffs:csbjfmjl:add")
    @Log(title = "分娩记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCsbjfmjl tbChCsbjfmjl)
    {
        return toAjax(tbChCsbjfmjlService.insertTbChCsbjfmjl(tbChCsbjfmjl));
    }

    /**
     * 修改分娩记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCsbjfmjl tbChCsbjfmjl = tbChCsbjfmjlService.selectTbChCsbjfmjlById(id);
        mmap.put("tbChCsbjfmjl", tbChCsbjfmjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存分娩记录
     */
    @RequiresPermissions("cffs:csbjfmjl:edit")
    @Log(title = "分娩记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCsbjfmjl tbChCsbjfmjl)
    {
        return toAjax(tbChCsbjfmjlService.updateTbChCsbjfmjl(tbChCsbjfmjl));
    }

    /**
     * 删除分娩记录
     */
    @RequiresPermissions("cffs:csbjfmjl:remove")
    @Log(title = "分娩记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCsbjfmjlService.deleteTbChCsbjfmjlByIds(ids));
    }
}
