package com.imedcare.project.etbj.etjktj.jktjdj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 儿童健康体检登记对象 tb_et_jktjdj
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
public class TbEtJktjdj extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 建档日期 */
    @Excel(name = "建档日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jdrq;

    /** 建档人员 */
    @Excel(name = "建档人员")
    private String jdry;

    /** 建档机构 */
    @Excel(name = "建档机构")
    private String jdjg;

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

    /** 母亲证件号码 */
    @Excel(name = "母亲证件号码")
    private String mqsfzjhm;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String lxfs;

    /** 现住址 */
    @Excel(name = "现住址")
    private String xzz;

    /** 档案ID */
    @Excel(name = "档案ID")
    private Long healthFileId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setJdrq(Date jdrq) 
    {
        this.jdrq = jdrq;
    }

    public Date getJdrq() 
    {
        return jdrq;
    }
    public void setJdry(String jdry) 
    {
        this.jdry = jdry;
    }

    public String getJdry() 
    {
        return jdry;
    }
    public void setJdjg(String jdjg) 
    {
        this.jdjg = jdjg;
    }

    public String getJdjg() 
    {
        return jdjg;
    }
    public void setXm(String xm) 
    {
        this.xm = xm;
    }

    public String getXm() 
    {
        return xm;
    }
    public void setXbdm(String xbdm) 
    {
        this.xbdm = xbdm;
    }

    public String getXbdm() 
    {
        return xbdm;
    }
    public void setCsrq(String csrq)
    {
        this.csrq = csrq;
    }

    public String getCsrq()
    {
        return csrq;
    }
    public void setMqxm(String mqxm) 
    {
        this.mqxm = mqxm;
    }

    public String getMqxm() 
    {
        return mqxm;
    }
    public void setMqsfzjhm(String mqsfzjhm) 
    {
        this.mqsfzjhm = mqsfzjhm;
    }

    public String getMqsfzjhm() 
    {
        return mqsfzjhm;
    }
    public void setLxfs(String lxfs) 
    {
        this.lxfs = lxfs;
    }

    public String getLxfs() 
    {
        return lxfs;
    }
    public void setXzz(String xzz) 
    {
        this.xzz = xzz;
    }

    public String getXzz() 
    {
        return xzz;
    }

    public Long getHealthFileId() {
        return healthFileId;
    }

    public void setHealthFileId(Long healthFileId) {
        this.healthFileId = healthFileId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("jdrq", getJdrq())
            .append("jdry", getJdry())
            .append("jdjg", getJdjg())
            .append("xm", getXm())
            .append("xbdm", getXbdm())
            .append("csrq", getCsrq())
            .append("mqxm", getMqxm())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("lxfs", getLxfs())
            .append("xzz", getXzz())
            .toString();
    }
}
