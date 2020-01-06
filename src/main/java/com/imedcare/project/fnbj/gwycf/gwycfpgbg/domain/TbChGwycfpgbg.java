package com.imedcare.project.fnbj.gwycf.gwycfpgbg.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 高危孕产妇评估报告对象 tb_ch_gwycfpgbg
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public class TbChGwycfpgbg extends BaseEntity
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

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String mqsfzjhm;

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String mqsfzjlbdm;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String lxfs;

    /** 高危妊娠转归代码 */
    @Excel(name = "高危妊娠转归代码")
    private String gwrszgdm;

    /** 高危转归日期 */
    @Excel(name = "高危转归日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gwzgrq;

    /** 高危转归医生姓名 */
    @Excel(name = "高危转归医生姓名")
    private String gwzgysxm;

    /** 高危转归机构名称 */
    @Excel(name = "高危转归机构名称")
    private String gwzgjgmc;

    /** 结案日期 */
    @Excel(name = "结案日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jarq;

    /** 结案单位名称 */
    @Excel(name = "结案单位名称")
    private String jadwmc;

    /** 登记日期 */
    @Excel(name = "登记日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date djrq;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long gwycfdjid;

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
    public void setMqsfzjhm(String mqsfzjhm) 
    {
        this.mqsfzjhm = mqsfzjhm;
    }

    public String getMqsfzjhm() 
    {
        return mqsfzjhm;
    }
    public void setMqsfzjlbdm(String mqsfzjlbdm) 
    {
        this.mqsfzjlbdm = mqsfzjlbdm;
    }

    public String getMqsfzjlbdm() 
    {
        return mqsfzjlbdm;
    }
    public void setLxfs(String lxfs) 
    {
        this.lxfs = lxfs;
    }

    public String getLxfs() 
    {
        return lxfs;
    }
    public void setGwrszgdm(String gwrszgdm) 
    {
        this.gwrszgdm = gwrszgdm;
    }

    public String getGwrszgdm() 
    {
        return gwrszgdm;
    }
    public void setGwzgrq(Date gwzgrq) 
    {
        this.gwzgrq = gwzgrq;
    }

    public Date getGwzgrq() 
    {
        return gwzgrq;
    }
    public void setGwzgysxm(String gwzgysxm) 
    {
        this.gwzgysxm = gwzgysxm;
    }

    public String getGwzgysxm() 
    {
        return gwzgysxm;
    }
    public void setGwzgjgmc(String gwzgjgmc) 
    {
        this.gwzgjgmc = gwzgjgmc;
    }

    public String getGwzgjgmc() 
    {
        return gwzgjgmc;
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
    public void setDjrq(Date djrq) 
    {
        this.djrq = djrq;
    }

    public Date getDjrq() 
    {
        return djrq;
    }
    public void setGwycfdjid(Long gwycfdjid) 
    {
        this.gwycfdjid = gwycfdjid;
    }

    public Long getGwycfdjid() 
    {
        return gwycfdjid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("csrq", getCsrq())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("mqsfzjlbdm", getMqsfzjlbdm())
            .append("lxfs", getLxfs())
            .append("gwrszgdm", getGwrszgdm())
            .append("gwzgrq", getGwzgrq())
            .append("gwzgysxm", getGwzgysxm())
            .append("gwzgjgmc", getGwzgjgmc())
            .append("jarq", getJarq())
            .append("jadwmc", getJadwmc())
            .append("djrq", getDjrq())
            .append("gwycfdjid", getGwycfdjid())
            .toString();
    }
}
