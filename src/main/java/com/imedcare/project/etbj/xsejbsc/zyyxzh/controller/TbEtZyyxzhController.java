package com.imedcare.project.etbj.xsejbsc.zyyxzh.controller;

import java.util.List;

import com.imedcare.project.etbj.xsejbsc.zyyxzh.domain.TbEtZyyxzhVo;
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
import com.imedcare.project.etbj.xsejbsc.zyyxzh.domain.TbEtZyyxzh;
import com.imedcare.project.etbj.xsejbsc.zyyxzh.service.ITbEtZyyxzhService;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.web.page.TableDataInfo;

/**
 * 新生儿疾病筛查可疑阳性召回Controller
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
@Controller
@RequestMapping("/xsejbsc/zyyxzh")
public class TbEtZyyxzhController extends BaseController
{
    private String prefix = "etbj/xsejbsc/zyyxzh";

    @Autowired
    private ITbEtZyyxzhService tbEtZyyxzhService;

    @RequiresPermissions("xsejbsc:zyyxzh:view")
    @GetMapping()
    public String zyyxzh()
    {
        return prefix + "/zyyxzh";
    }

    @RequiresPermissions("xsejbsc:zyyxzh:view")
    @GetMapping("listzh")
    public String listzh()
    {
        return prefix + "/list";
    }

    /**
     * 查询新生儿疾病筛查可疑阳性召回列表
     */
    @RequiresPermissions("xsejbsc:zyyxzh:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbEtZyyxzhVo tbEtZyyxzh)
    {
        startPage();
        List<TbEtZyyxzhVo> list = tbEtZyyxzhService.selectTbEtZyyxzhList(tbEtZyyxzh);
        return getDataTable(list);
    }

    /**
     * 导出新生儿疾病筛查可疑阳性召回列表
     */
    @RequiresPermissions("xsejbsc:zyyxzh:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbEtZyyxzhVo tbEtZyyxzh)
    {
        List<TbEtZyyxzhVo> list = tbEtZyyxzhService.selectTbEtZyyxzhList(tbEtZyyxzh);
        ExcelUtil<TbEtZyyxzhVo> util = new ExcelUtil<TbEtZyyxzhVo>(TbEtZyyxzhVo.class);
        return util.exportExcel(list, "zyyxzh");
    }

    /**
     * 新增新生儿疾病筛查可疑阳性召回
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新生儿疾病筛查可疑阳性召回
     */
    @RequiresPermissions("xsejbsc:zyyxzh:add")
    @Log(title = "新生儿疾病筛查可疑阳性召回", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbEtZyyxzh tbEtZyyxzh)
    {
        return toAjax(tbEtZyyxzhService.insertTbEtZyyxzh(tbEtZyyxzh));
    }

    /**
     * 修改新生儿疾病筛查可疑阳性召回
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbEtZyyxzhVo tbEtZyyxzh = tbEtZyyxzhService.selectTbEtZyyxzhById(id);
        mmap.put("tbEtZyyxzh", tbEtZyyxzh);
        return prefix + "/edit";
    }

    /**
     * 修改保存新生儿疾病筛查可疑阳性召回
     */
    @RequiresPermissions("xsejbsc:zyyxzh:edit")
    @Log(title = "新生儿疾病筛查可疑阳性召回", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbEtZyyxzh tbEtZyyxzh)
    {
        return toAjax(tbEtZyyxzhService.updateTbEtZyyxzh(tbEtZyyxzh));
    }

    /**
     * 删除新生儿疾病筛查可疑阳性召回
     */
    @RequiresPermissions("xsejbsc:zyyxzh:remove")
    @Log(title = "新生儿疾病筛查可疑阳性召回", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbEtZyyxzhService.deleteTbEtZyyxzhByIds(ids));
    }
}
