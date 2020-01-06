package com.imedcare.project.etbj.xsejbsc.jbsczd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 新生儿疾病筛查诊断记录对象 tb_et_jbsczd
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
public class TbEtJbsczd extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 诊断日期 */
    @Excel(name = "诊断日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date zdrq;

    /** 诊断项目 */
    @Excel(name = "诊断项目")
    private String zdxm;

    /** 诊断方法 */
    @Excel(name = "诊断方法")
    private String zdff;

    /** 诊断结果 */
    @Excel(name = "诊断结果")
    private String zdjg;

    /** 诊断机构 */
    @Excel(name = "诊断机构")
    private String zdjgmc;

    /** 登记id */
    @Excel(name = "登记id")
    private Long djid;

    /** 召回id */
    @Excel(name = "召回id")
    private Long zhid;

    /** 实验室记录id */
    @Excel(name = "实验室记录id")
    private Long sysjlid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setZdrq(Date zdrq) 
    {
        this.zdrq = zdrq;
    }

    public Date getZdrq() 
    {
        return zdrq;
    }
    public void setZdxm(String zdxm) 
    {
        this.zdxm = zdxm;
    }

    public String getZdxm() 
    {
        return zdxm;
    }
    public void setZdff(String zdff) 
    {
        this.zdff = zdff;
    }

    public String getZdff() 
    {
        return zdff;
    }
    public void setZdjg(String zdjg) 
    {
        this.zdjg = zdjg;
    }

    public String getZdjg() 
    {
        return zdjg;
    }
    public void setZdjgmc(String zdjgmc) 
    {
        this.zdjgmc = zdjgmc;
    }

    public String getZdjgmc() 
    {
        return zdjgmc;
    }
    public void setDjid(Long djid) 
    {
        this.djid = djid;
    }

    public Long getDjid() 
    {
        return djid;
    }
    public void setZhid(Long zhid) 
    {
        this.zhid = zhid;
    }

    public Long getZhid() 
    {
        return zhid;
    }
    public void setSysjlid(Long sysjlid) 
    {
        this.sysjlid = sysjlid;
    }

    public Long getSysjlid() 
    {
        return sysjlid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zdrq", getZdrq())
            .append("zdxm", getZdxm())
            .append("zdff", getZdff())
            .append("zdjg", getZdjg())
            .append("zdjgmc", getZdjgmc())
            .append("djid", getDjid())
            .append("zhid", getZhid())
            .append("sysjlid", getSysjlid())
            .toString();
    }
}
