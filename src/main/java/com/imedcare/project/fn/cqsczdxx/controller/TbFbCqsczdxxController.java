package com.imedcare.project.fn.cqsczdxx.controller;

import com.imedcare.common.utils.poi.ExcelUtil;
import com.imedcare.framework.aspectj.lang.annotation.Log;
import com.imedcare.framework.aspectj.lang.enums.BusinessType;
import com.imedcare.framework.web.controller.BaseController;
import com.imedcare.framework.web.domain.AjaxResult;
import com.imedcare.framework.web.page.TableDataInfo;
import com.imedcare.project.fn.cqsczdxx.domain.TbFbCqsczdxx;
import com.imedcare.project.fn.cqsczdxx.domain.Women;
import com.imedcare.project.fn.cqsczdxx.service.ITbFbCqsczdxxService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 产前筛查诊断信息Controller
 * 
 * @author maqilin
 * @date 2019-11-08
 */
@Controller
@RequestMapping("/fn/cqsczdxx")
public class TbFbCqsczdxxController extends BaseController
{
    private String prefix = "fn/cqsczdxx";

    @Autowired
    private ITbFbCqsczdxxService tbFbCqsczdxxService;

    @RequiresPermissions("fn:cqsczdxx:view")
    @GetMapping()
    public String cqsczdxx()
    {
        return prefix + "/cqsczdxx";
    }

    /**
     * 查询产前筛查诊断信息列表
     */
    @RequiresPermissions("fn:cqsczdxx:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbFbCqsczdxx tbFbCqsczdxx)
    {
        startPage();
        List<TbFbCqsczdxx> list = tbFbCqsczdxxService.selectTbFbCqsczdxxList(tbFbCqsczdxx);
        return getDataTable(list);
    }

    /**
     * 导出产前筛查诊断信息列表
     */
    @RequiresPermissions("fn:cqsczdxx:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbFbCqsczdxx tbFbCqsczdxx)
    {
        List<TbFbCqsczdxx> list = tbFbCqsczdxxService.selectTbFbCqsczdxxList(tbFbCqsczdxx);
        ExcelUtil<TbFbCqsczdxx> util = new ExcelUtil<TbFbCqsczdxx>(TbFbCqsczdxx.class);
        return util.exportExcel(list, "cqsczdxx");
    }

    /**
     * 新增产前筛查诊断信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }


    /**
     * 选择妇女
     */
    @GetMapping("/selectWomen/{id}")
    public String selectMenuTree(@PathVariable("id") Long id, ModelMap mmap)
    {
        mmap.put("women", new Women());
        return prefix + "/list";
    }

    @RequestMapping("/getWomenBaseData")
    @ResponseBody
    public List<Women> getWomenBaseData(Women wo) {
        List<Women> womenList = new ArrayList<>();
        Women women = new Women();
        women.setId("1");
        women.setAddressCity("四川");
        women.setAddressProvice("成都");
        women.setAddressRegion("成华");
        women.setBirthday(new Date(System.currentTimeMillis()-24L*60*60*1000*365*20));
        women.setIdNoType("身份证");
        women.setIdNo("511321199002122098");
        women.setPhone("13912542392");
        women.setName("刘亦菲");
        women.setMail("637300");

        String name = wo.getName();

        if (name == null) {
            womenList.add(women);
        } else {
            if (women.getName().indexOf(name)>=0) {
                womenList.add(women);
            }
        }

        Women w = new Women();
        w.setId("2");
        w.setAddressCity("四川");
        w.setAddressProvice("成都");
        w.setAddressRegion("锦江");
        w.setBirthday(new Date(System.currentTimeMillis()-24L*60*60*1000*365*20));
        w.setIdNoType("身份证");
        w.setPhone("13921352393");
        w.setIdNo("511321199002122097");
        w.setName("聂小倩");
        w.setMail("637301");

        if (name == null) {
            womenList.add(w);
        } else {
            if (w.getName().indexOf(name)>=0) {
                womenList.add(w);
            }
        }

        return  womenList;
    }


    /**
     * 新增保存产前筛查诊断信息
     */
    @RequiresPermissions("fn:cqsczdxx:add")
    @Log(title = "产前筛查诊断信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbFbCqsczdxx tbFbCqsczdxx)
    {
        return toAjax(tbFbCqsczdxxService.insertTbFbCqsczdxx(tbFbCqsczdxx));
    }

    /**
     * 修改产前筛查诊断信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbFbCqsczdxx tbFbCqsczdxx = tbFbCqsczdxxService.selectTbFbCqsczdxxById(id);
        mmap.put("tbFbCqsczdxx", tbFbCqsczdxx);
        return prefix + "/edit";
    }

    /**
     * 修改保存产前筛查诊断信息
     */
    @RequiresPermissions("fn:cqsczdxx:edit")
    @Log(title = "产前筛查诊断信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbFbCqsczdxx tbFbCqsczdxx)
    {
        return toAjax(tbFbCqsczdxxService.updateTbFbCqsczdxx(tbFbCqsczdxx));
    }

    /**
     * 删除产前筛查诊断信息
     */
    @RequiresPermissions("fn:cqsczdxx:remove")
    @Log(title = "产前筛查诊断信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbFbCqsczdxxService.deleteTbFbCqsczdxxByIds(ids));
    }
}
