package com.imedcare.project.fnbj.hqbjfw.hqzxzd.controller;

import java.util.List;
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
import com.imedcare.project.fnbj.hqbjfw.hqzxzd.domain.TbFbHqzxzd;
import com.imedcare.project.fnbj.hqbjfw.hqzxzd.service.ITbFbHqzxzdService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 婚前卫生咨询和指导Controller
 * 
 * @author liuyang
 * @date 2019-11-20
 */
@Controller
@RequestMapping("/hqbjfw/hqzxzd")
public class TbFbHqzxzdController extends BaseController
{
    private String prefix = "hqbjfw/hqzxzd";

    @Autowired
    private ITbFbHqzxzdService tbFbHqzxzdService;

    @RequiresPermissions("hqbjfw:hqzxzd:view")
    @GetMapping()
    public String hqzxzd()
    {
        return prefix + "/hqzxzd";
    }

    /**
     * 查询婚前卫生咨询和指导列表
     */
    @RequiresPermissions("hqbjfw:hqzxzd:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbHqzxzd tbFbHqzxzd)
    {
        startPage();
        List<TbFbHqzxzd> list = tbFbHqzxzdService.selectTbFbHqzxzdList(tbFbHqzxzd);
        return getDataTable(list);
    }

    /**
     * 导出婚前卫生咨询和指导列表
     */
    @RequiresPermissions("hqbjfw:hqzxzd:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbHqzxzd tbFbHqzxzd)
    {
        List<TbFbHqzxzd> list = tbFbHqzxzdService.selectTbFbHqzxzdList(tbFbHqzxzd);
        ExcelUtil<TbFbHqzxzd> util = new ExcelUtil<TbFbHqzxzd>(TbFbHqzxzd.class);
        return util.exportExcel(list, "hqzxzd");
    }

    /**
     * 新增婚前卫生咨询和指导
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存婚前卫生咨询和指导
     */
    @RequiresPermissions("hqbjfw:hqzxzd:add")
    @Log(title = "婚前卫生咨询和指导", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbHqzxzd tbFbHqzxzd)
    {
        return toAjax(tbFbHqzxzdService.insertTbFbHqzxzd(tbFbHqzxzd));
    }

    /**
     * 修改婚前卫生咨询和指导
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbHqzxzd tbFbHqzxzd = tbFbHqzxzdService.selectTbFbHqzxzdById(id);
        mmap.put("tbFbHqzxzd", tbFbHqzxzd);
        return prefix + "/edit";
    }

    /**
     * 修改保存婚前卫生咨询和指导
     */
    @RequiresPermissions("hqbjfw:hqzxzd:edit")
    @Log(title = "婚前卫生咨询和指导", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbHqzxzd tbFbHqzxzd)
    {
        return toAjax(tbFbHqzxzdService.updateTbFbHqzxzd(tbFbHqzxzd));
    }

    /**
     * 删除婚前卫生咨询和指导
     */
    @RequiresPermissions("hqbjfw:hqzxzd:remove")
    @Log(title = "婚前卫生咨询和指导", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbHqzxzdService.deleteTbFbHqzxzdByIds(ids));
    }
}
