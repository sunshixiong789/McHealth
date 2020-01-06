package com.imedcare.project.fnbj.gwycf.gwycfwxjl.controller;

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
import com.imedcare.project.fnbj.gwycf.gwycfwxjl.domain.TbChGwycfwxjl;
import com.imedcare.project.fnbj.gwycf.gwycfwxjl.service.ITbChGwycfwxjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 高危孕产妇问询记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/cffs/gwycfwxjl")
public class TbChGwycfwxjlController extends BaseController
{
    private String prefix = "cffs/gwycfwxjl";

    @Autowired
    private ITbChGwycfwxjlService tbChGwycfwxjlService;

    @RequiresPermissions("cffs:gwycfwxjl:view")
    @GetMapping()
    public String gwycfwxjl()
    {
        return prefix + "/gwycfwxjl";
    }

    /**
     * 查询高危孕产妇问询记录列表
     */
    @RequiresPermissions("cffs:gwycfwxjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChGwycfwxjl tbChGwycfwxjl)
    {
        startPage();
        List<TbChGwycfwxjl> list = tbChGwycfwxjlService.selectTbChGwycfwxjlList(tbChGwycfwxjl);
        return getDataTable(list);
    }

    /**
     * 导出高危孕产妇问询记录列表
     */
    @RequiresPermissions("cffs:gwycfwxjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChGwycfwxjl tbChGwycfwxjl)
    {
        List<TbChGwycfwxjl> list = tbChGwycfwxjlService.selectTbChGwycfwxjlList(tbChGwycfwxjl);
        ExcelUtil<TbChGwycfwxjl> util = new ExcelUtil<TbChGwycfwxjl>(TbChGwycfwxjl.class);
        return util.exportExcel(list, "gwycfwxjl");
    }

    /**
     * 新增高危孕产妇问询记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高危孕产妇问询记录
     */
    @RequiresPermissions("cffs:gwycfwxjl:add")
    @Log(title = "高危孕产妇问询记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChGwycfwxjl tbChGwycfwxjl)
    {
        return toAjax(tbChGwycfwxjlService.insertTbChGwycfwxjl(tbChGwycfwxjl));
    }

    /**
     * 修改高危孕产妇问询记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChGwycfwxjl tbChGwycfwxjl = tbChGwycfwxjlService.selectTbChGwycfwxjlById(id);
        mmap.put("tbChGwycfwxjl", tbChGwycfwxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存高危孕产妇问询记录
     */
    @RequiresPermissions("cffs:gwycfwxjl:edit")
    @Log(title = "高危孕产妇问询记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChGwycfwxjl tbChGwycfwxjl)
    {
        return toAjax(tbChGwycfwxjlService.updateTbChGwycfwxjl(tbChGwycfwxjl));
    }

    /**
     * 删除高危孕产妇问询记录
     */
    @RequiresPermissions("cffs:gwycfwxjl:remove")
    @Log(title = "高危孕产妇问询记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChGwycfwxjlService.deleteTbChGwycfwxjlByIds(ids));
    }
}
