package com.imedcare.project.etbj.etjktj.jktjtgjc.controller;

import java.util.List;

import com.imedcare.project.etbj.etjktj.jktjtgjc.domain.TbEtJktjtgjcVo;
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
import com.imedcare.project.etbj.etjktj.jktjtgjc.domain.TbEtJktjtgjc;
import com.imedcare.project.etbj.etjktj.jktjtgjc.service.ITbEtJktjtgjcService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 儿童健康体检问询记录Controller
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
@Controller
@RequestMapping("/etjktj/jktjtgjc")
public class TbEtJktjtgjcController extends BaseController
{
    private String prefix = "etbj/etjktj/jktjtgjc";

    @Autowired
    private ITbEtJktjtgjcService tbEtJktjtgjcService;

    @RequiresPermissions("etjktj:jktjtgjc:view")
    @GetMapping()
    public String jktjtgjc()
    {
        return prefix + "/jktjtgjc";
    }

    /**
     * 查询儿童健康体检问询记录列表
     */
    @RequiresPermissions("etjktj:jktjtgjc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtJktjtgjcVo tbEtJktjtgjc)
    {
        startPage();
        List<TbEtJktjtgjcVo> list = tbEtJktjtgjcService.selectTbEtJktjtgjcList(tbEtJktjtgjc);
        return getDataTable(list);
    }

    /**
     * 导出儿童健康体检问询记录列表
     */
    @RequiresPermissions("etjktj:jktjtgjc:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtJktjtgjcVo tbEtJktjtgjc)
    {
        List<TbEtJktjtgjcVo> list = tbEtJktjtgjcService.selectTbEtJktjtgjcList(tbEtJktjtgjc);
        ExcelUtil<TbEtJktjtgjcVo> util = new ExcelUtil<TbEtJktjtgjcVo>(TbEtJktjtgjcVo.class);
        return util.exportExcel(list, "jktjtgjc");
    }

    /**
     * 新增儿童健康体检问询记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存儿童健康体检问询记录
     */
    @RequiresPermissions("etjktj:jktjtgjc:add")
    @Log(title = "儿童健康体检问询记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtJktjtgjc tbEtJktjtgjc)
    {
        return toAjax(tbEtJktjtgjcService.insertTbEtJktjtgjc(tbEtJktjtgjc));
    }

    /**
     * 修改儿童健康体检问询记录
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtJktjtgjcVo tbEtJktjtgjc = tbEtJktjtgjcService.selectTbEtJktjtgjcById(id);
        mmap.put("tbEtJktjtgjc", tbEtJktjtgjc);
        return prefix + "/edit";
    }

    /**
     * 修改保存儿童健康体检问询记录
     */
    @RequiresPermissions("etjktj:jktjtgjc:edit")
    @Log(title = "儿童健康体检问询记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtJktjtgjc tbEtJktjtgjc)
    {
        return toAjax(tbEtJktjtgjcService.updateTbEtJktjtgjc(tbEtJktjtgjc));
    }

    /**
     * 删除儿童健康体检问询记录
     */
    @RequiresPermissions("etjktj:jktjtgjc:remove")
    @Log(title = "儿童健康体检问询记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtJktjtgjcService.deleteTbEtJktjtgjcByIds(ids));
    }
}
