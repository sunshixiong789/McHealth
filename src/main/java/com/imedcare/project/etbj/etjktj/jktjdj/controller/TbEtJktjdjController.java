package com.imedcare.project.etbj.etjktj.jktjdj.controller;

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
import com.imedcare.project.etbj.etjktj.jktjdj.domain.TbEtJktjdj;
import com.imedcare.project.etbj.etjktj.jktjdj.service.ITbEtJktjdjService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 儿童健康体检登记Controller
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/etjktj/jktjdj")
public class TbEtJktjdjController extends BaseController
{
    private String prefix = "etbj/etjktj/jktjdj";

    @Autowired
    private ITbEtJktjdjService tbEtJktjdjService;

    @RequiresPermissions("etjktj:jktjdj:view")
    @GetMapping()
    public String jktjdj()
    {
        return prefix + "/jktjdj";
    }

    @RequiresPermissions("etjktj:jktjdj:view")
    @GetMapping("listdj")
    public String listdj()
    {
        return prefix + "/list";
    }

    /**
     * 查询儿童健康体检登记列表
     */
    @RequiresPermissions("etjktj:jktjdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtJktjdj tbEtJktjdj)
    {
        startPage();
        List<TbEtJktjdj> list = tbEtJktjdjService.selectTbEtJktjdjList(tbEtJktjdj);
        return getDataTable(list);
    }

    /**
     * 导出儿童健康体检登记列表
     */
    @RequiresPermissions("etjktj:jktjdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtJktjdj tbEtJktjdj)
    {
        List<TbEtJktjdj> list = tbEtJktjdjService.selectTbEtJktjdjList(tbEtJktjdj);
        ExcelUtil<TbEtJktjdj> util = new ExcelUtil<TbEtJktjdj>(TbEtJktjdj.class);
        return util.exportExcel(list, "jktjdj");
    }

    /**
     * 新增儿童健康体检登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存儿童健康体检登记
     */
    @RequiresPermissions("etjktj:jktjdj:add")
    @Log(title = "儿童健康体检登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtJktjdj tbEtJktjdj)
    {
        return toAjax(tbEtJktjdjService.insertTbEtJktjdj(tbEtJktjdj));
    }

    /**
     * 修改儿童健康体检登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtJktjdj tbEtJktjdj = tbEtJktjdjService.selectTbEtJktjdjById(id);
        mmap.put("tbEtJktjdj", tbEtJktjdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存儿童健康体检登记
     */
    @RequiresPermissions("etjktj:jktjdj:edit")
    @Log(title = "儿童健康体检登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtJktjdj tbEtJktjdj)
    {
        return toAjax(tbEtJktjdjService.updateTbEtJktjdj(tbEtJktjdj));
    }

    /**
     * 删除儿童健康体检登记
     */
    @RequiresPermissions("etjktj:jktjdj:remove")
    @Log(title = "儿童健康体检登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtJktjdjService.deleteTbEtJktjdjByIds(ids));
    }
}
