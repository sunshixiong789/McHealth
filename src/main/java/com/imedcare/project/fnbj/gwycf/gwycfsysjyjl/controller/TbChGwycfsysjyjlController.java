package com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.controller;

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
import com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.domain.TbChGwycfsysjyjl;
import com.imedcare.project.fnbj.gwycf.gwycfsysjyjl.service.ITbChGwycfsysjyjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 高危孕产妇实验室检验记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/cffs/gwycfsysjyjl")
public class TbChGwycfsysjyjlController extends BaseController
{
    private String prefix = "cffs/gwycfsysjyjl";

    @Autowired
    private ITbChGwycfsysjyjlService tbChGwycfsysjyjlService;

    @RequiresPermissions("cffs:gwycfsysjyjl:view")
    @GetMapping()
    public String gwycfsysjyjl()
    {
        return prefix + "/gwycfsysjyjl";
    }

    /**
     * 查询高危孕产妇实验室检验记录列表
     */
    @RequiresPermissions("cffs:gwycfsysjyjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChGwycfsysjyjl tbChGwycfsysjyjl)
    {
        startPage();
        List<TbChGwycfsysjyjl> list = tbChGwycfsysjyjlService.selectTbChGwycfsysjyjlList(tbChGwycfsysjyjl);
        return getDataTable(list);
    }

    /**
     * 导出高危孕产妇实验室检验记录列表
     */
    @RequiresPermissions("cffs:gwycfsysjyjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChGwycfsysjyjl tbChGwycfsysjyjl)
    {
        List<TbChGwycfsysjyjl> list = tbChGwycfsysjyjlService.selectTbChGwycfsysjyjlList(tbChGwycfsysjyjl);
        ExcelUtil<TbChGwycfsysjyjl> util = new ExcelUtil<TbChGwycfsysjyjl>(TbChGwycfsysjyjl.class);
        return util.exportExcel(list, "gwycfsysjyjl");
    }

    /**
     * 新增高危孕产妇实验室检验记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高危孕产妇实验室检验记录
     */
    @RequiresPermissions("cffs:gwycfsysjyjl:add")
    @Log(title = "高危孕产妇实验室检验记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChGwycfsysjyjl tbChGwycfsysjyjl)
    {
        return toAjax(tbChGwycfsysjyjlService.insertTbChGwycfsysjyjl(tbChGwycfsysjyjl));
    }

    /**
     * 修改高危孕产妇实验室检验记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChGwycfsysjyjl tbChGwycfsysjyjl = tbChGwycfsysjyjlService.selectTbChGwycfsysjyjlById(id);
        mmap.put("tbChGwycfsysjyjl", tbChGwycfsysjyjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存高危孕产妇实验室检验记录
     */
    @RequiresPermissions("cffs:gwycfsysjyjl:edit")
    @Log(title = "高危孕产妇实验室检验记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChGwycfsysjyjl tbChGwycfsysjyjl)
    {
        return toAjax(tbChGwycfsysjyjlService.updateTbChGwycfsysjyjl(tbChGwycfsysjyjl));
    }

    /**
     * 删除高危孕产妇实验室检验记录
     */
    @RequiresPermissions("cffs:gwycfsysjyjl:remove")
    @Log(title = "高危孕产妇实验室检验记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChGwycfsysjyjlService.deleteTbChGwycfsysjyjlByIds(ids));
    }
}
