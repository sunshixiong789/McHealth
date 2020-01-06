package com.imedcare.project.etbj.tretgl.tryxjl.controller;

import java.util.List;

import com.imedcare.project.etbj.tretgl.tryxjl.domain.TbEtTryxjlVo;
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
import com.imedcare.project.etbj.tretgl.tryxjl.domain.TbEtTryxjl;
import com.imedcare.project.etbj.tretgl.tryxjl.service.ITbEtTryxjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 体弱儿童影像检查记录Controller
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Controller
@RequestMapping("/tretgl/tryxjl")
public class TbEtTryxjlController extends BaseController
{
    private String prefix = "etbj/tretgl/tryxjl";

    @Autowired
    private ITbEtTryxjlService tbEtTryxjlService;

    @RequiresPermissions("tretgl:tryxjl:view")
    @GetMapping()
    public String tryxjl()
    {
        return prefix + "/tryxjl";
    }

    /**
     * 查询体弱儿童影像检查记录列表
     */
    @RequiresPermissions("tretgl:tryxjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTryxjlVo tbEtTryxjl)
    {
        startPage();
        List<TbEtTryxjlVo> list = tbEtTryxjlService.selectTbEtTryxjlList(tbEtTryxjl);
        return getDataTable(list);
    }

    /**
     * 导出体弱儿童影像检查记录列表
     */
    @RequiresPermissions("tretgl:tryxjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTryxjlVo tbEtTryxjl)
    {
        List<TbEtTryxjlVo> list = tbEtTryxjlService.selectTbEtTryxjlList(tbEtTryxjl);
        ExcelUtil<TbEtTryxjlVo> util = new ExcelUtil<TbEtTryxjlVo>(TbEtTryxjlVo.class);
        return util.exportExcel(list, "tryxjl");
    }

    /**
     * 新增体弱儿童影像检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存体弱儿童影像检查记录
     */
    @RequiresPermissions("tretgl:tryxjl:add")
    @Log(title = "体弱儿童影像检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTryxjl tbEtTryxjl)
    {
        return toAjax(tbEtTryxjlService.insertTbEtTryxjl(tbEtTryxjl));
    }

    /**
     * 修改体弱儿童影像检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtTryxjlVo tbEtTryxjl = tbEtTryxjlService.selectTbEtTryxjlById(id);
        mmap.put("tbEtTryxjl", tbEtTryxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存体弱儿童影像检查记录
     */
    @RequiresPermissions("tretgl:tryxjl:edit")
    @Log(title = "体弱儿童影像检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTryxjl tbEtTryxjl)
    {
        return toAjax(tbEtTryxjlService.updateTbEtTryxjl(tbEtTryxjl));
    }

    /**
     * 删除体弱儿童影像检查记录
     */
    @RequiresPermissions("tretgl:tryxjl:remove")
    @Log(title = "体弱儿童影像检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtTryxjlService.deleteTbEtTryxjlByIds(ids));
    }
}
