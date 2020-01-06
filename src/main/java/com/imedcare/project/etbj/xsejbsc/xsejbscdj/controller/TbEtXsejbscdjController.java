package com.imedcare.project.etbj.xsejbsc.xsejbscdj.controller;

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
import com.imedcare.project.etbj.xsejbsc.xsejbscdj.domain.TbEtXsejbscdj;
import com.imedcare.project.etbj.xsejbsc.xsejbscdj.service.ITbEtXsejbscdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 新生儿疾病筛查登记Controller
 * 
 * @author 黄维业
 * @date 2019-11-19
 */
@Controller
@RequestMapping("/xsejbsc/xsejbscdj")
public class TbEtXsejbscdjController extends BaseController
{
    private String prefix = "etbj/xsejbsc/xsejbscdj";

    @Autowired
    private ITbEtXsejbscdjService tbEtXsejbscdjService;

    @RequiresPermissions("xsejbsc:xsejbscdj:view")
    @GetMapping()
    public String xsejbscdj()
    {
        return prefix + "/xsejbscdj";
    }

    @RequiresPermissions("xsejbsc:xsejbscdj:view")
    @GetMapping("listscdj")
    public String listscdj()
    {
        return prefix + "/list";
    }

    /**
     * 查询新生儿疾病筛查登记列表
     */
    @RequiresPermissions("xsejbsc:xsejbscdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtXsejbscdj tbEtXsejbscdj)
    {
        startPage();
        List<TbEtXsejbscdj> list = tbEtXsejbscdjService.selectTbEtXsejbscdjList(tbEtXsejbscdj);
        return getDataTable(list);
    }

    /**
     * 导出新生儿疾病筛查登记列表
     */
    @RequiresPermissions("xsejbsc:xsejbscdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtXsejbscdj tbEtXsejbscdj)
    {
        List<TbEtXsejbscdj> list = tbEtXsejbscdjService.selectTbEtXsejbscdjList(tbEtXsejbscdj);
        ExcelUtil<TbEtXsejbscdj> util = new ExcelUtil<TbEtXsejbscdj>(TbEtXsejbscdj.class);
        return util.exportExcel(list, "xsejbscdj");
    }

    /**
     * 新增新生儿疾病筛查登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新生儿疾病筛查登记
     */
    @RequiresPermissions("xsejbsc:xsejbscdj:add")
    @Log(title = "新生儿疾病筛查登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtXsejbscdj tbEtXsejbscdj)
    {
        return toAjax(tbEtXsejbscdjService.insertTbEtXsejbscdj(tbEtXsejbscdj));
    }

    /**
     * 修改新生儿疾病筛查登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtXsejbscdj tbEtXsejbscdj = tbEtXsejbscdjService.selectTbEtXsejbscdjById(id);
        mmap.put("tbEtXsejbscdj", tbEtXsejbscdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存新生儿疾病筛查登记
     */
    @RequiresPermissions("xsejbsc:xsejbscdj:edit")
    @Log(title = "新生儿疾病筛查登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtXsejbscdj tbEtXsejbscdj)
    {
        return toAjax(tbEtXsejbscdjService.updateTbEtXsejbscdj(tbEtXsejbscdj));
    }

    /**
     * 删除新生儿疾病筛查登记
     */
    @RequiresPermissions("xsejbsc:xsejbscdj:remove")
    @Log(title = "新生儿疾病筛查登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtXsejbscdjService.deleteTbEtXsejbscdjByIds(ids));
    }
}
