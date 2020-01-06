package com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.controller;

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
import com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.domain.TbChGwycfyxjcjl;
import com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.service.ITbChGwycfyxjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 高危孕产妇影像检查记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/cffs/gwycfyxjcjl")
public class TbChGwycfyxjcjlController extends BaseController
{
    private String prefix = "cffs/gwycfyxjcjl";

    @Autowired
    private ITbChGwycfyxjcjlService tbChGwycfyxjcjlService;

    @RequiresPermissions("cffs:gwycfyxjcjl:view")
    @GetMapping()
    public String gwycfyxjcjl()
    {
        return prefix + "/gwycfyxjcjl";
    }

    /**
     * 查询高危孕产妇影像检查记录列表
     */
    @RequiresPermissions("cffs:gwycfyxjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChGwycfyxjcjl tbChGwycfyxjcjl)
    {
        startPage();
        List<TbChGwycfyxjcjl> list = tbChGwycfyxjcjlService.selectTbChGwycfyxjcjlList(tbChGwycfyxjcjl);
        return getDataTable(list);
    }

    /**
     * 导出高危孕产妇影像检查记录列表
     */
    @RequiresPermissions("cffs:gwycfyxjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChGwycfyxjcjl tbChGwycfyxjcjl)
    {
        List<TbChGwycfyxjcjl> list = tbChGwycfyxjcjlService.selectTbChGwycfyxjcjlList(tbChGwycfyxjcjl);
        ExcelUtil<TbChGwycfyxjcjl> util = new ExcelUtil<TbChGwycfyxjcjl>(TbChGwycfyxjcjl.class);
        return util.exportExcel(list, "gwycfyxjcjl");
    }

    /**
     * 新增高危孕产妇影像检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高危孕产妇影像检查记录
     */
    @RequiresPermissions("cffs:gwycfyxjcjl:add")
    @Log(title = "高危孕产妇影像检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChGwycfyxjcjl tbChGwycfyxjcjl)
    {
        return toAjax(tbChGwycfyxjcjlService.insertTbChGwycfyxjcjl(tbChGwycfyxjcjl));
    }

    /**
     * 修改高危孕产妇影像检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChGwycfyxjcjl tbChGwycfyxjcjl = tbChGwycfyxjcjlService.selectTbChGwycfyxjcjlById(id);
        mmap.put("tbChGwycfyxjcjl", tbChGwycfyxjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存高危孕产妇影像检查记录
     */
    @RequiresPermissions("cffs:gwycfyxjcjl:edit")
    @Log(title = "高危孕产妇影像检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChGwycfyxjcjl tbChGwycfyxjcjl)
    {
        return toAjax(tbChGwycfyxjcjlService.updateTbChGwycfyxjcjl(tbChGwycfyxjcjl));
    }

    /**
     * 删除高危孕产妇影像检查记录
     */
    @RequiresPermissions("cffs:gwycfyxjcjl:remove")
    @Log(title = "高危孕产妇影像检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChGwycfyxjcjlService.deleteTbChGwycfyxjcjlByIds(ids));
    }
}
