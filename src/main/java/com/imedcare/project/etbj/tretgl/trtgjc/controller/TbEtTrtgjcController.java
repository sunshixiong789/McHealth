package com.imedcare.project.etbj.tretgl.trtgjc.controller;

import java.util.List;

import com.imedcare.project.etbj.tretgl.trtgjc.domain.TbEtTrtgjcVo;
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
import com.imedcare.project.etbj.tretgl.trtgjc.domain.TbEtTrtgjc;
import com.imedcare.project.etbj.tretgl.trtgjc.service.ITbEtTrtgjcService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 体弱儿童体格检查记录Controller
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Controller
@RequestMapping("/tretgl/trtgjc")
public class TbEtTrtgjcController extends BaseController
{
    private String prefix = "etbj/tretgl/trtgjc";

    @Autowired
    private ITbEtTrtgjcService tbEtTrtgjcService;

    @RequiresPermissions("tretgl:trtgjc:view")
    @GetMapping()
    public String trtgjc()
    {
        return prefix + "/trtgjc";
    }

    /**
     * 查询体弱儿童体格检查记录列表
     */
    @RequiresPermissions("tretgl:trtgjc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtTrtgjcVo tbEtTrtgjc)
    {
        startPage();
        List<TbEtTrtgjcVo> list = tbEtTrtgjcService.selectTbEtTrtgjcList(tbEtTrtgjc);
        return getDataTable(list);
    }

    /**
     * 导出体弱儿童体格检查记录列表
     */
    @RequiresPermissions("tretgl:trtgjc:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtTrtgjcVo tbEtTrtgjc)
    {
        List<TbEtTrtgjcVo> list = tbEtTrtgjcService.selectTbEtTrtgjcList(tbEtTrtgjc);
        ExcelUtil<TbEtTrtgjcVo> util = new ExcelUtil<TbEtTrtgjcVo>(TbEtTrtgjcVo.class);
        return util.exportExcel(list, "trtgjc");
    }

    /**
     * 新增体弱儿童体格检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存体弱儿童体格检查记录
     */
    @RequiresPermissions("tretgl:trtgjc:add")
    @Log(title = "体弱儿童体格检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtTrtgjc tbEtTrtgjc)
    {
        return toAjax(tbEtTrtgjcService.insertTbEtTrtgjc(tbEtTrtgjc));
    }

    /**
     * 修改体弱儿童体格检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtTrtgjcVo tbEtTrtgjc = tbEtTrtgjcService.selectTbEtTrtgjcById(id);
        mmap.put("tbEtTrtgjc", tbEtTrtgjc);
        return prefix + "/edit";
    }

    /**
     * 修改保存体弱儿童体格检查记录
     */
    @RequiresPermissions("tretgl:trtgjc:edit")
    @Log(title = "体弱儿童体格检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtTrtgjc tbEtTrtgjc)
    {
        return toAjax(tbEtTrtgjcService.updateTbEtTrtgjc(tbEtTrtgjc));
    }

    /**
     * 删除体弱儿童体格检查记录
     */
    @RequiresPermissions("tretgl:trtgjc:remove")
    @Log(title = "体弱儿童体格检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtTrtgjcService.deleteTbEtTrtgjcByIds(ids));
    }
}
