package com.imedcare.project.etbj.xsejbsc.sysjyjl.controller;

import java.util.List;

import com.imedcare.project.etbj.xsejbsc.sysjyjl.domain.TbEtSysjyjlVo;
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
import com.imedcare.project.etbj.xsejbsc.sysjyjl.domain.TbEtSysjyjl;
import com.imedcare.project.etbj.xsejbsc.sysjyjl.service.ITbEtSysjyjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 新生儿疾病筛查实验室检查记录Controller
 * 
 * @author 黄维业
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/xsejbsc/sysjyjl")
public class TbEtSysjyjlController extends BaseController
{
    private String prefix = "etbj/xsejbsc/sysjyjl";

    @Autowired
    private ITbEtSysjyjlService tbEtSysjyjlService;

    @RequiresPermissions("xsejbsc:sysjyjl:view")
    @GetMapping()
    public String sysjyjl()
    {
        return prefix + "/sysjyjl";
    }

    @RequiresPermissions("xsejbsc:sysjyjl:view")
    @GetMapping("listsysjl")
    public String listsysjl()
    {
        return prefix + "/list";
    }

    /**
     * 查询新生儿疾病筛查实验室检查记录列表
     */
    @RequiresPermissions("xsejbsc:sysjyjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtSysjyjl tbEtSysjyjl)
    {
        startPage();
        List<TbEtSysjyjlVo> list = tbEtSysjyjlService.selectTbEtSysjyjlList(tbEtSysjyjl);
        return getDataTable(list);
    }

    /**
     * 导出新生儿疾病筛查实验室检查记录列表
     */
    @RequiresPermissions("xsejbsc:sysjyjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtSysjyjl tbEtSysjyjl)
    {
        List<TbEtSysjyjlVo> list = tbEtSysjyjlService.selectTbEtSysjyjlList(tbEtSysjyjl);
        ExcelUtil<TbEtSysjyjlVo> util = new ExcelUtil<TbEtSysjyjlVo>(TbEtSysjyjlVo.class);
        return util.exportExcel(list, "sysjyjl");
    }

    /**
     * 新增新生儿疾病筛查实验室检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新生儿疾病筛查实验室检查记录
     */
    @RequiresPermissions("xsejbsc:sysjyjl:add")
    @Log(title = "新生儿疾病筛查实验室检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtSysjyjl tbEtSysjyjl)
    {
        return toAjax(tbEtSysjyjlService.insertTbEtSysjyjl(tbEtSysjyjl));
    }

    /**
     * 修改新生儿疾病筛查实验室检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtSysjyjlVo tbEtSysjyjl = tbEtSysjyjlService.selectTbEtSysjyjlById(id);
        mmap.put("tbEtSysjyjl", tbEtSysjyjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存新生儿疾病筛查实验室检查记录
     */
    @RequiresPermissions("xsejbsc:sysjyjl:edit")
    @Log(title = "新生儿疾病筛查实验室检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtSysjyjl tbEtSysjyjl)
    {
        return toAjax(tbEtSysjyjlService.updateTbEtSysjyjl(tbEtSysjyjl));
    }

    /**
     * 删除新生儿疾病筛查实验室检查记录
     */
    @RequiresPermissions("xsejbsc:sysjyjl:remove")
    @Log(title = "新生儿疾病筛查实验室检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtSysjyjlService.deleteTbEtSysjyjlByIds(ids));
    }

}
