package com.imedcare.project.fnbj.cffs.cffssfjl.controller;

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
import com.imedcare.project.fnbj.cffs.cffssfjl.domain.TbChCffssfjl;
import com.imedcare.project.fnbj.cffs.cffssfjl.service.ITbChCffssfjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产妇访视随访记录Controller
 * 
 * @author zsl
 * @date 2019-11-18
 */
@Controller
@RequestMapping("/cffs/cffssfjl")
public class TbChCffssfjlController extends BaseController
{
    private String prefix = "cffs/cffssfjl";

    @Autowired
    private ITbChCffssfjlService tbChCffssfjlService;

    @RequiresPermissions("cffs:cffssfjl:view")
    @GetMapping()
    public String cffssfjl()
    {
        return prefix + "/cffssfjl";
    }

    /**
     * 查询产妇访视随访记录列表
     */
    @RequiresPermissions("cffs:cffssfjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCffssfjl tbChCffssfjl)
    {
        startPage();
        List<TbChCffssfjl> list = tbChCffssfjlService.selectTbChCffssfjlList(tbChCffssfjl);
        return getDataTable(list);
    }

    /**
     * 导出产妇访视随访记录列表
     */
    @RequiresPermissions("cffs:cffssfjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCffssfjl tbChCffssfjl)
    {
        List<TbChCffssfjl> list = tbChCffssfjlService.selectTbChCffssfjlList(tbChCffssfjl);
        ExcelUtil<TbChCffssfjl> util = new ExcelUtil<TbChCffssfjl>(TbChCffssfjl.class);
        return util.exportExcel(list, "cffssfjl");
    }

    /**
     * 新增产妇访视随访记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产妇访视随访记录
     */
    @RequiresPermissions("cffs:cffssfjl:add")
    @Log(title = "产妇访视随访记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCffssfjl tbChCffssfjl)
    {
        return toAjax(tbChCffssfjlService.insertTbChCffssfjl(tbChCffssfjl));
    }

    /**
     * 修改产妇访视随访记录
     */
    @GetMapping("/edit/{chId}")
    public String edit(@PathVariable("chId") Long chId, ModelMap mmap)
    {
        TbChCffssfjl tbChCffssfjl = tbChCffssfjlService.selectTbChCffssfjlById(chId);
        mmap.put("tbChCffssfjl", tbChCffssfjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产妇访视随访记录
     */
    @RequiresPermissions("cffs:cffssfjl:edit")
    @Log(title = "产妇访视随访记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCffssfjl tbChCffssfjl)
    {
        return toAjax(tbChCffssfjlService.updateTbChCffssfjl(tbChCffssfjl));
    }

    /**
     * 删除产妇访视随访记录
     */
    @RequiresPermissions("cffs:cffssfjl:remove")
    @Log(title = "产妇访视随访记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCffssfjlService.deleteTbChCffssfjlByIds(ids));
    }
}
