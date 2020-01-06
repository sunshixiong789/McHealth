package com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.controller;

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
import com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.domain.TbFbHqbjfwtgjcjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.service.ITbFbHqbjfwtgjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 婚前保健服务体格检查记录Controller
 * 
 * @author liuyang
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/hqbjfw/hqbjfwtgjcjl")
public class TbFbHqbjfwtgjcjlController extends BaseController
{
    private String prefix = "hqbjfw/hqbjfwtgjcjl";

    @Autowired
    private ITbFbHqbjfwtgjcjlService tbFbHqbjfwtgjcjlService;

    @RequiresPermissions("hqbjfw:hqbjfwtgjcjl:view")
    @GetMapping()
    public String hqbjfwtgjcjl()
    {
        return prefix + "/hqbjfwtgjcjl";
    }

    /**
     * 查询婚前保健服务体格检查记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwtgjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl)
    {
        startPage();
        List<TbFbHqbjfwtgjcjl> list = tbFbHqbjfwtgjcjlService.selectTbFbHqbjfwtgjcjlList(tbFbHqbjfwtgjcjl);
        return getDataTable(list);
    }

    /**
     * 导出婚前保健服务体格检查记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwtgjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl)
    {
        List<TbFbHqbjfwtgjcjl> list = tbFbHqbjfwtgjcjlService.selectTbFbHqbjfwtgjcjlList(tbFbHqbjfwtgjcjl);
        ExcelUtil<TbFbHqbjfwtgjcjl> util = new ExcelUtil<TbFbHqbjfwtgjcjl>(TbFbHqbjfwtgjcjl.class);
        return util.exportExcel(list, "hqbjfwtgjcjl");
    }

    /**
     * 新增婚前保健服务体格检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存婚前保健服务体格检查记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwtgjcjl:add")
    @Log(title = "婚前保健服务体格检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl)
    {
        return toAjax(tbFbHqbjfwtgjcjlService.insertTbFbHqbjfwtgjcjl(tbFbHqbjfwtgjcjl));
    }

    /**
     * 修改婚前保健服务体格检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl = tbFbHqbjfwtgjcjlService.selectTbFbHqbjfwtgjcjlById(id);
        mmap.put("tbFbHqbjfwtgjcjl", tbFbHqbjfwtgjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存婚前保健服务体格检查记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwtgjcjl:edit")
    @Log(title = "婚前保健服务体格检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbHqbjfwtgjcjl tbFbHqbjfwtgjcjl)
    {
        return toAjax(tbFbHqbjfwtgjcjlService.updateTbFbHqbjfwtgjcjl(tbFbHqbjfwtgjcjl));
    }

    /**
     * 删除婚前保健服务体格检查记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwtgjcjl:remove")
    @Log(title = "婚前保健服务体格检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbHqbjfwtgjcjlService.deleteTbFbHqbjfwtgjcjlByIds(ids));
    }
}
