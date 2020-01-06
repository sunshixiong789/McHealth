package com.imedcare.project.fnbj.cqsc.cqscyxjcjl.controller;

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
import com.imedcare.project.fnbj.cqsc.cqscyxjcjl.domain.TbChCqscyxjcjl;
import com.imedcare.project.fnbj.cqsc.cqscyxjcjl.service.ITbChCqscyxjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前筛查影像检查记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqscyxjcjl")
public class TbChCqscyxjcjlController extends BaseController
{
    private String prefix = "cffs/cqscyxjcjl";

    @Autowired
    private ITbChCqscyxjcjlService tbChCqscyxjcjlService;

    @RequiresPermissions("cffs:cqscyxjcjl:view")
    @GetMapping()
    public String cqscyxjcjl()
    {
        return prefix + "/cqscyxjcjl";
    }

    /**
     * 查询产前筛查影像检查记录列表
     */
    @RequiresPermissions("cffs:cqscyxjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqscyxjcjl tbChCqscyxjcjl)
    {
        startPage();
        List<TbChCqscyxjcjl> list = tbChCqscyxjcjlService.selectTbChCqscyxjcjlList(tbChCqscyxjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产前筛查影像检查记录列表
     */
    @RequiresPermissions("cffs:cqscyxjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqscyxjcjl tbChCqscyxjcjl)
    {
        List<TbChCqscyxjcjl> list = tbChCqscyxjcjlService.selectTbChCqscyxjcjlList(tbChCqscyxjcjl);
        ExcelUtil<TbChCqscyxjcjl> util = new ExcelUtil<TbChCqscyxjcjl>(TbChCqscyxjcjl.class);
        return util.exportExcel(list, "cqscyxjcjl");
    }

    /**
     * 新增产前筛查影像检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前筛查影像检查记录
     */
    @RequiresPermissions("cffs:cqscyxjcjl:add")
    @Log(title = "产前筛查影像检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqscyxjcjl tbChCqscyxjcjl)
    {
        return toAjax(tbChCqscyxjcjlService.insertTbChCqscyxjcjl(tbChCqscyxjcjl));
    }

    /**
     * 修改产前筛查影像检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqscyxjcjl tbChCqscyxjcjl = tbChCqscyxjcjlService.selectTbChCqscyxjcjlById(id);
        mmap.put("tbChCqscyxjcjl", tbChCqscyxjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前筛查影像检查记录
     */
    @RequiresPermissions("cffs:cqscyxjcjl:edit")
    @Log(title = "产前筛查影像检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqscyxjcjl tbChCqscyxjcjl)
    {
        return toAjax(tbChCqscyxjcjlService.updateTbChCqscyxjcjl(tbChCqscyxjcjl));
    }

    /**
     * 删除产前筛查影像检查记录
     */
    @RequiresPermissions("cffs:cqscyxjcjl:remove")
    @Log(title = "产前筛查影像检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqscyxjcjlService.deleteTbChCqscyxjcjlByIds(ids));
    }
}
