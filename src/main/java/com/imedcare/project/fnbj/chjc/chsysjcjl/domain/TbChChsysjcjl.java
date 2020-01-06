package com.imedcare.project.fnbj.chjc.chsysjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产后42天实验室检查记录对象 tb_ch_chsysjcjl
 * 
 * @author zhangshilei
 * @date 2019-11-19
 */
public class TbChChsysjcjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date csrq;

    /** 民族 */
    @Excel(name = "民族")
    private String mz;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String mqsfzjhm;

    /** 白细胞计数值 */
    @Excel(name = "白细胞计数值")
    private String bxbjsz;

    /** 红细胞计数值 */
    @Excel(name = "红细胞计数值")
    private String hxbjsz;

    /** 血小板计数值 */
    @Excel(name = "血小板计数值")
    private String xxbjsz;

    /** 血红蛋白值 */
    @Excel(name = "血红蛋白值")
    private String xhdbz;

    /** 尿比重 */
    @Excel(name = "尿比重")
    private String nbz;

    /** 尿蛋白定量检测值 */
    @Excel(name = "尿蛋白定量检测值")
    private String ndbdljcz;

    /** 尿糖定量检测 */
    @Excel(name = "尿糖定量检测")
    private String ntdljc;

    /** 尿液酸碱度 */
    @Excel(name = "尿液酸碱度")
    private String nysjd;

    /** 检查人员姓名 */
    @Excel(name = "检查人员姓名")
    private String jcryxm;

    /** 检查机构名称 */
    @Excel(name = "检查机构名称")
    private String jcjgmc;

    /** 检查日期 */
    @Excel(name = "检查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String lxfs;

    /** 登记日期 */
    @Excel(name = "登记日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date djrq;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long chjcdjid;

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
    public void setCsrq(Date csrq) 
    {
        this.csrq = csrq;
    }

    public Date getCsrq() 
    {
        return csrq;
    }
    public void setMz(String mz) 
    {
        this.mz = mz;
    }

    public String getMz() 
    {
        return mz;
    }
    public void setMqsfzjhm(String mqsfzjhm) 
    {
        this.mqsfzjhm = mqsfzjhm;
    }

    public String getMqsfzjhm() 
    {
        return mqsfzjhm;
    }
    public void setBxbjsz(String bxbjsz) 
    {
        this.bxbjsz = bxbjsz;
    }

    public String getBxbjsz() 
    {
        return bxbjsz;
    }
    public void setHxbjsz(String hxbjsz) 
    {
        this.hxbjsz = hxbjsz;
    }

    public String getHxbjsz() 
    {
        return hxbjsz;
    }
    public void setXxbjsz(String xxbjsz) 
    {
        this.xxbjsz = xxbjsz;
    }

    public String getXxbjsz() 
    {
        return xxbjsz;
    }
    public void setXhdbz(String xhdbz) 
    {
        this.xhdbz = xhdbz;
    }

    public String getXhdbz() 
    {
        return xhdbz;
    }
    public void setNbz(String nbz) 
    {
        this.nbz = nbz;
    }

    public String getNbz() 
    {
        return nbz;
    }
    public void setNdbdljcz(String ndbdljcz) 
    {
        this.ndbdljcz = ndbdljcz;
    }

    public String getNdbdljcz() 
    {
        return ndbdljcz;
    }
    public void setNtdljc(String ntdljc) 
    {
        this.ntdljc = ntdljc;
    }

    public String getNtdljc() 
    {
        return ntdljc;
    }
    public void setNysjd(String nysjd) 
    {
        this.nysjd = nysjd;
    }

    public String getNysjd() 
    {
        return nysjd;
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
    public void setJcrq(Date jcrq) 
    {
        this.jcrq = jcrq;
    }

    public Date getJcrq() 
    {
        return jcrq;
    }
    public void setLxfs(String lxfs) 
    {
        this.lxfs = lxfs;
    }

    public String getLxfs() 
    {
        return lxfs;
    }
    public void setDjrq(Date djrq) 
    {
        this.djrq = djrq;
    }

    public Date getDjrq() 
    {
        return djrq;
    }
    public void setChjcdjid(Long chjcdjid) 
    {
        this.chjcdjid = chjcdjid;
    }

    public Long getChjcdjid() 
    {
        return chjcdjid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("csrq", getCsrq())
            .append("mz", getMz())
            .append("mqsfzjhm", getMqsfzjhm())
            .append("bxbjsz", getBxbjsz())
            .append("hxbjsz", getHxbjsz())
            .append("xxbjsz", getXxbjsz())
            .append("xhdbz", getXhdbz())
            .append("nbz", getNbz())
            .append("ndbdljcz", getNdbdljcz())
            .append("ntdljc", getNtdljc())
            .append("nysjd", getNysjd())
            .append("jcryxm", getJcryxm())
            .append("jcjgmc", getJcjgmc())
            .append("jcrq", getJcrq())
            .append("lxfs", getLxfs())
            .append("djrq", getDjrq())
            .append("chjcdjid", getChjcdjid())
            .toString();
    }
}
