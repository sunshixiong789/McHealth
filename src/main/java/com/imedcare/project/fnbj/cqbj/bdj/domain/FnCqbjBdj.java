package com.imedcare.project.fnbj.cqbj.bdj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前保健登记对象 fn_cqbj_bdj
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public class FnCqbjBdj extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 住院号 */
    @Excel(name = "住院号")
    private String zyh;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 健康档案ID */
    @Excel(name = "健康档案ID")
    private Long daid;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 文化程度代码 */
    @Excel(name = "文化程度代码")
    private String whcddm;

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String sfzjLbdm;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String sfzjHm;

    /** 职业类别代码(国标) */
    @Excel(name = "职业类别代码(国标)")
    private String zylbdm;

    /** 工作单位名称 */
    @Excel(name = "工作单位名称")
    private String gzdwmc;

    /** 配偶名称 */
    @Excel(name = "配偶名称")
    private String pomc;

    /** 配偶出生日期 */
    @Excel(name = "配偶出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pocsrq;

    /** 配偶名族代码 */
    @Excel(name = "配偶名族代码")
    private String pomzdm;

    /** 配偶文化程度代码 */
    @Excel(name = "配偶文化程度代码")
    private String powhcdm;

    /** 配偶身份证件-类别代码 */
    @Excel(name = "配偶身份证件-类别代码")
    private String posfzjLedm;

    /** 配偶身份证件-号码 */
    @Excel(name = "配偶身份证件-号码")
    private String posfzjHm;

    /** 配偶职业类别代码(国标) */
    @Excel(name = "配偶职业类别代码(国标)")
    private String pozylbdm;

    /** 配偶工作单位名称 */
    @Excel(name = "配偶工作单位名称")
    private String pogzdwmc;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setZyh(String zyh) 
    {
        this.zyh = zyh;
    }

    public String getZyh() 
    {
        return zyh;
    }
    public void setXm(String xm) 
    {
        this.xm = xm;
    }

    public String getXm() 
    {
        return xm;
    }
    public void setDaid(Long daid) 
    {
        this.daid = daid;
    }

    public Long getDaid() 
    {
        return daid;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setWhcddm(String whcddm) 
    {
        this.whcddm = whcddm;
    }

    public String getWhcddm() 
    {
        return whcddm;
    }
    public void setSfzjLbdm(String sfzjLbdm) 
    {
        this.sfzjLbdm = sfzjLbdm;
    }

    public String getSfzjLbdm() 
    {
        return sfzjLbdm;
    }
    public void setSfzjHm(String sfzjHm) 
    {
        this.sfzjHm = sfzjHm;
    }

    public String getSfzjHm() 
    {
        return sfzjHm;
    }
    public void setZylbdm(String zylbdm) 
    {
        this.zylbdm = zylbdm;
    }

    public String getZylbdm() 
    {
        return zylbdm;
    }
    public void setGzdwmc(String gzdwmc) 
    {
        this.gzdwmc = gzdwmc;
    }

    public String getGzdwmc() 
    {
        return gzdwmc;
    }
    public void setPomc(String pomc) 
    {
        this.pomc = pomc;
    }

    public String getPomc() 
    {
        return pomc;
    }
    public void setPocsrq(Date pocsrq) 
    {
        this.pocsrq = pocsrq;
    }

    public Date getPocsrq() 
    {
        return pocsrq;
    }
    public void setPomzdm(String pomzdm) 
    {
        this.pomzdm = pomzdm;
    }

    public String getPomzdm() 
    {
        return pomzdm;
    }
    public void setPowhcdm(String powhcdm) 
    {
        this.powhcdm = powhcdm;
    }

    public String getPowhcdm() 
    {
        return powhcdm;
    }
    public void setPosfzjLedm(String posfzjLedm) 
    {
        this.posfzjLedm = posfzjLedm;
    }

    public String getPosfzjLedm() 
    {
        return posfzjLedm;
    }
    public void setPosfzjHm(String posfzjHm) 
    {
        this.posfzjHm = posfzjHm;
    }

    public String getPosfzjHm() 
    {
        return posfzjHm;
    }
    public void setPozylbdm(String pozylbdm) 
    {
        this.pozylbdm = pozylbdm;
    }

    public String getPozylbdm() 
    {
        return pozylbdm;
    }
    public void setPogzdwmc(String pogzdwmc) 
    {
        this.pogzdwmc = pogzdwmc;
    }

    public String getPogzdwmc() 
    {
        return pogzdwmc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zyh", getZyh())
            .append("xm", getXm())
            .append("daid", getDaid())
            .append("birthday", getBirthday())
            .append("whcddm", getWhcddm())
            .append("sfzjLbdm", getSfzjLbdm())
            .append("sfzjHm", getSfzjHm())
            .append("zylbdm", getZylbdm())
            .append("gzdwmc", getGzdwmc())
            .append("pomc", getPomc())
            .append("pocsrq", getPocsrq())
            .append("pomzdm", getPomzdm())
            .append("powhcdm", getPowhcdm())
            .append("posfzjLedm", getPosfzjLedm())
            .append("posfzjHm", getPosfzjHm())
            .append("pozylbdm", getPozylbdm())
            .append("pogzdwmc", getPogzdwmc())
            .toString();
    }
}
