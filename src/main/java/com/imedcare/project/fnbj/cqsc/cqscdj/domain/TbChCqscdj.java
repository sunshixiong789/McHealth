package com.imedcare.project.fnbj.cqsc.cqscdj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前筛查登记对象 tb_ch_cqscdj
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public class TbChCqscdj extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date csrq;

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String mqsfzjlbdm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String mqsfzjhm;

    /** 地址类别代码 */
    @Excel(name = "地址类别代码")
    private String dzlbdm;

    /** 行政区划代码 */
    @Excel(name = "行政区划代码")
    private String xzqhdm;

    /** 地址-省/直辖市、自治区 */
    @Excel(name = "地址-省/直辖市、自治区")
    private String dzsheng;

    /** 地址-市/地区 */
    @Excel(name = "地址-市/地区")
    private String dzshi;

    /** 地址-区/县 */
    @Excel(name = "地址-区/县")
    private String dzxian;

    /** 地址-乡镇/街道办事处 */
    @Excel(name = "地址-乡镇/街道办事处")
    private String dzxiang;

    /** 地址-村/街/路/弄 */
    @Excel(name = "地址-村/街/路/弄")
    private String dzcun;

    /** 地址-门牌号码 */
    @Excel(name = "地址-门牌号码")
    private String dzmp;

    /** 邮政编码 */
    @Excel(name = "邮政编码")
    private String yzbm;

    /** 联系电话-类别 */
    @Excel(name = "联系电话-类别")
    private String lxdhlb;

    /** 联系电话-类别代码 */
    @Excel(name = "联系电话-类别代码")
    private String lxdhlbdm;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String lxfs;

    /** 登记日期 */
    @Excel(name = "登记日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date djrq;

    /** 档案ID */
    @Excel(name = "档案ID")
    private Long healthfileid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setXm(String xm) 
    {
        this.xm = xm;
    }

    public String getXm() 
    {
        return xm;
    }
    public void setCsrq(Date csrq) 
    {
        this.csrq = csrq;
    }

    public Date getCsrq() 
    {
        return csrq;
    }
    public void setMqsfzjlbdm(String mqsfzjlbdm) 
    {
        this.mqsfzjlbdm = mqsfzjlbdm;
    }

    public String getMqsfzjlbdm() 
    {
        return mqsfzjlbdm;
    }
    public void setMqsfzjhm(String mqsfzjhm) 
    {
        this.mqsfzjhm = mqsfzjhm;
    }

    public String getMqsfzjhm() 
    {
        return mqsfzjhm;
    }
    public void setDzlbdm(String dzlbdm) 
    {
        this.dzlbdm = dzlbdm;
    }

    public String getDzlbdm() 
    {
        return dzlbdm;
    }
    public void setXzqhdm(String xzqhdm) 
    {
        this.xzqhdm = xzqhdm;
    }

    public String getXzqhdm() 
    {
        return xzqhdm;
    }
    public void setDzsheng(String dzsheng) 
    {
        this.dzsheng = dzsheng;
    }

    public String getDzsheng() 
    {
        return dzsheng;
    }
    public void setDzshi(String dzshi) 
    {
        this.dzshi = dzshi;
    }

    public String getDzshi() 
    {
        return dzshi;
    }
    public void setDzxian(String dzxian) 
    {
        this.dzxian = dzxian;
    }

    public String getDzxian() 
    {
        return dzxian;
    }
    public void setDzxiang(String dzxiang) 
    {
        this.dzxiang = dzxiang;
    }

    public String getDzxiang() 
    {
        return dzxiang;
    }
    public void setDzcun(String dzcun) 
    {
        this.dzcun = dzcun;
    }

    public String getDzcun() 
    {
        return dzcun;
    }
    public void setDzmp(String dzmp) 
    {
        this.dzmp = dzmp;
    }

    public String getDzmp() 
    {
        return dzmp;
    }
    public void setYzbm(String yzbm) 
    {
        this.yzbm = yzbm;
    }

    public String getYzbm() 
    {
        return yzbm;
    }
    public void setLxdhlb(String lxdhlb) 
    {
        this.lxdhlb = lxdhlb;
    }

    public String getLxdhlb() 
    {
        return lxdhlb;
    }
    public void setLxdhlbdm(String lxdhlbdm) 
    {
        this.lxdhlbdm = lxdhlbdm;
    }

    public String getLxdhlbdm() 
    {
        return lxdhlbdm;
    }
    public void setLxfs(String lxfs) 
    {
        this.lxfs = lxfs;
    }

    public String getLxfs() 
    {
        return lxfs;
    }
    public void setDjrq(Date djrq) 
    {
        this.djrq = djrq;
    }

    public Date getDjrq() 
    {
        return djrq;
    }
    public void setHealthfileid(Long healthfileid) 
    {
        this.healthfileid = healthfileid;
    }

    public Long getHealthfileid() 
    {
        return healthfileid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("csrq", getCsrq())
            .append("mqsfzjlbdm", getMqsfzjlbdm())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("dzlbdm", getDzlbdm())
            .append("xzqhdm", getXzqhdm())
            .append("dzsheng", getDzsheng())
            .append("dzshi", getDzshi())
            .append("dzxian", getDzxian())
            .append("dzxiang", getDzxiang())
            .append("dzcun", getDzcun())
            .append("dzmp", getDzmp())
            .append("yzbm", getYzbm())
            .append("lxdhlb", getLxdhlb())
            .append("lxdhlbdm", getLxdhlbdm())
            .append("lxfs", getLxfs())
            .append("djrq", getDjrq())
            .append("healthfileid", getHealthfileid())
            .toString();
    }
}
