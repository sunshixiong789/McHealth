package com.imedcare.project.etbj.tlsc.kfgl.controller;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.etbj.tlsc.tlscdj.domain.TbEtTlsc;
import com.imedcare.project.etbj.tlsc.tlscdj.service.ITbEtTlscService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description:
 *
 * @author daiminghang
 * @date 2020/1/4 20:38
 */
@Controller
@RequestMapping("/tlsc/kfgl")
public class TbEtKfglController extends BaseController {
    private String prefix = "etbj/tlsc/kfgl";

    @Autowired
    private ITbEtTlscService tbEtTlscService;

    @RequiresPermissions("tlsc:kfgl:view")
    @GetMapping()
    public String tlscdj() {
        return prefix + "/kfgl";
    }

    /**
     * 查询康复管理列表
     */
    @RequiresPermissions("tlsc:kfgl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTlsc tbEtTlsc) {
        startPage();
        List<TbEtTlsc> list = tbEtTlscService.selectTbEtTlscList(tbEtTlsc);
        return getDataTable(list);
    }

    /**
     * 导出康复管理列表
     */
    @RequiresPermissions("tlsc:kfgl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTlsc tbEtTlsc) {
        List<TbEtTlsc> list = tbEtTlscService.selectTbEtTlscList(tbEtTlsc);
        ExcelUtil<TbEtTlsc> util = new ExcelUtil<TbEtTlsc>(TbEtTlsc.class);
        return util.exportExcel(list, "tlscdj");
    }

    /**
     * 新增康复管理
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增康复管理筛查
     */
    @RequiresPermissions("tlsc:kfgl:add")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTlsc tbEtTlsc) {
        return toAjax(tbEtTlscService.insertTbEtTlsc(tbEtTlsc));
    }

    /**
     * 修改康复管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        TbEtTlsc tbEtTlsc = tbEtTlscService.selectTbEtTlscById(id);
        mmap.put("tbEtTlsc", tbEtTlsc);
        return prefix + "/edit";
    }

    /**
     * 修改康复管理
     */
    @RequiresPermissions("tlsc:kfgl:edit")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTlsc tbEtTlsc) {
        return toAjax(tbEtTlscService.updateTbEtTlsc(tbEtTlsc));
    }

    /**
     * 删除康复管理
     */
    @RequiresPermissions("tlsc:kfgl:remove")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tbEtTlscService.deleteTbEtTlscByIds(ids));
    }
}
