package com.imedcare.project.etbj.xsefs.xsefsjl.controller;

import java.util.List;

import com.imedcare.project.etbj.xsefs.xsefsjl.domain.TbEtXsefsjlVo;
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
import com.imedcare.project.etbj.xsefs.xsefsjl.domain.TbEtXsefsjl;
import com.imedcare.project.etbj.xsefs.xsefsjl.service.ITbEtXsefsjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 新生儿访视记录Controller
 * 
 * @author 黄维业
 * @date 2019-11-12
 */
@Controller
@RequestMapping("/xsesf/xsefsjl")
public class TbEtXsefsjlController extends BaseController
{
    private String prefix = "etbj/xsesf/xsefsjl";

    @Autowired
    private ITbEtXsefsjlService tbEtXsefsjlService;

    @RequiresPermissions("xsesf:xsefsjl:view")
    @GetMapping()
    public String xsefsjl()
    {
        return prefix + "/xsefsjl";
    }

    /**
     * 查询新生儿访视记录列表
     */
    @RequiresPermissions("xsesf:xsefsjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtXsefsjlVo tbEtXsefsjl)
    {
        startPage();
        List<TbEtXsefsjlVo> list = tbEtXsefsjlService.selectTbEtXsefsjlList(tbEtXsefsjl);
        return getDataTable(list);
    }

    /**
     * 导出新生儿访视记录列表
     */
    @RequiresPermissions("xsesf:xsefsjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtXsefsjlVo tbEtXsefsjl)
    {
        List<TbEtXsefsjlVo> list = tbEtXsefsjlService.selectTbEtXsefsjlList(tbEtXsefsjl);
        ExcelUtil<TbEtXsefsjlVo> util = new ExcelUtil<TbEtXsefsjlVo>(TbEtXsefsjlVo.class);
        return util.exportExcel(list, "xsefsjl");
    }

    /**
     * 新增新生儿访视记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新生儿访视记录
     */
    @RequiresPermissions("xsesf:xsefsjl:add")
    @Log(title = "新生儿访视记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtXsefsjl tbEtXsefsjl)
    {
        return toAjax(tbEtXsefsjlService.insertTbEtXsefsjl(tbEtXsefsjl));
    }

    /**
     * 修改新生儿访视记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtXsefsjlVo tbEtXsefsjlVo = tbEtXsefsjlService.selectTbEtXsefsjlById(id);
        mmap.put("tbEtXsefsjl", tbEtXsefsjlVo);
        return prefix + "/edit";
    }

    /**
     * 修改保存新生儿访视记录
     */
    @RequiresPermissions("xsesf:xsefsjl:edit")
    @Log(title = "新生儿访视记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtXsefsjl tbEtXsefsjl)
    {
        return toAjax(tbEtXsefsjlService.updateTbEtXsefsjl(tbEtXsefsjl));
    }

    /**
     * 删除新生儿访视记录
     */
    @RequiresPermissions("xsesf:xsefsjl:remove")
    @Log(title = "新生儿访视记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtXsefsjlService.deleteTbEtXsefsjlByIds(ids));
    }
}
