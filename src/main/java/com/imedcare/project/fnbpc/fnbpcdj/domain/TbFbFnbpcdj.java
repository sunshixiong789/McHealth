package com.imedcare.project.fnbpc.fnbpcdj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 妇女病普查登记对象 tb_fb_fnbpcdj
 * 
 * @author imedcare
 * @date 2019-11-20
 */
public class TbFbFnbpcdj extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 妇女基本情况信息ID */
    private Long fnjbqkxxid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date csrq;

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String sfzjLbdm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String sfzjHm;

    /** 创建时间 */
    private Date createDate;

    /** 最后修改者 */
    private String lastUpdateBy;

    /** 最后修改时间 */
    private Date lastUpdateDate;

    /** 修改标志 1、正常，2、修改，3、撤销 */
    private String xgbz;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFnjbqkxxid(Long fnjbqkxxid) 
    {
        this.fnjbqkxxid = fnjbqkxxid;
    }

    public Long getFnjbqkxxid() 
    {
        return fnjbqkxxid;
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
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setLastUpdateBy(String lastUpdateBy) 
    {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getLastUpdateBy() 
    {
        return lastUpdateBy;
    }
    public void setLastUpdateDate(Date lastUpdateDate) 
    {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getLastUpdateDate() 
    {
        return lastUpdateDate;
    }
    public void setXgbz(String xgbz) 
    {
        this.xgbz = xgbz;
    }

    public String getXgbz() 
    {
        return xgbz;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fnjbqkxxid", getFnjbqkxxid())
            .append("xm", getXm())
            .append("csrq", getCsrq())
            .append("sfzjLbdm", getSfzjLbdm())
            .append("sfzjHm", getSfzjHm())
            .append("createBy", getCreateBy())
            .append("createDate", getCreateDate())
            .append("lastUpdateBy", getLastUpdateBy())
            .append("lastUpdateDate", getLastUpdateDate())
            .append("xgbz", getXgbz())
            .toString();
    }
}
