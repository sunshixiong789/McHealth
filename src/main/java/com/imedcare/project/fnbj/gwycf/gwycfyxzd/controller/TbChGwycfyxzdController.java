package com.imedcare.project.fnbj.gwycf.gwycfyxzd.controller;

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
import com.imedcare.project.fnbj.gwycf.gwycfyxzd.domain.TbChGwycfyxzd;
import com.imedcare.project.fnbj.gwycf.gwycfyxzd.service.ITbChGwycfyxzdService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 高危孕产妇医学指导Controller
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/cffs/gwycfyxzd")
public class TbChGwycfyxzdController extends BaseController
{
    private String prefix = "cffs/gwycfyxzd";

    @Autowired
    private ITbChGwycfyxzdService tbChGwycfyxzdService;

    @RequiresPermissions("cffs:gwycfyxzd:view")
    @GetMapping()
    public String gwycfyxzd()
    {
        return prefix + "/gwycfyxzd";
    }

    /**
     * 查询高危孕产妇医学指导列表
     */
    @RequiresPermissions("cffs:gwycfyxzd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChGwycfyxzd tbChGwycfyxzd)
    {
        startPage();
        List<TbChGwycfyxzd> list = tbChGwycfyxzdService.selectTbChGwycfyxzdList(tbChGwycfyxzd);
        return getDataTable(list);
    }

    /**
     * 导出高危孕产妇医学指导列表
     */
    @RequiresPermissions("cffs:gwycfyxzd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChGwycfyxzd tbChGwycfyxzd)
    {
        List<TbChGwycfyxzd> list = tbChGwycfyxzdService.selectTbChGwycfyxzdList(tbChGwycfyxzd);
        ExcelUtil<TbChGwycfyxzd> util = new ExcelUtil<TbChGwycfyxzd>(TbChGwycfyxzd.class);
        return util.exportExcel(list, "gwycfyxzd");
    }

    /**
     * 新增高危孕产妇医学指导
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高危孕产妇医学指导
     */
    @RequiresPermissions("cffs:gwycfyxzd:add")
    @Log(title = "高危孕产妇医学指导", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChGwycfyxzd tbChGwycfyxzd)
    {
        return toAjax(tbChGwycfyxzdService.insertTbChGwycfyxzd(tbChGwycfyxzd));
    }

    /**
     * 修改高危孕产妇医学指导
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChGwycfyxzd tbChGwycfyxzd = tbChGwycfyxzdService.selectTbChGwycfyxzdById(id);
        mmap.put("tbChGwycfyxzd", tbChGwycfyxzd);
        return prefix + "/edit";
    }

    /**
     * 修改保存高危孕产妇医学指导
     */
    @RequiresPermissions("cffs:gwycfyxzd:edit")
    @Log(title = "高危孕产妇医学指导", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChGwycfyxzd tbChGwycfyxzd)
    {
        return toAjax(tbChGwycfyxzdService.updateTbChGwycfyxzd(tbChGwycfyxzd));
    }

    /**
     * 删除高危孕产妇医学指导
     */
    @RequiresPermissions("cffs:gwycfyxzd:remove")
    @Log(title = "高危孕产妇医学指导", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChGwycfyxzdService.deleteTbChGwycfyxzdByIds(ids));
    }
}
