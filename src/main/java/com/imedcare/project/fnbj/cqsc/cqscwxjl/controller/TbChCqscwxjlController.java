package com.imedcare.project.fnbj.cqsc.cqscwxjl.controller;

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
import com.imedcare.project.fnbj.cqsc.cqscwxjl.domain.TbChCqscwxjl;
import com.imedcare.project.fnbj.cqsc.cqscwxjl.service.ITbChCqscwxjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前筛查问询记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqscwxjl")
public class TbChCqscwxjlController extends BaseController
{
    private String prefix = "cffs/cqscwxjl";

    @Autowired
    private ITbChCqscwxjlService tbChCqscwxjlService;

    @RequiresPermissions("cffs:cqscwxjl:view")
    @GetMapping()
    public String cqscwxjl()
    {
        return prefix + "/cqscwxjl";
    }

    /**
     * 查询产前筛查问询记录列表
     */
    @RequiresPermissions("cffs:cqscwxjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqscwxjl tbChCqscwxjl)
    {
        startPage();
        List<TbChCqscwxjl> list = tbChCqscwxjlService.selectTbChCqscwxjlList(tbChCqscwxjl);
        return getDataTable(list);
    }

    /**
     * 导出产前筛查问询记录列表
     */
    @RequiresPermissions("cffs:cqscwxjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqscwxjl tbChCqscwxjl)
    {
        List<TbChCqscwxjl> list = tbChCqscwxjlService.selectTbChCqscwxjlList(tbChCqscwxjl);
        ExcelUtil<TbChCqscwxjl> util = new ExcelUtil<TbChCqscwxjl>(TbChCqscwxjl.class);
        return util.exportExcel(list, "cqscwxjl");
    }

    /**
     * 新增产前筛查问询记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前筛查问询记录
     */
    @RequiresPermissions("cffs:cqscwxjl:add")
    @Log(title = "产前筛查问询记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqscwxjl tbChCqscwxjl)
    {
        return toAjax(tbChCqscwxjlService.insertTbChCqscwxjl(tbChCqscwxjl));
    }

    /**
     * 修改产前筛查问询记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqscwxjl tbChCqscwxjl = tbChCqscwxjlService.selectTbChCqscwxjlById(id);
        mmap.put("tbChCqscwxjl", tbChCqscwxjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前筛查问询记录
     */
    @RequiresPermissions("cffs:cqscwxjl:edit")
    @Log(title = "产前筛查问询记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqscwxjl tbChCqscwxjl)
    {
        return toAjax(tbChCqscwxjlService.updateTbChCqscwxjl(tbChCqscwxjl));
    }

    /**
     * 删除产前筛查问询记录
     */
    @RequiresPermissions("cffs:cqscwxjl:remove")
    @Log(title = "产前筛查问询记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqscwxjlService.deleteTbChCqscwxjlByIds(ids));
    }
}
