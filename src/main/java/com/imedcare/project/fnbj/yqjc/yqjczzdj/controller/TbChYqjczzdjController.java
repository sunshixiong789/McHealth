package com.imedcare.project.fnbj.yqjc.yqjczzdj.controller;

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
 * 转诊登记
 *
 * @author daiminghang
 * @date 2020/1/5 9:01
 */
@Controller
@RequestMapping("/yqjc/yqjczzdj")
public class TbChYqjczzdjController extends BaseController
{
    private String prefix = "yqjc/yqjczzdj";

    @Autowired
    private ITbChCqscdjService tbChCqscdjService;

    @RequiresPermissions("yqjc:yqjczzdj:view")
    @GetMapping()
    public String cqscdj()
    {
        return prefix + "/yqjczzdj";
    }

    /**
     * 查询转诊登记列表
     */
    @RequiresPermissions("yqjc:yqjczzdj:list")
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
    @RequiresPermissions("yqjc:yqjczzdj:view")
    @GetMapping("/list")
    public String getCqscdj()
    {
        return prefix+"/list";
    }
    /**
     * 导出转诊登记列表
     */
    @RequiresPermissions("yqjc:yqjczzdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqscdj tbChCqscdj)
    {
        List<TbChCqscdj> list = tbChCqscdjService.selectTbChCqscdjList(tbChCqscdj);
        ExcelUtil<TbChCqscdj> util = new ExcelUtil<TbChCqscdj>(TbChCqscdj.class);
        return util.exportExcel(list, "yqjczzdj");
    }

    /**
     * 新增转诊登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存转诊登记
     */
    @RequiresPermissions("yqjc:yqjczzdj:add")
    @Log(title = "转诊登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqscdj tbChCqscdj)
    {
        return toAjax(tbChCqscdjService.insertTbChCqscdj(tbChCqscdj));
    }

    /**
     * 修改转诊登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqscdj tbChCqscdj = tbChCqscdjService.selectTbChCqscdjById(id);
        mmap.put("tbChCqscdj", tbChCqscdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存转诊登记
     */
    @RequiresPermissions("yqjc:yqjczzdj:edit")
    @Log(title = "转诊登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqscdj tbChCqscdj)
    {
        return toAjax(tbChCqscdjService.updateTbChCqscdj(tbChCqscdj));
    }

    /**
     * 删除转诊登记
     */
    @RequiresPermissions("yqjc:yqjczzdj:remove")
    @Log(title = "转诊登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqscdjService.deleteTbChCqscdjByIds(ids));
    }
}
