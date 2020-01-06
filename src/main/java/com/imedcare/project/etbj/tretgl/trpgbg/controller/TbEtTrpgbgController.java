package com.imedcare.project.etbj.tretgl.trpgbg.controller;

import java.util.List;

import com.imedcare.project.etbj.tretgl.trpgbg.domain.TbEtTrpgbgVo;
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
import com.imedcare.project.etbj.tretgl.trpgbg.domain.TbEtTrpgbg;
import com.imedcare.project.etbj.tretgl.trpgbg.service.ITbEtTrpgbgService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 体弱儿童评估报告Controller
 * 
 * @author 黄维业
 * @date 2019-11-27
 */
@Controller
@RequestMapping("/tretgl/trpgbg")
public class TbEtTrpgbgController extends BaseController
{
    private String prefix = "etbj/tretgl/trpgbg";

    @Autowired
    private ITbEtTrpgbgService tbEtTrpgbgService;

    @RequiresPermissions("tretgl:trpgbg:view")
    @GetMapping()
    public String trpgbg()
    {
        return prefix + "/trpgbg";
    }

    @RequiresPermissions("tretgl:tretdj:view")
    @GetMapping("listdj")
    public String listdj()
    {
        return prefix + "/list";
    }
    /**
     * 查询体弱儿童评估报告列表
     */
    @RequiresPermissions("tretgl:trpgbg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTrpgbgVo tbEtTrpgbg)
    {
        startPage();
        List<TbEtTrpgbgVo> list = tbEtTrpgbgService.selectTbEtTrpgbgList(tbEtTrpgbg);
        return getDataTable(list);
    }

    /**
     * 导出体弱儿童评估报告列表
     */
    @RequiresPermissions("tretgl:trpgbg:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTrpgbgVo tbEtTrpgbg)
    {
        List<TbEtTrpgbgVo> list = tbEtTrpgbgService.selectTbEtTrpgbgList(tbEtTrpgbg);
        ExcelUtil<TbEtTrpgbgVo> util = new ExcelUtil<TbEtTrpgbgVo>(TbEtTrpgbgVo.class);
        return util.exportExcel(list, "trpgbg");
    }

    /**
     * 新增体弱儿童评估报告
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存体弱儿童评估报告
     */
    @RequiresPermissions("tretgl:trpgbg:add")
    @Log(title = "体弱儿童评估报告", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTrpgbg tbEtTrpgbg)
    {
        return toAjax(tbEtTrpgbgService.insertTbEtTrpgbg(tbEtTrpgbg));
    }

    /**
     * 修改体弱儿童评估报告
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtTrpgbgVo tbEtTrpgbg = tbEtTrpgbgService.selectTbEtTrpgbgById(id);
        mmap.put("tbEtTrpgbg", tbEtTrpgbg);
        return prefix + "/edit";
    }

    /**
     * 修改保存体弱儿童评估报告
     */
    @RequiresPermissions("tretgl:trpgbg:edit")
    @Log(title = "体弱儿童评估报告", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTrpgbg tbEtTrpgbg)
    {
        return toAjax(tbEtTrpgbgService.updateTbEtTrpgbg(tbEtTrpgbg));
    }

    /**
     * 删除体弱儿童评估报告
     */
    @RequiresPermissions("tretgl:trpgbg:remove")
    @Log(title = "体弱儿童评估报告", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtTrpgbgService.deleteTbEtTrpgbgByIds(ids));
    }
}
