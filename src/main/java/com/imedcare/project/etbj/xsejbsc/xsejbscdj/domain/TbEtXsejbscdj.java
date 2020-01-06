package com.imedcare.project.etbj.xsejbsc.xsejbscdj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 新生儿疾病筛查登记对象 tb_et_xsejbscdj
 * 
 * @author 黄维业
 * @date 2019-11-19
 */
public class TbEtXsejbscdj extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 标本编号 */
    @Excel(name = "标本编号")
    private String bbbh;

    /** 采血日期 */
    @Excel(name = "采血日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cxrq;

    /** 采血方式 */
    @Excel(name = "采血方式")
    private Integer cxfs;

    /** 采血部位 */
    @Excel(name = "采血部位")
    private Integer cxbw;

    /** 采血机构名 */
    @Excel(name = "采血机构名")
    private String cxjg;

    /** 采血医生 */
    @Excel(name = "采血医生")
    private String cxry;

    /** 新生儿姓名 */
    @Excel(name = "新生儿姓名")
    private String xm;

    /** 性别 */
    @Excel(name = "性别")
    private String xbdm;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String csrq;

    /** 母亲姓名 */
    @Excel(name = "母亲姓名")
    private String mqxm;

    /** 母亲出生日期 */
    @Excel(name = "母亲出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mqcsrq;

    /** 母亲证件类别 */
    @Excel(name = "母亲证件类别")
    private String mqsfzj;

    /** 母亲证件号码 */
    @Excel(name = "母亲证件号码")
    private String mqsfzjhm;

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

    /** 地址-村/街/路 */
    @Excel(name = "地址-村/街/路")
    private String dzcun;

    /** 地址-门牌 */
    @Excel(name = "地址-门牌")
    private String dzmp;

    /** 邮政编码 */
    @Excel(name = "邮政编码")
    private String yzbm;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String lxfs;

    /** 现住址 */
    @Excel(name = "现住址")
    private String xzz;

    /** 档案ID */
    @Excel(name = "档案ID")
    private Long healthFileId;

    public Long getHealthFileId() {
        return healthFileId;
    }

    public void setHealthFileId(Long healthFileId) {
        this.healthFileId = healthFileId;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBbbh(String bbbh) 
    {
        this.bbbh = bbbh;
    }

    public String getBbbh() 
    {
        return bbbh;
    }
    public void setCxrq(Date cxrq) 
    {
        this.cxrq = cxrq;
    }

    public Date getCxrq() 
    {
        return cxrq;
    }
    public void setCxfs(Integer cxfs) 
    {
        this.cxfs = cxfs;
    }

    public Integer getCxfs() 
    {
        return cxfs;
    }
    public void setCxbw(Integer cxbw) 
    {
        this.cxbw = cxbw;
    }

    public Integer getCxbw() 
    {
        return cxbw;
    }
    public void setCxjg(String cxjg) 
    {
        this.cxjg = cxjg;
    }

    public String getCxjg() 
    {
        return cxjg;
    }
    public void setCxry(String cxry) 
    {
        this.cxry = cxry;
    }

    public String getCxry() 
    {
        return cxry;
    }
    public void setXm(String xm) 
    {
        this.xm = xm;
    }

    public String getXm() 
    {
        return xm;
    }
    public void setXbdm(String xbdm) 
    {
        this.xbdm = xbdm;
    }

    public String getXbdm() 
    {
        return xbdm;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public void setMqxm(String mqxm)
    {
        this.mqxm = mqxm;
    }

    public String getMqxm() 
    {
        return mqxm;
    }
    public void setMqcsrq(Date mqcsrq) 
    {
        this.mqcsrq = mqcsrq;
    }

    public Date getMqcsrq() 
    {
        return mqcsrq;
    }
    public void setMqsfzj(String mqsfzj) 
    {
        this.mqsfzj = mqsfzj;
    }

    public String getMqsfzj() 
    {
        return mqsfzj;
    }
    public void setMqsfzjhm(String mqsfzjhm) 
    {
        this.mqsfzjhm = mqsfzjhm;
    }

    public String getMqsfzjhm() 
    {
        return mqsfzjhm;
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
    public void setLxfs(String lxfs) 
    {
        this.lxfs = lxfs;
    }

    public String getLxfs() 
    {
        return lxfs;
    }
    public void setXzz(String xzz) 
    {
        this.xzz = xzz;
    }

    public String getXzz() 
    {
        return xzz;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bbbh", getBbbh())
            .append("cxrq", getCxrq())
            .append("cxfs", getCxfs())
            .append("cxbw", getCxbw())
            .append("cxjg", getCxjg())
            .append("cxry", getCxry())
            .append("xm", getXm())
            .append("xbdm", getXbdm())
            .append("csrq", getCsrq())
            .append("mqxm", getMqxm())
            .append("mqcsrq", getMqcsrq())
            .append("mqsfzj", getMqsfzj())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("xzqhdm", getXzqhdm())
            .append("dzsheng", getDzsheng())
            .append("dzshi", getDzshi())
            .append("dzxian", getDzxian())
            .append("dzxiang", getDzxiang())
            .append("dzcun", getDzcun())
            .append("dzmp", getDzmp())
            .append("yzbm", getYzbm())
            .append("lxfs", getLxfs())
            .append("xzz", getXzz())
            .append("healthfileId", getHealthFileId())
            .toString();
    }
}
