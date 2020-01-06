package com.imedcare.project.fnbj.hqbjfw.zzjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 转诊记录对象 tb_fb_zzjl
 * 
 * @author liuyang
 * @date 2019-11-20
 */
public class TbFbZzjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 婚前保健服务登记ID */
    @Excel(name = "婚前保健服务登记ID")
    private Long hqbjfwdjid;

    /** 转诊日期 */
    @Excel(name = "转诊日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date zzrq;

    /** 转入医院名称 */
    @Excel(name = "转入医院名称")
    private String zryymc;

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
    public void setHqbjfwdjid(Long hqbjfwdjid) 
    {
        this.hqbjfwdjid = hqbjfwdjid;
    }

    public Long getHqbjfwdjid() 
    {
        return hqbjfwdjid;
    }
    public void setZzrq(Date zzrq) 
    {
        this.zzrq = zzrq;
    }

    public Date getZzrq() 
    {
        return zzrq;
    }
    public void setZryymc(String zryymc) 
    {
        this.zryymc = zryymc;
    }

    public String getZryymc() 
    {
        return zryymc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("birthday", getBirthday())
            .append("cardid", getCardid())
            .append("hqbjfwdjid", getHqbjfwdjid())
            .append("zzrq", getZzrq())
            .append("zryymc", getZryymc())
            .toString();
    }
}
