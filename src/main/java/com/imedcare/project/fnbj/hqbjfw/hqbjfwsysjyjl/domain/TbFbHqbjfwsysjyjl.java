package com.imedcare.project.fnbj.hqbjfw.hqbjfwsysjyjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 婚前保健服务实验室检验记录对象 tb_fb_hqbjfwsysjyjl
 * 
 * @author liuyang
 * @date 2019-11-19
 */
public class TbFbHqbjfwsysjyjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 婚前保健服务登记id */
    @Excel(name = "婚前保健服务登记id")
    private Long hqbjfwdjid;

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

    /** 白细胞分类结果 */
    @Excel(name = "白细胞分类结果")
    private String bxbfljg;

    /** 白细胞计数值(G/L) */
    @Excel(name = "白细胞计数值(G/L)")
    private Integer bxbjsz;

    /** 红细胞计数值(G/L) */
    @Excel(name = "红细胞计数值(G/L)")
    private Integer hxbjsz;

    /** 血红蛋白值(G/L) */
    @Excel(name = "血红蛋白值(G/L)")
    private Integer xhdbz;

    /** 血小板计数值(G/L) */
    @Excel(name = "血小板计数值(G/L)")
    private Integer xxbjsz;

    /** 尿比重 */
    @Excel(name = "尿比重")
    private Integer nbz;

    /** 尿蛋白定量检测值(mg/24h) */
    @Excel(name = "尿蛋白定量检测值(mg/24h)")
    private Integer ndbdljcz;

    /** 尿糖定量检测(mmol/L) */
    @Excel(name = "尿糖定量检测(mmol/L)")
    private Integer ntdljc;

    /** 尿液酸碱度 */
    @Excel(name = "尿液酸碱度")
    private Integer nysjd;

    /** 血清谷丙转氨酶值(U/L) */
    @Excel(name = "血清谷丙转氨酶值(U/L)")
    private Integer xqgbzamz;

    /** 乙型肝炎病毒表面抗原检测结果代码 */
    @Excel(name = "乙型肝炎病毒表面抗原检测结果代码")
    private String yxgybdbmkyjcjgdm;

    /** 淋球菌检查结果 */
    @Excel(name = "淋球菌检查结果")
    private String lqjjcjg;

    /** 梅毒血清学实验结果代码 */
    @Excel(name = "梅毒血清学实验结果代码")
    private String mdxqxsyjgdm;

    /** HIV抗体检测结果代码 */
    @Excel(name = "HIV抗体检测结果代码")
    private String hivktjcjgdm;

    /** 滴虫检测结果代码 */
    @Excel(name = "滴虫检测结果代码")
    private String dcjcjgdm;

    /** 念珠菌检测结果代码 */
    @Excel(name = "念珠菌检测结果代码")
    private String nzjjcjgdm;

    /** 阴道分泌物性状描述 */
    @Excel(name = "阴道分泌物性状描述")
    private String ydfmwxzms;

    /** 阴道分泌物清洁度代码 */
    @Excel(name = "阴道分泌物清洁度代码")
    private String ydfmwqjddm;

    /** 检查(测)日期 */
    @Excel(name = "检查(测)日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jcryxm;

    /** 检查(测)机构名称 */
    @Excel(name = "检查(测)机构名称")
    private String jcjgmc;

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
    public void setBxbfljg(String bxbfljg) 
    {
        this.bxbfljg = bxbfljg;
    }

    public String getBxbfljg() 
    {
        return bxbfljg;
    }
    public void setBxbjsz(Integer bxbjsz) 
    {
        this.bxbjsz = bxbjsz;
    }

    public Integer getBxbjsz() 
    {
        return bxbjsz;
    }
    public void setHxbjsz(Integer hxbjsz) 
    {
        this.hxbjsz = hxbjsz;
    }

    public Integer getHxbjsz() 
    {
        return hxbjsz;
    }
    public void setXhdbz(Integer xhdbz) 
    {
        this.xhdbz = xhdbz;
    }

    public Integer getXhdbz() 
    {
        return xhdbz;
    }
    public void setXxbjsz(Integer xxbjsz) 
    {
        this.xxbjsz = xxbjsz;
    }

    public Integer getXxbjsz() 
    {
        return xxbjsz;
    }
    public void setNbz(Integer nbz) 
    {
        this.nbz = nbz;
    }

    public Integer getNbz() 
    {
        return nbz;
    }
    public void setNdbdljcz(Integer ndbdljcz) 
    {
        this.ndbdljcz = ndbdljcz;
    }

    public Integer getNdbdljcz() 
    {
        return ndbdljcz;
    }
    public void setNtdljc(Integer ntdljc) 
    {
        this.ntdljc = ntdljc;
    }

    public Integer getNtdljc() 
    {
        return ntdljc;
    }
    public void setNysjd(Integer nysjd) 
    {
        this.nysjd = nysjd;
    }

    public Integer getNysjd() 
    {
        return nysjd;
    }
    public void setXqgbzamz(Integer xqgbzamz) 
    {
        this.xqgbzamz = xqgbzamz;
    }

    public Integer getXqgbzamz() 
    {
        return xqgbzamz;
    }
    public void setYxgybdbmkyjcjgdm(String yxgybdbmkyjcjgdm) 
    {
        this.yxgybdbmkyjcjgdm = yxgybdbmkyjcjgdm;
    }

    public String getYxgybdbmkyjcjgdm() 
    {
        return yxgybdbmkyjcjgdm;
    }
    public void setLqjjcjg(String lqjjcjg) 
    {
        this.lqjjcjg = lqjjcjg;
    }

    public String getLqjjcjg() 
    {
        return lqjjcjg;
    }
    public void setMdxqxsyjgdm(String mdxqxsyjgdm) 
    {
        this.mdxqxsyjgdm = mdxqxsyjgdm;
    }

    public String getMdxqxsyjgdm() 
    {
        return mdxqxsyjgdm;
    }
    public void setHivktjcjgdm(String hivktjcjgdm) 
    {
        this.hivktjcjgdm = hivktjcjgdm;
    }

    public String getHivktjcjgdm() 
    {
        return hivktjcjgdm;
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
    public void setYdfmwxzms(String ydfmwxzms) 
    {
        this.ydfmwxzms = ydfmwxzms;
    }

    public String getYdfmwxzms() 
    {
        return ydfmwxzms;
    }
    public void setYdfmwqjddm(String ydfmwqjddm) 
    {
        this.ydfmwqjddm = ydfmwqjddm;
    }

    public String getYdfmwqjddm() 
    {
        return ydfmwqjddm;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("hqbjfwdjid", getHqbjfwdjid())
            .append("cardid", getCardid())
            .append("birthday", getBirthday())
            .append("dfjlbid", getDfjlbid())
            .append("dfxm", getDfxm())
            .append("bxbfljg", getBxbfljg())
            .append("bxbjsz", getBxbjsz())
            .append("hxbjsz", getHxbjsz())
            .append("xhdbz", getXhdbz())
            .append("xxbjsz", getXxbjsz())
            .append("nbz", getNbz())
            .append("ndbdljcz", getNdbdljcz())
            .append("ntdljc", getNtdljc())
            .append("nysjd", getNysjd())
            .append("xqgbzamz", getXqgbzamz())
            .append("yxgybdbmkyjcjgdm", getYxgybdbmkyjcjgdm())
            .append("lqjjcjg", getLqjjcjg())
            .append("mdxqxsyjgdm", getMdxqxsyjgdm())
            .append("hivktjcjgdm", getHivktjcjgdm())
            .append("dcjcjgdm", getDcjcjgdm())
            .append("nzjjcjgdm", getNzjjcjgdm())
            .append("ydfmwxzms", getYdfmwxzms())
            .append("ydfmwqjddm", getYdfmwqjddm())
            .append("jcrq", getJcrq())
            .append("jcryxm", getJcryxm())
            .append("jcjgmc", getJcjgmc())
            .toString();
    }
}
