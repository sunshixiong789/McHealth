package com.imedcare.project.etbj.etjktj.jktjpgbg.controller;

import java.util.List;

import com.imedcare.project.etbj.etjktj.jktjpgbg.domain.TbEtJktjpgbgVo;
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
import com.imedcare.project.etbj.etjktj.jktjpgbg.domain.TbEtJktjpgbg;
import com.imedcare.project.etbj.etjktj.jktjpgbg.service.ITbEtJktjpgbgService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 儿童健康体检评估报告Controller
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Controller
@RequestMapping("/etjktj/jktjpgbg")
public class TbEtJktjpgbgController extends BaseController
{
    private String prefix = "etbj/etjktj/jktjpgbg";

    @Autowired
    private ITbEtJktjpgbgService tbEtJktjpgbgService;

    @RequiresPermissions("etjktj:jktjpgbg:view")
    @GetMapping()
    public String jktjpgbg()
    {
        return prefix + "/jktjpgbg";
    }

    /**
     * 查询儿童健康体检评估报告列表
     */
    @RequiresPermissions("etjktj:jktjpgbg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtJktjpgbgVo tbEtJktjpgbg)
    {
        startPage();
        List<TbEtJktjpgbgVo> list = tbEtJktjpgbgService.selectTbEtJktjpgbgList(tbEtJktjpgbg);
        return getDataTable(list);
    }

    /**
     * 导出儿童健康体检评估报告列表
     */
    @RequiresPermissions("etjktj:jktjpgbg:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtJktjpgbgVo tbEtJktjpgbg)
    {
        List<TbEtJktjpgbgVo> list = tbEtJktjpgbgService.selectTbEtJktjpgbgList(tbEtJktjpgbg);
        ExcelUtil<TbEtJktjpgbgVo> util = new ExcelUtil<TbEtJktjpgbgVo>(TbEtJktjpgbgVo.class);
        return util.exportExcel(list, "jktjpgbg");
    }

    /**
     * 新增儿童健康体检评估报告
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存儿童健康体检评估报告
     */
    @RequiresPermissions("etjktj:jktjpgbg:add")
    @Log(title = "儿童健康体检评估报告", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtJktjpgbg tbEtJktjpgbg)
    {
        return toAjax(tbEtJktjpgbgService.insertTbEtJktjpgbg(tbEtJktjpgbg));
    }

    /**
     * 修改儿童健康体检评估报告
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtJktjpgbgVo tbEtJktjpgbg = tbEtJktjpgbgService.selectTbEtJktjpgbgById(id);
        mmap.put("tbEtJktjpgbg", tbEtJktjpgbg);
        return prefix + "/edit";
    }

    /**
     * 修改保存儿童健康体检评估报告
     */
    @RequiresPermissions("etjktj:jktjpgbg:edit")
    @Log(title = "儿童健康体检评估报告", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtJktjpgbg tbEtJktjpgbg)
    {
        return toAjax(tbEtJktjpgbgService.updateTbEtJktjpgbg(tbEtJktjpgbg));
    }

    /**
     * 删除儿童健康体检评估报告
     */
    @RequiresPermissions("etjktj:jktjpgbg:remove")
    @Log(title = "儿童健康体检评估报告", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtJktjpgbgService.deleteTbEtJktjpgbgByIds(ids));
    }
}
