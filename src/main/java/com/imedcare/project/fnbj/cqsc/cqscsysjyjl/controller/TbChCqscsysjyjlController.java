package com.imedcare.project.fnbj.cqsc.cqscsysjyjl.controller;

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
import com.imedcare.project.fnbj.cqsc.cqscsysjyjl.domain.TbChCqscsysjyjl;
import com.imedcare.project.fnbj.cqsc.cqscsysjyjl.service.ITbChCqscsysjyjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前筛查实验室检验记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqscsysjyjl")
public class TbChCqscsysjyjlController extends BaseController
{
    private String prefix = "cffs/cqscsysjyjl";

    @Autowired
    private ITbChCqscsysjyjlService tbChCqscsysjyjlService;

    @RequiresPermissions("cffs:cqscsysjyjl:view")
    @GetMapping()
    public String cqscsysjyjl()
    {
        return prefix + "/cqscsysjyjl";
    }

    /**
     * 查询产前筛查实验室检验记录列表
     */
    @RequiresPermissions("cffs:cqscsysjyjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqscsysjyjl tbChCqscsysjyjl)
    {
        startPage();
        List<TbChCqscsysjyjl> list = tbChCqscsysjyjlService.selectTbChCqscsysjyjlList(tbChCqscsysjyjl);
        return getDataTable(list);
    }

    /**
     * 导出产前筛查实验室检验记录列表
     */
    @RequiresPermissions("cffs:cqscsysjyjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqscsysjyjl tbChCqscsysjyjl)
    {
        List<TbChCqscsysjyjl> list = tbChCqscsysjyjlService.selectTbChCqscsysjyjlList(tbChCqscsysjyjl);
        ExcelUtil<TbChCqscsysjyjl> util = new ExcelUtil<TbChCqscsysjyjl>(TbChCqscsysjyjl.class);
        return util.exportExcel(list, "cqscsysjyjl");
    }

    /**
     * 新增产前筛查实验室检验记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前筛查实验室检验记录
     */
    @RequiresPermissions("cffs:cqscsysjyjl:add")
    @Log(title = "产前筛查实验室检验记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqscsysjyjl tbChCqscsysjyjl)
    {
        return toAjax(tbChCqscsysjyjlService.insertTbChCqscsysjyjl(tbChCqscsysjyjl));
    }

    /**
     * 修改产前筛查实验室检验记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqscsysjyjl tbChCqscsysjyjl = tbChCqscsysjyjlService.selectTbChCqscsysjyjlById(id);
        mmap.put("tbChCqscsysjyjl", tbChCqscsysjyjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前筛查实验室检验记录
     */
    @RequiresPermissions("cffs:cqscsysjyjl:edit")
    @Log(title = "产前筛查实验室检验记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqscsysjyjl tbChCqscsysjyjl)
    {
        return toAjax(tbChCqscsysjyjlService.updateTbChCqscsysjyjl(tbChCqscsysjyjl));
    }

    /**
     * 删除产前筛查实验室检验记录
     */
    @RequiresPermissions("cffs:cqscsysjyjl:remove")
    @Log(title = "产前筛查实验室检验记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqscsysjyjlService.deleteTbChCqscsysjyjlByIds(ids));
    }
}
