package com.imedcare.project.etbj.tlsc.zlysf.controller;

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
 * 治疗与随访controller
 *
 * @author daiminghang
 * @date 2020/1/4 17:59
 */
@Controller
@RequestMapping("/tlsc/zlysf")
public class TbEtZlysfController extends BaseController {
    private String prefix = "etbj/tlsc/zlysf";

    @Autowired
    private ITbEtTlscService tbEtTlscService;

    @RequiresPermissions("tlsc:zlysf:view")
    @GetMapping()
    public String tlscdj() {
        return prefix + "/zlysf";
    }

    /**
     * 查询治疗与随访列表
     */
    @RequiresPermissions("tlsc:zlysf:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTlsc tbEtTlsc) {
        startPage();
        List<TbEtTlsc> list = tbEtTlscService.selectTbEtTlscList(tbEtTlsc);
        return getDataTable(list);
    }

    /**
     * 导出治疗与随访列表
     */
    @RequiresPermissions("tlsc:zlysf:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTlsc tbEtTlsc) {
        List<TbEtTlsc> list = tbEtTlscService.selectTbEtTlscList(tbEtTlsc);
        ExcelUtil<TbEtTlsc> util = new ExcelUtil<TbEtTlsc>(TbEtTlsc.class);
        return util.exportExcel(list, "tlscdj");
    }

    /**
     * 新增治疗与随访
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增治疗与随访筛查
     */
    @RequiresPermissions("tlsc:zlysf:add")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTlsc tbEtTlsc) {
        return toAjax(tbEtTlscService.insertTbEtTlsc(tbEtTlsc));
    }

    /**
     * 修改治疗与随访
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        TbEtTlsc tbEtTlsc = tbEtTlscService.selectTbEtTlscById(id);
        mmap.put("tbEtTlsc", tbEtTlsc);
        return prefix + "/edit";
    }

    /**
     * 修改治疗与随访
     */
    @RequiresPermissions("tlsc:zlysf:edit")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTlsc tbEtTlsc) {
        return toAjax(tbEtTlscService.updateTbEtTlsc(tbEtTlsc));
    }

    /**
     * 删除治疗与随访
     */
    @RequiresPermissions("tlsc:zlysf:remove")
    @Log(title = "新生儿听力筛查", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tbEtTlscService.deleteTbEtTlscByIds(ids));
    }
}
