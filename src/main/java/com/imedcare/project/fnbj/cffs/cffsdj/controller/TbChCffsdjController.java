package com.imedcare.project.fnbj.cffs.cffsdj.controller;

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
import com.imedcare.project.fnbj.cffs.cffsdj.domain.TbChCffsdj;
import com.imedcare.project.fnbj.cffs.cffsdj.service.ITbChCffsdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产妇访视登记Controller
 * 
 * @author zsl
 * @date 2019-11-15
 */
@Controller
@RequestMapping("/cffs/cffsdj")
public class TbChCffsdjController extends BaseController
{
    private String prefix = "cffs/cffsdj";

    @Autowired
    private ITbChCffsdjService tbChCffsdjService;

    @RequiresPermissions("cffs:cffsdj:view")
    @GetMapping()
    public String cffsdj()
    {
        return prefix + "/cffsdj";
    }
    /**
     * 查询产妇访视登记调用
     */
    @RequiresPermissions("cffs:cffsdj:view")
    @GetMapping("/list")
    public String getCffsdj()
    {
        return prefix+"/list";
    }

    /**
     * 查询产妇访视登记列表
     */
    @RequiresPermissions("cffs:cffsdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCffsdj tbChCffsdj)
    {
        startPage();
        List<TbChCffsdj> list = tbChCffsdjService.selectTbChCffsdjList(tbChCffsdj);
        return getDataTable(list);
    }

    /**
     * 导出产妇访视登记列表
     */
    @RequiresPermissions("cffs:cffsdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCffsdj tbChCffsdj)
    {
        List<TbChCffsdj> list = tbChCffsdjService.selectTbChCffsdjList(tbChCffsdj);
        ExcelUtil<TbChCffsdj> util = new ExcelUtil<TbChCffsdj>(TbChCffsdj.class);
        return util.exportExcel(list, "cffsdj");
    }

    /**
     * 新增产妇访视登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产妇访视登记
     */
    @RequiresPermissions("cffs:cffsdj:add")
    @Log(title = "产妇访视登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCffsdj tbChCffsdj)
    {
        return toAjax(tbChCffsdjService.insertTbChCffsdj(tbChCffsdj));
    }

    /**
     * 修改产妇访视登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCffsdj tbChCffsdj = tbChCffsdjService.selectTbChCffsdjById(id);
        mmap.put("tbChCffsdj", tbChCffsdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存产妇访视登记
     */
    @RequiresPermissions("cffs:cffsdj:edit")
    @Log(title = "产妇访视登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCffsdj tbChCffsdj)
    {
        return toAjax(tbChCffsdjService.updateTbChCffsdj(tbChCffsdj));
    }

    /**
     * 删除产妇访视登记
     */
    @RequiresPermissions("cffs:cffsdj:remove")
    @Log(title = "产妇访视登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCffsdjService.deleteTbChCffsdjByIds(ids));
    }
}
