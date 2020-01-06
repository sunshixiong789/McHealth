package com.imedcare.project.fnbj.hqbjfw.hqzxzd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 婚前卫生咨询和指导对象 tb_fb_hqzxzd
 * 
 * @author liuyang
 * @date 2019-11-20
 */
public class TbFbHqzxzd extends BaseEntity
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

    /** 婚前卫生咨询内容 */
    @Excel(name = "婚前卫生咨询内容")
    private String hqwszxnr;

    /** 婚前咨询指导结果代码 */
    @Excel(name = "婚前咨询指导结果代码")
    private String hqzxzdjgdm;

    /** 婚前卫生指导内容 */
    @Excel(name = "婚前卫生指导内容")
    private String hqwszdnr;

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
    public void setHqwszxnr(String hqwszxnr) 
    {
        this.hqwszxnr = hqwszxnr;
    }

    public String getHqwszxnr() 
    {
        return hqwszxnr;
    }
    public void setHqzxzdjgdm(String hqzxzdjgdm) 
    {
        this.hqzxzdjgdm = hqzxzdjgdm;
    }

    public String getHqzxzdjgdm() 
    {
        return hqzxzdjgdm;
    }
    public void setHqwszdnr(String hqwszdnr) 
    {
        this.hqwszdnr = hqwszdnr;
    }

    public String getHqwszdnr() 
    {
        return hqwszdnr;
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
            .append("hqwszxnr", getHqwszxnr())
            .append("hqzxzdjgdm", getHqzxzdjgdm())
            .append("hqwszdnr", getHqwszdnr())
            .toString();
    }
}
