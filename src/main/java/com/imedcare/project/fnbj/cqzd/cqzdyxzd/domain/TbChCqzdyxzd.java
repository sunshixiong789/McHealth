package com.imedcare.project.fnbj.cqzd.cqzdyxzd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前诊断医学指导对象 tb_ch_cqzdyxzd
 * 
 * @author zhangshilei
 * @date 2019-11-21
 */
public class TbChCqzdyxzd extends BaseEntity
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

    /** 产前诊断医学意见 */
    @Excel(name = "产前诊断医学意见")
    private String cqzdyxyj;

    /** 产前诊断医师姓名 */
    @Excel(name = "产前诊断医师姓名")
    private String cqzdysxm;

    /** 诊断机构名称 */
    @Excel(name = "诊断机构名称")
    private String cqzdjgmc;

    /** 登记日期 */
    @Excel(name = "登记日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date djrq;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long cqzddjid;

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
    public void setCqzdyxyj(String cqzdyxyj) 
    {
        this.cqzdyxyj = cqzdyxyj;
    }

    public String getCqzdyxyj() 
    {
        return cqzdyxyj;
    }
    public void setCqzdysxm(String cqzdysxm) 
    {
        this.cqzdysxm = cqzdysxm;
    }

    public String getCqzdysxm() 
    {
        return cqzdysxm;
    }
    public void setCqzdjgmc(String cqzdjgmc) 
    {
        this.cqzdjgmc = cqzdjgmc;
    }

    public String getCqzdjgmc() 
    {
        return cqzdjgmc;
    }
    public void setDjrq(Date djrq) 
    {
        this.djrq = djrq;
    }

    public Date getDjrq() 
    {
        return djrq;
    }
    public void setCqzddjid(Long cqzddjid) 
    {
        this.cqzddjid = cqzddjid;
    }

    public Long getCqzddjid() 
    {
        return cqzddjid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("csrq", getCsrq())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("mqsfzjlbdm", getMqsfzjlbdm())
            .append("cqzdyxyj", getCqzdyxyj())
            .append("cqzdysxm", getCqzdysxm())
            .append("cqzdjgmc", getCqzdjgmc())
            .append("djrq", getDjrq())
            .append("cqzddjid", getCqzddjid())
            .toString();
    }
}
