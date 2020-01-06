package com.imedcare.project.fnbj.chjc.chtgjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产后42天体格检查记录对象 tb_ch_chtgjcjl
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
public class TbChChtgjcjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 产后42天检查登记id */
    @Excel(name = "产后42天检查登记id")
    private Long chjcdjid;

    /** null */
    @Excel(name = "null")
    private String xm;

    /** 体温 */
    @Excel(name = "体温")
    private String tw;

    /** 收缩压 */
    @Excel(name = "收缩压")
    private String ssy;

    /** 舒张压 */
    @Excel(name = "舒张压")
    private String szy;

    /** 乳头检查结果 */
    @Excel(name = "乳头检查结果")
    private String rrjcjg;

    /** 甲状腺检查结果 */
    @Excel(name = "甲状腺检查结果")
    private String jzxjcjg;

    /** 心脏听诊结果 */
    @Excel(name = "心脏听诊结果")
    private String xztzjg;

    /** 肺部听诊结果 */
    @Excel(name = "肺部听诊结果")
    private String fbtzjg;

    /** 宫颈检查结果 */
    @Excel(name = "宫颈检查结果")
    private String gjjcjg;

    /** 阴道检查结果 */
    @Excel(name = "阴道检查结果")
    private String ydjcjg;

    /** 子宫检查结果 */
    @Excel(name = "子宫检查结果")
    private String zgjcjg;

    /** 左侧附件检查结果代码 */
    @Excel(name = "左侧附件检查结果代码")
    private String zcfjjcjgdm;

    /** 右侧附件检查结果代码 */
    @Excel(name = "右侧附件检查结果代码")
    private String ycfjjcjgdm;

    /** 左侧乳腺检查结果代码 */
    @Excel(name = "左侧乳腺检查结果代码")
    private String zcrxjcjgdm;

    /** 右侧乳腺检查结果代码 */
    @Excel(name = "右侧乳腺检查结果代码")
    private String ycrxjcjgdm;

    /** 外阴检查结果 */
    @Excel(name = "外阴检查结果")
    private String wyjcjg;

    /** 伤口愈合状况代码 */
    @Excel(name = "伤口愈合状况代码")
    private String skyhzkdm;

    /** 恶露状况 */
    @Excel(name = "恶露状况")
    private String elzk;

    /** 检查（测）人员姓名 */
    @Excel(name = "检查", readConverterExp = "测=")
    private String jcryxm;

    /** 检查（测）机构名称 */
    @Excel(name = "检查", readConverterExp = "测=")
    private String jcjgmc;

    /** 检查（测）日期 */
    @Excel(name = "检查", readConverterExp = "测=")
    private Date jcrq;

    /** 填表日期 */
    @Excel(name = "填表日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tbrq;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setChjcdjid(Long chjcdjid) 
    {
        this.chjcdjid = chjcdjid;
    }

    public Long getChjcdjid() 
    {
        return chjcdjid;
    }
    public void setXm(String xm) 
    {
        this.xm = xm;
    }

    public String getXm() 
    {
        return xm;
    }
    public void setTw(String tw) 
    {
        this.tw = tw;
    }

    public String getTw() 
    {
        return tw;
    }
    public void setSsy(String ssy) 
    {
        this.ssy = ssy;
    }

    public String getSsy() 
    {
        return ssy;
    }
    public void setSzy(String szy) 
    {
        this.szy = szy;
    }

    public String getSzy() 
    {
        return szy;
    }
    public void setRrjcjg(String rrjcjg) 
    {
        this.rrjcjg = rrjcjg;
    }

    public String getRrjcjg() 
    {
        return rrjcjg;
    }
    public void setJzxjcjg(String jzxjcjg) 
    {
        this.jzxjcjg = jzxjcjg;
    }

    public String getJzxjcjg() 
    {
        return jzxjcjg;
    }
    public void setXztzjg(String xztzjg) 
    {
        this.xztzjg = xztzjg;
    }

    public String getXztzjg() 
    {
        return xztzjg;
    }
    public void setFbtzjg(String fbtzjg) 
    {
        this.fbtzjg = fbtzjg;
    }

    public String getFbtzjg() 
    {
        return fbtzjg;
    }
    public void setGjjcjg(String gjjcjg) 
    {
        this.gjjcjg = gjjcjg;
    }

    public String getGjjcjg() 
    {
        return gjjcjg;
    }
    public void setYdjcjg(String ydjcjg) 
    {
        this.ydjcjg = ydjcjg;
    }

    public String getYdjcjg() 
    {
        return ydjcjg;
    }
    public void setZgjcjg(String zgjcjg) 
    {
        this.zgjcjg = zgjcjg;
    }

    public String getZgjcjg() 
    {
        return zgjcjg;
    }
    public void setZcfjjcjgdm(String zcfjjcjgdm) 
    {
        this.zcfjjcjgdm = zcfjjcjgdm;
    }

    public String getZcfjjcjgdm() 
    {
        return zcfjjcjgdm;
    }
    public void setYcfjjcjgdm(String ycfjjcjgdm) 
    {
        this.ycfjjcjgdm = ycfjjcjgdm;
    }

    public String getYcfjjcjgdm() 
    {
        return ycfjjcjgdm;
    }
    public void setZcrxjcjgdm(String zcrxjcjgdm) 
    {
        this.zcrxjcjgdm = zcrxjcjgdm;
    }

    public String getZcrxjcjgdm() 
    {
        return zcrxjcjgdm;
    }
    public void setYcrxjcjgdm(String ycrxjcjgdm) 
    {
        this.ycrxjcjgdm = ycrxjcjgdm;
    }

    public String getYcrxjcjgdm() 
    {
        return ycrxjcjgdm;
    }
    public void setWyjcjg(String wyjcjg) 
    {
        this.wyjcjg = wyjcjg;
    }

    public String getWyjcjg() 
    {
        return wyjcjg;
    }
    public void setSkyhzkdm(String skyhzkdm) 
    {
        this.skyhzkdm = skyhzkdm;
    }

    public String getSkyhzkdm() 
    {
        return skyhzkdm;
    }
    public void setElzk(String elzk) 
    {
        this.elzk = elzk;
    }

    public String getElzk() 
    {
        return elzk;
    }
    public void setJcryxm(String jcryxm) 
    {
        this.jcryxm = jcryxm;
    }

    public String getJcryxm() 
    {
        return jcryxm;
    }
    public void setJcjgmc(String jcjgmc) 
    {
        this.jcjgmc = jcjgmc;
    }

    public String getJcjgmc() 
    {
        return jcjgmc;
    }
    public void setJcrq(Date jcrq) 
    {
        this.jcrq = jcrq;
    }

    public Date getJcrq() 
    {
        return jcrq;
    }
    public void setTbrq(Date tbrq) 
    {
        this.tbrq = tbrq;
    }

    public Date getTbrq() 
    {
        return tbrq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("chjcdjid", getChjcdjid())
            .append("xm", getXm())
            .append("tw", getTw())
            .append("ssy", getSsy())
            .append("szy", getSzy())
            .append("rrjcjg", getRrjcjg())
            .append("jzxjcjg", getJzxjcjg())
            .append("xztzjg", getXztzjg())
            .append("fbtzjg", getFbtzjg())
            .append("gjjcjg", getGjjcjg())
            .append("ydjcjg", getYdjcjg())
            .append("zgjcjg", getZgjcjg())
            .append("zcfjjcjgdm", getZcfjjcjgdm())
            .append("ycfjjcjgdm", getYcfjjcjgdm())
            .append("zcrxjcjgdm", getZcrxjcjgdm())
            .append("ycrxjcjgdm", getYcrxjcjgdm())
            .append("wyjcjg", getWyjcjg())
            .append("skyhzkdm", getSkyhzkdm())
            .append("elzk", getElzk())
            .append("jcryxm", getJcryxm())
            .append("jcjgmc", getJcjgmc())
            .append("jcrq", getJcrq())
            .append("tbrq", getTbrq())
            .toString();
    }
}
