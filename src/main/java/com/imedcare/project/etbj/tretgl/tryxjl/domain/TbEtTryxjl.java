package com.imedcare.project.etbj.tretgl.tryxjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 体弱儿童影像检查记录对象 tb_et_tryxjl
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public class TbEtTryxjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 辅助检查项目 */
    @Excel(name = "辅助检查项目")
    private String fzxm;

    /** 检查结果 */
    @Excel(name = "检查结果")
    private String jcjg;

    /** 检查日期 */
    @Excel(name = "检查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检查人员 */
    @Excel(name = "检查人员")
    private String jcry;

    /** 检查机构 */
    @Excel(name = "检查机构")
    private String jcjgmc;

    /** 登记id */
    @Excel(name = "登记id")
    private Long djid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFzxm(String fzxm) 
    {
        this.fzxm = fzxm;
    }

    public String getFzxm() 
    {
        return fzxm;
    }
    public void setJcjg(String jcjg) 
    {
        this.jcjg = jcjg;
    }

    public String getJcjg() 
    {
        return jcjg;
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
    public void setJcjgmc(String jcjgmc) 
    {
        this.jcjgmc = jcjgmc;
    }

    public String getJcjgmc() 
    {
        return jcjgmc;
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
            .append("fzxm", getFzxm())
            .append("jcjg", getJcjg())
            .append("jcrq", getJcrq())
            .append("jcry", getJcry())
            .append("jcjgmc", getJcjgmc())
            .append("djid", getDjid())
            .toString();
    }
}
