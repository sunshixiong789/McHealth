package com.imedcare.project.fnbj.yqjc.yqjcdj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 孕前优生健康检查对象 tb_ch_yqjc
 * 
 * @author 黄维业
 * @date 2019-12-24
 */
public class TbChYqjc extends BaseEntity
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

    /** 初潮年龄 */
    @Excel(name = "初潮年龄")
    private String ccnl;

    /** 经期 */
    @Excel(name = "经期")
    private String jq;

    /** 周期 */
    @Excel(name = "周期")
    private String zq;

    /** 月经量 */
    @Excel(name = "月经量")
    private Integer yjl;

    /** 痛经 */
    @Excel(name = "痛经")
    private Integer tj;

    /** 末次月经日期 */
    @Excel(name = "末次月经日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcyj;

    /** 绝经 */
    @Excel(name = "绝经")
    private Integer jj;

    /** 绝经年龄 */
    @Excel(name = "绝经年龄")
    private String jjnl;

    /** 手术绝经 */
    @Excel(name = "手术绝经")
    private Integer ssjj;

    /** 孕次 */
    @Excel(name = "孕次")
    private String yc;

    /** 产次 */
    @Excel(name = "产次")
    private String cc;

    /** 人工流产次数 */
    @Excel(name = "人工流产次数")
    private String rglc;

    /** 自然流产次数 */
    @Excel(name = "自然流产次数")
    private String zrlc;

    /** 中期引产次数 */
    @Excel(name = "中期引产次数")
    private String zqycc;

    /** 早产次数 */
    @Excel(name = "早产次数")
    private String zccs;

    /** 手术产次数 */
    @Excel(name = "手术产次数")
    private String sscc;

    /** 死胎次数 */
    @Excel(name = "死胎次数")
    private String stcs;

    /** 死产次数 */
    @Excel(name = "死产次数")
    private String sccs;

    /** 出生缺陷儿数 */
    @Excel(name = "出生缺陷儿数")
    private String csqxes;

    /** 末次妊娠终止日期 */
    @Excel(name = "末次妊娠终止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcrszzrq;

    /** 末次妊娠终止方式 */
    @Excel(name = "末次妊娠终止方式")
    private String mcrszzfs;

    /** 末次分娩日期 */
    @Excel(name = "末次分娩日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcfmrq;

    /** 末次分娩方式 */
    @Excel(name = "末次分娩方式")
    private String mcfmfs;

    /** 妊娠并发症 */
    @Excel(name = "妊娠并发症")
    private String rsbfz;

    /** 其他异常孕史 */
    @Excel(name = "其他异常孕史")
    private String qtycys;

    /** 避孕方式 */
    @Excel(name = "避孕方式")
    private Integer byfs;

    /** 既往疾病史 */
    @Excel(name = "既往疾病史")
    private String jwjbs;

    /** 性交出血史 */
    @Excel(name = "性交出血史")
    private String xjcxs;

    /** 妇科病史 */
    @Excel(name = "妇科病史")
    private String fkbs;

    /** 乳腺病史 */
    @Excel(name = "乳腺病史")
    private String rxbs;

    /** 家族肿瘤史 */
    @Excel(name = "家族肿瘤史")
    private String jzzls;

    /** 妇科及乳腺不适症状 */
    @Excel(name = "妇科及乳腺不适症状")
    private String fkjrxbs;

    /** 心率（次/分） */
    @Excel(name = "心率", readConverterExp = "次=/分")
    private String xl;

    /** 舒张压mmHg */
    @Excel(name = "舒张压mmHg")
    private String szy;

    /** 收缩压mmHg */
    @Excel(name = "收缩压mmHg")
    private String ssy;

    /** 外阴 */
    @Excel(name = "外阴")
    private String wy;

    /** 阴道 */
    @Excel(name = "阴道")
    private String yd;

    /** 宫颈 */
    @Excel(name = "宫颈")
    private String gj;

    /** 子宫 */
    @Excel(name = "子宫")
    private String zg;

    /** 左侧附件 */
    @Excel(name = "左侧附件")
    private String zcfj;

    /** 右侧附件 */
    @Excel(name = "右侧附件")
    private String ycfj;

    /** 左侧乳腺 */
    @Excel(name = "左侧乳腺")
    private String zcrx;

    /** 右侧乳腺 */
    @Excel(name = "右侧乳腺")
    private String ycrx;

    /** 滴虫 */
    @Excel(name = "滴虫")
    private String dc;

    /** 念珠菌 */
    @Excel(name = "念珠菌")
    private String nzj;

    /** 阴道清洁度 */
    @Excel(name = "阴道清洁度")
    private String ydqjd;

    /** 梅毒螺旋体 */
    @Excel(name = "梅毒螺旋体")
    private String mdlxt;

    /** 淋球菌 */
    @Excel(name = "淋球菌")
    private String lqj;

    /** 阴道检查结果 */
    @Excel(name = "阴道检查结果")
    private String ydjcjg;

    /** B超检查结果 */
    @Excel(name = "B超检查结果")
    private String bcjcjg;

    /** 宫颈细胞学检查结果 */
    @Excel(name = "宫颈细胞学检查结果")
    private String gjxbxjcjg;

    /** 乳腺X线检查结果 */
    @Excel(name = "乳腺X线检查结果")
    private String rxxxjcjg;

    /** 其他 */
    @Excel(name = "其他")
    private String qt;

    /** 检查结果 */
    @Excel(name = "检查结果")
    private String jcjg;

    /** 处理意见 */
    @Excel(name = "处理意见")
    private String clyj;

    /** 检查机构 */
    @Excel(name = "检查机构")
    private String jcjgg;

    /** 检查日期 */
    @Excel(name = "检查日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 主检医师 */
    @Excel(name = "主检医师")
    private String zjys;

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
    public void setCcnl(String ccnl) 
    {
        this.ccnl = ccnl;
    }

    public String getCcnl() 
    {
        return ccnl;
    }
    public void setJq(String jq) 
    {
        this.jq = jq;
    }

    public String getJq() 
    {
        return jq;
    }
    public void setZq(String zq) 
    {
        this.zq = zq;
    }

    public String getZq() 
    {
        return zq;
    }
    public void setYjl(Integer yjl) 
    {
        this.yjl = yjl;
    }

    public Integer getYjl() 
    {
        return yjl;
    }
    public void setTj(Integer tj) 
    {
        this.tj = tj;
    }

    public Integer getTj() 
    {
        return tj;
    }
    public void setMcyj(Date mcyj) 
    {
        this.mcyj = mcyj;
    }

    public Date getMcyj() 
    {
        return mcyj;
    }
    public void setJj(Integer jj) 
    {
        this.jj = jj;
    }

    public Integer getJj() 
    {
        return jj;
    }
    public void setJjnl(String jjnl) 
    {
        this.jjnl = jjnl;
    }

    public String getJjnl() 
    {
        return jjnl;
    }
    public void setSsjj(Integer ssjj) 
    {
        this.ssjj = ssjj;
    }

    public Integer getSsjj() 
    {
        return ssjj;
    }
    public void setYc(String yc) 
    {
        this.yc = yc;
    }

    public String getYc() 
    {
        return yc;
    }
    public void setCc(String cc) 
    {
        this.cc = cc;
    }

    public String getCc() 
    {
        return cc;
    }
    public void setRglc(String rglc) 
    {
        this.rglc = rglc;
    }

    public String getRglc() 
    {
        return rglc;
    }
    public void setZrlc(String zrlc) 
    {
        this.zrlc = zrlc;
    }

    public String getZrlc() 
    {
        return zrlc;
    }
    public void setZqycc(String zqycc) 
    {
        this.zqycc = zqycc;
    }

    public String getZqycc() 
    {
        return zqycc;
    }
    public void setZccs(String zccs) 
    {
        this.zccs = zccs;
    }

    public String getZccs() 
    {
        return zccs;
    }
    public void setSscc(String sscc) 
    {
        this.sscc = sscc;
    }

    public String getSscc() 
    {
        return sscc;
    }
    public void setStcs(String stcs) 
    {
        this.stcs = stcs;
    }

    public String getStcs() 
    {
        return stcs;
    }
    public void setSccs(String sccs) 
    {
        this.sccs = sccs;
    }

    public String getSccs() 
    {
        return sccs;
    }
    public void setCsqxes(String csqxes) 
    {
        this.csqxes = csqxes;
    }

    public String getCsqxes() 
    {
        return csqxes;
    }
    public void setMcrszzrq(Date mcrszzrq) 
    {
        this.mcrszzrq = mcrszzrq;
    }

    public Date getMcrszzrq() 
    {
        return mcrszzrq;
    }
    public void setMcrszzfs(String mcrszzfs) 
    {
        this.mcrszzfs = mcrszzfs;
    }

    public String getMcrszzfs() 
    {
        return mcrszzfs;
    }
    public void setMcfmrq(Date mcfmrq) 
    {
        this.mcfmrq = mcfmrq;
    }

    public Date getMcfmrq() 
    {
        return mcfmrq;
    }
    public void setMcfmfs(String mcfmfs) 
    {
        this.mcfmfs = mcfmfs;
    }

    public String getMcfmfs() 
    {
        return mcfmfs;
    }
    public void setRsbfz(String rsbfz) 
    {
        this.rsbfz = rsbfz;
    }

    public String getRsbfz() 
    {
        return rsbfz;
    }
    public void setQtycys(String qtycys) 
    {
        this.qtycys = qtycys;
    }

    public String getQtycys() 
    {
        return qtycys;
    }
    public void setByfs(Integer byfs) 
    {
        this.byfs = byfs;
    }

    public Integer getByfs() 
    {
        return byfs;
    }
    public void setJwjbs(String jwjbs) 
    {
        this.jwjbs = jwjbs;
    }

    public String getJwjbs() 
    {
        return jwjbs;
    }
    public void setXjcxs(String xjcxs) 
    {
        this.xjcxs = xjcxs;
    }

    public String getXjcxs() 
    {
        return xjcxs;
    }
    public void setFkbs(String fkbs) 
    {
        this.fkbs = fkbs;
    }

    public String getFkbs() 
    {
        return fkbs;
    }
    public void setRxbs(String rxbs) 
    {
        this.rxbs = rxbs;
    }

    public String getRxbs() 
    {
        return rxbs;
    }
    public void setJzzls(String jzzls) 
    {
        this.jzzls = jzzls;
    }

    public String getJzzls() 
    {
        return jzzls;
    }
    public void setFkjrxbs(String fkjrxbs) 
    {
        this.fkjrxbs = fkjrxbs;
    }

    public String getFkjrxbs() 
    {
        return fkjrxbs;
    }
    public void setXl(String xl) 
    {
        this.xl = xl;
    }

    public String getXl() 
    {
        return xl;
    }
    public void setSzy(String szy) 
    {
        this.szy = szy;
    }

    public String getSzy() 
    {
        return szy;
    }
    public void setSsy(String ssy) 
    {
        this.ssy = ssy;
    }

    public String getSsy() 
    {
        return ssy;
    }
    public void setWy(String wy) 
    {
        this.wy = wy;
    }

    public String getWy() 
    {
        return wy;
    }
    public void setYd(String yd) 
    {
        this.yd = yd;
    }

    public String getYd() 
    {
        return yd;
    }
    public void setGj(String gj) 
    {
        this.gj = gj;
    }

    public String getGj() 
    {
        return gj;
    }
    public void setZg(String zg) 
    {
        this.zg = zg;
    }

    public String getZg() 
    {
        return zg;
    }
    public void setZcfj(String zcfj) 
    {
        this.zcfj = zcfj;
    }

    public String getZcfj() 
    {
        return zcfj;
    }
    public void setYcfj(String ycfj) 
    {
        this.ycfj = ycfj;
    }

    public String getYcfj() 
    {
        return ycfj;
    }
    public void setZcrx(String zcrx) 
    {
        this.zcrx = zcrx;
    }

    public String getZcrx() 
    {
        return zcrx;
    }
    public void setYcrx(String ycrx) 
    {
        this.ycrx = ycrx;
    }

    public String getYcrx() 
    {
        return ycrx;
    }
    public void setDc(String dc) 
    {
        this.dc = dc;
    }

    public String getDc() 
    {
        return dc;
    }
    public void setNzj(String nzj) 
    {
        this.nzj = nzj;
    }

    public String getNzj() 
    {
        return nzj;
    }
    public void setYdqjd(String ydqjd) 
    {
        this.ydqjd = ydqjd;
    }

    public String getYdqjd() 
    {
        return ydqjd;
    }
    public void setMdlxt(String mdlxt) 
    {
        this.mdlxt = mdlxt;
    }

    public String getMdlxt() 
    {
        return mdlxt;
    }
    public void setLqj(String lqj) 
    {
        this.lqj = lqj;
    }

    public String getLqj() 
    {
        return lqj;
    }
    public void setYdjcjg(String ydjcjg) 
    {
        this.ydjcjg = ydjcjg;
    }

    public String getYdjcjg() 
    {
        return ydjcjg;
    }
    public void setBcjcjg(String bcjcjg) 
    {
        this.bcjcjg = bcjcjg;
    }

    public String getBcjcjg() 
    {
        return bcjcjg;
    }
    public void setGjxbxjcjg(String gjxbxjcjg) 
    {
        this.gjxbxjcjg = gjxbxjcjg;
    }

    public String getGjxbxjcjg() 
    {
        return gjxbxjcjg;
    }
    public void setRxxxjcjg(String rxxxjcjg) 
    {
        this.rxxxjcjg = rxxxjcjg;
    }

    public String getRxxxjcjg() 
    {
        return rxxxjcjg;
    }
    public void setQt(String qt) 
    {
        this.qt = qt;
    }

    public String getQt() 
    {
        return qt;
    }
    public void setJcjg(String jcjg) 
    {
        this.jcjg = jcjg;
    }

    public String getJcjg() 
    {
        return jcjg;
    }
    public void setClyj(String clyj) 
    {
        this.clyj = clyj;
    }

    public String getClyj() 
    {
        return clyj;
    }
    public void setJcjgg(String jcjgg) 
    {
        this.jcjgg = jcjgg;
    }

    public String getJcjgg() 
    {
        return jcjgg;
    }
    public void setJcrq(Date jcrq) 
    {
        this.jcrq = jcrq;
    }

    public Date getJcrq() 
    {
        return jcrq;
    }
    public void setZjys(String zjys) 
    {
        this.zjys = zjys;
    }

    public String getZjys() 
    {
        return zjys;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("xm", getXm())
            .append("jkdaid", getJkdaid())
            .append("cardid", getCardid())
            .append("birthday", getBirthday())
            .append("ccnl", getCcnl())
            .append("jq", getJq())
            .append("zq", getZq())
            .append("yjl", getYjl())
            .append("tj", getTj())
            .append("mcyj", getMcyj())
            .append("jj", getJj())
            .append("jjnl", getJjnl())
            .append("ssjj", getSsjj())
            .append("yc", getYc())
            .append("cc", getCc())
            .append("rglc", getRglc())
            .append("zrlc", getZrlc())
            .append("zqycc", getZqycc())
            .append("zccs", getZccs())
            .append("sscc", getSscc())
            .append("stcs", getStcs())
            .append("sccs", getSccs())
            .append("csqxes", getCsqxes())
            .append("mcrszzrq", getMcrszzrq())
            .append("mcrszzfs", getMcrszzfs())
            .append("mcfmrq", getMcfmrq())
            .append("mcfmfs", getMcfmfs())
            .append("rsbfz", getRsbfz())
            .append("qtycys", getQtycys())
            .append("byfs", getByfs())
            .append("jwjbs", getJwjbs())
            .append("xjcxs", getXjcxs())
            .append("fkbs", getFkbs())
            .append("rxbs", getRxbs())
            .append("jzzls", getJzzls())
            .append("fkjrxbs", getFkjrxbs())
            .append("xl", getXl())
            .append("szy", getSzy())
            .append("ssy", getSsy())
            .append("wy", getWy())
            .append("yd", getYd())
            .append("gj", getGj())
            .append("zg", getZg())
            .append("zcfj", getZcfj())
            .append("ycfj", getYcfj())
            .append("zcrx", getZcrx())
            .append("ycrx", getYcrx())
            .append("dc", getDc())
            .append("nzj", getNzj())
            .append("ydqjd", getYdqjd())
            .append("mdlxt", getMdlxt())
            .append("lqj", getLqj())
            .append("ydjcjg", getYdjcjg())
            .append("bcjcjg", getBcjcjg())
            .append("gjxbxjcjg", getGjxbxjcjg())
            .append("rxxxjcjg", getRxxxjcjg())
            .append("qt", getQt())
            .append("jcjg", getJcjg())
            .append("clyj", getClyj())
            .append("jcjgg", getJcjgg())
            .append("jcrq", getJcrq())
            .append("zjys", getZjys())
            .toString();
    }
}
