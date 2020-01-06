package com.imedcare.project.fnbj.cqsc.cqsctgjcjl.controller;

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
import com.imedcare.project.fnbj.cqsc.cqsctgjcjl.domain.TbChCqsctgjcjl;
import com.imedcare.project.fnbj.cqsc.cqsctgjcjl.service.ITbChCqsctgjcjlService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 产前筛查体格检查记录Controller
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/cffs/cqsctgjcjl")
public class TbChCqsctgjcjlController extends BaseController
{
    private String prefix = "cffs/cqsctgjcjl";

    @Autowired
    private ITbChCqsctgjcjlService tbChCqsctgjcjlService;

    @RequiresPermissions("cffs:cqsctgjcjl:view")
    @GetMapping()
    public String cqsctgjcjl()
    {
        return prefix + "/cqsctgjcjl";
    }

    /**
     * 查询产前筛查体格检查记录列表
     */
    @RequiresPermissions("cffs:cqsctgjcjl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbChCqsctgjcjl tbChCqsctgjcjl)
    {
        startPage();
        List<TbChCqsctgjcjl> list = tbChCqsctgjcjlService.selectTbChCqsctgjcjlList(tbChCqsctgjcjl);
        return getDataTable(list);
    }

    /**
     * 导出产前筛查体格检查记录列表
     */
    @RequiresPermissions("cffs:cqsctgjcjl:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbChCqsctgjcjl tbChCqsctgjcjl)
    {
        List<TbChCqsctgjcjl> list = tbChCqsctgjcjlService.selectTbChCqsctgjcjlList(tbChCqsctgjcjl);
        ExcelUtil<TbChCqsctgjcjl> util = new ExcelUtil<TbChCqsctgjcjl>(TbChCqsctgjcjl.class);
        return util.exportExcel(list, "cqsctgjcjl");
    }

    /**
     * 新增产前筛查体格检查记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产前筛查体格检查记录
     */
    @RequiresPermissions("cffs:cqsctgjcjl:add")
    @Log(title = "产前筛查体格检查记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbChCqsctgjcjl tbChCqsctgjcjl)
    {
        return toAjax(tbChCqsctgjcjlService.insertTbChCqsctgjcjl(tbChCqsctgjcjl));
    }

    /**
     * 修改产前筛查体格检查记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbChCqsctgjcjl tbChCqsctgjcjl = tbChCqsctgjcjlService.selectTbChCqsctgjcjlById(id);
        mmap.put("tbChCqsctgjcjl", tbChCqsctgjcjl);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前筛查体格检查记录
     */
    @RequiresPermissions("cffs:cqsctgjcjl:edit")
    @Log(title = "产前筛查体格检查记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbChCqsctgjcjl tbChCqsctgjcjl)
    {
        return toAjax(tbChCqsctgjcjlService.updateTbChCqsctgjcjl(tbChCqsctgjcjl));
    }

    /**
     * 删除产前筛查体格检查记录
     */
    @RequiresPermissions("cffs:cqsctgjcjl:remove")
    @Log(title = "产前筛查体格检查记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbChCqsctgjcjlService.deleteTbChCqsctgjcjlByIds(ids));
    }
}
