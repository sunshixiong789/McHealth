package com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.controller;

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
import com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.domain.TbFbHqbjfwsysjyjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.service.ITbFbHqbjfwsysjyjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 婚前保健服务实验室检验记录Controller
 * 
 * @author liuyang
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/hqbjfw/hqbjfwsysjyjl")
public class TbFbHqbjfwsysjyjlController extends BaseController
{
    private String prefix = "hqbjfw/hqbjfwsysjyjl";

    @Autowired
    private ITbFbHqbjfwsysjyjlService tbFbHqbjfwsysjyjlService;

    @RequiresPermissions("hqbjfw:hqbjfwsysjyjl:view")
    @GetMapping()
    public String hqbjfwsysjyjl()
    {
        return prefix + "/hqbjfwsysjyjl";
    }

    /**
     * 查询婚前保健服务实验室检验记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwsysjyjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl)
    {
        startPage();
        List<TbFbHqbjfwsysjyjl> list = tbFbHqbjfwsysjyjlService.selectTbFbHqbjfwsysjyjlList(tbFbHqbjfwsysjyjl);
        return getDataTable(list);
    }

    /**
     * 导出婚前保健服务实验室检验记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwsysjyjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl)
    {
        List<TbFbHqbjfwsysjyjl> list = tbFbHqbjfwsysjyjlService.selectTbFbHqbjfwsysjyjlList(tbFbHqbjfwsysjyjl);
        ExcelUtil<TbFbHqbjfwsysjyjl> util = new ExcelUtil<TbFbHqbjfwsysjyjl>(TbFbHqbjfwsysjyjl.class);
        return util.exportExcel(list, "hqbjfwsysjyjl");
    }

    /**
     * 新增婚前保健服务实验室检验记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存婚前保健服务实验室检验记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwsysjyjl:add")
    @Log(title = "婚前保健服务实验室检验记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl)
    {
        return toAjax(tbFbHqbjfwsysjyjlService.insertTbFbHqbjfwsysjyjl(tbFbHqbjfwsysjyjl));
    }

    /**
     * 修改婚前保健服务实验室检验记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl = tbFbHqbjfwsysjyjlService.selectTbFbHqbjfwsysjyjlById(id);
        mmap.put("tbFbHqbjfwsysjyjl", tbFbHqbjfwsysjyjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存婚前保健服务实验室检验记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwsysjyjl:edit")
    @Log(title = "婚前保健服务实验室检验记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbHqbjfwsysjyjl tbFbHqbjfwsysjyjl)
    {
        return toAjax(tbFbHqbjfwsysjyjlService.updateTbFbHqbjfwsysjyjl(tbFbHqbjfwsysjyjl));
    }

    /**
     * 删除婚前保健服务实验室检验记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwsysjyjl:remove")
    @Log(title = "婚前保健服务实验室检验记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbHqbjfwsysjyjlService.deleteTbFbHqbjfwsysjyjlByIds(ids));
    }
}
