package com.imedcare.project.etbj.xsejbsc.sysjyjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 新生儿疾病筛查实验室检查记录对象 tb_et_sysjyjl
 * 
 * @author 黄维业
 * @date 2019-11-20
 */
public class TbEtSysjyjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 筛查项目 */
    @Excel(name = "筛查项目")
    private Integer scxm;

    /** 筛查方法 */
    @Excel(name = "筛查方法")
    private Integer scff;

    /** 筛查结果 */
    @Excel(name = "筛查结果")
    private String scjg;

    /** 筛查日期 */
    @Excel(name = "筛查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 筛查人员 */
    @Excel(name = "筛查人员")
    private String jcry;

    /** 筛查机构 */
    @Excel(name = "筛查机构")
    private String jcjg;

    /** 通知日期 */
    @Excel(name = "通知日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tzrq;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long djid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setScxm(Integer scxm) 
    {
        this.scxm = scxm;
    }

    public Integer getScxm() 
    {
        return scxm;
    }
    public void setScff(Integer scff) 
    {
        this.scff = scff;
    }

    public Integer getScff() 
    {
        return scff;
    }
    public void setScjg(String scjg) 
    {
        this.scjg = scjg;
    }

    public String getScjg() 
    {
        return scjg;
    }
    public void setJcrq(Date jcrq) 
    {
        this.jcrq = jcrq;
    }

    public Date getJcrq() 
    {
        return jcrq;
    }
    public void setJcry(String jcry) 
    {
        this.jcry = jcry;
    }

    public String getJcry() 
    {
        return jcry;
    }
    public void setJcjg(String jcjg) 
    {
        this.jcjg = jcjg;
    }

    public String getJcjg() 
    {
        return jcjg;
    }
    public void setTzrq(Date tzrq) 
    {
        this.tzrq = tzrq;
    }

    public Date getTzrq() 
    {
        return tzrq;
    }
    public void setDjid(Long djid) 
    {
        this.djid = djid;
    }

    public Long getDjid() 
    {
        return djid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("scxm", getScxm())
            .append("scff", getScff())
            .append("scjg", getScjg())
            .append("jcrq", getJcrq())
            .append("jcry", getJcry())
            .append("jcjg", getJcjg())
            .append("tzrq", getTzrq())
            .append("djid", getDjid())
            .toString();
    }
}
