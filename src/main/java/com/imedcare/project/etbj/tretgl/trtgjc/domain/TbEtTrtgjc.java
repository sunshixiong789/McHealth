package com.imedcare.project.etbj.tretgl.trtgjc.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 体弱儿童体格检查记录对象 tb_et_trtgjc
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public class TbEtTrtgjc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long djid;

    /** 问询记录ID */
    @Excel(name = "问询记录ID")
    private Long wxjlid;

    /** 症状 */
    @Excel(name = "症状")
    private String zz;

    /** 体征 */
    @Excel(name = "体征")
    private String tzz;

    /** 检查日期 */
    @Excel(name = "检查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检查人员 */
    @Excel(name = "检查人员")
    private String jcry;

    /** 检查机构 */
    @Excel(name = "检查机构")
    private String jcjg;

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
    public void setWxjlid(Long wxjlid) 
    {
        this.wxjlid = wxjlid;
    }

    public Long getWxjlid() 
    {
        return wxjlid;
    }
    public void setZz(String zz) 
    {
        this.zz = zz;
    }

    public String getZz() 
    {
        return zz;
    }
    public void setTzz(String tzz) 
    {
        this.tzz = tzz;
    }

    public String getTzz() 
    {
        return tzz;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("djid", getDjid())
            .append("wxjlid", getWxjlid())
            .append("zz", getZz())
            .append("tzz", getTzz())
            .append("jcrq", getJcrq())
            .append("jcry", getJcry())
            .append("jcjg", getJcjg())
            .toString();
    }
}
