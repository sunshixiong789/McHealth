package com.imedcare.project.fnbj.chjc.chsysjcjl.controller;

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
import com.imedcare.project.fnbj.chjc.chsysjcjl.domain.TbChChsysjcjl;
import com.imedcare.project.fnbj.chjc.chsysjcjl.service.ITbChChsysjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产后42天实验室检查记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/cffs/chsysjcjl")
public class TbChChsysjcjlController extends BaseController
{
    private String prefix = "cffs/chsysjcjl";

    @Autowired
    private ITbChChsysjcjlService tbChChsysjcjlService;

    @RequiresPermissions("cffs:chsysjcjl:view")
    @GetMapping()
    public String chsysjcjl()
    {
        return prefix + "/chsysjcjl";
    }

    /**
     * 查询产后42天实验室检查记录列表
     */
    @RequiresPermissions("cffs:chsysjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChChsysjcjl tbChChsysjcjl)
    {
        startPage();
        List<TbChChsysjcjl> list = tbChChsysjcjlService.selectTbChChsysjcjlList(tbChChsysjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产后42天实验室检查记录列表
     */
    @RequiresPermissions("cffs:chsysjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChChsysjcjl tbChChsysjcjl)
    {
        List<TbChChsysjcjl> list = tbChChsysjcjlService.selectTbChChsysjcjlList(tbChChsysjcjl);
        ExcelUtil<TbChChsysjcjl> util = new ExcelUtil<TbChChsysjcjl>(TbChChsysjcjl.class);
        return util.exportExcel(list, "chsysjcjl");
    }

    /**
     * 新增产后42天实验室检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产后42天实验室检查记录
     */
    @RequiresPermissions("cffs:chsysjcjl:add")
    @Log(title = "产后42天实验室检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChChsysjcjl tbChChsysjcjl)
    {
        return toAjax(tbChChsysjcjlService.insertTbChChsysjcjl(tbChChsysjcjl));
    }

    /**
     * 修改产后42天实验室检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChChsysjcjl tbChChsysjcjl = tbChChsysjcjlService.selectTbChChsysjcjlById(id);
        mmap.put("tbChChsysjcjl", tbChChsysjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产后42天实验室检查记录
     */
    @RequiresPermissions("cffs:chsysjcjl:edit")
    @Log(title = "产后42天实验室检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChChsysjcjl tbChChsysjcjl)
    {
        return toAjax(tbChChsysjcjlService.updateTbChChsysjcjl(tbChChsysjcjl));
    }

    /**
     * 删除产后42天实验室检查记录
     */
    @RequiresPermissions("cffs:chsysjcjl:remove")
    @Log(title = "产后42天实验室检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChChsysjcjlService.deleteTbChChsysjcjlByIds(ids));
    }
}
