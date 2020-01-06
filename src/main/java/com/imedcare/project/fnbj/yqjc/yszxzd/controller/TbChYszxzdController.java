package com.imedcare.project.fnbj.yqjc.yszxzd.controller;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.fnbj.cqsc.cqscdj.domain.TbChCqscdj;
import com.imedcare.project.fnbj.cqsc.cqscdj.service.ITbChCqscdjService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description:
 * 优生咨询指导
 *
 * @author daiminghang
 * @date 2020/1/5 8:52
 */
@Controller
@RequestMapping("/yqjc/yszxzd")
public class TbChYszxzdController extends BaseController
{
    private String prefix = "yqjc/yszxzd";

    @Autowired
    private ITbChCqscdjService tbChCqscdjService;

    @RequiresPermissions("yqjc:yszxzd:view")
    @GetMapping()
    public String cqscdj()
    {
        return prefix + "/yszxzd";
    }

    /**
     * 查询优生咨询指导列表
     */
    @RequiresPermissions("yqjc:yszxzd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqscdj tbChCqscdj)
    {
        startPage();
        List<TbChCqscdj> list = tbChCqscdjService.selectTbChCqscdjList(tbChCqscdj);
        return getDataTable(list);
    }
    /**
     * 查询产妇访视登记调用
     */
    @RequiresPermissions("yqjc:yszxzd:view")
    @GetMapping("/list")
    public String getCqscdj()
    {
        return prefix+"/list";
    }
    /**
     * 导出优生咨询指导列表
     */
    @RequiresPermissions("yqjc:yszxzd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqscdj tbChCqscdj)
    {
        List<TbChCqscdj> list = tbChCqscdjService.selectTbChCqscdjList(tbChCqscdj);
        ExcelUtil<TbChCqscdj> util = new ExcelUtil<TbChCqscdj>(TbChCqscdj.class);
        return util.exportExcel(list, "yszxzd");
    }

    /**
     * 新增优生咨询指导
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存优生咨询指导
     */
    @RequiresPermissions("yqjc:yszxzd:add")
    @Log(title = "优生咨询指导", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqscdj tbChCqscdj)
    {
        return toAjax(tbChCqscdjService.insertTbChCqscdj(tbChCqscdj));
    }

    /**
     * 修改优生咨询指导
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqscdj tbChCqscdj = tbChCqscdjService.selectTbChCqscdjById(id);
        mmap.put("tbChCqscdj", tbChCqscdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存优生咨询指导
     */
    @RequiresPermissions("yqjc:yszxzd:edit")
    @Log(title = "优生咨询指导", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqscdj tbChCqscdj)
    {
        return toAjax(tbChCqscdjService.updateTbChCqscdj(tbChCqscdj));
    }

    /**
     * 删除优生咨询指导
     */
    @RequiresPermissions("yqjc:yszxzd:remove")
    @Log(title = "优生咨询指导", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqscdjService.deleteTbChCqscdjByIds(ids));
    }
}

