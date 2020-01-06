package com.imedcare.project.etbj.xsefs.xsefsjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 新生儿访视记录对象 tb_et_xsefsjl
 * 
 * @author 黄维业
 * @date 2019-11-12
 */
public class TbEtXsefsjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 新生儿访视登记ID */
    @Excel(name = "新生儿访视登记ID")
    private Long fsdjid;

    /** 体重 */
    @Excel(name = "体重")
    private String tz;

    /** 身长 */
    @Excel(name = "身长")
    private String sc;

    /** 头围 */
    @Excel(name = "头围")
    private String tw;

    /** 黄疸部位 */
    @Excel(name = "黄疸部位")
    private String hddm;

    /** 喂养方式代码 */
    @Excel(name = "喂养方式代码")
    private String wyfs;

    /** 小便性状代码 */
    @Excel(name = "小便性状代码")
    private String xbzkdm;

    /** 小便状况 */
    @Excel(name = "小便状况")
    private String xbzk;

    /** 大便性状代码 */
    @Excel(name = "大便性状代码")
    private String dbzkdm;

    /** 大便状况 */
    @Excel(name = "大便状况")
    private String dbzk;

    /** 有无特殊情况 */
    @Excel(name = "有无特殊情况")
    private String tsqk;

    /** 特殊情况 */
    @Excel(name = "特殊情况")
    private String tsqksm;

    /** 有无并发症 */
    @Excel(name = "有无并发症")
    private String bfz;

    /** 并发症代码 */
    @Excel(name = "并发症代码")
    private String bfzdm;

    /** 指导意见 */
    @Excel(name = "指导意见")
    private String zdyj;

    /** 访视日期 */
    @Excel(name = "访视日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fsrq;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String jgmc;

    /** 访视医生姓名 */
    @Excel(name = "访视医生姓名")
    private String ysxm;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFsdjid(Long fsdjid) 
    {
        this.fsdjid = fsdjid;
    }

    public Long getFsdjid() 
    {
        return fsdjid;
    }
    public void setTz(String tz) 
    {
        this.tz = tz;
    }

    public String getTz() 
    {
        return tz;
    }
    public void setSc(String sc) 
    {
        this.sc = sc;
    }

    public String getSc() 
    {
        return sc;
    }
    public void setTw(String tw) 
    {
        this.tw = tw;
    }

    public String getTw() 
    {
        return tw;
    }
    public void setHddm(String hddm) 
    {
        this.hddm = hddm;
    }

    public String getHddm() 
    {
        return hddm;
    }
    public void setWyfs(String wyfs) 
    {
        this.wyfs = wyfs;
    }

    public String getWyfs() 
    {
        return wyfs;
    }
    public void setXbzkdm(String xbzkdm) 
    {
        this.xbzkdm = xbzkdm;
    }

    public String getXbzkdm() 
    {
        return xbzkdm;
    }
    public void setXbzk(String xbzk) 
    {
        this.xbzk = xbzk;
    }

    public String getXbzk() 
    {
        return xbzk;
    }
    public void setDbzkdm(String dbzkdm) 
    {
        this.dbzkdm = dbzkdm;
    }

    public String getDbzkdm() 
    {
        return dbzkdm;
    }
    public void setDbzk(String dbzk) 
    {
        this.dbzk = dbzk;
    }

    public String getDbzk() 
    {
        return dbzk;
    }
    public void setTsqk(String tsqk) 
    {
        this.tsqk = tsqk;
    }

    public String getTsqk() 
    {
        return tsqk;
    }
    public void setTsqksm(String tsqksm) 
    {
        this.tsqksm = tsqksm;
    }

    public String getTsqksm() 
    {
        return tsqksm;
    }
    public void setBfz(String bfz) 
    {
        this.bfz = bfz;
    }

    public String getBfz() 
    {
        return bfz;
    }
    public void setBfzdm(String bfzdm) 
    {
        this.bfzdm = bfzdm;
    }

    public String getBfzdm() 
    {
        return bfzdm;
    }
    public void setZdyj(String zdyj) 
    {
        this.zdyj = zdyj;
    }

    public String getZdyj() 
    {
        return zdyj;
    }
    public void setFsrq(Date fsrq) 
    {
        this.fsrq = fsrq;
    }

    public Date getFsrq() 
    {
        return fsrq;
    }
    public void setJgmc(String jgmc) 
    {
        this.jgmc = jgmc;
    }

    public String getJgmc() 
    {
        return jgmc;
    }
    public void setYsxm(String ysxm) 
    {
        this.ysxm = ysxm;
    }

    public String getYsxm() 
    {
        return ysxm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fsdjid", getFsdjid())
            .append("tz", getTz())
            .append("sc", getSc())
            .append("tw", getTw())
            .append("hddm", getHddm())
            .append("wyfs", getWyfs())
            .append("xbzkdm", getXbzkdm())
            .append("xbzk", getXbzk())
            .append("dbzkdm", getDbzkdm())
            .append("dbzk", getDbzk())
            .append("tsqk", getTsqk())
            .append("tsqksm", getTsqksm())
            .append("bfz", getBfz())
            .append("bfzdm", getBfzdm())
            .append("zdyj", getZdyj())
            .append("fsrq", getFsrq())
            .append("jgmc", getJgmc())
            .append("ysxm", getYsxm())
            .toString();
    }
}
