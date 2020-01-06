package com.imedcare.project.etbj.tlsc.tlscdj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 新生儿听力筛查对象 tb_et_tlsc
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
public class TbEtTlsc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 性别 */
    @Excel(name = "性别")
    private String xbdm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date csrq;

    /** 母亲姓名 */
    @Excel(name = "母亲姓名")
    private String mqxm;

    /** 母亲证件号码 */
    @Excel(name = "母亲证件号码")
    private String mqsfzjhm;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String lxfs;

    /** 现住址 */
    @Excel(name = "现住址")
    private String xzz;

    /** 档案ID */
    @Excel(name = "档案ID")
    private Long healthFileId;

    /** 筛查结果左耳 */
    @Excel(name = "筛查结果左耳")
    private String scjgzr;

    /** 筛查结果右耳 */
    @Excel(name = "筛查结果右耳")
    private String scjgyr;

    /** 诊断结果左耳 */
    @Excel(name = "诊断结果左耳")
    private String zdjgzr;

    /** 诊断结果右耳 */
    @Excel(name = "诊断结果右耳")
    private String zdjgyr;

    /** 确诊月龄 */
    @Excel(name = "确诊月龄")
    private String qzyl;

    /** 确诊医院 */
    @Excel(name = "确诊医院")
    private String qzyy;

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
    public void setXbdm(String xbdm) 
    {
        this.xbdm = xbdm;
    }

    public String getXbdm() 
    {
        return xbdm;
    }
    public void setCsrq(Date csrq) 
    {
        this.csrq = csrq;
    }

    public Date getCsrq() 
    {
        return csrq;
    }
    public void setMqxm(String mqxm) 
    {
        this.mqxm = mqxm;
    }

    public String getMqxm() 
    {
        return mqxm;
    }
    public void setMqsfzjhm(String mqsfzjhm) 
    {
        this.mqsfzjhm = mqsfzjhm;
    }

    public String getMqsfzjhm() 
    {
        return mqsfzjhm;
    }
    public void setLxfs(String lxfs) 
    {
        this.lxfs = lxfs;
    }

    public String getLxfs() 
    {
        return lxfs;
    }
    public void setXzz(String xzz) 
    {
        this.xzz = xzz;
    }

    public String getXzz() 
    {
        return xzz;
    }

    public Long getHealthFileId() {
        return healthFileId;
    }

    public void setHealthFileId(Long healthFileId) {
        this.healthFileId = healthFileId;
    }

    public void setScjgzr(String scjgzr)
    {
        this.scjgzr = scjgzr;
    }

    public String getScjgzr() 
    {
        return scjgzr;
    }
    public void setScjgyr(String scjgyr) 
    {
        this.scjgyr = scjgyr;
    }

    public String getScjgyr() 
    {
        return scjgyr;
    }
    public void setZdjgzr(String zdjgzr) 
    {
        this.zdjgzr = zdjgzr;
    }

    public String getZdjgzr() 
    {
        return zdjgzr;
    }
    public void setZdjgyr(String zdjgyr) 
    {
        this.zdjgyr = zdjgyr;
    }

    public String getZdjgyr() 
    {
        return zdjgyr;
    }
    public void setQzyl(String qzyl) 
    {
        this.qzyl = qzyl;
    }

    public String getQzyl() 
    {
        return qzyl;
    }
    public void setQzyy(String qzyy) 
    {
        this.qzyy = qzyy;
    }

    public String getQzyy() 
    {
        return qzyy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("xbdm", getXbdm())
            .append("csrq", getCsrq())
            .append("mqxm", getMqxm())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("lxfs", getLxfs())
            .append("xzz", getXzz())
            .append("scjgzr", getScjgzr())
            .append("scjgyr", getScjgyr())
            .append("zdjgzr", getZdjgzr())
            .append("zdjgyr", getZdjgyr())
            .append("qzyl", getQzyl())
            .append("qzyy", getQzyy())
            .toString();
    }
}
