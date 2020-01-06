package com.imedcare.project.fnbj.gwycf.gwycfwxjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 高危孕产妇问询记录对象 tb_ch_gwycfwxjl
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public class TbChGwycfwxjl extends BaseEntity
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

    /** 末次月经日期 */
    @Excel(name = "末次月经日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcyjrq;

    /** 预产期 */
    @Excel(name = "预产期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ycq;

    /** 孕次 */
    @Excel(name = "孕次")
    private Integer yc;

    /** 产次 */
    @Excel(name = "产次")
    private Integer cc;

    /** 孕产期高危因素-代码 */
    @Excel(name = "孕产期高危因素-代码")
    private String ycqgwysdm;

    /** 孕产期高危因素-标志 */
    @Excel(name = "孕产期高危因素-标志")
    private String ycqgwysbz;

    /** 高危评分孕周 */
    @Excel(name = "高危评分孕周")
    private Integer gwpfyz;

    /** 高危评分日期 */
    @Excel(name = "高危评分日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gwpfrq;

    /** 高危评分值（分） */
    @Excel(name = "高危评分值", readConverterExp = "分=")
    private Integer gwpfz;

    /** 高危妊娠级别代码 */
    @Excel(name = "高危妊娠级别代码")
    private String gwrcjbdm;

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
    public void setMcyjrq(Date mcyjrq) 
    {
        this.mcyjrq = mcyjrq;
    }

    public Date getMcyjrq() 
    {
        return mcyjrq;
    }
    public void setYcq(Date ycq) 
    {
        this.ycq = ycq;
    }

    public Date getYcq() 
    {
        return ycq;
    }
    public void setYc(Integer yc) 
    {
        this.yc = yc;
    }

    public Integer getYc() 
    {
        return yc;
    }
    public void setCc(Integer cc) 
    {
        this.cc = cc;
    }

    public Integer getCc() 
    {
        return cc;
    }
    public void setYcqgwysdm(String ycqgwysdm) 
    {
        this.ycqgwysdm = ycqgwysdm;
    }

    public String getYcqgwysdm() 
    {
        return ycqgwysdm;
    }
    public void setYcqgwysbz(String ycqgwysbz) 
    {
        this.ycqgwysbz = ycqgwysbz;
    }

    public String getYcqgwysbz() 
    {
        return ycqgwysbz;
    }
    public void setGwpfyz(Integer gwpfyz) 
    {
        this.gwpfyz = gwpfyz;
    }

    public Integer getGwpfyz() 
    {
        return gwpfyz;
    }
    public void setGwpfrq(Date gwpfrq) 
    {
        this.gwpfrq = gwpfrq;
    }

    public Date getGwpfrq() 
    {
        return gwpfrq;
    }
    public void setGwpfz(Integer gwpfz) 
    {
        this.gwpfz = gwpfz;
    }

    public Integer getGwpfz() 
    {
        return gwpfz;
    }
    public void setGwrcjbdm(String gwrcjbdm) 
    {
        this.gwrcjbdm = gwrcjbdm;
    }

    public String getGwrcjbdm() 
    {
        return gwrcjbdm;
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
            .append("mcyjrq", getMcyjrq())
            .append("ycq", getYcq())
            .append("yc", getYc())
            .append("cc", getCc())
            .append("ycqgwysdm", getYcqgwysdm())
            .append("ycqgwysbz", getYcqgwysbz())
            .append("gwpfyz", getGwpfyz())
            .append("gwpfrq", getGwpfrq())
            .append("gwpfz", getGwpfz())
            .append("gwrcjbdm", getGwrcjbdm())
            .append("djrq", getDjrq())
            .append("gwycfdjid", getGwycfdjid())
            .toString();
    }
}
