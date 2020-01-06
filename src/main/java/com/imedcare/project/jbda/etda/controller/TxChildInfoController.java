package com.imedcare.project.jbda.etda.controller;

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
import com.imedcare.project.jbda.etda.domain.TxChildInfo;
import com.imedcare.project.jbda.etda.service.ITxChildInfoService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 儿童档案Controller
 * 
 * @author imedcare
 * @date 2019-11-13
 */
@Controller
@RequestMapping("/jbda/etda")
public class TxChildInfoController extends BaseController
{
    private String prefix = "jbda/etda";

    @Autowired
    private ITxChildInfoService txChildInfoService;

    @RequiresPermissions("jbda:etda:view")
    @GetMapping()
    public String etda()
    {
        return prefix + "/etda";
    }
    /*** 
    * @Description: 儿童档案调用 
    * @Param: [] 
    * @return: java.lang.String 
    * @Author: huangweiye
    */ 
    @RequiresPermissions("jbda:etda:view")
    @GetMapping("/listetda")
    public String getEtda()
    {
        return prefix+"/list";
    }

    /**
     * 查询儿童档案列表
     */
    @RequiresPermissions("jbda:etda:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TxChildInfo txChildInfo)
    {
        startPage();
        List<TxChildInfo> list = txChildInfoService.selectTxChildInfoList(txChildInfo);
        return getDataTable(list);
    }

    /**
     * 导出儿童档案列表
     */
    @RequiresPermissions("jbda:etda:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TxChildInfo txChildInfo)
    {
        List<TxChildInfo> list = txChildInfoService.selectTxChildInfoList(txChildInfo);
        ExcelUtil<TxChildInfo> util = new ExcelUtil<TxChildInfo>(TxChildInfo.class);
        return util.exportExcel(list, "etda");
    }

    /**
     * 新增儿童档案
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存儿童档案
     */
    @RequiresPermissions("jbda:etda:add")
    @Log(title = "儿童档案", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TxChildInfo txChildInfo)
    {

        return toAjax(txChildInfoService.insertTxChildInfo(txChildInfo));
    }

    /**
     * 修改儿童档案
     */
    @GetMapping("/edit/{healthFileId}")
    public String edit(@PathVariable("healthFileId") Long healthFileId, ModelMap mmap)
    {
        TxChildInfo txChildInfo = txChildInfoService.selectTxChildInfoById(healthFileId);
        mmap.put("txChildInfo", txChildInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存儿童档案
     */
    @RequiresPermissions("jbda:etda:edit")
    @Log(title = "儿童档案", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TxChildInfo txChildInfo)
    {
        return toAjax(txChildInfoService.updateTxChildInfo(txChildInfo));
    }

    /**
     * 删除儿童档案
     */
    @RequiresPermissions("jbda:etda:remove")
    @Log(title = "儿童档案", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(txChildInfoService.deleteTxChildInfoByIds(ids));
    }
}
