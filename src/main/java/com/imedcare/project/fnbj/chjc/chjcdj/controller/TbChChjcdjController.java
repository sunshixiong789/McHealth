package com.imedcare.project.fnbj.chjc.chjcdj.controller;

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
import com.imedcare.project.fnbj.chjc.chjcdj.domain.TbChChjcdj;
import com.imedcare.project.fnbj.chjc.chjcdj.service.ITbChChjcdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产后42天检查登记Controller
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/cffs/chjcdj")
public class TbChChjcdjController extends BaseController
{
    private String prefix = "cffs/chjcdj";

    @Autowired
    private ITbChChjcdjService tbChChjcdjService;

    @RequiresPermissions("cffs:chjcdj:view")
    @GetMapping()
    public String chjcdj()
    {
        return prefix + "/chjcdj";
    }
    /**
     * 查询产妇访视登记调用
     */
    @RequiresPermissions("cffs:chjcdj:view")
    @GetMapping("/list")
    public String getChjcdj()
    {
        return prefix+"/list";
    }
    /**
     * 查询产后42天检查登记列表
     */
    @RequiresPermissions("cffs:chjcdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChChjcdj tbChChjcdj)
    {
        startPage();
        List<TbChChjcdj> list = tbChChjcdjService.selectTbChChjcdjList(tbChChjcdj);
        return getDataTable(list);
    }

    /**
     * 导出产后42天检查登记列表
     */
    @RequiresPermissions("cffs:chjcdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChChjcdj tbChChjcdj)
    {
        List<TbChChjcdj> list = tbChChjcdjService.selectTbChChjcdjList(tbChChjcdj);
        ExcelUtil<TbChChjcdj> util = new ExcelUtil<TbChChjcdj>(TbChChjcdj.class);
        return util.exportExcel(list, "chjcdj");
    }

    /**
     * 新增产后42天检查登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产后42天检查登记
     */
    @RequiresPermissions("cffs:chjcdj:add")
    @Log(title = "产后42天检查登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChChjcdj tbChChjcdj)
    {
        return toAjax(tbChChjcdjService.insertTbChChjcdj(tbChChjcdj));
    }

    /**
     * 修改产后42天检查登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChChjcdj tbChChjcdj = tbChChjcdjService.selectTbChChjcdjById(id);
        mmap.put("tbChChjcdj", tbChChjcdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存产后42天检查登记
     */
    @RequiresPermissions("cffs:chjcdj:edit")
    @Log(title = "产后42天检查登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChChjcdj tbChChjcdj)
    {
        return toAjax(tbChChjcdjService.updateTbChChjcdj(tbChChjcdj));
    }

    /**
     * 删除产后42天检查登记
     */
    @RequiresPermissions("cffs:chjcdj:remove")
    @Log(title = "产后42天检查登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChChjcdjService.deleteTbChChjcdjByIds(ids));
    }
}
