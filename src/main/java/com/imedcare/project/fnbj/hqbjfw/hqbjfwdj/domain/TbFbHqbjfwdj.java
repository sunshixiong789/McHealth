package com.imedcare.project.fnbj.hqbjfw.hqbjfwdj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 婚前保健服务登记对象 tb_fb_hqbjfwdj
 *
 * @author liuyang
 * @date 2019-11-18
 */
public class TbFbHqbjfwdj extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 健康档案id */
    @Excel(name = "健康档案id")
    private Long jkdaid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 生日 */
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 对方记录表编号 */
    @Excel(name = "对方记录表编号")
    private Long dfjlbid;

    /** 对方姓名 */
    @Excel(name = "对方姓名")
    private String dfxm;

    /** 填写日期 */
    @Excel(name = "填写日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date txrq;

    /** 是否删除 */
    @Excel(name = "是否删除")
    private String deleteFlag;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setJkdaid(Long jkdaid)
    {
        this.jkdaid = jkdaid;
    }

    public Long getJkdaid()
    {
        return jkdaid;
    }
    public void setXm(String xm)
    {
        this.xm = xm;
    }

    public String getXm()
    {
        return xm;
    }
    public void setCardid(String cardid)
    {
        this.cardid = cardid;
    }

    public String getCardid()
    {
        return cardid;
    }
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public Date getBirthday()
    {
        return birthday;
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
    public void setTxrq(Date txrq)
    {
        this.txrq = txrq;
    }

    public Date getTxrq()
    {
        return txrq;
    }
    public void setDeleteFlag(String deleteFlag)
    {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteFlag()
    {
        return deleteFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("jkdaid", getJkdaid())
                .append("xm", getXm())
                .append("cardid", getCardid())
                .append("birthday", getBirthday())
                .append("dfjlbid", getDfjlbid())
                .append("dfxm", getDfxm())
                .append("txrq", getTxrq())
                .append("deleteFlag", getDeleteFlag())
                .toString();
    }
}
