package com.imedcare.project.fnbj.jhsy.jhsydj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 计划生育技术服务对象 tb_ch_jhsy
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
public class TbChJhsy extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 健康档案id */
    @Excel(name = "健康档案id")
    private Long jkdaid;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 手术类别 */
    @Excel(name = "手术类别")
    private Integer ssdm;

    /** 术前检查描述 */
    @Excel(name = "术前检查描述")
    private String sqms;

    /** 手术记录描述 */
    @Excel(name = "手术记录描述")
    private String ssjlms;

    /** 手术并发症 */
    @Excel(name = "手术并发症")
    private String ssbfz;

    /** 特殊情况描述 */
    @Excel(name = "特殊情况描述")
    private String tsqkms;

    /** 处理意见 */
    @Excel(name = "处理意见")
    private String clyj;

    /** 医生姓名 */
    @Excel(name = "医生姓名")
    private String ysxm;

    /** 手术日期 */
    @Excel(name = "手术日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ssrq;

    /** 手术出血量 */
    @Excel(name = "手术出血量")
    private String sscxl;

    /** 清宫日期 */
    @Excel(name = "清宫日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qgrq;

    /** 胚囊排出日期 */
    @Excel(name = "胚囊排出日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pnpcrq;

    /** 药物用法 */
    @Excel(name = "药物用法")
    private String ywyf;

    /** 病理检查结果 */
    @Excel(name = "病理检查结果")
    private String bljcjg;

    /** 腹痛程度 */
    @Excel(name = "腹痛程度")
    private Integer ftcd;

    /** 腹泻次数 */
    @Excel(name = "腹泻次数")
    private String fxcs;

    /** 呕吐次数 */
    @Excel(name = "呕吐次数")
    private String otcs;

    /** 药流药物类别 */
    @Excel(name = "药流药物类别")
    private Integer ylywlb;

    /** 流产方法 */
    @Excel(name = "流产方法")
    private Integer lcff;

    /** 胚囊直径（cm） */
    @Excel(name = "胚囊直径", readConverterExp = "c=m")
    private String pnzj;

    /** 输卵管结扎部位 */
    @Excel(name = "输卵管结扎部位")
    private Integer jzbw;

    /** 输卵管结扎方式 */
    @Excel(name = "输卵管结扎方式")
    private Integer jzfs;

    /** 皮下埋植剂异常 */
    @Excel(name = "皮下埋植剂异常")
    private Integer pxmzyc;

    /** 皮下埋植部位 */
    @Excel(name = "皮下埋植部位")
    private Integer pxmzbw;

    /** 皮下埋植年限 */
    @Excel(name = "皮下埋植年限")
    private String pxmznx;

    /** 皮下埋植时期 */
    @Excel(name = "皮下埋植时期")
    private Integer pxmzsq;

    /** 宫内节育器种类 */
    @Excel(name = "宫内节育器种类")
    private Integer gnjyqzl;

    /** 宫内节育器异常描述 */
    @Excel(name = "宫内节育器异常描述")
    private String gnjyqycms;

    /** 宫内节育器异常 */
    @Excel(name = "宫内节育器异常")
    private Integer gnjyqyc;

    /** 宫内节育器放置时期 */
    @Excel(name = "宫内节育器放置时期")
    private Integer gnjyqfzsq;

    /** 宫内节育器放置年限 */
    @Excel(name = "宫内节育器放置年限")
    private String gnjyqfznx;

    /** 血β-绒毛膜促性腺激素值（IU/L） */
    @Excel(name = "血β-绒毛膜促性腺激素值", readConverterExp = "I=U/L")
    private String rmcxxjs;

    /** 尿妊娠试验结果代码 */
    @Excel(name = "尿妊娠试验结果代码")
    private String nrssyjg;

    /** 右侧卵巢检查结果 */
    @Excel(name = "右侧卵巢检查结果")
    private String yclcjg;

    /** 左侧卵巢检查结果 */
    @Excel(name = "左侧卵巢检查结果")
    private String zclcjg;

    /** 右侧输卵管检查结果 */
    @Excel(name = "右侧输卵管检查结果")
    private String ycslgjcjg;

    /** 左侧输卵管检查结果 */
    @Excel(name = "左侧输卵管检查结果")
    private String zcslgjcjg;

    /** 子宫大小 */
    @Excel(name = "子宫大小")
    private Integer zgdx;

    /** 子宫位置 */
    @Excel(name = "子宫位置")
    private Integer zgwz;

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
    public void setJkdaid(Long jkdaid) 
    {
        this.jkdaid = jkdaid;
    }

    public Long getJkdaid() 
    {
        return jkdaid;
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
    public void setSsdm(Integer ssdm) 
    {
        this.ssdm = ssdm;
    }

    public Integer getSsdm() 
    {
        return ssdm;
    }
    public void setSqms(String sqms) 
    {
        this.sqms = sqms;
    }

    public String getSqms() 
    {
        return sqms;
    }
    public void setSsjlms(String ssjlms) 
    {
        this.ssjlms = ssjlms;
    }

    public String getSsjlms() 
    {
        return ssjlms;
    }
    public void setSsbfz(String ssbfz) 
    {
        this.ssbfz = ssbfz;
    }

    public String getSsbfz() 
    {
        return ssbfz;
    }
    public void setTsqkms(String tsqkms) 
    {
        this.tsqkms = tsqkms;
    }

    public String getTsqkms() 
    {
        return tsqkms;
    }
    public void setClyj(String clyj) 
    {
        this.clyj = clyj;
    }

    public String getClyj() 
    {
        return clyj;
    }
    public void setYsxm(String ysxm) 
    {
        this.ysxm = ysxm;
    }

    public String getYsxm() 
    {
        return ysxm;
    }
    public void setSsrq(Date ssrq) 
    {
        this.ssrq = ssrq;
    }

    public Date getSsrq() 
    {
        return ssrq;
    }
    public void setSscxl(String sscxl) 
    {
        this.sscxl = sscxl;
    }

    public String getSscxl() 
    {
        return sscxl;
    }
    public void setQgrq(Date qgrq) 
    {
        this.qgrq = qgrq;
    }

    public Date getQgrq() 
    {
        return qgrq;
    }
    public void setPnpcrq(Date pnpcrq) 
    {
        this.pnpcrq = pnpcrq;
    }

    public Date getPnpcrq() 
    {
        return pnpcrq;
    }
    public void setYwyf(String ywyf) 
    {
        this.ywyf = ywyf;
    }

    public String getYwyf() 
    {
        return ywyf;
    }
    public void setBljcjg(String bljcjg) 
    {
        this.bljcjg = bljcjg;
    }

    public String getBljcjg() 
    {
        return bljcjg;
    }
    public void setFtcd(Integer ftcd) 
    {
        this.ftcd = ftcd;
    }

    public Integer getFtcd() 
    {
        return ftcd;
    }
    public void setFxcs(String fxcs) 
    {
        this.fxcs = fxcs;
    }

    public String getFxcs() 
    {
        return fxcs;
    }
    public void setOtcs(String otcs) 
    {
        this.otcs = otcs;
    }

    public String getOtcs() 
    {
        return otcs;
    }
    public void setYlywlb(Integer ylywlb) 
    {
        this.ylywlb = ylywlb;
    }

    public Integer getYlywlb() 
    {
        return ylywlb;
    }
    public void setLcff(Integer lcff) 
    {
        this.lcff = lcff;
    }

    public Integer getLcff() 
    {
        return lcff;
    }
    public void setPnzj(String pnzj) 
    {
        this.pnzj = pnzj;
    }

    public String getPnzj() 
    {
        return pnzj;
    }
    public void setJzbw(Integer jzbw) 
    {
        this.jzbw = jzbw;
    }

    public Integer getJzbw() 
    {
        return jzbw;
    }
    public void setJzfs(Integer jzfs) 
    {
        this.jzfs = jzfs;
    }

    public Integer getJzfs() 
    {
        return jzfs;
    }
    public void setPxmzyc(Integer pxmzyc) 
    {
        this.pxmzyc = pxmzyc;
    }

    public Integer getPxmzyc() 
    {
        return pxmzyc;
    }
    public void setPxmzbw(Integer pxmzbw) 
    {
        this.pxmzbw = pxmzbw;
    }

    public Integer getPxmzbw() 
    {
        return pxmzbw;
    }
    public void setPxmznx(String pxmznx) 
    {
        this.pxmznx = pxmznx;
    }

    public String getPxmznx() 
    {
        return pxmznx;
    }
    public void setPxmzsq(Integer pxmzsq) 
    {
        this.pxmzsq = pxmzsq;
    }

    public Integer getPxmzsq() 
    {
        return pxmzsq;
    }
    public void setGnjyqzl(Integer gnjyqzl) 
    {
        this.gnjyqzl = gnjyqzl;
    }

    public Integer getGnjyqzl() 
    {
        return gnjyqzl;
    }
    public void setGnjyqycms(String gnjyqycms) 
    {
        this.gnjyqycms = gnjyqycms;
    }

    public String getGnjyqycms() 
    {
        return gnjyqycms;
    }
    public void setGnjyqyc(Integer gnjyqyc) 
    {
        this.gnjyqyc = gnjyqyc;
    }

    public Integer getGnjyqyc() 
    {
        return gnjyqyc;
    }
    public void setGnjyqfzsq(Integer gnjyqfzsq) 
    {
        this.gnjyqfzsq = gnjyqfzsq;
    }

    public Integer getGnjyqfzsq() 
    {
        return gnjyqfzsq;
    }
    public void setGnjyqfznx(String gnjyqfznx) 
    {
        this.gnjyqfznx = gnjyqfznx;
    }

    public String getGnjyqfznx() 
    {
        return gnjyqfznx;
    }
    public void setRmcxxjs(String rmcxxjs) 
    {
        this.rmcxxjs = rmcxxjs;
    }

    public String getRmcxxjs() 
    {
        return rmcxxjs;
    }
    public void setNrssyjg(String nrssyjg) 
    {
        this.nrssyjg = nrssyjg;
    }

    public String getNrssyjg() 
    {
        return nrssyjg;
    }
    public void setYclcjg(String yclcjg) 
    {
        this.yclcjg = yclcjg;
    }

    public String getYclcjg() 
    {
        return yclcjg;
    }
    public void setZclcjg(String zclcjg) 
    {
        this.zclcjg = zclcjg;
    }

    public String getZclcjg() 
    {
        return zclcjg;
    }
    public void setYcslgjcjg(String ycslgjcjg) 
    {
        this.ycslgjcjg = ycslgjcjg;
    }

    public String getYcslgjcjg() 
    {
        return ycslgjcjg;
    }
    public void setZcslgjcjg(String zcslgjcjg) 
    {
        this.zcslgjcjg = zcslgjcjg;
    }

    public String getZcslgjcjg() 
    {
        return zcslgjcjg;
    }
    public void setZgdx(Integer zgdx) 
    {
        this.zgdx = zgdx;
    }

    public Integer getZgdx() 
    {
        return zgdx;
    }
    public void setZgwz(Integer zgwz) 
    {
        this.zgwz = zgwz;
    }

    public Integer getZgwz() 
    {
        return zgwz;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("jkdaid", getJkdaid())
            .append("cardid", getCardid())
            .append("birthday", getBirthday())
            .append("ssdm", getSsdm())
            .append("sqms", getSqms())
            .append("ssjlms", getSsjlms())
            .append("ssbfz", getSsbfz())
            .append("tsqkms", getTsqkms())
            .append("clyj", getClyj())
            .append("ysxm", getYsxm())
            .append("ssrq", getSsrq())
            .append("sscxl", getSscxl())
            .append("qgrq", getQgrq())
            .append("pnpcrq", getPnpcrq())
            .append("ywyf", getYwyf())
            .append("bljcjg", getBljcjg())
            .append("ftcd", getFtcd())
            .append("fxcs", getFxcs())
            .append("otcs", getOtcs())
            .append("ylywlb", getYlywlb())
            .append("lcff", getLcff())
            .append("pnzj", getPnzj())
            .append("jzbw", getJzbw())
            .append("jzfs", getJzfs())
            .append("pxmzyc", getPxmzyc())
            .append("pxmzbw", getPxmzbw())
            .append("pxmznx", getPxmznx())
            .append("pxmzsq", getPxmzsq())
            .append("gnjyqzl", getGnjyqzl())
            .append("gnjyqycms", getGnjyqycms())
            .append("gnjyqyc", getGnjyqyc())
            .append("gnjyqfzsq", getGnjyqfzsq())
            .append("gnjyqfznx", getGnjyqfznx())
            .append("rmcxxjs", getRmcxxjs())
            .append("nrssyjg", getNrssyjg())
            .append("yclcjg", getYclcjg())
            .append("zclcjg", getZclcjg())
            .append("ycslgjcjg", getYcslgjcjg())
            .append("zcslgjcjg", getZcslgjcjg())
            .append("zgdx", getZgdx())
            .append("zgwz", getZgwz())
            .toString();
    }
}
