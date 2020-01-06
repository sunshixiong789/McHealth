package com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.controller;

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
import com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.domain.TbFbHqbjfwwxjl;
import com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.service.ITbFbHqbjfwwxjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 婚前保健服务问询记录Controller
 * 
 * @author imedcare
 * @date 2019-11-18
 */
@Controller
@RequestMapping("/hqbjfw/hqbjfwwxjl")
public class TbFbHqbjfwwxjlController extends BaseController
{
    private String prefix = "hqbjfw/hqbjfwwxjl";

    @Autowired
    private ITbFbHqbjfwwxjlService tbFbHqbjfwwxjlService;

    @RequiresPermissions("hqbjfw:hqbjfwwxjl:view")
    @GetMapping()
    public String hqbjfwwxjl()
    {
        return prefix + "/hqbjfwwxjl";
    }

    /**
     * 查询婚前保健服务问询记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwwxjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbHqbjfwwxjl tbFbHqbjfwwxjl)
    {
        startPage();
        List<TbFbHqbjfwwxjl> list = tbFbHqbjfwwxjlService.selectTbFbHqbjfwwxjlList(tbFbHqbjfwwxjl);
        return getDataTable(list);
    }

    /**
     * 导出婚前保健服务问询记录列表
     */
    @RequiresPermissions("hqbjfw:hqbjfwwxjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbHqbjfwwxjl tbFbHqbjfwwxjl)
    {
        List<TbFbHqbjfwwxjl> list = tbFbHqbjfwwxjlService.selectTbFbHqbjfwwxjlList(tbFbHqbjfwwxjl);
        ExcelUtil<TbFbHqbjfwwxjl> util = new ExcelUtil<TbFbHqbjfwwxjl>(TbFbHqbjfwwxjl.class);
        return util.exportExcel(list, "hqbjfwwxjl");
    }

    /**
     * 新增婚前保健服务问询记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存婚前保健服务问询记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwwxjl:add")
    @Log(title = "婚前保健服务问询记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbHqbjfwwxjl tbFbHqbjfwwxjl)
    {
        return toAjax(tbFbHqbjfwwxjlService.insertTbFbHqbjfwwxjl(tbFbHqbjfwwxjl));
    }

    /**
     * 修改婚前保健服务问询记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbHqbjfwwxjl tbFbHqbjfwwxjl = tbFbHqbjfwwxjlService.selectTbFbHqbjfwwxjlById(id);
        mmap.put("tbFbHqbjfwwxjl", tbFbHqbjfwwxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存婚前保健服务问询记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwwxjl:edit")
    @Log(title = "婚前保健服务问询记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbHqbjfwwxjl tbFbHqbjfwwxjl)
    {
        return toAjax(tbFbHqbjfwwxjlService.updateTbFbHqbjfwwxjl(tbFbHqbjfwwxjl));
    }

    /**
     * 删除婚前保健服务问询记录
     */
    @RequiresPermissions("hqbjfw:hqbjfwwxjl:remove")
    @Log(title = "婚前保健服务问询记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbHqbjfwwxjlService.deleteTbFbHqbjfwwxjlByIds(ids));
    }
}
