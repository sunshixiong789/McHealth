package com.imedcare.project.etbj.etjktj.jktjyxzd.domain;

import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 儿童健康体检医学指导对象 tb_et_jktjyxzd
 * 
 * @author 黄维业
 * @date 2019-11-25
 */
public class TbEtJktjyxzdVo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 登记ID */
    @Excel(name = "登记ID")
    private Long djid;

    /** 体格检查ID */
    @Excel(name = "体格检查ID")
    private Long tgjcid;

    /** 实验室记录ID */
    @Excel(name = "实验室记录ID")
    private Long sysjlid;

    /** 年龄别体重评价 */
    @Excel(name = "年龄别体重评价")
    private String lnbtz;

    /** 年龄别身高评价 */
    @Excel(name = "年龄别身高评价")
    private String lnbsg;

    /** 身高别体重评价 */
    @Excel(name = "身高别体重评价")
    private String sgbtzpj;

    /** 儿童神经精神发育筛查 */
    @Excel(name = "儿童神经精神发育筛查")
    private String sjjsfyjg;

    /** 检查日期 */
    @Excel(name = "检查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检查人员 */
    @Excel(name = "检查人员")
    private String jcry;

    /** 检查机构 */
    @Excel(name = "检查机构")
    private String jcjg;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 性别 */
    @Excel(name = "性别")
    private String xbdm;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String csrq;

    /** 母亲姓名 */
    @Excel(name = "母亲姓名")
    private String mqxm;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDjid(Long djid) 
    {
        this.djid = djid;
    }

    public Long getDjid() 
    {
        return djid;
    }
    public void setTgjcid(Long tgjcid) 
    {
        this.tgjcid = tgjcid;
    }

    public Long getTgjcid() 
    {
        return tgjcid;
    }
    public void setSysjlid(Long sysjlid) 
    {
        this.sysjlid = sysjlid;
    }

    public Long getSysjlid() 
    {
        return sysjlid;
    }
    public void setLnbtz(String lnbtz) 
    {
        this.lnbtz = lnbtz;
    }

    public String getLnbtz() 
    {
        return lnbtz;
    }
    public void setLnbsg(String lnbsg) 
    {
        this.lnbsg = lnbsg;
    }

    public String getLnbsg() 
    {
        return lnbsg;
    }
    public void setSgbtzpj(String sgbtzpj) 
    {
        this.sgbtzpj = sgbtzpj;
    }

    public String getSgbtzpj() 
    {
        return sgbtzpj;
    }
    public void setSjjsfyjg(String sjjsfyjg) 
    {
        this.sjjsfyjg = sjjsfyjg;
    }

    public String getSjjsfyjg() 
    {
        return sjjsfyjg;
    }
    public void setJcrq(Date jcrq) 
    {
        this.jcrq = jcrq;
    }

    public Date getJcrq() 
    {
        return jcrq;
    }
    public void setJcry(String jcry) 
    {
        this.jcry = jcry;
    }

    public String getJcry() 
    {
        return jcry;
    }
    public void setJcjg(String jcjg) 
    {
        this.jcjg = jcjg;
    }

    public String getJcjg() 
    {
        return jcjg;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXbdm() {
        return xbdm;
    }

    public void setXbdm(String xbdm) {
        this.xbdm = xbdm;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getMqxm() {
        return mqxm;
    }

    public void setMqxm(String mqxm) {
        this.mqxm = mqxm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("djid", getDjid())
            .append("tgjcid", getTgjcid())
            .append("sysjlid", getSysjlid())
            .append("lnbtz", getLnbtz())
            .append("lnbsg", getLnbsg())
            .append("sgbtzpj", getSgbtzpj())
            .append("sjjsfyjg", getSjjsfyjg())
            .append("jcrq", getJcrq())
            .append("jcry", getJcry())
            .append("jcjg", getJcjg())
            .toString();
    }
}
