package com.imedcare.project.etbj.xsejbsc.jbsczd.controller;

import java.util.List;

import com.imedcare.project.etbj.xsejbsc.jbsczd.domain.TbEtJbsczdVo;
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
import com.imedcare.project.etbj.xsejbsc.jbsczd.domain.TbEtJbsczd;
import com.imedcare.project.etbj.xsejbsc.jbsczd.service.ITbEtJbsczdService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 新生儿疾病筛查诊断记录Controller
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/xsejbsc/jbsczd")
public class TbEtJbsczdController extends BaseController
{
    private String prefix = "etbj/xsejbsc/jbsczd";

    @Autowired
    private ITbEtJbsczdService tbEtJbsczdService;

    @RequiresPermissions("xsejbsc:jbsczd:view")
    @GetMapping()
    public String jbsczd()
    {
        return prefix + "/jbsczd";
    }

    /**
     * 查询新生儿疾病筛查诊断记录列表
     */
    @RequiresPermissions("xsejbsc:jbsczd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtJbsczdVo tbEtJbsczd)
    {
        startPage();
        List<TbEtJbsczdVo> list = tbEtJbsczdService.selectTbEtJbsczdList(tbEtJbsczd);
        return getDataTable(list);
    }

    /**
     * 导出新生儿疾病筛查诊断记录列表
     */
    @RequiresPermissions("xsejbsc:jbsczd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtJbsczdVo tbEtJbsczd)
    {
        List<TbEtJbsczdVo> list = tbEtJbsczdService.selectTbEtJbsczdList(tbEtJbsczd);
        ExcelUtil<TbEtJbsczdVo> util = new ExcelUtil<TbEtJbsczdVo>(TbEtJbsczdVo.class);
        return util.exportExcel(list, "jbsczd");
    }

    /**
     * 新增新生儿疾病筛查诊断记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新生儿疾病筛查诊断记录
     */
    @RequiresPermissions("xsejbsc:jbsczd:add")
    @Log(title = "新生儿疾病筛查诊断记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtJbsczd tbEtJbsczd)
    {
        return toAjax(tbEtJbsczdService.insertTbEtJbsczd(tbEtJbsczd));
    }

    /**
     * 修改新生儿疾病筛查诊断记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtJbsczdVo tbEtJbsczd = tbEtJbsczdService.selectTbEtJbsczdById(id);
        mmap.put("tbEtJbsczd", tbEtJbsczd);
        return prefix + "/edit";
    }

    /**
     * 修改保存新生儿疾病筛查诊断记录
     */
    @RequiresPermissions("xsejbsc:jbsczd:edit")
    @Log(title = "新生儿疾病筛查诊断记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtJbsczd tbEtJbsczd)
    {
        return toAjax(tbEtJbsczdService.updateTbEtJbsczd(tbEtJbsczd));
    }

    /**
     * 删除新生儿疾病筛查诊断记录
     */
    @RequiresPermissions("xsejbsc:jbsczd:remove")
    @Log(title = "新生儿疾病筛查诊断记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtJbsczdService.deleteTbEtJbsczdByIds(ids));
    }
}
