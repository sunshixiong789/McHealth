package com.imedcare.project.fnbj.cqsc.cqscdj.controller;

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
import com.imedcare.project.fnbj.cqsc.cqscdj.domain.TbChCqscdj;
import com.imedcare.project.fnbj.cqsc.cqscdj.service.ITbChCqscdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前筛查登记Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqscdj")
public class TbChCqscdjController extends BaseController
{
    private String prefix = "cffs/cqscdj";

    @Autowired
    private ITbChCqscdjService tbChCqscdjService;

    @RequiresPermissions("cffs:cqscdj:view")
    @GetMapping()
    public String cqscdj()
    {
        return prefix + "/cqscdj";
    }

    /**
     * 查询产前筛查登记列表
     */
    @RequiresPermissions("cffs:cqscdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqscdj tbChCqscdj)
    {
        startPage();
        List<TbChCqscdj> list = tbChCqscdjService.selectTbChCqscdjList(tbChCqscdj);
        return getDataTable(list);
    }
    /**
     * 查询产妇访视登记调用
     */
    @RequiresPermissions("cffs:cqscdj:view")
    @GetMapping("/list")
    public String getCqscdj()
    {
        return prefix+"/list";
    }
    /**
     * 导出产前筛查登记列表
     */
    @RequiresPermissions("cffs:cqscdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqscdj tbChCqscdj)
    {
        List<TbChCqscdj> list = tbChCqscdjService.selectTbChCqscdjList(tbChCqscdj);
        ExcelUtil<TbChCqscdj> util = new ExcelUtil<TbChCqscdj>(TbChCqscdj.class);
        return util.exportExcel(list, "cqscdj");
    }

    /**
     * 新增产前筛查登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前筛查登记
     */
    @RequiresPermissions("cffs:cqscdj:add")
    @Log(title = "产前筛查登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqscdj tbChCqscdj)
    {
        return toAjax(tbChCqscdjService.insertTbChCqscdj(tbChCqscdj));
    }

    /**
     * 修改产前筛查登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqscdj tbChCqscdj = tbChCqscdjService.selectTbChCqscdjById(id);
        mmap.put("tbChCqscdj", tbChCqscdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前筛查登记
     */
    @RequiresPermissions("cffs:cqscdj:edit")
    @Log(title = "产前筛查登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqscdj tbChCqscdj)
    {
        return toAjax(tbChCqscdjService.updateTbChCqscdj(tbChCqscdj));
    }

    /**
     * 删除产前筛查登记
     */
    @RequiresPermissions("cffs:cqscdj:remove")
    @Log(title = "产前筛查登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqscdjService.deleteTbChCqscdjByIds(ids));
    }
}
