package com.imedcare.project.etbj.tretgl.trpgbg.domain;

import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 体弱儿童评估报告对象 tb_et_trpgbg
 * 
 * @author 黄维业
 * @date 2019-11-27
 */
public class TbEtTrpgbgVo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 转归 */
    @Excel(name = "转归")
    private Integer gzdm;

    /** 结案日期 */
    @Excel(name = "结案日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jarq;

    /** 结案医生 */
    @Excel(name = "结案医生")
    private String jays;

    /** 结案机构 */
    @Excel(name = "结案机构")
    private String jajg;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long djid;

    /** 姓名 */
    @Excel(name = "姓名")
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

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGzdm(Integer gzdm) 
    {
        this.gzdm = gzdm;
    }

    public Integer getGzdm() 
    {
        return gzdm;
    }
    public void setJarq(Date jarq) 
    {
        this.jarq = jarq;
    }

    public Date getJarq() 
    {
        return jarq;
    }
    public void setJays(String jays) 
    {
        this.jays = jays;
    }

    public String getJays() 
    {
        return jays;
    }
    public void setJajg(String jajg) 
    {
        this.jajg = jajg;
    }

    public String getJajg() 
    {
        return jajg;
    }
    public void setDjid(Long djid) 
    {
        this.djid = djid;
    }

    public Long getDjid() 
    {
        return djid;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXbdm() {
        return xbdm;
    }

    public void setXbdm(String xbdm) {
        this.xbdm = xbdm;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getMqxm() {
        return mqxm;
    }

    public void setMqxm(String mqxm) {
        this.mqxm = mqxm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("gzdm", getGzdm())
            .append("jarq", getJarq())
            .append("jays", getJays())
            .append("jajg", getJajg())
            .append("djid", getDjid())
            .toString();
    }
}
