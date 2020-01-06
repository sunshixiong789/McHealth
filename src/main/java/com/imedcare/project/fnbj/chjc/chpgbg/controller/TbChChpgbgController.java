package com.imedcare.project.fnbj.chjc.chpgbg.controller;

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
import com.imedcare.project.fnbj.chjc.chpgbg.domain.TbChChpgbg;
import com.imedcare.project.fnbj.chjc.chpgbg.service.ITbChChpgbgService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产后42天评估报告（孕产妇保健管理结案）Controller
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/cffs/chpgbg")
public class TbChChpgbgController extends BaseController
{
    private String prefix = "cffs/chpgbg";

    @Autowired
    private ITbChChpgbgService tbChChpgbgService;

    @RequiresPermissions("cffs:chpgbg:view")
    @GetMapping()
    public String chpgbg()
    {
        return prefix + "/chpgbg";
    }

    /**
     * 查询产后42天评估报告（孕产妇保健管理结案）列表
     */
    @RequiresPermissions("cffs:chpgbg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChChpgbg tbChChpgbg)
    {
        startPage();
        List<TbChChpgbg> list = tbChChpgbgService.selectTbChChpgbgList(tbChChpgbg);
        return getDataTable(list);
    }

    /**
     * 导出产后42天评估报告（孕产妇保健管理结案）列表
     */
    @RequiresPermissions("cffs:chpgbg:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChChpgbg tbChChpgbg)
    {
        List<TbChChpgbg> list = tbChChpgbgService.selectTbChChpgbgList(tbChChpgbg);
        ExcelUtil<TbChChpgbg> util = new ExcelUtil<TbChChpgbg>(TbChChpgbg.class);
        return util.exportExcel(list, "chpgbg");
    }

    /**
     * 新增产后42天评估报告（孕产妇保健管理结案）
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产后42天评估报告（孕产妇保健管理结案）
     */
    @RequiresPermissions("cffs:chpgbg:add")
    @Log(title = "产后42天评估报告（孕产妇保健管理结案）", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChChpgbg tbChChpgbg)
    {
        return toAjax(tbChChpgbgService.insertTbChChpgbg(tbChChpgbg));
    }

    /**
     * 修改产后42天评估报告（孕产妇保健管理结案）
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChChpgbg tbChChpgbg = tbChChpgbgService.selectTbChChpgbgById(id);
        mmap.put("tbChChpgbg", tbChChpgbg);
        return prefix + "/edit";
    }

    /**
     * 修改保存产后42天评估报告（孕产妇保健管理结案）
     */
    @RequiresPermissions("cffs:chpgbg:edit")
    @Log(title = "产后42天评估报告（孕产妇保健管理结案）", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChChpgbg tbChChpgbg)
    {
        return toAjax(tbChChpgbgService.updateTbChChpgbg(tbChChpgbg));
    }

    /**
     * 删除产后42天评估报告（孕产妇保健管理结案）
     */
    @RequiresPermissions("cffs:chpgbg:remove")
    @Log(title = "产后42天评估报告（孕产妇保健管理结案）", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChChpgbgService.deleteTbChChpgbgByIds(ids));
    }
}
