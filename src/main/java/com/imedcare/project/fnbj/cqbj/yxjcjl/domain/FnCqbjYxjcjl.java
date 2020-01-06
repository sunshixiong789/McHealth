package com.imedcare.project.fnbj.cqbj.yxjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前保健影像检查记录对象 fn_cqbj_yxjcjl
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public class FnCqbjYxjcjl extends BaseEntity
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

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String sfzlbDm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String sfzjHm;

    /** B超检查结果 */
    @Excel(name = "B超检查结果")
    private String bcjcjg;

    /** 胎方位代码 */
    @Excel(name = "胎方位代码")
    private String tfwdm;

    /** 胎先露代码 */
    @Excel(name = "胎先露代码")
    private String txldm;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jcryxm;

    /** 检查(测)机构名称 */
    @Excel(name = "检查(测)机构名称")
    private String jcjgmc;

    /** 检查(测)日期 */
    @Excel(name = "检查(测)日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

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
    public void setSfzlbDm(String sfzlbDm) 
    {
        this.sfzlbDm = sfzlbDm;
    }

    public String getSfzlbDm() 
    {
        return sfzlbDm;
    }
    public void setSfzjHm(String sfzjHm) 
    {
        this.sfzjHm = sfzjHm;
    }

    public String getSfzjHm() 
    {
        return sfzjHm;
    }
    public void setBcjcjg(String bcjcjg) 
    {
        this.bcjcjg = bcjcjg;
    }

    public String getBcjcjg() 
    {
        return bcjcjg;
    }
    public void setTfwdm(String tfwdm) 
    {
        this.tfwdm = tfwdm;
    }

    public String getTfwdm() 
    {
        return tfwdm;
    }
    public void setTxldm(String txldm) 
    {
        this.txldm = txldm;
    }

    public String getTxldm() 
    {
        return txldm;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zyh", getZyh())
            .append("xm", getXm())
            .append("daid", getDaid())
            .append("birthday", getBirthday())
            .append("sfzlbDm", getSfzlbDm())
            .append("sfzjHm", getSfzjHm())
            .append("bcjcjg", getBcjcjg())
            .append("tfwdm", getTfwdm())
            .append("txldm", getTxldm())
            .append("jcryxm", getJcryxm())
            .append("jcjgmc", getJcjgmc())
            .append("jcrq", getJcrq())
            .toString();
    }
}
