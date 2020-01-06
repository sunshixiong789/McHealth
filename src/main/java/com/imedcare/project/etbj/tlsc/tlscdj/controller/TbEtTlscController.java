package com.imedcare.project.etbj.tlsc.tlscdj.controller;

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
import com.imedcare.project.etbj.tlsc.tlscdj.domain.TbEtTlsc;
import com.imedcare.project.etbj.tlsc.tlscdj.service.ITbEtTlscService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 新生儿听力筛查Controller
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
@Controller
@RequestMapping("/tlsc/tlscdj")
public class TbEtTlscController extends BaseController
{
    private String prefix = "etbj/tlsc/tlscdj";

    @Autowired
    private ITbEtTlscService tbEtTlscService;

    @RequiresPermissions("tlsc:tlscdj:view")
    @GetMapping()
    public String tlscdj()
    {
        return prefix + "/tlscdj";
    }

    /**
     * 查询新生儿听力筛查列表
     */
    @RequiresPermissions("tlsc:tlscdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTlsc tbEtTlsc)
    {
        startPage();
        List<TbEtTlsc> list = tbEtTlscService.selectTbEtTlscList(tbEtTlsc);
        return getDataTable(list);
    }

    /**
     * 导出新生儿听力筛查列表
     */
    @RequiresPermissions("tlsc:tlscdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTlsc tbEtTlsc)
    {
        List<TbEtTlsc> list = tbEtTlscService.selectTbEtTlscList(tbEtTlsc);
        ExcelUtil<TbEtTlsc> util = new ExcelUtil<TbEtTlsc>(TbEtTlsc.class);
        return util.exportExcel(list, "tlscdj");
    }

    /**
     * 新增新生儿听力筛查
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新生儿听力筛查
     */
    @RequiresPermissions("tlsc:tlscdj:add")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTlsc tbEtTlsc)
    {
        return toAjax(tbEtTlscService.insertTbEtTlsc(tbEtTlsc));
    }

    /**
     * 修改新生儿听力筛查
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtTlsc tbEtTlsc = tbEtTlscService.selectTbEtTlscById(id);
        mmap.put("tbEtTlsc", tbEtTlsc);
        return prefix + "/edit";
    }

    /**
     * 修改保存新生儿听力筛查
     */
    @RequiresPermissions("tlsc:tlscdj:edit")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTlsc tbEtTlsc)
    {
        return toAjax(tbEtTlscService.updateTbEtTlsc(tbEtTlsc));
    }

    /**
     * 删除新生儿听力筛查
     */
    @RequiresPermissions("tlsc:tlscdj:remove")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtTlscService.deleteTbEtTlscByIds(ids));
    }
}
