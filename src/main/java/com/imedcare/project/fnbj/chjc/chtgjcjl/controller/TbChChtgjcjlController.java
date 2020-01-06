package com.imedcare.project.fnbj.chjc.chtgjcjl.controller;

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
import com.imedcare.project.fnbj.chjc.chtgjcjl.domain.TbChChtgjcjl;
import com.imedcare.project.fnbj.chjc.chtgjcjl.service.ITbChChtgjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产后42天体格检查记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/cffs/chtgjcjl")
public class TbChChtgjcjlController extends BaseController
{
    private String prefix = "cffs/chtgjcjl";

    @Autowired
    private ITbChChtgjcjlService tbChChtgjcjlService;

    @RequiresPermissions("cffs:chtgjcjl:view")
    @GetMapping()
    public String chtgjcjl()
    {
        return prefix + "/chtgjcjl";
    }

    /**
     * 查询产后42天体格检查记录列表
     */
    @RequiresPermissions("cffs:chtgjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChChtgjcjl tbChChtgjcjl)
    {
        startPage();
        List<TbChChtgjcjl> list = tbChChtgjcjlService.selectTbChChtgjcjlList(tbChChtgjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产后42天体格检查记录列表
     */
    @RequiresPermissions("cffs:chtgjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChChtgjcjl tbChChtgjcjl)
    {
        List<TbChChtgjcjl> list = tbChChtgjcjlService.selectTbChChtgjcjlList(tbChChtgjcjl);
        ExcelUtil<TbChChtgjcjl> util = new ExcelUtil<TbChChtgjcjl>(TbChChtgjcjl.class);
        return util.exportExcel(list, "chtgjcjl");
    }

    /**
     * 新增产后42天体格检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产后42天体格检查记录
     */
    @RequiresPermissions("cffs:chtgjcjl:add")
    @Log(title = "产后42天体格检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChChtgjcjl tbChChtgjcjl)
    {
        return toAjax(tbChChtgjcjlService.insertTbChChtgjcjl(tbChChtgjcjl));
    }

    /**
     * 修改产后42天体格检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChChtgjcjl tbChChtgjcjl = tbChChtgjcjlService.selectTbChChtgjcjlById(id);
        mmap.put("tbChChtgjcjl", tbChChtgjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产后42天体格检查记录
     */
    @RequiresPermissions("cffs:chtgjcjl:edit")
    @Log(title = "产后42天体格检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChChtgjcjl tbChChtgjcjl)
    {
        return toAjax(tbChChtgjcjlService.updateTbChChtgjcjl(tbChChtgjcjl));
    }

    /**
     * 删除产后42天体格检查记录
     */
    @RequiresPermissions("cffs:chtgjcjl:remove")
    @Log(title = "产后42天体格检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChChtgjcjlService.deleteTbChChtgjcjlByIds(ids));
    }
}
