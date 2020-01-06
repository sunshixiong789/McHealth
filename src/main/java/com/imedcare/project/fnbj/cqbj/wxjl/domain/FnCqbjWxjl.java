package com.imedcare.project.fnbj.cqbj.wxjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前保健问询记录对象 fn_cqbj_wxjl
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public class FnCqbjWxjl extends BaseEntity
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

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 健康档案id */
    @Excel(name = "健康档案id")
    private Long daid;

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String sfzjLbdm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String sfzjHm;

    /** 现病史 */
    @Excel(name = "现病史")
    private String xbs;

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
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setDaid(Long daid) 
    {
        this.daid = daid;
    }

    public Long getDaid() 
    {
        return daid;
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
    public void setXbs(String xbs) 
    {
        this.xbs = xbs;
    }

    public String getXbs() 
    {
        return xbs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zyh", getZyh())
            .append("xm", getXm())
            .append("birthday", getBirthday())
            .append("daid", getDaid())
            .append("sfzjLbdm", getSfzjLbdm())
            .append("sfzjHm", getSfzjHm())
            .append("xbs", getXbs())
            .toString();
    }
}
