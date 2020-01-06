package com.imedcare.project.etbj.etjktj.zzdj.controller;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.etbj.etjktj.jktjsysjc.domain.TbEtJktjsysjc;
import com.imedcare.project.etbj.etjktj.jktjsysjc.domain.TbEtJktjsysjcVo;
import com.imedcare.project.etbj.etjktj.jktjsysjc.service.ITbEtJktjsysjcService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description:
 * 转诊登记controller
 *
 * @author daiminghang
 * @date 2020/1/4 20:58
 */
@Controller
@RequestMapping("/etjktj/zzdj")
public class TbEtZzdjController extends BaseController {
    private String prefix = "etbj/etjktj/zzdj";

    @Autowired
    private ITbEtJktjsysjcService tbEtJktjsysjcService;

    @RequiresPermissions("etjktj:zzdj:view")
    @GetMapping()
    public String jktjsysjc() {
        return prefix + "/zzdj";
    }

    /**
     * 查询转诊登记列表
     */
    @RequiresPermissions("etjktj:zzdj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtJktjsysjcVo tbEtJktjsysjc) {
        startPage();
        List<TbEtJktjsysjcVo> list = tbEtJktjsysjcService.selectTbEtJktjsysjcList(tbEtJktjsysjc);
        return getDataTable(list);
    }

    /**
     * 导出转诊登记列表
     */
    @RequiresPermissions("etjktj:zzdj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtJktjsysjcVo tbEtJktjsysjc) {
        List<TbEtJktjsysjcVo> list = tbEtJktjsysjcService.selectTbEtJktjsysjcList(tbEtJktjsysjc);
        ExcelUtil<TbEtJktjsysjcVo> util = new ExcelUtil<TbEtJktjsysjcVo>(TbEtJktjsysjcVo.class);
        return util.exportExcel(list, "jktjsysjc");
    }

    /**
     * 新增转诊登记
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存转诊登记
     */
    @RequiresPermissions("etjktj:zzdj:add")
    @Log(title = "转诊登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtJktjsysjc tbEtJktjsysjc) {
        return toAjax(tbEtJktjsysjcService.insertTbEtJktjsysjc(tbEtJktjsysjc));
    }

    /**
     * 修改转诊登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        TbEtJktjsysjcVo tbEtJktjsysjc = tbEtJktjsysjcService.selectTbEtJktjsysjcById(id);
        mmap.put("tbEtJktjsysjc", tbEtJktjsysjc);
        return prefix + "/edit";
    }

    /**
     * 修改保存转诊登记
     */
    @RequiresPermissions("etjktj:zzdj:edit")
    @Log(title = "转诊登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtJktjsysjc tbEtJktjsysjc) {
        return toAjax(tbEtJktjsysjcService.updateTbEtJktjsysjc(tbEtJktjsysjc));
    }

    /**
     * 删除转诊登记
     */
    @RequiresPermissions("etjktj:zzdj:remove")
    @Log(title = "转诊登记", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tbEtJktjsysjcService.deleteTbEtJktjsysjcByIds(ids));
    }
}

