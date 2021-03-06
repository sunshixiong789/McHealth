package com.imedcare.project.fnbj.cqsc.cqscsysjyjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前筛查实验室检验记录对象 tb_ch_cqscsysjyjl
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public class TbChCqscsysjyjl extends BaseEntity
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

    /** 产前筛查项目 */
    @Excel(name = "产前筛查项目")
    private String cqscxm;

    /** 产前筛查方法代码 */
    @Excel(name = "产前筛查方法代码")
    private String cqscffdm;

    /** 产前筛查结果 */
    @Excel(name = "产前筛查结果")
    private String cqscjg;

    /** 检查日期 */
    @Excel(name = "检查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 产前筛查医师姓名 */
    @Excel(name = "产前筛查医师姓名")
    private String cqscysxm;

    /** 产前筛查机构名称 */
    @Excel(name = "产前筛查机构名称")
    private String cqscjgmc;

    /** 登记日期 */
    @Excel(name = "登记日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date djrq;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long cqscdjid;

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
    public void setCqscxm(String cqscxm) 
    {
        this.cqscxm = cqscxm;
    }

    public String getCqscxm() 
    {
        return cqscxm;
    }
    public void setCqscffdm(String cqscffdm) 
    {
        this.cqscffdm = cqscffdm;
    }

    public String getCqscffdm() 
    {
        return cqscffdm;
    }
    public void setCqscjg(String cqscjg) 
    {
        this.cqscjg = cqscjg;
    }

    public String getCqscjg() 
    {
        return cqscjg;
    }
    public void setJcrq(Date jcrq) 
    {
        this.jcrq = jcrq;
    }

    public Date getJcrq() 
    {
        return jcrq;
    }
    public void setCqscysxm(String cqscysxm) 
    {
        this.cqscysxm = cqscysxm;
    }

    public String getCqscysxm() 
    {
        return cqscysxm;
    }
    public void setCqscjgmc(String cqscjgmc) 
    {
        this.cqscjgmc = cqscjgmc;
    }

    public String getCqscjgmc() 
    {
        return cqscjgmc;
    }
    public void setDjrq(Date djrq) 
    {
        this.djrq = djrq;
    }

    public Date getDjrq() 
    {
        return djrq;
    }
    public void setCqscdjid(Long cqscdjid) 
    {
        this.cqscdjid = cqscdjid;
    }

    public Long getCqscdjid() 
    {
        return cqscdjid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("csrq", getCsrq())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("mqsfzjlbdm", getMqsfzjlbdm())
            .append("cqscxm", getCqscxm())
            .append("cqscffdm", getCqscffdm())
            .append("cqscjg", getCqscjg())
            .append("jcrq", getJcrq())
            .append("cqscysxm", getCqscysxm())
            .append("cqscjgmc", getCqscjgmc())
            .append("djrq", getDjrq())
            .append("cqscdjid", getCqscdjid())
            .toString();
    }
}
