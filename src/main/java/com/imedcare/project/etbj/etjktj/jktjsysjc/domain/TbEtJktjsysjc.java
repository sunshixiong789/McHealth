package com.imedcare.project.etbj.etjktj.jktjsysjc.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 儿童健康体检实验室记录对象 tb_et_jktjsysjc
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public class TbEtJktjsysjc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long djid;

    /** 血红蛋白值 */
    @Excel(name = "血红蛋白值")
    private String xhdbz;

    /** 检测日期 */
    @Excel(name = "检测日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检测人员 */
    @Excel(name = "检测人员")
    private String jcry;

    /** 检测机构 */
    @Excel(name = "检测机构")
    private String jcjg;

    /** 体格检查ID */
    @Excel(name = "体格检查ID")
    private Long tgjcid;

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
    public void setXhdbz(String xhdbz) 
    {
        this.xhdbz = xhdbz;
    }

    public String getXhdbz() 
    {
        return xhdbz;
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
    public void setTgjcid(Long tgjcid) 
    {
        this.tgjcid = tgjcid;
    }

    public Long getTgjcid() 
    {
        return tgjcid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("djid", getDjid())
            .append("xhdbz", getXhdbz())
            .append("jcrq", getJcrq())
            .append("jcry", getJcry())
            .append("jcjg", getJcjg())
            .append("tgjcid", getTgjcid())
            .toString();
    }
}
