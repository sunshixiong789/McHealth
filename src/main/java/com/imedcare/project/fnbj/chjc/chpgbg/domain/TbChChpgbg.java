package com.imedcare.project.fnbj.chjc.chpgbg.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产后42天评估报告（孕产妇保健管理结案）对象 tb_ch_chpgbg
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
public class TbChChpgbg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date csrq;

    /** 民族 */
    @Excel(name = "民族")
    private String mz;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String mqsfzjhm;

    /** 结案日期 */
    @Excel(name = "结案日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jarq;

    /** 结案单位名称 */
    @Excel(name = "结案单位名称")
    private String jadwmc;

    /** 结案方式 */
    @Excel(name = "结案方式")
    private String jafs;

    /** 结案人员姓名 */
    @Excel(name = "结案人员姓名")
    private String jaryxm;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String lxfs;

    /** 登记日期 */
    @Excel(name = "登记日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date djrq;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long chjcdjid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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
    public void setMz(String mz) 
    {
        this.mz = mz;
    }

    public String getMz() 
    {
        return mz;
    }
    public void setMqsfzjhm(String mqsfzjhm) 
    {
        this.mqsfzjhm = mqsfzjhm;
    }

    public String getMqsfzjhm() 
    {
        return mqsfzjhm;
    }
    public void setJarq(Date jarq) 
    {
        this.jarq = jarq;
    }

    public Date getJarq() 
    {
        return jarq;
    }
    public void setJadwmc(String jadwmc) 
    {
        this.jadwmc = jadwmc;
    }

    public String getJadwmc() 
    {
        return jadwmc;
    }
    public void setJafs(String jafs) 
    {
        this.jafs = jafs;
    }

    public String getJafs() 
    {
        return jafs;
    }
    public void setJaryxm(String jaryxm) 
    {
        this.jaryxm = jaryxm;
    }

    public String getJaryxm() 
    {
        return jaryxm;
    }
    public void setLxfs(String lxfs) 
    {
        this.lxfs = lxfs;
    }

    public String getLxfs() 
    {
        return lxfs;
    }
    public void setDjrq(Date djrq) 
    {
        this.djrq = djrq;
    }

    public Date getDjrq() 
    {
        return djrq;
    }
    public void setChjcdjid(Long chjcdjid) 
    {
        this.chjcdjid = chjcdjid;
    }

    public Long getChjcdjid() 
    {
        return chjcdjid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("csrq", getCsrq())
            .append("mz", getMz())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("jarq", getJarq())
            .append("jadwmc", getJadwmc())
            .append("jafs", getJafs())
            .append("jaryxm", getJaryxm())
            .append("lxfs", getLxfs())
            .append("djrq", getDjrq())
            .append("chjcdjid", getChjcdjid())
            .toString();
    }
}
