package com.imedcare.project.etbj.tretgl.trwxjl.controller;

import java.util.List;

import com.imedcare.project.etbj.tretgl.trwxjl.domain.TbEtTrwxjlVo;
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
import com.imedcare.project.etbj.tretgl.trwxjl.domain.TbEtTrwxjl;
import com.imedcare.project.etbj.tretgl.trwxjl.service.ITbEtTrwxjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 体弱儿童问询记录Controller
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Controller
@RequestMapping("/tretgl/trwxjl")
public class TbEtTrwxjlController extends BaseController
{
    private String prefix = "etbj/tretgl/trwxjl";

    @Autowired
    private ITbEtTrwxjlService tbEtTrwxjlService;

    @RequiresPermissions("tretgl:trwxjl:view")
    @GetMapping()
    public String trwxjl()
    {
        return prefix + "/trwxjl";
    }

    /**
     * 查询体弱儿童问询记录列表
     */
    @RequiresPermissions("tretgl:trwxjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTrwxjlVo tbEtTrwxjl)
    {
        startPage();
        List<TbEtTrwxjlVo> list = tbEtTrwxjlService.selectTbEtTrwxjlList(tbEtTrwxjl);
        return getDataTable(list);
    }

    /**
     * 导出体弱儿童问询记录列表
     */
    @RequiresPermissions("tretgl:trwxjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTrwxjlVo tbEtTrwxjl)
    {
        List<TbEtTrwxjlVo> list = tbEtTrwxjlService.selectTbEtTrwxjlList(tbEtTrwxjl);
        ExcelUtil<TbEtTrwxjlVo> util = new ExcelUtil<TbEtTrwxjlVo>(TbEtTrwxjlVo.class);
        return util.exportExcel(list, "trwxjl");
    }

    /**
     * 新增体弱儿童问询记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存体弱儿童问询记录
     */
    @RequiresPermissions("tretgl:trwxjl:add")
    @Log(title = "体弱儿童问询记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTrwxjl tbEtTrwxjl)
    {
        return toAjax(tbEtTrwxjlService.insertTbEtTrwxjl(tbEtTrwxjl));
    }

    /**
     * 修改体弱儿童问询记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtTrwxjlVo tbEtTrwxjl = tbEtTrwxjlService.selectTbEtTrwxjlById(id);
        mmap.put("tbEtTrwxjl", tbEtTrwxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存体弱儿童问询记录
     */
    @RequiresPermissions("tretgl:trwxjl:edit")
    @Log(title = "体弱儿童问询记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTrwxjl tbEtTrwxjl)
    {
        return toAjax(tbEtTrwxjlService.updateTbEtTrwxjl(tbEtTrwxjl));
    }

    /**
     * 删除体弱儿童问询记录
     */
    @RequiresPermissions("tretgl:trwxjl:remove")
    @Log(title = "体弱儿童问询记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtTrwxjlService.deleteTbEtTrwxjlByIds(ids));
    }
}
