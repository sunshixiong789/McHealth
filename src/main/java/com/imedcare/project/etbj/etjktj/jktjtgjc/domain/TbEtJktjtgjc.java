package com.imedcare.project.etbj.etjktj.jktjtgjc.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;

/**
 * 儿童健康体检问询记录对象 tb_et_jktjtgjc
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public class TbEtJktjtgjc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long djid;

    /** 分娩方式 */
    @Excel(name = "分娩方式")
    private Integer fmfs;

    /** 出生孕周 */
    @Excel(name = "出生孕周")
    private Integer csyz;

    /** 体重 */
    @Excel(name = "体重")
    private Double tz;

    /** 身长 */
    @Excel(name = "身长")
    private Long sc;

    /** Apgar评分值 */
    @Excel(name = "Apgar评分值")
    private Integer pfz;

    /** 出生缺陷标志 */
    @Excel(name = "出生缺陷标志")
    private Integer csqxbz;

    /** 出生缺陷类别 */
    @Excel(name = "出生缺陷类别")
    private Integer csqxlb;

    /** 疾病筛查结果 */
    @Excel(name = "疾病筛查结果")
    private Integer jbscjg;

    /** 家族遗传病史 */
    @Excel(name = "家族遗传病史")
    private String ycbs;

    /** 患者与儿童关系 */
    @Excel(name = "患者与儿童关系")
    private String hzbrgx;

    /** 过敏史 */
    @Excel(name = "过敏史")
    private String gms;

    /** 抬头月龄 */
    @Excel(name = "抬头月龄")
    private Integer ttyl;

    /** 翻身月龄 */
    @Excel(name = "翻身月龄")
    private Integer fsyl;

    /** 独坐月龄 */
    @Excel(name = "独坐月龄")
    private Integer dzyl;

    /** 爬行月龄 */
    @Excel(name = "爬行月龄")
    private Integer pxyl;

    /** ABO血型代码 */
    @Excel(name = "ABO血型代码")
    private Integer aobxx;

    /** Rh血型代码 */
    @Excel(name = "Rh血型代码")
    private Integer rhxx;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDjid(Long djid) 
    {
        this.djid = djid;
    }

    public Long getDjid() 
    {
        return djid;
    }
    public void setFmfs(Integer fmfs) 
    {
        this.fmfs = fmfs;
    }

    public Integer getFmfs() 
    {
        return fmfs;
    }
    public void setCsyz(Integer csyz) 
    {
        this.csyz = csyz;
    }

    public Integer getCsyz() 
    {
        return csyz;
    }
    public void setTz(Double tz) 
    {
        this.tz = tz;
    }

    public Double getTz() 
    {
        return tz;
    }
    public void setSc(Long sc) 
    {
        this.sc = sc;
    }

    public Long getSc() 
    {
        return sc;
    }
    public void setPfz(Integer pfz) 
    {
        this.pfz = pfz;
    }

    public Integer getPfz() 
    {
        return pfz;
    }
    public void setCsqxbz(Integer csqxbz) 
    {
        this.csqxbz = csqxbz;
    }

    public Integer getCsqxbz() 
    {
        return csqxbz;
    }
    public void setCsqxlb(Integer csqxlb) 
    {
        this.csqxlb = csqxlb;
    }

    public Integer getCsqxlb() 
    {
        return csqxlb;
    }
    public void setJbscjg(Integer jbscjg) 
    {
        this.jbscjg = jbscjg;
    }

    public Integer getJbscjg() 
    {
        return jbscjg;
    }
    public void setYcbs(String ycbs) 
    {
        this.ycbs = ycbs;
    }

    public String getYcbs() 
    {
        return ycbs;
    }
    public void setHzbrgx(String hzbrgx) 
    {
        this.hzbrgx = hzbrgx;
    }

    public String getHzbrgx() 
    {
        return hzbrgx;
    }
    public void setGms(String gms) 
    {
        this.gms = gms;
    }

    public String getGms() 
    {
        return gms;
    }
    public void setTtyl(Integer ttyl) 
    {
        this.ttyl = ttyl;
    }

    public Integer getTtyl() 
    {
        return ttyl;
    }
    public void setFsyl(Integer fsyl) 
    {
        this.fsyl = fsyl;
    }

    public Integer getFsyl() 
    {
        return fsyl;
    }
    public void setDzyl(Integer dzyl) 
    {
        this.dzyl = dzyl;
    }

    public Integer getDzyl() 
    {
        return dzyl;
    }
    public void setPxyl(Integer pxyl) 
    {
        this.pxyl = pxyl;
    }

    public Integer getPxyl() 
    {
        return pxyl;
    }
    public void setAobxx(Integer aobxx) 
    {
        this.aobxx = aobxx;
    }

    public Integer getAobxx() 
    {
        return aobxx;
    }
    public void setRhxx(Integer rhxx) 
    {
        this.rhxx = rhxx;
    }

    public Integer getRhxx() 
    {
        return rhxx;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("djid", getDjid())
            .append("fmfs", getFmfs())
            .append("csyz", getCsyz())
            .append("tz", getTz())
            .append("sc", getSc())
            .append("pfz", getPfz())
            .append("csqxbz", getCsqxbz())
            .append("csqxlb", getCsqxlb())
            .append("jbscjg", getJbscjg())
            .append("ycbs", getYcbs())
            .append("hzbrgx", getHzbrgx())
            .append("gms", getGms())
            .append("ttyl", getTtyl())
            .append("fsyl", getFsyl())
            .append("dzyl", getDzyl())
            .append("pxyl", getPxyl())
            .append("aobxx", getAobxx())
            .append("rhxx", getRhxx())
            .toString();
    }
}
