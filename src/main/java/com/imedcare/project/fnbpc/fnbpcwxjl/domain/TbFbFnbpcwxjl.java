package com.imedcare.project.fnbpc.fnbpcwxjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 妇女病普查问询记录对象 tb_fb_fnbpcwxjl
 * 
 * @author liuyang
 * @date 2019-11-20
 */
public class TbFbFnbpcwxjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 妇女病普查登记ID */
    private Long fnbpcdjid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date csrq;

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String sfzjLbdm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String sfzjHm;

    /** 性交出血史 */
    @Excel(name = "性交出血史")
    private String xjcxs;

    /** 妊娠合并史/并发症史 */
    @Excel(name = "妊娠合并史/并发症史")
    private String rshbs;

    /** 既往疾病史 */
    @Excel(name = "既往疾病史")
    private String jwjbs;

    /** 家族肿瘤史 */
    @Excel(name = "家族肿瘤史")
    private String jzzls;

    /** 妇科及乳腺不适症状代码 0、无，1、外阴瘙痒，2、白带异常，3、宫颈触血，4、下腹不适5、情绪改变，6、潮热出汗，7、月经不规律，8、失眠，9、乳房疼痛，10、乳腺肿块，11、乳腺异常泌乳，12、性交出血，13性交疼痛14、绝经后阴道出血，15、其他 */
    @Excel(name = "妇科及乳腺不适症状代码 0、无，1、外阴瘙痒，2、白带异常，3、宫颈触血，4、下腹不适5、情绪改变，6、潮热出汗，7、月经不规律，8、失眠，9、乳房疼痛，10、乳腺肿块，11、乳腺异常泌乳，12、性交出血，13性交疼痛14、绝经后阴道出血，15、其他")
    private String fkjrxbszzdm;

    /** 初潮年龄（岁） */
    @Excel(name = "初潮年龄", readConverterExp = "岁=")
    private Integer ccnl;

    /** 月经周期（d） */
    @Excel(name = "月经周期", readConverterExp = "d=")
    private Integer yjzq;

    /** 月经持续时间（d） */
    @Excel(name = "月经持续时间", readConverterExp = "d=")
    private Integer yjcxsj;

    /** 月经出血量类别 */
    @Excel(name = "月经出血量类别")
    private String yjcxllbdm;

    /** 痛经标志 */
    @Excel(name = "痛经标志")
    private String tjbz;

    /** 末次月经日期 */
    @Excel(name = "末次月经日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcyjrq;

    /** 绝经标志 */
    @Excel(name = "绝经标志")
    private String jjbz;

    /** 手术绝经标志 0、否，1、是 */
    @Excel(name = "手术绝经标志 0、否，1、是")
    private String ssjjbz;

    /** 绝经年龄（岁） */
    @Excel(name = "绝经年龄", readConverterExp = "岁=")
    private Integer jjnl;

    /** 孕次 */
    @Excel(name = "孕次")
    private Integer yc;

    /** 产次 */
    @Excel(name = "产次")
    private Integer cc;

    /** 自然流产次数 */
    @Excel(name = "自然流产次数")
    private Integer zrlccs;

    /** 人工流产次数 */
    @Excel(name = "人工流产次数")
    private Integer rglccs;

    /** 中期引产次数 */
    @Excel(name = "中期引产次数")
    private Integer zqyccs;

    /** 早产次数 */
    @Excel(name = "早产次数")
    private Integer czcs;

    /** 手术产次数 */
    @Excel(name = "手术产次数")
    private Integer ssccs;

    /** 剖宫产次数 */
    @Excel(name = "剖宫产次数")
    private Integer pgccs;

    /** 死胎例数 */
    @Excel(name = "死胎例数")
    private Integer stls;

    /** 死产例数 */
    @Excel(name = "死产例数")
    private Integer scls;

    /** 出生缺陷儿例数 */
    @Excel(name = "出生缺陷儿例数")
    private Integer csqxrls;

    /** 末次妊娠终止日期 */
    @Excel(name = "末次妊娠终止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcrszzrq;

    /** 末次妊娠终止方式 */
    @Excel(name = "末次妊娠终止方式")
    private String mcrszzfsdm;

    /** 末次分娩日期 */
    @Excel(name = "末次分娩日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcfmrq;

    /** 末次分娩方式 */
    @Excel(name = "末次分娩方式")
    private String mcfmfsdm;

    /** 其他异常孕产史 */
    @Excel(name = "其他异常孕产史")
    private String qtycycs;

    /** 避孕方式 */
    @Excel(name = "避孕方式")
    private String byfsdm;

    /** null */
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
    public void setCsrq(Date csrq) 
    {
        this.csrq = csrq;
    }

    public Date getCsrq() 
    {
        return csrq;
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
    public void setXjcxs(String xjcxs) 
    {
        this.xjcxs = xjcxs;
    }

    public String getXjcxs() 
    {
        return xjcxs;
    }
    public void setRshbs(String rshbs) 
    {
        this.rshbs = rshbs;
    }

    public String getRshbs() 
    {
        return rshbs;
    }
    public void setJwjbs(String jwjbs) 
    {
        this.jwjbs = jwjbs;
    }

    public String getJwjbs() 
    {
        return jwjbs;
    }
    public void setJzzls(String jzzls) 
    {
        this.jzzls = jzzls;
    }

    public String getJzzls() 
    {
        return jzzls;
    }
    public void setFkjrxbszzdm(String fkjrxbszzdm) 
    {
        this.fkjrxbszzdm = fkjrxbszzdm;
    }

    public String getFkjrxbszzdm() 
    {
        return fkjrxbszzdm;
    }
    public void setCcnl(Integer ccnl) 
    {
        this.ccnl = ccnl;
    }

    public Integer getCcnl() 
    {
        return ccnl;
    }
    public void setYjzq(Integer yjzq) 
    {
        this.yjzq = yjzq;
    }

    public Integer getYjzq() 
    {
        return yjzq;
    }
    public void setYjcxsj(Integer yjcxsj) 
    {
        this.yjcxsj = yjcxsj;
    }

    public Integer getYjcxsj() 
    {
        return yjcxsj;
    }
    public void setYjcxllbdm(String yjcxllbdm) 
    {
        this.yjcxllbdm = yjcxllbdm;
    }

    public String getYjcxllbdm() 
    {
        return yjcxllbdm;
    }
    public void setTjbz(String tjbz) 
    {
        this.tjbz = tjbz;
    }

    public String getTjbz() 
    {
        return tjbz;
    }
    public void setMcyjrq(Date mcyjrq) 
    {
        this.mcyjrq = mcyjrq;
    }

    public Date getMcyjrq() 
    {
        return mcyjrq;
    }
    public void setJjbz(String jjbz) 
    {
        this.jjbz = jjbz;
    }

    public String getJjbz() 
    {
        return jjbz;
    }
    public void setSsjjbz(String ssjjbz) 
    {
        this.ssjjbz = ssjjbz;
    }

    public String getSsjjbz() 
    {
        return ssjjbz;
    }
    public void setJjnl(Integer jjnl) 
    {
        this.jjnl = jjnl;
    }

    public Integer getJjnl() 
    {
        return jjnl;
    }
    public void setYc(Integer yc) 
    {
        this.yc = yc;
    }

    public Integer getYc() 
    {
        return yc;
    }
    public void setCc(Integer cc) 
    {
        this.cc = cc;
    }

    public Integer getCc() 
    {
        return cc;
    }
    public void setZrlccs(Integer zrlccs) 
    {
        this.zrlccs = zrlccs;
    }

    public Integer getZrlccs() 
    {
        return zrlccs;
    }
    public void setRglccs(Integer rglccs) 
    {
        this.rglccs = rglccs;
    }

    public Integer getRglccs() 
    {
        return rglccs;
    }
    public void setZqyccs(Integer zqyccs) 
    {
        this.zqyccs = zqyccs;
    }

    public Integer getZqyccs() 
    {
        return zqyccs;
    }
    public void setCzcs(Integer czcs) 
    {
        this.czcs = czcs;
    }

    public Integer getCzcs() 
    {
        return czcs;
    }
    public void setSsccs(Integer ssccs) 
    {
        this.ssccs = ssccs;
    }

    public Integer getSsccs() 
    {
        return ssccs;
    }
    public void setPgccs(Integer pgccs) 
    {
        this.pgccs = pgccs;
    }

    public Integer getPgccs() 
    {
        return pgccs;
    }
    public void setStls(Integer stls) 
    {
        this.stls = stls;
    }

    public Integer getStls() 
    {
        return stls;
    }
    public void setScls(Integer scls) 
    {
        this.scls = scls;
    }

    public Integer getScls() 
    {
        return scls;
    }
    public void setCsqxrls(Integer csqxrls) 
    {
        this.csqxrls = csqxrls;
    }

    public Integer getCsqxrls() 
    {
        return csqxrls;
    }
    public void setMcrszzrq(Date mcrszzrq) 
    {
        this.mcrszzrq = mcrszzrq;
    }

    public Date getMcrszzrq() 
    {
        return mcrszzrq;
    }
    public void setMcrszzfsdm(String mcrszzfsdm) 
    {
        this.mcrszzfsdm = mcrszzfsdm;
    }

    public String getMcrszzfsdm() 
    {
        return mcrszzfsdm;
    }
    public void setMcfmrq(Date mcfmrq) 
    {
        this.mcfmrq = mcfmrq;
    }

    public Date getMcfmrq() 
    {
        return mcfmrq;
    }
    public void setMcfmfsdm(String mcfmfsdm) 
    {
        this.mcfmfsdm = mcfmfsdm;
    }

    public String getMcfmfsdm() 
    {
        return mcfmfsdm;
    }
    public void setQtycycs(String qtycycs) 
    {
        this.qtycycs = qtycycs;
    }

    public String getQtycycs() 
    {
        return qtycycs;
    }
    public void setByfsdm(String byfsdm) 
    {
        this.byfsdm = byfsdm;
    }

    public String getByfsdm() 
    {
        return byfsdm;
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
            .append("csrq", getCsrq())
            .append("sfzjLbdm", getSfzjLbdm())
            .append("sfzjHm", getSfzjHm())
            .append("xjcxs", getXjcxs())
            .append("rshbs", getRshbs())
            .append("jwjbs", getJwjbs())
            .append("jzzls", getJzzls())
            .append("fkjrxbszzdm", getFkjrxbszzdm())
            .append("ccnl", getCcnl())
            .append("yjzq", getYjzq())
            .append("yjcxsj", getYjcxsj())
            .append("yjcxllbdm", getYjcxllbdm())
            .append("tjbz", getTjbz())
            .append("mcyjrq", getMcyjrq())
            .append("jjbz", getJjbz())
            .append("ssjjbz", getSsjjbz())
            .append("jjnl", getJjnl())
            .append("yc", getYc())
            .append("cc", getCc())
            .append("zrlccs", getZrlccs())
            .append("rglccs", getRglccs())
            .append("zqyccs", getZqyccs())
            .append("czcs", getCzcs())
            .append("ssccs", getSsccs())
            .append("pgccs", getPgccs())
            .append("stls", getStls())
            .append("scls", getScls())
            .append("csqxrls", getCsqxrls())
            .append("mcrszzrq", getMcrszzrq())
            .append("mcrszzfsdm", getMcrszzfsdm())
            .append("mcfmrq", getMcfmrq())
            .append("mcfmfsdm", getMcfmfsdm())
            .append("qtycycs", getQtycycs())
            .append("byfsdm", getByfsdm())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
