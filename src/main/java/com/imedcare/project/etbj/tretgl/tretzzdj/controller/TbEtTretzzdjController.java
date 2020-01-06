package com.imedcare.project.etbj.tretgl.tretzzdj.controller;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.etbj.tretgl.tretdj.domain.TbEtTretdj;
import com.imedcare.project.etbj.tretgl.tretdj.service.TbIEtTretdjService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description:
 * 体弱儿童转诊登记
 *
 * @author daiminghang
 * @date 2020/1/4 23:24
 */
@Controller
@RequestMapping("/tretgl/tretzzdj")
public class TbEtTretzzdjController extends BaseController {
    private String prefix = "etbj/tretgl/tretzzdj";

    @Autowired
    private TbIEtTretdjService etTretdjService;

    @RequiresPermissions("tretgl:tretzzdj:view")
    @GetMapping()
    public String tretdj() {
        return prefix + "/tretzzdj";
    }

    @RequiresPermissions("tretgl:tretzzdj:view")
    @GetMapping("listdj")
    public String listdj() {
        return prefix + "/list";
    }

    /**
     * 查询体弱儿童转诊登记列表
     */
    @RequiresPermissions("tretgl:tretzzdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTretdj tbEtTretdj) {
        startPage();
        List<TbEtTretdj> list = etTretdjService.selectEtTretdjList(tbEtTretdj);
        return getDataTable(list);
    }

    /**
     * 导出体弱儿童转诊登记列表
     */
    @RequiresPermissions("tretgl:tretzzdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTretdj tbEtTretdj) {
        List<TbEtTretdj> list = etTretdjService.selectEtTretdjList(tbEtTretdj);
        ExcelUtil<TbEtTretdj> util = new ExcelUtil<TbEtTretdj>(TbEtTretdj.class);
        return util.exportExcel(list, "tretdj");
    }

    /**
     * 新增体弱儿童转诊登记
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存体弱儿童转诊登记
     */
    @RequiresPermissions("tretgl:tretzzdj:add")
    @Log(title = "体弱儿童转诊登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTretdj tbEtTretdj) {
        return toAjax(etTretdjService.insertEtTretdj(tbEtTretdj));
    }

    /**
     * 修改体弱儿童转诊登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        TbEtTretdj tbEtTretdj = etTretdjService.selectEtTretdjById(id);
        mmap.put("tbEtTretdj", tbEtTretdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存体弱儿童转诊登记
     */
    @RequiresPermissions("tretgl:tretzzdj:edit")
    @Log(title = "体弱儿童转诊登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTretdj tbEtTretdj) {
        return toAjax(etTretdjService.updateEtTretdj(tbEtTretdj));
    }

    /**
     * 删除体弱儿童转诊登记
     */
    @RequiresPermissions("tretgl:tretzzdj:remove")
    @Log(title = "体弱儿童转诊登记", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(etTretdjService.deleteEtTretdjByIds(ids));
    }
}

