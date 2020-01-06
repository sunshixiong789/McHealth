package com.imedcare.project.etbj.tretgl.tretdj.controller;

import java.util.List;

import com.imedcare.project.etbj.tretgl.tretdj.domain.TbEtTretdj;
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
import com.imedcare.project.etbj.tretgl.tretdj.service.TbIEtTretdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 体弱儿童登记Controller
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Controller
@RequestMapping("/tretgl/tretdj")
public class TbEtTretdjController extends BaseController
{
    private String prefix = "etbj/tretgl/tretdj";

    @Autowired
    private TbIEtTretdjService etTretdjService;

    @RequiresPermissions("tretgl:tretdj:view")
    @GetMapping()
    public String tretdj()
    {
        return prefix + "/tretdj";
    }

    @RequiresPermissions("tretgl:tretdj:view")
    @GetMapping("listdj")
    public String listdj()
    {
        return prefix + "/list";
    }

    /**
     * 查询体弱儿童登记列表
     */
    @RequiresPermissions("tretgl:tretdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTretdj tbEtTretdj)
    {
        startPage();
        List<TbEtTretdj> list = etTretdjService.selectEtTretdjList(tbEtTretdj);
        return getDataTable(list);
    }

    /**
     * 导出体弱儿童登记列表
     */
    @RequiresPermissions("tretgl:tretdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTretdj tbEtTretdj)
    {
        List<TbEtTretdj> list = etTretdjService.selectEtTretdjList(tbEtTretdj);
        ExcelUtil<TbEtTretdj> util = new ExcelUtil<TbEtTretdj>(TbEtTretdj.class);
        return util.exportExcel(list, "tretdj");
    }

    /**
     * 新增体弱儿童登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存体弱儿童登记
     */
    @RequiresPermissions("tretgl:tretdj:add")
    @Log(title = "体弱儿童登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTretdj tbEtTretdj)
    {
        return toAjax(etTretdjService.insertEtTretdj(tbEtTretdj));
    }

    /**
     * 修改体弱儿童登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtTretdj tbEtTretdj = etTretdjService.selectEtTretdjById(id);
        mmap.put("tbEtTretdj", tbEtTretdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存体弱儿童登记
     */
    @RequiresPermissions("tretgl:tretdj:edit")
    @Log(title = "体弱儿童登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTretdj tbEtTretdj)
    {
        return toAjax(etTretdjService.updateEtTretdj(tbEtTretdj));
    }

    /**
     * 删除体弱儿童登记
     */
    @RequiresPermissions("tretgl:tretdj:remove")
    @Log(title = "体弱儿童登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(etTretdjService.deleteEtTretdjByIds(ids));
    }
}
