package com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.controller;

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
import com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.domain.TbChCqzdtgjcjl;
import com.imedcare.project.fnbj.cqzd.cqzdtgjcjl.service.ITbChCqzdtgjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前诊断体格检查记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqzdtgjcjl")
public class TbChCqzdtgjcjlController extends BaseController
{
    private String prefix = "cffs/cqzdtgjcjl";

    @Autowired
    private ITbChCqzdtgjcjlService tbChCqzdtgjcjlService;

    @RequiresPermissions("cffs:cqzdtgjcjl:view")
    @GetMapping()
    public String cqzdtgjcjl()
    {
        return prefix + "/cqzdtgjcjl";
    }

    /**
     * 查询产前诊断体格检查记录列表
     */
    @RequiresPermissions("cffs:cqzdtgjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqzdtgjcjl tbChCqzdtgjcjl)
    {
        startPage();
        List<TbChCqzdtgjcjl> list = tbChCqzdtgjcjlService.selectTbChCqzdtgjcjlList(tbChCqzdtgjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产前诊断体格检查记录列表
     */
    @RequiresPermissions("cffs:cqzdtgjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqzdtgjcjl tbChCqzdtgjcjl)
    {
        List<TbChCqzdtgjcjl> list = tbChCqzdtgjcjlService.selectTbChCqzdtgjcjlList(tbChCqzdtgjcjl);
        ExcelUtil<TbChCqzdtgjcjl> util = new ExcelUtil<TbChCqzdtgjcjl>(TbChCqzdtgjcjl.class);
        return util.exportExcel(list, "cqzdtgjcjl");
    }

    /**
     * 新增产前诊断体格检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前诊断体格检查记录
     */
    @RequiresPermissions("cffs:cqzdtgjcjl:add")
    @Log(title = "产前诊断体格检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqzdtgjcjl tbChCqzdtgjcjl)
    {
        return toAjax(tbChCqzdtgjcjlService.insertTbChCqzdtgjcjl(tbChCqzdtgjcjl));
    }

    /**
     * 修改产前诊断体格检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqzdtgjcjl tbChCqzdtgjcjl = tbChCqzdtgjcjlService.selectTbChCqzdtgjcjlById(id);
        mmap.put("tbChCqzdtgjcjl", tbChCqzdtgjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前诊断体格检查记录
     */
    @RequiresPermissions("cffs:cqzdtgjcjl:edit")
    @Log(title = "产前诊断体格检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqzdtgjcjl tbChCqzdtgjcjl)
    {
        return toAjax(tbChCqzdtgjcjlService.updateTbChCqzdtgjcjl(tbChCqzdtgjcjl));
    }

    /**
     * 删除产前诊断体格检查记录
     */
    @RequiresPermissions("cffs:cqzdtgjcjl:remove")
    @Log(title = "产前诊断体格检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqzdtgjcjlService.deleteTbChCqzdtgjcjlByIds(ids));
    }
}
