package com.imedcare.project.fnbj.hqbjfw.hqbjfwzdjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 婚前保健服务诊断记录对象 tb_fb_hqbjfwzdjl
 * 
 * @author liuyang
 * @date 2019-11-19
 */
public class TbFbHqbjfwzdjl extends BaseEntity
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

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 对方记录表编号 */
    @Excel(name = "对方记录表编号")
    private Long dfjlbid;

    /** 对方姓名 */
    @Excel(name = "对方姓名")
    private String dfxm;

    /** 生日 */
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 疾病诊断代码 */
    @Excel(name = "疾病诊断代码")
    private String jbzddm;

    /** 婚前医学检查结果代码 */
    @Excel(name = "婚前医学检查结果代码")
    private String hqyxjcjgdm;

    /** 检查(测)日期 */
    @Excel(name = "检查(测)日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jcryxm;

    /** 检查(测)机构名称 */
    @Excel(name = "检查(测)机构名称")
    private String jcjgmc;

    /** 填报日期 */
    @Excel(name = "填报日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tbrq;

    /** 首诊医师姓名 */
    @Excel(name = "首诊医师姓名")
    private String szysxm;

    /** 主检医师姓名 */
    @Excel(name = "主检医师姓名")
    private String zjysxm;

    /** 出具《婚前医学检查证明》日期 */
    @Excel(name = "出具《婚前医学检查证明》日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cjrq;

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
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setJbzddm(String jbzddm) 
    {
        this.jbzddm = jbzddm;
    }

    public String getJbzddm() 
    {
        return jbzddm;
    }
    public void setHqyxjcjgdm(String hqyxjcjgdm) 
    {
        this.hqyxjcjgdm = hqyxjcjgdm;
    }

    public String getHqyxjcjgdm() 
    {
        return hqyxjcjgdm;
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
    public void setTbrq(Date tbrq) 
    {
        this.tbrq = tbrq;
    }

    public Date getTbrq() 
    {
        return tbrq;
    }
    public void setSzysxm(String szysxm) 
    {
        this.szysxm = szysxm;
    }

    public String getSzysxm() 
    {
        return szysxm;
    }
    public void setZjysxm(String zjysxm) 
    {
        this.zjysxm = zjysxm;
    }

    public String getZjysxm() 
    {
        return zjysxm;
    }
    public void setCjrq(Date cjrq) 
    {
        this.cjrq = cjrq;
    }

    public Date getCjrq() 
    {
        return cjrq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("hqbjfwdjid", getHqbjfwdjid())
            .append("cardid", getCardid())
            .append("dfjlbid", getDfjlbid())
            .append("dfxm", getDfxm())
            .append("birthday", getBirthday())
            .append("jbzddm", getJbzddm())
            .append("hqyxjcjgdm", getHqyxjcjgdm())
            .append("jcrq", getJcrq())
            .append("jcryxm", getJcryxm())
            .append("jcjgmc", getJcjgmc())
            .append("tbrq", getTbrq())
            .append("szysxm", getSzysxm())
            .append("zjysxm", getZjysxm())
            .append("cjrq", getCjrq())
            .toString();
    }
}
