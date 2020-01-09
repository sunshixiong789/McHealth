package com.imedcare.project.addProject;

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

  @GetMapping("chanqian")
  public String chanQian(){
    return "/demoview/chanqian/bdj";
  }

  @GetMapping("chanqian/add")
  public String chanQianAdd(){
    return "/demoview/chanqian/add";
  }

  @GetMapping("zzjl")
  public String zzjl(){
    return "/demoview/zzjl/zzjl";
  }
  @GetMapping("yangxing")
  public String yangxing(){
    return "/demoview/yangxing/zzjl";
  }
  @GetMapping("jianche")
  public String jianche(){
    return "/demoview/jianche/zzjl";
  }
  @GetMapping("shenghe")
  public String shenghe(){
    return "/demoview/shenghe/zzjl";
  }
  @GetMapping("pingsheng")
  public String pingsheng(){
    return "/demoview/pingsheng/zzjl";
  }
  @GetMapping("yujing")
  public String yujing(){
    return "/demoview/yujing/zzjl";
  }
}
