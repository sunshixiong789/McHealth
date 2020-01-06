package com.imedcare.project.fnbpc.fnbpcyxzd.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 妇女病普查医学指导对象 tb_fb_fnbpcyxzd
 * 
 * @author liuyang
 * @date 2019-11-21
 */
public class TbFbFnbpcyxzd extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 妇女病普查登记ID */
    @Excel(name = "妇女病普查登记ID")
    private Long fnbpcdjid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 体检结果 */
    @Excel(name = "体检结果")
    private String tjjg;

    /** 处理及指导意见 */
    @Excel(name = "处理及指导意见")
    private String cljzdyj;

    /** 主检医师姓名 */
    @Excel(name = "主检医师姓名")
    private String zjysxm;

    /** 检查(测)日期 */
    @Excel(name = "检查(测)日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检查(测)人员代码 */
    @Excel(name = "检查(测)人员代码")
    private String jcrydm;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jcryxm;

    /** 检查(测)机构代码 */
    @Excel(name = "检查(测)机构代码")
    private String jcjgdm;

    /** 检查(测)机构名称 */
    @Excel(name = "检查(测)机构名称")
    private String jcjgmc;

    /** 删除标志 */
    @Excel(name = "删除标志")
    private String deleteFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFnbpcdjid(Long fnbpcdjid) 
    {
        this.fnbpcdjid = fnbpcdjid;
    }

    public Long getFnbpcdjid() 
    {
        return fnbpcdjid;
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
    public void setTjjg(String tjjg) 
    {
        this.tjjg = tjjg;
    }

    public String getTjjg() 
    {
        return tjjg;
    }
    public void setCljzdyj(String cljzdyj) 
    {
        this.cljzdyj = cljzdyj;
    }

    public String getCljzdyj() 
    {
        return cljzdyj;
    }
    public void setZjysxm(String zjysxm) 
    {
        this.zjysxm = zjysxm;
    }

    public String getZjysxm() 
    {
        return zjysxm;
    }
    public void setJcrq(Date jcrq) 
    {
        this.jcrq = jcrq;
    }

    public Date getJcrq() 
    {
        return jcrq;
    }
    public void setJcrydm(String jcrydm) 
    {
        this.jcrydm = jcrydm;
    }

    public String getJcrydm() 
    {
        return jcrydm;
    }
    public void setJcryxm(String jcryxm) 
    {
        this.jcryxm = jcryxm;
    }

    public String getJcryxm() 
    {
        return jcryxm;
    }
    public void setJcjgdm(String jcjgdm) 
    {
        this.jcjgdm = jcjgdm;
    }

    public String getJcjgdm() 
    {
        return jcjgdm;
    }
    public void setJcjgmc(String jcjgmc) 
    {
        this.jcjgmc = jcjgmc;
    }

    public String getJcjgmc() 
    {
        return jcjgmc;
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
            .append("fnbpcdjid", getFnbpcdjid())
            .append("xm", getXm())
            .append("cardid", getCardid())
            .append("birthday", getBirthday())
            .append("tjjg", getTjjg())
            .append("cljzdyj", getCljzdyj())
            .append("zjysxm", getZjysxm())
            .append("jcrq", getJcrq())
            .append("jcrydm", getJcrydm())
            .append("jcryxm", getJcryxm())
            .append("jcjgdm", getJcjgdm())
            .append("jcjgmc", getJcjgmc())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
