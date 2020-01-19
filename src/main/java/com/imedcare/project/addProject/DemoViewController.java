package com.imedcare.project.addProject;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 演示使用的页面
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2020/1/5-14:25
 */
@Controller
@RequestMapping("/demoView")
public class DemoViewController {

  @RequiresPermissions("cqbj:bdj:view")
  @GetMapping("chanqian")
  public String chanQian() {
    return "demoview/chanqian/bdj";
  }

  @GetMapping("chanqian/add")
  public String chanQianAdd() {
    return "demoview/chanqian/add";
  }

  @GetMapping("zzjl")
  @RequiresPermissions("cqbj:zzjl:view")
  public String zzjl() {
    return "demoview/zzjl/zzjl";
  }

  @RequiresPermissions("cqbj:zzjl:view")
  @GetMapping("yangxing")
  public String yangxing() {
    return "demoview/yangxing/zzjl";
  }

  @RequiresPermissions("cqbj:zzjl:view")
  @GetMapping("jianche")
  public String jianche() {
    return "demoview/jianche/zzjl";
  }

  @RequiresPermissions("cqbj:zzjl:view")
  @GetMapping("shenghe")
  public String shenghe() {
    return "demoview/shenghe/zzjl";
  }

  @RequiresPermissions("cqbj:zzjl:view")
  @GetMapping("pingsheng")
  public String pingsheng() {
    return "demoview/pingsheng/zzjl";
  }

  @RequiresPermissions("cqbj:zzjl:view")
  @GetMapping("yujing")
  public String yujing() {
    return "demoview/yujing/zzjl";
  }
}
