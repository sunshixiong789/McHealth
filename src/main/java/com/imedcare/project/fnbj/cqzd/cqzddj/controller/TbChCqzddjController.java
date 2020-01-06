package com.imedcare.project.fnbj.cqzd.cqzddj.controller;

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
import com.imedcare.project.fnbj.cqzd.cqzddj.domain.TbChCqzddj;
import com.imedcare.project.fnbj.cqzd.cqzddj.service.ITbChCqzddjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前诊断登记Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqzddj")
public class TbChCqzddjController extends BaseController
{
    private String prefix = "cffs/cqzddj";

    @Autowired
    private ITbChCqzddjService tbChCqzddjService;

    @RequiresPermissions("cffs:cqzddj:view")
    @GetMapping()
    public String cqzddj()
    {
        return prefix + "/cqzddj";
    }
    /**
     * 查询产妇访视登记调用
     */
    @RequiresPermissions("cffs:cqzddj:view")
    @GetMapping("/list")
    public String getCqzddj()
    {
        return prefix+"/list";
    }
    /**
     * 查询产前诊断登记列表
     */
    @RequiresPermissions("cffs:cqzddj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqzddj tbChCqzddj)
    {
        startPage();
        List<TbChCqzddj> list = tbChCqzddjService.selectTbChCqzddjList(tbChCqzddj);
        return getDataTable(list);
    }

    /**
     * 导出产前诊断登记列表
     */
    @RequiresPermissions("cffs:cqzddj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqzddj tbChCqzddj)
    {
        List<TbChCqzddj> list = tbChCqzddjService.selectTbChCqzddjList(tbChCqzddj);
        ExcelUtil<TbChCqzddj> util = new ExcelUtil<TbChCqzddj>(TbChCqzddj.class);
        return util.exportExcel(list, "cqzddj");
    }

    /**
     * 新增产前诊断登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前诊断登记
     */
    @RequiresPermissions("cffs:cqzddj:add")
    @Log(title = "产前诊断登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqzddj tbChCqzddj)
    {
        return toAjax(tbChCqzddjService.insertTbChCqzddj(tbChCqzddj));
    }

    /**
     * 修改产前诊断登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqzddj tbChCqzddj = tbChCqzddjService.selectTbChCqzddjById(id);
        mmap.put("tbChCqzddj", tbChCqzddj);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前诊断登记
     */
    @RequiresPermissions("cffs:cqzddj:edit")
    @Log(title = "产前诊断登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqzddj tbChCqzddj)
    {
        return toAjax(tbChCqzddjService.updateTbChCqzddj(tbChCqzddj));
    }

    /**
     * 删除产前诊断登记
     */
    @RequiresPermissions("cffs:cqzddj:remove")
    @Log(title = "产前诊断登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqzddjService.deleteTbChCqzddjByIds(ids));
    }
}
