package com.imedcare.project.fnbj.hqbjfw.hqbjyxjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 婚前保健影像检查记录对象 tb_fb_hqbjyxjcjl
 * 
 * @author liuyang
 * @date 2019-11-19
 */
public class TbFbHqbjyxjcjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 婚前保健服务登记ID */
    @Excel(name = "婚前保健服务登记ID")
    private Long hqbjfwdjid;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 对方记录表单编号 */
    @Excel(name = "对方记录表单编号")
    private Long dfjlbid;

    /** 对方姓名 */
    @Excel(name = "对方姓名")
    private String dfxm;

    /** 胸部x线检查结果 */
    @Excel(name = "胸部x线检查结果")
    private String xbxxjcjg;

    /** 检查(测)日期 */
    @Excel(name = "检查(测)日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jcryxm;

    /** 检查(测)机构名称 */
    @Excel(name = "检查(测)机构名称")
    private String jcjgmc;

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
    public void setHqbjfwdjid(Long hqbjfwdjid) 
    {
        this.hqbjfwdjid = hqbjfwdjid;
    }

    public Long getHqbjfwdjid() 
    {
        return hqbjfwdjid;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setCardid(String cardid) 
    {
        this.cardid = cardid;
    }

    public String getCardid() 
    {
        return cardid;
    }
    public void setDfjlbid(Long dfjlbid) 
    {
        this.dfjlbid = dfjlbid;
    }

    public Long getDfjlbid() 
    {
        return dfjlbid;
    }
    public void setDfxm(String dfxm) 
    {
        this.dfxm = dfxm;
    }

    public String getDfxm() 
    {
        return dfxm;
    }
    public void setXbxxjcjg(String xbxxjcjg) 
    {
        this.xbxxjcjg = xbxxjcjg;
    }

    public String getXbxxjcjg() 
    {
        return xbxxjcjg;
    }
    public void setJcrq(Date jcrq) 
    {
        this.jcrq = jcrq;
    }

    public Date getJcrq() 
    {
        return jcrq;
    }
    public void setJcryxm(String jcryxm) 
    {
        this.jcryxm = jcryxm;
    }

    public String getJcryxm() 
    {
        return jcryxm;
    }
    public void setJcjgmc(String jcjgmc) 
    {
        this.jcjgmc = jcjgmc;
    }

    public String getJcjgmc() 
    {
        return jcjgmc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("hqbjfwdjid", getHqbjfwdjid())
            .append("birthday", getBirthday())
            .append("cardid", getCardid())
            .append("dfjlbid", getDfjlbid())
            .append("dfxm", getDfxm())
            .append("xbxxjcjg", getXbxxjcjg())
            .append("jcrq", getJcrq())
            .append("jcryxm", getJcryxm())
            .append("jcjgmc", getJcjgmc())
            .toString();
    }
}
