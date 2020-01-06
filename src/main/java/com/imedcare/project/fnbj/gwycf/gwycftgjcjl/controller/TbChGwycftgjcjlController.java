package com.imedcare.project.fnbj.gwycf.gwycftgjcjl.controller;

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
import com.imedcare.project.fnbj.gwycf.gwycftgjcjl.domain.TbChGwycftgjcjl;
import com.imedcare.project.fnbj.gwycf.gwycftgjcjl.service.ITbChGwycftgjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 高危孕产妇体格检查记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/cffs/gwycftgjcjl")
public class TbChGwycftgjcjlController extends BaseController
{
    private String prefix = "cffs/gwycftgjcjl";

    @Autowired
    private ITbChGwycftgjcjlService tbChGwycftgjcjlService;

    @RequiresPermissions("cffs:gwycftgjcjl:view")
    @GetMapping()
    public String gwycftgjcjl()
    {
        return prefix + "/gwycftgjcjl";
    }

    /**
     * 查询高危孕产妇体格检查记录列表
     */
    @RequiresPermissions("cffs:gwycftgjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChGwycftgjcjl tbChGwycftgjcjl)
    {
        startPage();
        List<TbChGwycftgjcjl> list = tbChGwycftgjcjlService.selectTbChGwycftgjcjlList(tbChGwycftgjcjl);
        return getDataTable(list);
    }

    /**
     * 导出高危孕产妇体格检查记录列表
     */
    @RequiresPermissions("cffs:gwycftgjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChGwycftgjcjl tbChGwycftgjcjl)
    {
        List<TbChGwycftgjcjl> list = tbChGwycftgjcjlService.selectTbChGwycftgjcjlList(tbChGwycftgjcjl);
        ExcelUtil<TbChGwycftgjcjl> util = new ExcelUtil<TbChGwycftgjcjl>(TbChGwycftgjcjl.class);
        return util.exportExcel(list, "gwycftgjcjl");
    }

    /**
     * 新增高危孕产妇体格检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高危孕产妇体格检查记录
     */
    @RequiresPermissions("cffs:gwycftgjcjl:add")
    @Log(title = "高危孕产妇体格检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChGwycftgjcjl tbChGwycftgjcjl)
    {
        return toAjax(tbChGwycftgjcjlService.insertTbChGwycftgjcjl(tbChGwycftgjcjl));
    }

    /**
     * 修改高危孕产妇体格检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChGwycftgjcjl tbChGwycftgjcjl = tbChGwycftgjcjlService.selectTbChGwycftgjcjlById(id);
        mmap.put("tbChGwycftgjcjl", tbChGwycftgjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存高危孕产妇体格检查记录
     */
    @RequiresPermissions("cffs:gwycftgjcjl:edit")
    @Log(title = "高危孕产妇体格检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChGwycftgjcjl tbChGwycftgjcjl)
    {
        return toAjax(tbChGwycftgjcjlService.updateTbChGwycftgjcjl(tbChGwycftgjcjl));
    }

    /**
     * 删除高危孕产妇体格检查记录
     */
    @RequiresPermissions("cffs:gwycftgjcjl:remove")
    @Log(title = "高危孕产妇体格检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChGwycftgjcjlService.deleteTbChGwycftgjcjlByIds(ids));
    }
}
