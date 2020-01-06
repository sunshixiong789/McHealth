package com.imedcare.project.etbj.xsefs.xsefsdj.controller;

import java.util.Date;
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
import com.imedcare.project.etbj.xsefs.xsefsdj.domain.TbEtXsefsdj;
import com.imedcare.project.etbj.xsefs.xsefsdj.service.ITbEtXsefsdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 新生儿随访登记Controller
 * 
 * @author 黄维业
 * @date 2019-11-11
 */
@Controller
@RequestMapping("/xsesf/xsefsdj")
public class TbEtXsefsdjController extends BaseController
{
    private String prefix = "etbj/xsesf/xsefsdj";

    @Autowired
    private ITbEtXsefsdjService tbEtXsefsdjService;

    @RequiresPermissions("xsesf:xsefsdj:view")
    @GetMapping()
    public String xsefsdj()
    {
        return prefix + "/xsefsdj";
    }

    @RequiresPermissions("xsesf:xsefsdj:view")
    @GetMapping("/listfsdj")
    public String listfsdj()
    {
        return prefix + "/list.html";
    }



    /**
     * 查询新生儿随访登记列表
     */
    @RequiresPermissions("xsesf:xsefsdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtXsefsdj tbEtXsefsdj)
    {
        startPage();
        List<TbEtXsefsdj> list = tbEtXsefsdjService.selectTbEtXsefsdjList(tbEtXsefsdj);
        return getDataTable(list);
    }

    /**
     * 导出新生儿随访登记列表
     */
    @RequiresPermissions("xsesf:xsefsdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtXsefsdj tbEtXsefsdj)
    {
        List<TbEtXsefsdj> list = tbEtXsefsdjService.selectTbEtXsefsdjList(tbEtXsefsdj);
        ExcelUtil<TbEtXsefsdj> util = new ExcelUtil<TbEtXsefsdj>(TbEtXsefsdj.class);
        return util.exportExcel(list, "xsefsdj");
    }

    /**
     * 新增新生儿随访登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新生儿随访登记
     */
    @RequiresPermissions("xsesf:xsefsdj:add")
    @Log(title = "新生儿随访登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtXsefsdj tbEtXsefsdj)
    {
        tbEtXsefsdj.setDjrq(new Date());
        return toAjax(tbEtXsefsdjService.insertTbEtXsefsdj(tbEtXsefsdj));
    }

    /**
     * 修改新生儿随访登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtXsefsdj tbEtXsefsdj = tbEtXsefsdjService.selectTbEtXsefsdjById(id);
        mmap.put("tbEtXsefsdj", tbEtXsefsdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存新生儿随访登记
     */
    @RequiresPermissions("xsesf:xsefsdj:edit")
    @Log(title = "新生儿随访登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtXsefsdj tbEtXsefsdj)
    {
        return toAjax(tbEtXsefsdjService.updateTbEtXsefsdj(tbEtXsefsdj));
    }

    /**
     * 删除新生儿随访登记
     */
    @RequiresPermissions("xsesf:xsefsdj:remove")
    @Log(title = "新生儿随访登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtXsefsdjService.deleteTbEtXsefsdjByIds(ids));
    }
}
