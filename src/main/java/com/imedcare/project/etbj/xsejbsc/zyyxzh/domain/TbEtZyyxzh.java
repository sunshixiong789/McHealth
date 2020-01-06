package com.imedcare.project.etbj.xsejbsc.zyyxzh.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 新生儿疾病筛查可疑阳性召回对象 tb_et_zyyxzh
 * 
 * @author 黄维业
 * @date 2019-11-21
 */
public class TbEtZyyxzh extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 召回日期 */
    @Excel(name = "召回日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date zhrq;

    /** 通知形式 */
    @Excel(name = "通知形式")
    private Integer tzxs;

    /** 通知到达人 */
    @Excel(name = "通知到达人")
    private String tzdar;

    /** 通知到达人与新生儿关系 */
    @Excel(name = "通知到达人与新生儿关系")
    private String tzgx;

    /** 实验室记录Id */
    @Excel(name = "实验室记录Id")
    private Long sysjlid;

    /** 登记Id */
    @Excel(name = "登记Id")
    private Long djid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setZhrq(Date zhrq) 
    {
        this.zhrq = zhrq;
    }

    public Date getZhrq() 
    {
        return zhrq;
    }
    public void setTzxs(Integer tzxs) 
    {
        this.tzxs = tzxs;
    }

    public Integer getTzxs() 
    {
        return tzxs;
    }
    public void setTzdar(String tzdar) 
    {
        this.tzdar = tzdar;
    }

    public String getTzdar() 
    {
        return tzdar;
    }
    public void setTzgx(String tzgx) 
    {
        this.tzgx = tzgx;
    }

    public String getTzgx() 
    {
        return tzgx;
    }
    public void setSysjlid(Long sysjlid) 
    {
        this.sysjlid = sysjlid;
    }

    public Long getSysjlid() 
    {
        return sysjlid;
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
            .append("zhrq", getZhrq())
            .append("tzxs", getTzxs())
            .append("tzdar", getTzdar())
            .append("tzgx", getTzgx())
            .append("sysjlid", getSysjlid())
            .append("djid", getDjid())
            .toString();
    }
}
