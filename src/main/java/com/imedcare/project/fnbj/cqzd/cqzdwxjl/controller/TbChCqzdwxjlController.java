package com.imedcare.project.fnbj.cqzd.cqzdwxjl.controller;

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
import com.imedcare.project.fnbj.cqzd.cqzdwxjl.domain.TbChCqzdwxjl;
import com.imedcare.project.fnbj.cqzd.cqzdwxjl.service.ITbChCqzdwxjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前诊断问询记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqzdwxjl")
public class TbChCqzdwxjlController extends BaseController
{
    private String prefix = "cffs/cqzdwxjl";

    @Autowired
    private ITbChCqzdwxjlService tbChCqzdwxjlService;

    @RequiresPermissions("cffs:cqzdwxjl:view")
    @GetMapping()
    public String cqzdwxjl()
    {
        return prefix + "/cqzdwxjl";
    }

    /**
     * 查询产前诊断问询记录列表
     */
    @RequiresPermissions("cffs:cqzdwxjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqzdwxjl tbChCqzdwxjl)
    {
        startPage();
        List<TbChCqzdwxjl> list = tbChCqzdwxjlService.selectTbChCqzdwxjlList(tbChCqzdwxjl);
        return getDataTable(list);
    }

    /**
     * 导出产前诊断问询记录列表
     */
    @RequiresPermissions("cffs:cqzdwxjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqzdwxjl tbChCqzdwxjl)
    {
        List<TbChCqzdwxjl> list = tbChCqzdwxjlService.selectTbChCqzdwxjlList(tbChCqzdwxjl);
        ExcelUtil<TbChCqzdwxjl> util = new ExcelUtil<TbChCqzdwxjl>(TbChCqzdwxjl.class);
        return util.exportExcel(list, "cqzdwxjl");
    }

    /**
     * 新增产前诊断问询记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前诊断问询记录
     */
    @RequiresPermissions("cffs:cqzdwxjl:add")
    @Log(title = "产前诊断问询记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqzdwxjl tbChCqzdwxjl)
    {
        return toAjax(tbChCqzdwxjlService.insertTbChCqzdwxjl(tbChCqzdwxjl));
    }

    /**
     * 修改产前诊断问询记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqzdwxjl tbChCqzdwxjl = tbChCqzdwxjlService.selectTbChCqzdwxjlById(id);
        mmap.put("tbChCqzdwxjl", tbChCqzdwxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前诊断问询记录
     */
    @RequiresPermissions("cffs:cqzdwxjl:edit")
    @Log(title = "产前诊断问询记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqzdwxjl tbChCqzdwxjl)
    {
        return toAjax(tbChCqzdwxjlService.updateTbChCqzdwxjl(tbChCqzdwxjl));
    }

    /**
     * 删除产前诊断问询记录
     */
    @RequiresPermissions("cffs:cqzdwxjl:remove")
    @Log(title = "产前诊断问询记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqzdwxjlService.deleteTbChCqzdwxjlByIds(ids));
    }
}
