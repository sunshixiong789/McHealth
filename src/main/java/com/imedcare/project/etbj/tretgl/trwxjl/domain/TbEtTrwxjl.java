package com.imedcare.project.etbj.tretgl.trwxjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 体弱儿童问询记录对象 tb_et_trwxjl
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public class TbEtTrwxjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long djid;

    /** 喂养方式 */
    @Excel(name = "喂养方式")
    private Integer wyfs;

    /** 随诊月龄 */
    @Excel(name = "随诊月龄")
    private Integer szyl;

    /** 体弱原因 */
    @Excel(name = "体弱原因")
    private Integer tryy;

    /** 建档日期 */
    @Excel(name = "建档日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jdrq;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDjid(Long djid) 
    {
        this.djid = djid;
    }

    public Long getDjid() 
    {
        return djid;
    }
    public void setWyfs(Integer wyfs) 
    {
        this.wyfs = wyfs;
    }

    public Integer getWyfs() 
    {
        return wyfs;
    }
    public void setSzyl(Integer szyl) 
    {
        this.szyl = szyl;
    }

    public Integer getSzyl() 
    {
        return szyl;
    }
    public void setTryy(Integer tryy) 
    {
        this.tryy = tryy;
    }

    public Integer getTryy() 
    {
        return tryy;
    }
    public void setJdrq(Date jdrq) 
    {
        this.jdrq = jdrq;
    }

    public Date getJdrq() 
    {
        return jdrq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("djid", getDjid())
            .append("wyfs", getWyfs())
            .append("szyl", getSzyl())
            .append("tryy", getTryy())
            .append("jdrq", getJdrq())
            .toString();
    }
}
