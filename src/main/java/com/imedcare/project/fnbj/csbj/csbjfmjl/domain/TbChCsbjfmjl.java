package com.imedcare.project.fnbj.csbj.csbjfmjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 分娩记录对象 tb_ch_csbjfmjl
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public class TbChCsbjfmjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 妇女档案ID */
    @Excel(name = "妇女档案ID")
    private Long healthfileid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date csrq;

    /** 登记日期 */
    @Excel(name = "登记日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date djrq;

    /** 分娩孕周 */
    @Excel(name = "分娩孕周")
    private Integer fmyz;

    /** 分娩日期时间 */
    @Excel(name = "分娩日期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fmrqsj;

    /** 分娩方式代码 */
    @Excel(name = "分娩方式代码")
    private String fmfsdm;

    /** 总产程时长（min） */
    @Excel(name = "总产程时长", readConverterExp = "m=in")
    private Long zccsc;

    /** 第一产程时长（min） */
    @Excel(name = "第一产程时长", readConverterExp = "m=in")
    private Long dyccsc;

    /** 第二产程时长（min） */
    @Excel(name = "第二产程时长", readConverterExp = "m=in")
    private Long deccsc;

    /** 第三产程时长（min） */
    @Excel(name = "第三产程时长", readConverterExp = "m=in")
    private Long dsccsc;

    /** 产后开奶时长 */
    @Excel(name = "产后开奶时长")
    private Long chknsc;

    /** 产后天数 */
    @Excel(name = "产后天数")
    private Long chts;

    /** 产时并发症代码 */
    @Excel(name = "产时并发症代码")
    private String csbfzdm;

    /** 分娩结局 */
    @Excel(name = "分娩结局")
    private String fmjj;

    /** 总出血量（ml） */
    @Excel(name = "总出血量", readConverterExp = "m=l")
    private Long zcxl;

    /** 产时出血量（ml） */
    @Excel(name = "产时出血量", readConverterExp = "m=l")
    private Long cscxl;

    /** 产后两小时出血量（ml） */
    @Excel(name = "产后两小时出血量", readConverterExp = "m=l")
    private Long chlxscxl;

    /** 会阴-切开标志 */
    @Excel(name = "会阴-切开标志")
    private String hyqkbz;

    /** 会阴-缝合针数 */
    @Excel(name = "会阴-缝合针数")
    private String hyfhzs;

    /** 会阴裂伤程度代码 */
    @Excel(name = "会阴裂伤程度代码")
    private String hylscddm;

    /** 危重孕产妇标志 */
    @Excel(name = "危重孕产妇标志")
    private String wzycfbz;

    /** Apgar评分值（分） */
    @Excel(name = "Apgar评分值", readConverterExp = "分=")
    private String apgarpfz;

    /** 妊娠合并症/并发症史 */
    @Excel(name = "妊娠合并症/并发症史")
    private String rshbzbfzs;

    /** 出生缺陷标志 */
    @Excel(name = "出生缺陷标志")
    private String csqxbz;

    /** 出生缺陷类别代码 */
    @Excel(name = "出生缺陷类别代码")
    private String csqxlbdm;

    /** 出生缺陷儿例数 */
    @Excel(name = "出生缺陷儿例数")
    private String csqxels;

    /** 新生儿并发症-标志 */
    @Excel(name = "新生儿并发症-标志")
    private String xsebfzbz;

    /** 新生儿并发症-代码 */
    @Excel(name = "新生儿并发症-代码")
    private String xsebfadm;

    /** 新生儿抢救标志 */
    @Excel(name = "新生儿抢救标志")
    private String xseqjbz;

    /** 新生儿抢救方法代码 */
    @Excel(name = "新生儿抢救方法代码")
    private String xseqjffdm;

    /** 孕产妇死亡时间类别代码 */
    @Excel(name = "孕产妇死亡时间类别代码")
    private String ycfswsjlbdm;

    /** 助产人员姓名 */
    @Excel(name = "助产人员姓名")
    private String zcryxm;

    /** 助产机构名称 */
    @Excel(name = "助产机构名称")
    private String zcjgmc;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHealthfileid(Long healthfileid) 
    {
        this.healthfileid = healthfileid;
    }

    public Long getHealthfileid() 
    {
        return healthfileid;
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
    public void setDjrq(Date djrq) 
    {
        this.djrq = djrq;
    }

    public Date getDjrq() 
    {
        return djrq;
    }
    public void setFmyz(Integer fmyz) 
    {
        this.fmyz = fmyz;
    }

    public Integer getFmyz() 
    {
        return fmyz;
    }
    public void setFmrqsj(Date fmrqsj) 
    {
        this.fmrqsj = fmrqsj;
    }

    public Date getFmrqsj() 
    {
        return fmrqsj;
    }
    public void setFmfsdm(String fmfsdm) 
    {
        this.fmfsdm = fmfsdm;
    }

    public String getFmfsdm() 
    {
        return fmfsdm;
    }
    public void setZccsc(Long zccsc) 
    {
        this.zccsc = zccsc;
    }

    public Long getZccsc() 
    {
        return zccsc;
    }
    public void setDyccsc(Long dyccsc) 
    {
        this.dyccsc = dyccsc;
    }

    public Long getDyccsc() 
    {
        return dyccsc;
    }
    public void setDeccsc(Long deccsc) 
    {
        this.deccsc = deccsc;
    }

    public Long getDeccsc() 
    {
        return deccsc;
    }
    public void setDsccsc(Long dsccsc) 
    {
        this.dsccsc = dsccsc;
    }

    public Long getDsccsc() 
    {
        return dsccsc;
    }
    public void setChknsc(Long chknsc) 
    {
        this.chknsc = chknsc;
    }

    public Long getChknsc() 
    {
        return chknsc;
    }
    public void setChts(Long chts) 
    {
        this.chts = chts;
    }

    public Long getChts() 
    {
        return chts;
    }
    public void setCsbfzdm(String csbfzdm) 
    {
        this.csbfzdm = csbfzdm;
    }

    public String getCsbfzdm() 
    {
        return csbfzdm;
    }
    public void setFmjj(String fmjj) 
    {
        this.fmjj = fmjj;
    }

    public String getFmjj() 
    {
        return fmjj;
    }
    public void setZcxl(Long zcxl) 
    {
        this.zcxl = zcxl;
    }

    public Long getZcxl() 
    {
        return zcxl;
    }
    public void setCscxl(Long cscxl) 
    {
        this.cscxl = cscxl;
    }

    public Long getCscxl() 
    {
        return cscxl;
    }
    public void setChlxscxl(Long chlxscxl) 
    {
        this.chlxscxl = chlxscxl;
    }

    public Long getChlxscxl() 
    {
        return chlxscxl;
    }
    public void setHyqkbz(String hyqkbz) 
    {
        this.hyqkbz = hyqkbz;
    }

    public String getHyqkbz() 
    {
        return hyqkbz;
    }
    public void setHyfhzs(String hyfhzs) 
    {
        this.hyfhzs = hyfhzs;
    }

    public String getHyfhzs() 
    {
        return hyfhzs;
    }
    public void setHylscddm(String hylscddm) 
    {
        this.hylscddm = hylscddm;
    }

    public String getHylscddm() 
    {
        return hylscddm;
    }
    public void setWzycfbz(String wzycfbz) 
    {
        this.wzycfbz = wzycfbz;
    }

    public String getWzycfbz() 
    {
        return wzycfbz;
    }
    public void setApgarpfz(String apgarpfz) 
    {
        this.apgarpfz = apgarpfz;
    }

    public String getApgarpfz() 
    {
        return apgarpfz;
    }
    public void setRshbzbfzs(String rshbzbfzs) 
    {
        this.rshbzbfzs = rshbzbfzs;
    }

    public String getRshbzbfzs() 
    {
        return rshbzbfzs;
    }
    public void setCsqxbz(String csqxbz) 
    {
        this.csqxbz = csqxbz;
    }

    public String getCsqxbz() 
    {
        return csqxbz;
    }
    public void setCsqxlbdm(String csqxlbdm) 
    {
        this.csqxlbdm = csqxlbdm;
    }

    public String getCsqxlbdm() 
    {
        return csqxlbdm;
    }
    public void setCsqxels(String csqxels) 
    {
        this.csqxels = csqxels;
    }

    public String getCsqxels() 
    {
        return csqxels;
    }
    public void setXsebfzbz(String xsebfzbz) 
    {
        this.xsebfzbz = xsebfzbz;
    }

    public String getXsebfzbz() 
    {
        return xsebfzbz;
    }
    public void setXsebfadm(String xsebfadm) 
    {
        this.xsebfadm = xsebfadm;
    }

    public String getXsebfadm() 
    {
        return xsebfadm;
    }
    public void setXseqjbz(String xseqjbz) 
    {
        this.xseqjbz = xseqjbz;
    }

    public String getXseqjbz() 
    {
        return xseqjbz;
    }
    public void setXseqjffdm(String xseqjffdm) 
    {
        this.xseqjffdm = xseqjffdm;
    }

    public String getXseqjffdm() 
    {
        return xseqjffdm;
    }
    public void setYcfswsjlbdm(String ycfswsjlbdm) 
    {
        this.ycfswsjlbdm = ycfswsjlbdm;
    }

    public String getYcfswsjlbdm() 
    {
        return ycfswsjlbdm;
    }
    public void setZcryxm(String zcryxm) 
    {
        this.zcryxm = zcryxm;
    }

    public String getZcryxm() 
    {
        return zcryxm;
    }
    public void setZcjgmc(String zcjgmc) 
    {
        this.zcjgmc = zcjgmc;
    }

    public String getZcjgmc() 
    {
        return zcjgmc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("healthfileid", getHealthfileid())
            .append("xm", getXm())
            .append("csrq", getCsrq())
            .append("djrq", getDjrq())
            .append("fmyz", getFmyz())
            .append("fmrqsj", getFmrqsj())
            .append("fmfsdm", getFmfsdm())
            .append("zccsc", getZccsc())
            .append("dyccsc", getDyccsc())
            .append("deccsc", getDeccsc())
            .append("dsccsc", getDsccsc())
            .append("chknsc", getChknsc())
            .append("chts", getChts())
            .append("csbfzdm", getCsbfzdm())
            .append("fmjj", getFmjj())
            .append("zcxl", getZcxl())
            .append("cscxl", getCscxl())
            .append("chlxscxl", getChlxscxl())
            .append("hyqkbz", getHyqkbz())
            .append("hyfhzs", getHyfhzs())
            .append("hylscddm", getHylscddm())
            .append("wzycfbz", getWzycfbz())
            .append("apgarpfz", getApgarpfz())
            .append("rshbzbfzs", getRshbzbfzs())
            .append("csqxbz", getCsqxbz())
            .append("csqxlbdm", getCsqxlbdm())
            .append("csqxels", getCsqxels())
            .append("xsebfzbz", getXsebfzbz())
            .append("xsebfadm", getXsebfadm())
            .append("xseqjbz", getXseqjbz())
            .append("xseqjffdm", getXseqjffdm())
            .append("ycfswsjlbdm", getYcfswsjlbdm())
            .append("zcryxm", getZcryxm())
            .append("zcjgmc", getZcjgmc())
            .toString();
    }
}
