package com.imedcare.project.fnbj.gwycf.gwycfdj.controller;

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
import com.imedcare.project.fnbj.gwycf.gwycfdj.domain.TbChGwycfdj;
import com.imedcare.project.fnbj.gwycf.gwycfdj.service.ITbChGwycfdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 高危孕产妇登记Controller
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/cffs/gwycfdj")
public class TbChGwycfdjController extends BaseController
{
    private String prefix = "cffs/gwycfdj";

    @Autowired
    private ITbChGwycfdjService tbChGwycfdjService;

    @RequiresPermissions("cffs:gwycfdj:view")
    @GetMapping()
    public String gwycfdj()
    {
        return prefix + "/gwycfdj";
    }
    /**
     * 查询产妇访视登记调用
     */
    @RequiresPermissions("cffs:gwycfdj:view")
    @GetMapping("/list")
    public String getChjcdj()
    {
        return prefix+"/list";
    }
    /**
     * 查询高危孕产妇登记列表
     */
    @RequiresPermissions("cffs:gwycfdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChGwycfdj tbChGwycfdj)
    {
        startPage();
        List<TbChGwycfdj> list = tbChGwycfdjService.selectTbChGwycfdjList(tbChGwycfdj);
        return getDataTable(list);
    }

    /**
     * 导出高危孕产妇登记列表
     */
    @RequiresPermissions("cffs:gwycfdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChGwycfdj tbChGwycfdj)
    {
        List<TbChGwycfdj> list = tbChGwycfdjService.selectTbChGwycfdjList(tbChGwycfdj);
        ExcelUtil<TbChGwycfdj> util = new ExcelUtil<TbChGwycfdj>(TbChGwycfdj.class);
        return util.exportExcel(list, "gwycfdj");
    }

    /**
     * 新增高危孕产妇登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存高危孕产妇登记
     */
    @RequiresPermissions("cffs:gwycfdj:add")
    @Log(title = "高危孕产妇登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChGwycfdj tbChGwycfdj)
    {
        return toAjax(tbChGwycfdjService.insertTbChGwycfdj(tbChGwycfdj));
    }

    /**
     * 修改高危孕产妇登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChGwycfdj tbChGwycfdj = tbChGwycfdjService.selectTbChGwycfdjById(id);
        mmap.put("tbChGwycfdj", tbChGwycfdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存高危孕产妇登记
     */
    @RequiresPermissions("cffs:gwycfdj:edit")
    @Log(title = "高危孕产妇登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChGwycfdj tbChGwycfdj)
    {
        return toAjax(tbChGwycfdjService.updateTbChGwycfdj(tbChGwycfdj));
    }

    /**
     * 删除高危孕产妇登记
     */
    @RequiresPermissions("cffs:gwycfdj:remove")
    @Log(title = "高危孕产妇登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChGwycfdjService.deleteTbChGwycfdjByIds(ids));
    }
}
