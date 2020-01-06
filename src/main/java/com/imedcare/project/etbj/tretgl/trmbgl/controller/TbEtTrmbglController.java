package com.imedcare.project.etbj.tretgl.trmbgl.controller;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.etbj.tretgl.trwxjl.domain.TbEtTrwxjl;
import com.imedcare.project.etbj.tretgl.trwxjl.domain.TbEtTrwxjlVo;
import com.imedcare.project.etbj.tretgl.trwxjl.service.ITbEtTrwxjlService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description:
 * 模板管理
 *
 * @author daiminghang
 * @date 2020/1/4 23:52
 */
@Controller
@RequestMapping("/tretgl/trmbgl")
public class TbEtTrmbglController extends BaseController {
    private String prefix = "etbj/tretgl/trmbgl";

    @Autowired
    private ITbEtTrwxjlService tbEtTrwxjlService;

    @RequiresPermissions("tretgl:trmbgl:view")
    @GetMapping()
    public String trwxjl() {
        return prefix + "/trmbgl";
    }

    /**
     * 查询体弱儿童模板管理列表
     */
    @RequiresPermissions("tretgl:trmbgl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTrwxjlVo tbEtTrwxjl) {
        startPage();
        List<TbEtTrwxjlVo> list = tbEtTrwxjlService.selectTbEtTrwxjlList(tbEtTrwxjl);
        return getDataTable(list);
    }

    /**
     * 导出体弱儿童模板管理列表
     */
    @RequiresPermissions("tretgl:trmbgl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTrwxjlVo tbEtTrwxjl) {
        List<TbEtTrwxjlVo> list = tbEtTrwxjlService.selectTbEtTrwxjlList(tbEtTrwxjl);
        ExcelUtil<TbEtTrwxjlVo> util = new ExcelUtil<TbEtTrwxjlVo>(TbEtTrwxjlVo.class);
        return util.exportExcel(list, "trwxjl");
    }

    /**
     * 新增体弱儿童模板管理
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存体弱儿童模板管理
     */
    @RequiresPermissions("tretgl:trmbgl:add")
    @Log(title = "体弱儿童模板管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTrwxjl tbEtTrwxjl) {
        return toAjax(tbEtTrwxjlService.insertTbEtTrwxjl(tbEtTrwxjl));
    }

    /**
     * 修改体弱儿童模板管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        TbEtTrwxjlVo tbEtTrwxjl = tbEtTrwxjlService.selectTbEtTrwxjlById(id);
        mmap.put("tbEtTrwxjl", tbEtTrwxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存体弱儿童模板管理
     */
    @RequiresPermissions("tretgl:trmbgl:edit")
    @Log(title = "体弱儿童模板管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTrwxjl tbEtTrwxjl) {
        return toAjax(tbEtTrwxjlService.updateTbEtTrwxjl(tbEtTrwxjl));
    }

    /**
     * 删除体弱儿童模板管理
     */
    @RequiresPermissions("tretgl:trmbgl:remove")
    @Log(title = "体弱儿童模板管理", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tbEtTrwxjlService.deleteTbEtTrwxjlByIds(ids));
    }
}

