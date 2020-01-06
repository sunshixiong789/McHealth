package com.imedcare.project.fnbj.cqzd.cqzdyxzd.controller;

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
import com.imedcare.project.fnbj.cqzd.cqzdyxzd.domain.TbChCqzdyxzd;
import com.imedcare.project.fnbj.cqzd.cqzdyxzd.service.ITbChCqzdyxzdService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前诊断医学指导Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqzdyxzd")
public class TbChCqzdyxzdController extends BaseController
{
    private String prefix = "cffs/cqzdyxzd";

    @Autowired
    private ITbChCqzdyxzdService tbChCqzdyxzdService;

    @RequiresPermissions("cffs:cqzdyxzd:view")
    @GetMapping()
    public String cqzdyxzd()
    {
        return prefix + "/cqzdyxzd";
    }

    /**
     * 查询产前诊断医学指导列表
     */
    @RequiresPermissions("cffs:cqzdyxzd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqzdyxzd tbChCqzdyxzd)
    {
        startPage();
        List<TbChCqzdyxzd> list = tbChCqzdyxzdService.selectTbChCqzdyxzdList(tbChCqzdyxzd);
        return getDataTable(list);
    }

    /**
     * 导出产前诊断医学指导列表
     */
    @RequiresPermissions("cffs:cqzdyxzd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqzdyxzd tbChCqzdyxzd)
    {
        List<TbChCqzdyxzd> list = tbChCqzdyxzdService.selectTbChCqzdyxzdList(tbChCqzdyxzd);
        ExcelUtil<TbChCqzdyxzd> util = new ExcelUtil<TbChCqzdyxzd>(TbChCqzdyxzd.class);
        return util.exportExcel(list, "cqzdyxzd");
    }

    /**
     * 新增产前诊断医学指导
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前诊断医学指导
     */
    @RequiresPermissions("cffs:cqzdyxzd:add")
    @Log(title = "产前诊断医学指导", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqzdyxzd tbChCqzdyxzd)
    {
        return toAjax(tbChCqzdyxzdService.insertTbChCqzdyxzd(tbChCqzdyxzd));
    }

    /**
     * 修改产前诊断医学指导
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqzdyxzd tbChCqzdyxzd = tbChCqzdyxzdService.selectTbChCqzdyxzdById(id);
        mmap.put("tbChCqzdyxzd", tbChCqzdyxzd);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前诊断医学指导
     */
    @RequiresPermissions("cffs:cqzdyxzd:edit")
    @Log(title = "产前诊断医学指导", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqzdyxzd tbChCqzdyxzd)
    {
        return toAjax(tbChCqzdyxzdService.updateTbChCqzdyxzd(tbChCqzdyxzd));
    }

    /**
     * 删除产前诊断医学指导
     */
    @RequiresPermissions("cffs:cqzdyxzd:remove")
    @Log(title = "产前诊断医学指导", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqzdyxzdService.deleteTbChCqzdyxzdByIds(ids));
    }
}
