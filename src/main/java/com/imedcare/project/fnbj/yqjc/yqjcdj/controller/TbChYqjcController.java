package com.imedcare.project.fnbj.yqjc.yqjcdj.controller;

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
import com.imedcare.project.fnbj.yqjc.yqjcdj.domain.TbChYqjc;
import com.imedcare.project.fnbj.yqjc.yqjcdj.service.ITbChYqjcService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 孕前优生健康检查Controller
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
@Controller
@RequestMapping("/yqjc/yqjcdj")
public class TbChYqjcController extends BaseController
{
    private String prefix = "yqjc/yqjcdj";

    @Autowired
    private ITbChYqjcService tbChYqjcService;

    @RequiresPermissions("yqjc:yqjcdj:view")
    @GetMapping()
    public String yqjcdj()
    {
        return prefix + "/yqjcdj";
    }

    /**
     * 查询孕前优生健康检查列表
     */
    @RequiresPermissions("yqjc:yqjcdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChYqjc tbChYqjc)
    {
        startPage();
        List<TbChYqjc> list = tbChYqjcService.selectTbChYqjcList(tbChYqjc);
        return getDataTable(list);
    }

    /**
     * 导出孕前优生健康检查列表
     */
    @RequiresPermissions("yqjc:yqjcdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChYqjc tbChYqjc)
    {
        List<TbChYqjc> list = tbChYqjcService.selectTbChYqjcList(tbChYqjc);
        ExcelUtil<TbChYqjc> util = new ExcelUtil<TbChYqjc>(TbChYqjc.class);
        return util.exportExcel(list, "yqjcdj");
    }

    /**
     * 新增孕前优生健康检查
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存孕前优生健康检查
     */
    @RequiresPermissions("yqjc:yqjcdj:add")
    @Log(title = "孕前优生健康检查", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChYqjc tbChYqjc)
    {
        return toAjax(tbChYqjcService.insertTbChYqjc(tbChYqjc));
    }

    /**
     * 修改孕前优生健康检查
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChYqjc tbChYqjc = tbChYqjcService.selectTbChYqjcById(id);
        mmap.put("tbChYqjc", tbChYqjc);
        return prefix + "/edit";
    }

    /**
     * 修改保存孕前优生健康检查
     */
    @RequiresPermissions("yqjc:yqjcdj:edit")
    @Log(title = "孕前优生健康检查", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChYqjc tbChYqjc)
    {
        return toAjax(tbChYqjcService.updateTbChYqjc(tbChYqjc));
    }

    /**
     * 删除孕前优生健康检查
     */
    @RequiresPermissions("yqjc:yqjcdj:remove")
    @Log(title = "孕前优生健康检查", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChYqjcService.deleteTbChYqjcByIds(ids));
    }
}
