package com.imedcare.project.fnbj.chjc.chyxzd.controller;

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
import com.imedcare.project.fnbj.chjc.chyxzd.domain.TbChChyxzd;
import com.imedcare.project.fnbj.chjc.chyxzd.service.ITbChChyxzdService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产后42天医学指导Controller
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/cffs/chyxzd")
public class TbChChyxzdController extends BaseController
{
    private String prefix = "cffs/chyxzd";

    @Autowired
    private ITbChChyxzdService tbChChyxzdService;

    @RequiresPermissions("cffs:chyxzd:view")
    @GetMapping()
    public String chyxzd()
    {
        return prefix + "/chyxzd";
    }

    /**
     * 查询产后42天医学指导列表
     */
    @RequiresPermissions("cffs:chyxzd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChChyxzd tbChChyxzd)
    {
        startPage();
        List<TbChChyxzd> list = tbChChyxzdService.selectTbChChyxzdList(tbChChyxzd);
        return getDataTable(list);
    }

    /**
     * 导出产后42天医学指导列表
     */
    @RequiresPermissions("cffs:chyxzd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChChyxzd tbChChyxzd)
    {
        List<TbChChyxzd> list = tbChChyxzdService.selectTbChChyxzdList(tbChChyxzd);
        ExcelUtil<TbChChyxzd> util = new ExcelUtil<TbChChyxzd>(TbChChyxzd.class);
        return util.exportExcel(list, "chyxzd");
    }

    /**
     * 新增产后42天医学指导
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产后42天医学指导
     */
    @RequiresPermissions("cffs:chyxzd:add")
    @Log(title = "产后42天医学指导", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChChyxzd tbChChyxzd)
    {
        return toAjax(tbChChyxzdService.insertTbChChyxzd(tbChChyxzd));
    }

    /**
     * 修改产后42天医学指导
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChChyxzd tbChChyxzd = tbChChyxzdService.selectTbChChyxzdById(id);
        mmap.put("tbChChyxzd", tbChChyxzd);
        return prefix + "/edit";
    }

    /**
     * 修改保存产后42天医学指导
     */
    @RequiresPermissions("cffs:chyxzd:edit")
    @Log(title = "产后42天医学指导", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChChyxzd tbChChyxzd)
    {
        return toAjax(tbChChyxzdService.updateTbChChyxzd(tbChChyxzd));
    }

    /**
     * 删除产后42天医学指导
     */
    @RequiresPermissions("cffs:chyxzd:remove")
    @Log(title = "产后42天医学指导", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChChyxzdService.deleteTbChChyxzdByIds(ids));
    }
}
