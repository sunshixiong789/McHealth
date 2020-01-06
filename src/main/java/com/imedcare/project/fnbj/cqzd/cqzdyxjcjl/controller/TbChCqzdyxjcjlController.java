package com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.controller;

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
import com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.domain.TbChCqzdyxjcjl;
import com.imedcare.project.fnbj.cqzd.cqzdyxjcjl.service.ITbChCqzdyxjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前诊断影像检查记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqzdyxjcjl")
public class TbChCqzdyxjcjlController extends BaseController
{
    private String prefix = "cffs/cqzdyxjcjl";

    @Autowired
    private ITbChCqzdyxjcjlService tbChCqzdyxjcjlService;

    @RequiresPermissions("cffs:cqzdyxjcjl:view")
    @GetMapping()
    public String cqzdyxjcjl()
    {
        return prefix + "/cqzdyxjcjl";
    }

    /**
     * 查询产前诊断影像检查记录列表
     */
    @RequiresPermissions("cffs:cqzdyxjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqzdyxjcjl tbChCqzdyxjcjl)
    {
        startPage();
        List<TbChCqzdyxjcjl> list = tbChCqzdyxjcjlService.selectTbChCqzdyxjcjlList(tbChCqzdyxjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产前诊断影像检查记录列表
     */
    @RequiresPermissions("cffs:cqzdyxjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqzdyxjcjl tbChCqzdyxjcjl)
    {
        List<TbChCqzdyxjcjl> list = tbChCqzdyxjcjlService.selectTbChCqzdyxjcjlList(tbChCqzdyxjcjl);
        ExcelUtil<TbChCqzdyxjcjl> util = new ExcelUtil<TbChCqzdyxjcjl>(TbChCqzdyxjcjl.class);
        return util.exportExcel(list, "cqzdyxjcjl");
    }

    /**
     * 新增产前诊断影像检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前诊断影像检查记录
     */
    @RequiresPermissions("cffs:cqzdyxjcjl:add")
    @Log(title = "产前诊断影像检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqzdyxjcjl tbChCqzdyxjcjl)
    {
        return toAjax(tbChCqzdyxjcjlService.insertTbChCqzdyxjcjl(tbChCqzdyxjcjl));
    }

    /**
     * 修改产前诊断影像检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqzdyxjcjl tbChCqzdyxjcjl = tbChCqzdyxjcjlService.selectTbChCqzdyxjcjlById(id);
        mmap.put("tbChCqzdyxjcjl", tbChCqzdyxjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前诊断影像检查记录
     */
    @RequiresPermissions("cffs:cqzdyxjcjl:edit")
    @Log(title = "产前诊断影像检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqzdyxjcjl tbChCqzdyxjcjl)
    {
        return toAjax(tbChCqzdyxjcjlService.updateTbChCqzdyxjcjl(tbChCqzdyxjcjl));
    }

    /**
     * 删除产前诊断影像检查记录
     */
    @RequiresPermissions("cffs:cqzdyxjcjl:remove")
    @Log(title = "产前诊断影像检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqzdyxjcjlService.deleteTbChCqzdyxjcjlByIds(ids));
    }
}
