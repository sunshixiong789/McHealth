package com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.controller;

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
import com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.domain.TbChCqzdsysjyjl;
import com.imedcare.project.fnbj.cqzd.cqzdsysjyjl.service.ITbChCqzdsysjyjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前诊断实验室检验记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqzdsysjyjl")
public class TbChCqzdsysjyjlController extends BaseController
{
    private String prefix = "cffs/cqzdsysjyjl";

    @Autowired
    private ITbChCqzdsysjyjlService tbChCqzdsysjyjlService;

    @RequiresPermissions("cffs:cqzdsysjyjl:view")
    @GetMapping()
    public String cqzdsysjyjl()
    {
        return prefix + "/cqzdsysjyjl";
    }

    /**
     * 查询产前诊断实验室检验记录列表
     */
    @RequiresPermissions("cffs:cqzdsysjyjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqzdsysjyjl tbChCqzdsysjyjl)
    {
        startPage();
        List<TbChCqzdsysjyjl> list = tbChCqzdsysjyjlService.selectTbChCqzdsysjyjlList(tbChCqzdsysjyjl);
        return getDataTable(list);
    }

    /**
     * 导出产前诊断实验室检验记录列表
     */
    @RequiresPermissions("cffs:cqzdsysjyjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqzdsysjyjl tbChCqzdsysjyjl)
    {
        List<TbChCqzdsysjyjl> list = tbChCqzdsysjyjlService.selectTbChCqzdsysjyjlList(tbChCqzdsysjyjl);
        ExcelUtil<TbChCqzdsysjyjl> util = new ExcelUtil<TbChCqzdsysjyjl>(TbChCqzdsysjyjl.class);
        return util.exportExcel(list, "cqzdsysjyjl");
    }

    /**
     * 新增产前诊断实验室检验记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前诊断实验室检验记录
     */
    @RequiresPermissions("cffs:cqzdsysjyjl:add")
    @Log(title = "产前诊断实验室检验记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqzdsysjyjl tbChCqzdsysjyjl)
    {
        return toAjax(tbChCqzdsysjyjlService.insertTbChCqzdsysjyjl(tbChCqzdsysjyjl));
    }

    /**
     * 修改产前诊断实验室检验记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqzdsysjyjl tbChCqzdsysjyjl = tbChCqzdsysjyjlService.selectTbChCqzdsysjyjlById(id);
        mmap.put("tbChCqzdsysjyjl", tbChCqzdsysjyjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前诊断实验室检验记录
     */
    @RequiresPermissions("cffs:cqzdsysjyjl:edit")
    @Log(title = "产前诊断实验室检验记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqzdsysjyjl tbChCqzdsysjyjl)
    {
        return toAjax(tbChCqzdsysjyjlService.updateTbChCqzdsysjyjl(tbChCqzdsysjyjl));
    }

    /**
     * 删除产前诊断实验室检验记录
     */
    @RequiresPermissions("cffs:cqzdsysjyjl:remove")
    @Log(title = "产前诊断实验室检验记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqzdsysjyjlService.deleteTbChCqzdsysjyjlByIds(ids));
    }
}
