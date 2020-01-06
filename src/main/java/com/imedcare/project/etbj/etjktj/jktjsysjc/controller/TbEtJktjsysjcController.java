package com.imedcare.project.etbj.etjktj.jktjsysjc.controller;

import java.util.List;

import com.imedcare.project.etbj.etjktj.jktjsysjc.domain.TbEtJktjsysjcVo;
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
import com.imedcare.project.etbj.etjktj.jktjsysjc.domain.TbEtJktjsysjc;
import com.imedcare.project.etbj.etjktj.jktjsysjc.service.ITbEtJktjsysjcService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 儿童健康体检实验室记录Controller
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Controller
@RequestMapping("/etjktj/jktjsysjc")
public class TbEtJktjsysjcController extends BaseController
{
    private String prefix = "etbj/etjktj/jktjsysjc";

    @Autowired
    private ITbEtJktjsysjcService tbEtJktjsysjcService;

    @RequiresPermissions("etjktj:jktjsysjc:view")
    @GetMapping()
    public String jktjsysjc()
    {
        return prefix + "/jktjsysjc";
    }

    /**
     * 查询儿童健康体检实验室记录列表
     */
    @RequiresPermissions("etjktj:jktjsysjc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtJktjsysjcVo tbEtJktjsysjc)
    {
        startPage();
        List<TbEtJktjsysjcVo> list = tbEtJktjsysjcService.selectTbEtJktjsysjcList(tbEtJktjsysjc);
        return getDataTable(list);
    }

    /**
     * 导出儿童健康体检实验室记录列表
     */
    @RequiresPermissions("etjktj:jktjsysjc:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtJktjsysjcVo tbEtJktjsysjc)
    {
        List<TbEtJktjsysjcVo> list = tbEtJktjsysjcService.selectTbEtJktjsysjcList(tbEtJktjsysjc);
        ExcelUtil<TbEtJktjsysjcVo> util = new ExcelUtil<TbEtJktjsysjcVo>(TbEtJktjsysjcVo.class);
        return util.exportExcel(list, "jktjsysjc");
    }

    /**
     * 新增儿童健康体检实验室记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存儿童健康体检实验室记录
     */
    @RequiresPermissions("etjktj:jktjsysjc:add")
    @Log(title = "儿童健康体检实验室记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtJktjsysjc tbEtJktjsysjc)
    {
        return toAjax(tbEtJktjsysjcService.insertTbEtJktjsysjc(tbEtJktjsysjc));
    }

    /**
     * 修改儿童健康体检实验室记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtJktjsysjcVo tbEtJktjsysjc = tbEtJktjsysjcService.selectTbEtJktjsysjcById(id);
        mmap.put("tbEtJktjsysjc", tbEtJktjsysjc);
        return prefix + "/edit";
    }

    /**
     * 修改保存儿童健康体检实验室记录
     */
    @RequiresPermissions("etjktj:jktjsysjc:edit")
    @Log(title = "儿童健康体检实验室记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtJktjsysjc tbEtJktjsysjc)
    {
        return toAjax(tbEtJktjsysjcService.updateTbEtJktjsysjc(tbEtJktjsysjc));
    }

    /**
     * 删除儿童健康体检实验室记录
     */
    @RequiresPermissions("etjktj:jktjsysjc:remove")
    @Log(title = "儿童健康体检实验室记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtJktjsysjcService.deleteTbEtJktjsysjcByIds(ids));
    }
}
