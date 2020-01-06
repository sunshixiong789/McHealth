package com.imedcare.project.fnbj.gwycf.gwycfpgbg.controller;

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
import com.imedcare.project.fnbj.gwycf.gwycfpgbg.domain.TbChGwycfpgbg;
import com.imedcare.project.fnbj.gwycf.gwycfpgbg.service.ITbChGwycfpgbgService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 高危孕产妇评估报告Controller
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/cffs/gwycfpgbg")
public class TbChGwycfpgbgController extends BaseController
{
    private String prefix = "cffs/gwycfpgbg";

    @Autowired
    private ITbChGwycfpgbgService tbChGwycfpgbgService;

    @RequiresPermissions("cffs:gwycfpgbg:view")
    @GetMapping()
    public String gwycfpgbg()
    {
        return prefix + "/gwycfpgbg";
    }

    /**
     * 查询高危孕产妇评估报告列表
     */
    @RequiresPermissions("cffs:gwycfpgbg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChGwycfpgbg tbChGwycfpgbg)
    {
        startPage();
        List<TbChGwycfpgbg> list = tbChGwycfpgbgService.selectTbChGwycfpgbgList(tbChGwycfpgbg);
        return getDataTable(list);
    }

    /**
     * 导出高危孕产妇评估报告列表
     */
    @RequiresPermissions("cffs:gwycfpgbg:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChGwycfpgbg tbChGwycfpgbg)
    {
        List<TbChGwycfpgbg> list = tbChGwycfpgbgService.selectTbChGwycfpgbgList(tbChGwycfpgbg);
        ExcelUtil<TbChGwycfpgbg> util = new ExcelUtil<TbChGwycfpgbg>(TbChGwycfpgbg.class);
        return util.exportExcel(list, "gwycfpgbg");
    }

    /**
     * 新增高危孕产妇评估报告
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高危孕产妇评估报告
     */
    @RequiresPermissions("cffs:gwycfpgbg:add")
    @Log(title = "高危孕产妇评估报告", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChGwycfpgbg tbChGwycfpgbg)
    {
        return toAjax(tbChGwycfpgbgService.insertTbChGwycfpgbg(tbChGwycfpgbg));
    }

    /**
     * 修改高危孕产妇评估报告
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChGwycfpgbg tbChGwycfpgbg = tbChGwycfpgbgService.selectTbChGwycfpgbgById(id);
        mmap.put("tbChGwycfpgbg", tbChGwycfpgbg);
        return prefix + "/edit";
    }

    /**
     * 修改保存高危孕产妇评估报告
     */
    @RequiresPermissions("cffs:gwycfpgbg:edit")
    @Log(title = "高危孕产妇评估报告", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChGwycfpgbg tbChGwycfpgbg)
    {
        return toAjax(tbChGwycfpgbgService.updateTbChGwycfpgbg(tbChGwycfpgbg));
    }

    /**
     * 删除高危孕产妇评估报告
     */
    @RequiresPermissions("cffs:gwycfpgbg:remove")
    @Log(title = "高危孕产妇评估报告", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChGwycfpgbgService.deleteTbChGwycfpgbgByIds(ids));
    }
}
