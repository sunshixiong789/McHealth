package com.imedcare.project.etbj.swbg.etswbg;

import com.imedcare.framework.web.controller.BaseController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description:
 *
 * @author daiminghang
 * @date 2020/1/9 18:13
 */
@Controller
@RequestMapping("/swbg/etswbg")
public class TbEtSwbgController extends BaseController {
    private String prefix = "etbj/swbg/etswbg";

    @RequiresPermissions("swbg:etswbg:view")
    @GetMapping()
    public String xsefsdj()
    {
        return prefix + "/etswbg";
    }
}
