package com.imedcare.project.etbj.swbg.bgksh;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.etbj.xsefs.xsefsdj.domain.TbEtXsefsdj;
import com.imedcare.project.etbj.xsefs.xsefsdj.service.ITbEtXsefsdjService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * description:
 * 报告卡登记
 *
 * @author daiminghang
 * @date 2020/1/5 9:20
 */
@Controller
@RequestMapping("/swbg/bgksh")
public class TbEtBgkshController extends BaseController
{
    private String prefix = "etbj/swbg/bgksh";

    @Autowired
    private ITbEtXsefsdjService tbEtXsefsdjService;

    @RequiresPermissions("swbg:bgksh:view")
    @GetMapping()
    public String xsefsdj()
    {
        return prefix + "/bgksh";
    }

    @RequiresPermissions("swbg:bgksh:view")
    @GetMapping("/listfsdj")
    public String listfsdj()
    {
        return prefix + "/list.html";
    }



    /**
     * 查询报告卡登记列表
     */
    @RequiresPermissions("swbg:bgksh:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtXsefsdj tbEtXsefsdj)
    {
        startPage();
        List<TbEtXsefsdj> list = tbEtXsefsdjService.selectTbEtXsefsdjList(tbEtXsefsdj);
        return getDataTable(list);
    }

    /**
     * 导出报告卡登记列表
     */
    @RequiresPermissions("swbg:bgksh:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtXsefsdj tbEtXsefsdj)
    {
        List<TbEtXsefsdj> list = tbEtXsefsdjService.selectTbEtXsefsdjList(tbEtXsefsdj);
        ExcelUtil<TbEtXsefsdj> util = new ExcelUtil<TbEtXsefsdj>(TbEtXsefsdj.class);
        return util.exportExcel(list, "bgksh");
    }

    /**
     * 新增报告卡登记
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存报告卡登记
     */
    @RequiresPermissions("swbg:bgksh:add")
    @Log(title = "报告卡登记", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtXsefsdj tbEtXsefsdj)
    {
        tbEtXsefsdj.setDjrq(new Date());
        return toAjax(tbEtXsefsdjService.insertTbEtXsefsdj(tbEtXsefsdj));
    }

    /**
     * 修改报告卡登记
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtXsefsdj tbEtXsefsdj = tbEtXsefsdjService.selectTbEtXsefsdjById(id);
        mmap.put("tbEtXsefsdj", tbEtXsefsdj);
        return prefix + "/edit";
    }

    /**
     * 修改保存报告卡登记
     */
    @RequiresPermissions("swbg:bgksh:edit")
    @Log(title = "报告卡登记", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtXsefsdj tbEtXsefsdj)
    {
        return toAjax(tbEtXsefsdjService.updateTbEtXsefsdj(tbEtXsefsdj));
    }

    /**
     * 删除报告卡登记
     */
    @RequiresPermissions("swbg:bgksh:remove")
    @Log(title = "报告卡登记", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtXsefsdjService.deleteTbEtXsefsdjByIds(ids));
    }
}
