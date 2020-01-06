package com.imedcare.project.fnbj.cqzd.cqzdzdjl.controller;

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
import com.imedcare.project.fnbj.cqzd.cqzdzdjl.domain.TbChCqzdzdjl;
import com.imedcare.project.fnbj.cqzd.cqzdzdjl.service.ITbChCqzdzdjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前诊断诊断记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqzdzdjl")
public class TbChCqzdzdjlController extends BaseController
{
    private String prefix = "cffs/cqzdzdjl";

    @Autowired
    private ITbChCqzdzdjlService tbChCqzdzdjlService;

    @RequiresPermissions("cffs:cqzdzdjl:view")
    @GetMapping()
    public String cqzdzdjl()
    {
        return prefix + "/cqzdzdjl";
    }

    /**
     * 查询产前诊断诊断记录列表
     */
    @RequiresPermissions("cffs:cqzdzdjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqzdzdjl tbChCqzdzdjl)
    {
        startPage();
        List<TbChCqzdzdjl> list = tbChCqzdzdjlService.selectTbChCqzdzdjlList(tbChCqzdzdjl);
        return getDataTable(list);
    }

    /**
     * 导出产前诊断诊断记录列表
     */
    @RequiresPermissions("cffs:cqzdzdjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqzdzdjl tbChCqzdzdjl)
    {
        List<TbChCqzdzdjl> list = tbChCqzdzdjlService.selectTbChCqzdzdjlList(tbChCqzdzdjl);
        ExcelUtil<TbChCqzdzdjl> util = new ExcelUtil<TbChCqzdzdjl>(TbChCqzdzdjl.class);
        return util.exportExcel(list, "cqzdzdjl");
    }

    /**
     * 新增产前诊断诊断记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前诊断诊断记录
     */
    @RequiresPermissions("cffs:cqzdzdjl:add")
    @Log(title = "产前诊断诊断记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqzdzdjl tbChCqzdzdjl)
    {
        return toAjax(tbChCqzdzdjlService.insertTbChCqzdzdjl(tbChCqzdzdjl));
    }

    /**
     * 修改产前诊断诊断记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqzdzdjl tbChCqzdzdjl = tbChCqzdzdjlService.selectTbChCqzdzdjlById(id);
        mmap.put("tbChCqzdzdjl", tbChCqzdzdjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前诊断诊断记录
     */
    @RequiresPermissions("cffs:cqzdzdjl:edit")
    @Log(title = "产前诊断诊断记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqzdzdjl tbChCqzdzdjl)
    {
        return toAjax(tbChCqzdzdjlService.updateTbChCqzdzdjl(tbChCqzdzdjl));
    }

    /**
     * 删除产前诊断诊断记录
     */
    @RequiresPermissions("cffs:cqzdzdjl:remove")
    @Log(title = "产前诊断诊断记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqzdzdjlService.deleteTbChCqzdzdjlByIds(ids));
    }
}
