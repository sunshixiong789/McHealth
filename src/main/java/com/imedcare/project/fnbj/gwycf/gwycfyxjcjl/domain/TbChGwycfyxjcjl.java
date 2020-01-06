package com.imedcare.project.fnbj.gwycf.gwycfyxjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 高危孕产妇影像检查记录对象 tb_ch_gwycfyxjcjl
 * 
 * @author zhangshilei
 * @date 2019-11-20
 */
public class TbChGwycfyxjcjl extends BaseEntity
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

    /** 辅助检查-结果 */
    @Excel(name = "辅助检查-结果")
    private String fzjcjg;

    /** 辅助检查-项目名称 */
    @Excel(name = "辅助检查-项目名称")
    private String fzjcxmmc;

    /** 检查人员姓名 */
    @Excel(name = "检查人员姓名")
    private String jcryxm;

    /** 检查机构名称 */
    @Excel(name = "检查机构名称")
    private String jcjgmc;

    /** 检查日期 */
    @Excel(name = "检查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

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
    public void setFzjcjg(String fzjcjg) 
    {
        this.fzjcjg = fzjcjg;
    }

    public String getFzjcjg() 
    {
        return fzjcjg;
    }
    public void setFzjcxmmc(String fzjcxmmc) 
    {
        this.fzjcxmmc = fzjcxmmc;
    }

    public String getFzjcxmmc() 
    {
        return fzjcxmmc;
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
            .append("fzjcjg", getFzjcjg())
            .append("fzjcxmmc", getFzjcxmmc())
            .append("jcryxm", getJcryxm())
            .append("jcjgmc", getJcjgmc())
            .append("jcrq", getJcrq())
            .append("djrq", getDjrq())
            .append("gwycfdjid", getGwycfdjid())
            .toString();
    }
}
