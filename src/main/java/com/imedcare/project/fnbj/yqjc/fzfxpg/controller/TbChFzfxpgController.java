package com.imedcare.project.fnbj.yqjc.fzfxpg.controller;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.fnbj.yqjc.yqjcdj.domain.TbChYqjc;
import com.imedcare.project.fnbj.yqjc.yqjcdj.service.ITbChYqjcService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description:
 * 辅助风险评估
 *
 * @author daiminghang
 * @date 2020/1/5 8:29
 */
@Controller
@RequestMapping("/yqjc/fzfxpg")
public class TbChFzfxpgController extends BaseController {
    private String prefix = "yqjc/fzfxpg";

    @Autowired
    private ITbChYqjcService tbChYqjcService;

    @RequiresPermissions("yqjc:fzfxpg:view")
    @GetMapping()
    public String yqjcdj() {
        return prefix + "/fzfxpg";
    }

    /**
     * 查询辅助风险评估列表
     */
    @RequiresPermissions("yqjc:fzfxpg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChYqjc tbChYqjc) {
        startPage();
        List<TbChYqjc> list = tbChYqjcService.selectTbChYqjcList(tbChYqjc);
        return getDataTable(list);
    }

    /**
     * 导出辅助风险评估列表
     */
    @RequiresPermissions("yqjc:fzfxpg:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChYqjc tbChYqjc) {
        List<TbChYqjc> list = tbChYqjcService.selectTbChYqjcList(tbChYqjc);
        ExcelUtil<TbChYqjc> util = new ExcelUtil<TbChYqjc>(TbChYqjc.class);
        return util.exportExcel(list, "fzfxpg");
    }

    /**
     * 新增辅助风险评估
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存辅助风险评估
     */
    @RequiresPermissions("yqjc:fzfxpg:add")
    @Log(title = "辅助风险评估", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChYqjc tbChYqjc) {
        return toAjax(tbChYqjcService.insertTbChYqjc(tbChYqjc));
    }

    /**
     * 修改辅助风险评估
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        TbChYqjc tbChYqjc = tbChYqjcService.selectTbChYqjcById(id);
        mmap.put("tbChYqjc", tbChYqjc);
        return prefix + "/edit";
    }

    /**
     * 修改保存辅助风险评估
     */
    @RequiresPermissions("yqjc:fzfxpg:edit")
    @Log(title = "辅助风险评估", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChYqjc tbChYqjc) {
        return toAjax(tbChYqjcService.updateTbChYqjc(tbChYqjc));
    }

    /**
     * 删除辅助风险评估
     */
    @RequiresPermissions("yqjc:fzfxpg:remove")
    @Log(title = "辅助风险评估", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(tbChYqjcService.deleteTbChYqjcByIds(ids));
    }
}
