package com.imedcare.project.fnbj.cqbj.sysjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前保健实验室检查记录对象 fn_cqbj_sysjcjl
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public class FnCqbjSysjcjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 健康档案ID */
    @Excel(name = "健康档案ID")
    private Long daid;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String sfzjLbdm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String sfzjHm;

    /** ABO血型代码 */
    @Excel(name = "ABO血型代码")
    private String aboxxdm;

    /** Rh血型代码 */
    @Excel(name = "Rh血型代码")
    private String rhxxdm;

    /** 肝功能检查结果代码 */
    @Excel(name = "肝功能检查结果代码")
    private String ggnjcjgdm;

    /** 肾功能检查结果代码 */
    @Excel(name = "肾功能检查结果代码")
    private String sgnjcjgdm;

    /** 血β-绒毛膜促性腺激素值(IU/L) */
    @Excel(name = "血β-绒毛膜促性腺激素值(IU/L)")
    private String rmmcxxjs;

    /** 血糖检查值(nmol/L) */
    @Excel(name = "血糖检查值(nmol/L)")
    private String xtjcz;

    /** 白细胞计数值(G/L) */
    @Excel(name = "白细胞计数值(G/L)")
    private String bxbjsz;

    /** 红细胞计数值(G/L) */
    @Excel(name = "红细胞计数值(G/L)")
    private String hxbjsz;

    /** 血小板计数值(G/L) */
    @Excel(name = "血小板计数值(G/L)")
    private String xxbjsz;

    /** 出血时间(s) */
    @Excel(name = "出血时间(s)")
    private String cxsj;

    /** 凝血时间(s) */
    @Excel(name = "凝血时间(s)")
    private String nxsj;

    /** 血红蛋白值(g/L) */
    @Excel(name = "血红蛋白值(g/L)")
    private String xhdbz;

    /** 血清谷丙转氨酶值(U/L) */
    @Excel(name = "血清谷丙转氨酶值(U/L)")
    private String xqgbzamz;

    /** 尿比重 */
    @Excel(name = "尿比重")
    private String nbz;

    /** 尿蛋白定量检测值(mg/24h) */
    @Excel(name = "尿蛋白定量检测值(mg/24h)")
    private String ndbdljcz;

    /** 尿液酸碱度 */
    @Excel(name = "尿液酸碱度")
    private String nyxjd;

    /** 尿糖定量检测(mmol/L) */
    @Excel(name = "尿糖定量检测(mmol/L)")
    private String ntdljc;

    /** 阴道分泌物性状描述 */
    @Excel(name = "阴道分泌物性状描述")
    private String ydfmwxzms;

    /** 滴虫检测结果代码 */
    @Excel(name = "滴虫检测结果代码")
    private String dcjcjgdm;

    /** 念珠菌检测结果代码 */
    @Excel(name = "念珠菌检测结果代码")
    private String nzjjcjgdm;

    /** 阴道分泌物清洁度代码 */
    @Excel(name = "阴道分泌物清洁度代码")
    private String ydfmwqjdm;

    /** 乙型肝炎病毒表面抗原检测结果代码 */
    @Excel(name = "乙型肝炎病毒表面抗原检测结果代码")
    private String yxgybdbm;

    /** 梅毒血清学试验结果代码 */
    @Excel(name = "梅毒血清学试验结果代码")
    private String mdxqxsy;

    /** 淋球菌检查结果 */
    @Excel(name = "淋球菌检查结果")
    private String lqjjcjg;

    /** HIV抗体检查结果代码 */
    @Excel(name = "HIV抗体检查结果代码")
    private String hivktjc;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jctyxm;

    /** 检查(测)机构名称 */
    @Excel(name = "检查(测)机构名称")
    private String jcjimc;

    /** 检查(测)日期 */
    @Excel(name = "检查(测)日期")
    private String jcrq;

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
    public void setDaid(Long daid) 
    {
        this.daid = daid;
    }

    public Long getDaid() 
    {
        return daid;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setSfzjLbdm(String sfzjLbdm) 
    {
        this.sfzjLbdm = sfzjLbdm;
    }

    public String getSfzjLbdm() 
    {
        return sfzjLbdm;
    }
    public void setSfzjHm(String sfzjHm) 
    {
        this.sfzjHm = sfzjHm;
    }

    public String getSfzjHm() 
    {
        return sfzjHm;
    }
    public void setAboxxdm(String aboxxdm) 
    {
        this.aboxxdm = aboxxdm;
    }

    public String getAboxxdm() 
    {
        return aboxxdm;
    }
    public void setRhxxdm(String rhxxdm) 
    {
        this.rhxxdm = rhxxdm;
    }

    public String getRhxxdm() 
    {
        return rhxxdm;
    }
    public void setGgnjcjgdm(String ggnjcjgdm) 
    {
        this.ggnjcjgdm = ggnjcjgdm;
    }

    public String getGgnjcjgdm() 
    {
        return ggnjcjgdm;
    }
    public void setSgnjcjgdm(String sgnjcjgdm) 
    {
        this.sgnjcjgdm = sgnjcjgdm;
    }

    public String getSgnjcjgdm() 
    {
        return sgnjcjgdm;
    }
    public void setRmmcxxjs(String rmmcxxjs) 
    {
        this.rmmcxxjs = rmmcxxjs;
    }

    public String getRmmcxxjs() 
    {
        return rmmcxxjs;
    }
    public void setXtjcz(String xtjcz) 
    {
        this.xtjcz = xtjcz;
    }

    public String getXtjcz() 
    {
        return xtjcz;
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
    public void setCxsj(String cxsj) 
    {
        this.cxsj = cxsj;
    }

    public String getCxsj() 
    {
        return cxsj;
    }
    public void setNxsj(String nxsj) 
    {
        this.nxsj = nxsj;
    }

    public String getNxsj() 
    {
        return nxsj;
    }
    public void setXhdbz(String xhdbz) 
    {
        this.xhdbz = xhdbz;
    }

    public String getXhdbz() 
    {
        return xhdbz;
    }
    public void setXqgbzamz(String xqgbzamz) 
    {
        this.xqgbzamz = xqgbzamz;
    }

    public String getXqgbzamz() 
    {
        return xqgbzamz;
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
    public void setNyxjd(String nyxjd) 
    {
        this.nyxjd = nyxjd;
    }

    public String getNyxjd() 
    {
        return nyxjd;
    }
    public void setNtdljc(String ntdljc) 
    {
        this.ntdljc = ntdljc;
    }

    public String getNtdljc() 
    {
        return ntdljc;
    }
    public void setYdfmwxzms(String ydfmwxzms) 
    {
        this.ydfmwxzms = ydfmwxzms;
    }

    public String getYdfmwxzms() 
    {
        return ydfmwxzms;
    }
    public void setDcjcjgdm(String dcjcjgdm) 
    {
        this.dcjcjgdm = dcjcjgdm;
    }

    public String getDcjcjgdm() 
    {
        return dcjcjgdm;
    }
    public void setNzjjcjgdm(String nzjjcjgdm) 
    {
        this.nzjjcjgdm = nzjjcjgdm;
    }

    public String getNzjjcjgdm() 
    {
        return nzjjcjgdm;
    }
    public void setYdfmwqjdm(String ydfmwqjdm) 
    {
        this.ydfmwqjdm = ydfmwqjdm;
    }

    public String getYdfmwqjdm() 
    {
        return ydfmwqjdm;
    }
    public void setYxgybdbm(String yxgybdbm) 
    {
        this.yxgybdbm = yxgybdbm;
    }

    public String getYxgybdbm() 
    {
        return yxgybdbm;
    }
    public void setMdxqxsy(String mdxqxsy) 
    {
        this.mdxqxsy = mdxqxsy;
    }

    public String getMdxqxsy() 
    {
        return mdxqxsy;
    }
    public void setLqjjcjg(String lqjjcjg) 
    {
        this.lqjjcjg = lqjjcjg;
    }

    public String getLqjjcjg() 
    {
        return lqjjcjg;
    }
    public void setHivktjc(String hivktjc) 
    {
        this.hivktjc = hivktjc;
    }

    public String getHivktjc() 
    {
        return hivktjc;
    }
    public void setJctyxm(String jctyxm) 
    {
        this.jctyxm = jctyxm;
    }

    public String getJctyxm() 
    {
        return jctyxm;
    }
    public void setJcjimc(String jcjimc) 
    {
        this.jcjimc = jcjimc;
    }

    public String getJcjimc() 
    {
        return jcjimc;
    }
    public void setJcrq(String jcrq) 
    {
        this.jcrq = jcrq;
    }

    public String getJcrq() 
    {
        return jcrq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("daid", getDaid())
            .append("birthday", getBirthday())
            .append("sfzjLbdm", getSfzjLbdm())
            .append("sfzjHm", getSfzjHm())
            .append("aboxxdm", getAboxxdm())
            .append("rhxxdm", getRhxxdm())
            .append("ggnjcjgdm", getGgnjcjgdm())
            .append("sgnjcjgdm", getSgnjcjgdm())
            .append("rmmcxxjs", getRmmcxxjs())
            .append("xtjcz", getXtjcz())
            .append("bxbjsz", getBxbjsz())
            .append("hxbjsz", getHxbjsz())
            .append("xxbjsz", getXxbjsz())
            .append("cxsj", getCxsj())
            .append("nxsj", getNxsj())
            .append("xhdbz", getXhdbz())
            .append("xqgbzamz", getXqgbzamz())
            .append("nbz", getNbz())
            .append("ndbdljcz", getNdbdljcz())
            .append("nyxjd", getNyxjd())
            .append("ntdljc", getNtdljc())
            .append("ydfmwxzms", getYdfmwxzms())
            .append("dcjcjgdm", getDcjcjgdm())
            .append("nzjjcjgdm", getNzjjcjgdm())
            .append("ydfmwqjdm", getYdfmwqjdm())
            .append("yxgybdbm", getYxgybdbm())
            .append("mdxqxsy", getMdxqxsy())
            .append("lqjjcjg", getLqjjcjg())
            .append("hivktjc", getHivktjc())
            .append("jctyxm", getJctyxm())
            .append("jcjimc", getJcjimc())
            .append("jcrq", getJcrq())
            .toString();
    }
}
