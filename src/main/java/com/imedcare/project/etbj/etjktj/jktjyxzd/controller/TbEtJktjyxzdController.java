package com.imedcare.project.etbj.etjktj.jktjyxzd.controller;

import java.util.List;

import com.imedcare.project.etbj.etjktj.jktjyxzd.domain.TbEtJktjyxzdVo;
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
import com.imedcare.project.etbj.etjktj.jktjyxzd.domain.TbEtJktjyxzd;
import com.imedcare.project.etbj.etjktj.jktjyxzd.service.ITbEtJktjyxzdService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 儿童健康体检医学指导Controller
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Controller
@RequestMapping("/etjktj/jktjyxzd")
public class TbEtJktjyxzdController extends BaseController
{
    private String prefix = "etbj/etjktj/jktjyxzd";

    @Autowired
    private ITbEtJktjyxzdService tbEtJktjyxzdService;

    @RequiresPermissions("etjktj:jktjyxzd:view")
    @GetMapping()
    public String jktjyxzd()
    {
        return prefix + "/jktjyxzd";
    }

    /**
     * 查询儿童健康体检医学指导列表
     */
    @RequiresPermissions("etjktj:jktjyxzd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtJktjyxzdVo tbEtJktjyxzd)
    {
        startPage();
        List<TbEtJktjyxzdVo> list = tbEtJktjyxzdService.selectTbEtJktjyxzdList(tbEtJktjyxzd);
        return getDataTable(list);
    }

    /**
     * 导出儿童健康体检医学指导列表
     */
    @RequiresPermissions("etjktj:jktjyxzd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtJktjyxzdVo tbEtJktjyxzd)
    {
        List<TbEtJktjyxzdVo> list = tbEtJktjyxzdService.selectTbEtJktjyxzdList(tbEtJktjyxzd);
        ExcelUtil<TbEtJktjyxzdVo> util = new ExcelUtil<TbEtJktjyxzdVo>(TbEtJktjyxzdVo.class);
        return util.exportExcel(list, "jktjyxzd");
    }

    /**
     * 新增儿童健康体检医学指导
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存儿童健康体检医学指导
     */
    @RequiresPermissions("etjktj:jktjyxzd:add")
    @Log(title = "儿童健康体检医学指导", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtJktjyxzd tbEtJktjyxzd)
    {
        return toAjax(tbEtJktjyxzdService.insertTbEtJktjyxzd(tbEtJktjyxzd));
    }

    /**
     * 修改儿童健康体检医学指导
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtJktjyxzdVo tbEtJktjyxzd = tbEtJktjyxzdService.selectTbEtJktjyxzdById(id);
        mmap.put("tbEtJktjyxzd", tbEtJktjyxzd);
        return prefix + "/edit";
    }

    /**
     * 修改保存儿童健康体检医学指导
     */
    @RequiresPermissions("etjktj:jktjyxzd:edit")
    @Log(title = "儿童健康体检医学指导", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtJktjyxzd tbEtJktjyxzd)
    {
        return toAjax(tbEtJktjyxzdService.updateTbEtJktjyxzd(tbEtJktjyxzd));
    }

    /**
     * 删除儿童健康体检医学指导
     */
    @RequiresPermissions("etjktj:jktjyxzd:remove")
    @Log(title = "儿童健康体检医学指导", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtJktjyxzdService.deleteTbEtJktjyxzdByIds(ids));
    }
}
