package com.imedcare.project.fnbj.cqbj.yixzd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前保健医学指导对象 fn_cqbj_yixzd
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public class FnCqbjYixzd extends BaseEntity
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

    /** 身份证件_类别代码 */
    @Excel(name = "身份证件_类别代码")
    private String sfzjLbdm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String sfzjHm;

    /** 处理及指导意见 */
    @Excel(name = "处理及指导意见")
    private String cljzdyj;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jcrxxm;

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
    public void setCljzdyj(String cljzdyj) 
    {
        this.cljzdyj = cljzdyj;
    }

    public String getCljzdyj() 
    {
        return cljzdyj;
    }
    public void setJcrxxm(String jcrxxm) 
    {
        this.jcrxxm = jcrxxm;
    }

    public String getJcrxxm() 
    {
        return jcrxxm;
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
            .append("sfzjLbdm", getSfzjLbdm())
            .append("sfzjHm", getSfzjHm())
            .append("cljzdyj", getCljzdyj())
            .append("jcrxxm", getJcrxxm())
            .append("jcjgmc", getJcjgmc())
            .append("jcrq", getJcrq())
            .toString();
    }
}
