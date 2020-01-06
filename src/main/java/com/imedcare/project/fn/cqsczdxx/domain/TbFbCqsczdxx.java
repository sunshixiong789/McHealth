package com.imedcare.project.fn.cqsczdxx.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前筛查诊断信息对象 tb_fb_cqsczdxx
 * 
 * @author maqilin
 * @date 2019-11-08
 */
public class TbFbCqsczdxx extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录表单编号 */
    private Long id;

    /** 妇女个人标识号 */
    private String fngrbsh;

    /** 妇女姓名 */
    @Excel(name = "妇女姓名")
    private String xm;

    /** 妇女身份证号 */
    @Excel(name = "妇女身份证号")
    private String sfz;

    /** 末次月经日期 */
    @Excel(name = "末次月经日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcyjrq;

    /** 体重 */
    @Excel(name = "体重")
    private Double tz;

    /** 孕周确认方法 */
    @Excel(name = "孕周确认方法")
    private String yzqrff;

    /** 胎数 */
    @Excel(name = "胎数")
    private Integer ts;

    /** 采血时间 */
    @Excel(name = "采血时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cxsj;

    /** 采血地点 */
    @Excel(name = "采血地点")
    private String cxdd;

    /** 样本条形码 */
    @Excel(name = "样本条形码")
    private String ybtxm;

    /** 产前诊断医学意见 */
    private String cqzdyxyj;

    /** 妊娠结局 */
    private String rcjj;

    /** 修改标记 */
    private String xgbj;

    /** 修改日期 */
    private Date zgrq;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFngrbsh(String fngrbsh) 
    {
        this.fngrbsh = fngrbsh;
    }

    public String getFngrbsh() 
    {
        return fngrbsh;
    }
    public void setXm(String xm) 
    {
        this.xm = xm;
    }

    public String getXm() 
    {
        return xm;
    }
    public void setSfz(String sfz) 
    {
        this.sfz = sfz;
    }

    public String getSfz() 
    {
        return sfz;
    }
    public void setMcyjrq(Date mcyjrq) 
    {
        this.mcyjrq = mcyjrq;
    }

    public Date getMcyjrq() 
    {
        return mcyjrq;
    }
    public void setTz(Double tz) 
    {
        this.tz = tz;
    }

    public Double getTz() 
    {
        return tz;
    }
    public void setYzqrff(String yzqrff) 
    {
        this.yzqrff = yzqrff;
    }

    public String getYzqrff() 
    {
        return yzqrff;
    }
    public void setTs(Integer ts) 
    {
        this.ts = ts;
    }

    public Integer getTs() 
    {
        return ts;
    }
    public void setCxsj(Date cxsj) 
    {
        this.cxsj = cxsj;
    }

    public Date getCxsj() 
    {
        return cxsj;
    }
    public void setCxdd(String cxdd) 
    {
        this.cxdd = cxdd;
    }

    public String getCxdd() 
    {
        return cxdd;
    }
    public void setYbtxm(String ybtxm) 
    {
        this.ybtxm = ybtxm;
    }

    public String getYbtxm() 
    {
        return ybtxm;
    }
    public void setCqzdyxyj(String cqzdyxyj) 
    {
        this.cqzdyxyj = cqzdyxyj;
    }

    public String getCqzdyxyj() 
    {
        return cqzdyxyj;
    }
    public void setRcjj(String rcjj) 
    {
        this.rcjj = rcjj;
    }

    public String getRcjj() 
    {
        return rcjj;
    }
    public void setXgbj(String xgbj) 
    {
        this.xgbj = xgbj;
    }

    public String getXgbj() 
    {
        return xgbj;
    }
    public void setZgrq(Date zgrq) 
    {
        this.zgrq = zgrq;
    }

    public Date getZgrq() 
    {
        return zgrq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fngrbsh", getFngrbsh())
            .append("xm", getXm())
            .append("sfz", getSfz())
            .append("mcyjrq", getMcyjrq())
            .append("tz", getTz())
            .append("yzqrff", getYzqrff())
            .append("ts", getTs())
            .append("cxsj", getCxsj())
            .append("cxdd", getCxdd())
            .append("ybtxm", getYbtxm())
            .append("cqzdyxyj", getCqzdyxyj())
            .append("rcjj", getRcjj())
            .append("xgbj", getXgbj())
            .append("zgrq", getZgrq())
            .toString();
    }
}
