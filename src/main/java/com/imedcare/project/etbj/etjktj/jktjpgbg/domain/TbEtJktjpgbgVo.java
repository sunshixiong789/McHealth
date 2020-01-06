package com.imedcare.project.etbj.etjktj.jktjpgbg.domain;

import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 儿童健康体检评估报告对象 tb_et_jktjpgbg
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public class TbEtJktjpgbgVo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long djid;

    /** 体格检查ID */
    @Excel(name = "体格检查ID")
    private Long tgjcid;

    /** 实验室记录ID */
    @Excel(name = "实验室记录ID")
    private Long sysjlid;

    /** 处理意见 */
    @Excel(name = "处理意见")
    private String clyj;

    /** 结案方式 */
    @Excel(name = "结案方式")
    private String jafs;

    /** 结案日期 */
    @Excel(name = "结案日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jarq;

    /** 结案机构 */
    @Excel(name = "结案机构")
    private String jajg;

    /** 结案人员 */
    @Excel(name = "结案人员")
    private String jary;

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
    public void setDjid(Long djid) 
    {
        this.djid = djid;
    }

    public Long getDjid() 
    {
        return djid;
    }
    public void setTgjcid(Long tgjcid) 
    {
        this.tgjcid = tgjcid;
    }

    public Long getTgjcid() 
    {
        return tgjcid;
    }
    public void setSysjlid(Long sysjlid) 
    {
        this.sysjlid = sysjlid;
    }

    public Long getSysjlid() 
    {
        return sysjlid;
    }
    public void setClyj(String clyj) 
    {
        this.clyj = clyj;
    }

    public String getClyj() 
    {
        return clyj;
    }
    public void setJafs(String jafs) 
    {
        this.jafs = jafs;
    }

    public String getJafs() 
    {
        return jafs;
    }
    public void setJarq(Date jarq) 
    {
        this.jarq = jarq;
    }

    public Date getJarq() 
    {
        return jarq;
    }
    public void setJajg(String jajg) 
    {
        this.jajg = jajg;
    }

    public String getJajg() 
    {
        return jajg;
    }
    public void setJary(String jary) 
    {
        this.jary = jary;
    }

    public String getJary() 
    {
        return jary;
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
            .append("djid", getDjid())
            .append("tgjcid", getTgjcid())
            .append("sysjlid", getSysjlid())
            .append("clyj", getClyj())
            .append("jafs", getJafs())
            .append("jarq", getJarq())
            .append("jajg", getJajg())
            .append("jary", getJary())
            .toString();
    }
}
