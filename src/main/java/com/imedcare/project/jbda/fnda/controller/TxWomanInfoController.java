package com.imedcare.project.jbda.fnda.controller;

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
import com.imedcare.project.jbda.fnda.domain.TxWomanInfo;
import com.imedcare.project.jbda.fnda.service.ITxWomanInfoService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 妇女档案Controller
 *
 * @author liuyang
 * @date 2019-11-14
 */
@Controller
@RequestMapping("/jbda/fnda")
public class TxWomanInfoController extends BaseController
{
    private String prefix = "jbda/fnda";

    @Autowired
    private ITxWomanInfoService txWomanInfoService;


    @RequiresPermissions("jbda:fnda:view")
    @GetMapping()
    public String fnda()
    {
        return prefix + "/fnda";
    }
    /***
     * @Description: 妇女档案调用
     * @Param: []
     * @return: java.lang.String
     * @Author: liuyang
     */
    @RequiresPermissions("jbda:fnda:view")
    @GetMapping("/listfnda")
    public String getFnda()
    {
        return prefix+"/list";
    }
    /**
     * 查询妇女档案列表
     */
    @RequiresPermissions("jbda:fnda:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TxWomanInfo txWomanInfo)
    {
        startPage();
        List<TxWomanInfo> list = txWomanInfoService.selectTxWomanInfoList(txWomanInfo);
        return getDataTable(list);
    }

    /**
     * 导出妇女档案列表
     */
    @RequiresPermissions("jbda:fnda:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TxWomanInfo txWomanInfo)
    {
        List<TxWomanInfo> list = txWomanInfoService.selectTxWomanInfoList(txWomanInfo);
        ExcelUtil<TxWomanInfo> util = new ExcelUtil<TxWomanInfo>(TxWomanInfo.class);
        return util.exportExcel(list, "fnda");
    }

    /**
     * 新增妇女档案
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存妇女档案
     */
    @RequiresPermissions("jbda:fnda:add")
    @Log(title = "妇女档案", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TxWomanInfo txWomanInfo)
    {
        return toAjax(txWomanInfoService.insertTxWomanInfo(txWomanInfo));
    }

    /**
     * 修改妇女档案
     */
    @GetMapping("/edit/{healthFileId}")
    public String edit(@PathVariable("healthFileId") Long healthFileId, ModelMap mmap)
    {
        TxWomanInfo txWomanInfo = txWomanInfoService.selectTxWomanInfoById(healthFileId);
        mmap.put("txWomanInfo", txWomanInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存妇女档案
     */
    @RequiresPermissions("jbda:fnda:edit")
    @Log(title = "妇女档案", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TxWomanInfo txWomanInfo)
    {
        return toAjax(txWomanInfoService.updateTxWomanInfo(txWomanInfo));
    }

    /**
     * 删除妇女档案
     */
    @RequiresPermissions("jbda:fnda:remove")
    @Log(title = "妇女档案", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(txWomanInfoService.deleteTxWomanInfoByIds(ids));
    }
}
