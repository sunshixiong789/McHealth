package com.imedcare.project.etbj.etjktj.txyyj.controller;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.etbj.etjktj.jktjyxzd.domain.TbEtJktjyxzd;
import com.imedcare.project.etbj.etjktj.jktjyxzd.domain.TbEtJktjyxzdVo;
import com.imedcare.project.etbj.etjktj.jktjyxzd.service.ITbEtJktjyxzdService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description:
 * 提醒与预警controller
 *
 * @author daiminghang
 * @date 2020/1/4 21:22
 */
@Controller
@RequestMapping("/etjktj/txyyj")
public class TbEtTxyyjController extends BaseController {
    private String prefix = "etbj/etjktj/txyyj";

    @Autowired
    private ITbEtJktjyxzdService tbEtJktjyxzdService;

    @RequiresPermissions("etjktj:txyyj:view")
    @GetMapping()
    public String jktjyxzd()
    {
        return prefix + "/txyyj";
    }

    /**
     * 查询提醒与预警列表
     */
    @RequiresPermissions("etjktj:txyyj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtJktjyxzdVo tbEtJktjyxzd)
    {
        startPage();
        List<TbEtJktjyxzdVo> list = tbEtJktjyxzdService.selectTbEtJktjyxzdList(tbEtJktjyxzd);
        return getDataTable(list);
    }

    /**
     * 导出提醒与预警列表
     */
    @RequiresPermissions("etjktj:txyyj:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtJktjyxzdVo tbEtJktjyxzd)
    {
        List<TbEtJktjyxzdVo> list = tbEtJktjyxzdService.selectTbEtJktjyxzdList(tbEtJktjyxzd);
        ExcelUtil<TbEtJktjyxzdVo> util = new ExcelUtil<TbEtJktjyxzdVo>(TbEtJktjyxzdVo.class);
        return util.exportExcel(list, "jktjyxzd");
    }

    /**
     * 新增提醒与预警
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存提醒与预警
     */
    @RequiresPermissions("etjktj:txyyj:add")
    @Log(title = "提醒与预警", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtJktjyxzd tbEtJktjyxzd)
    {
        return toAjax(tbEtJktjyxzdService.insertTbEtJktjyxzd(tbEtJktjyxzd));
    }

    /**
     * 修改提醒与预警
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtJktjyxzdVo tbEtJktjyxzd = tbEtJktjyxzdService.selectTbEtJktjyxzdById(id);
        mmap.put("tbEtJktjyxzd", tbEtJktjyxzd);
        return prefix + "/edit";
    }

    /**
     * 修改保存提醒与预警
     */
    @RequiresPermissions("etjktj:txyyj:edit")
    @Log(title = "提醒与预警", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtJktjyxzd tbEtJktjyxzd)
    {
        return toAjax(tbEtJktjyxzdService.updateTbEtJktjyxzd(tbEtJktjyxzd));
    }

    /**
     * 删除提醒与预警
     */
    @RequiresPermissions("etjktj:txyyj:remove")
    @Log(title = "提醒与预警", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtJktjyxzdService.deleteTbEtJktjyxzdByIds(ids));
    }
}
