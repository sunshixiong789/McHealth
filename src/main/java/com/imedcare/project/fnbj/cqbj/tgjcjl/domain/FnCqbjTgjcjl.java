package com.imedcare.project.fnbj.cqbj.tgjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产前保健体格检查记录对象 fn_cqbj_tgjcjl
 * 
 * @author liuyang
 * @date 2019-11-22
 */
public class FnCqbjTgjcjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 住院号 */
    @Excel(name = "住院号")
    private String zyh;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 健康档案ID */
    @Excel(name = "健康档案ID")
    private Long daid;

    /** 身份证件-类别代码 */
    @Excel(name = "身份证件-类别代码")
    private String sfzjLbdm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String sfzjHm;

    /** 体征 */
    @Excel(name = "体征")
    private String tizheng;

    /** 身高(cm) */
    @Excel(name = "身高(cm)")
    private String sg;

    /** 收缩压(mmHg) */
    @Excel(name = "收缩压(mmHg)")
    private String ssy;

    /** 舒张压(mmHg) */
    @Excel(name = "舒张压(mmHg)")
    private String szy;

    /** 基础收缩压(mmHg) */
    @Excel(name = "基础收缩压(mmHg)")
    private String jcsxy;

    /** 基础舒张压(mmHg) */
    @Excel(name = "基础舒张压(mmHg)")
    private String jcszy;

    /** 体温℃ */
    @Excel(name = "体温℃")
    private String tw;

    /** 症状 */
    @Excel(name = "症状")
    private String zz;

    /** 体征 */
    @Excel(name = "体征")
    private String tz;

    /** 心率(次/分钟) */
    @Excel(name = "心率(次/分钟)")
    private String xl;

    /** 胎心率(次/分钟) */
    @Excel(name = "胎心率(次/分钟)")
    private String txl;

    /** 肝脏触诊结果 */
    @Excel(name = "肝脏触诊结果")
    private String gzczjg;

    /** 脾脏触诊结果 */
    @Excel(name = "脾脏触诊结果")
    private String pzczjg;

    /** 宫颈检查结果 */
    @Excel(name = "宫颈检查结果")
    private String gjjcjg;

    /** 阴道检查结果 */
    @Excel(name = "阴道检查结果")
    private String ydjcjg;

    /** 子宫检查结果 */
    @Excel(name = "子宫检查结果")
    private String zgjcjg;

    /** 左侧附件检查结果代码 */
    @Excel(name = "左侧附件检查结果代码")
    private String zcfjjcjgdm;

    /** 右侧附件检查结果代码 */
    @Excel(name = "右侧附件检查结果代码")
    private String ycfjjcjgdm;

    /** 左侧乳腺检查结果代码 */
    @Excel(name = "左侧乳腺检查结果代码")
    private String zcrxjcjgdm;

    /** 右侧乳腺检查结果代码 */
    @Excel(name = "右侧乳腺检查结果代码")
    private String ycrxjcjgdm;

    /** 脊柱检查结果 */
    @Excel(name = "脊柱检查结果")
    private String jzjcjg;

    /** 甲状腺检查结果 */
    @Excel(name = "甲状腺检查结果")
    private String jzxjcjg;

    /** 外阴检查结果 */
    @Excel(name = "外阴检查结果")
    private String wyjcjg;

    /** 乳头检查结果 */
    @Excel(name = "乳头检查结果")
    private String rtjcjg;

    /** 四肢检查结果 */
    @Excel(name = "四肢检查结果")
    private String szjcjg;

    /** 浮肿程度代码 */
    @Excel(name = "浮肿程度代码")
    private String fzcddm;

    /** 腹围(cm) */
    @Excel(name = "腹围(cm)")
    private String fw;

    /** 衔接标志 */
    @Excel(name = "衔接标志")
    private String xjbz;

    /** 宫底高度(cm) */
    @Excel(name = "宫底高度(cm)")
    private String gdgd;

    /** 骶耻外径(cm) */
    @Excel(name = "骶耻外径(cm)")
    private String dcwj;

    /** 髂棘间距(cm) */
    @Excel(name = "髂棘间距(cm)")
    private String qjjj;

    /** 髂嵴间径(cm) */
    @Excel(name = "髂嵴间径(cm)")
    private String qji;

    /** 坐骨结节间径(cm) */
    @Excel(name = "坐骨结节间径(cm)")
    private String zgjjjj;

    /** 盆骨测量日期 */
    @Excel(name = "盆骨测量日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pgclrq;

    /** 盆骨测量孕周 */
    @Excel(name = "盆骨测量孕周")
    private String pgclyz;

    /** 既往疾病史 */
    @Excel(name = "既往疾病史")
    private String jwjbs;

    /** 手术史 */
    @Excel(name = "手术史")
    private String sss;

    /** 过敏史 */
    @Excel(name = "过敏史")
    private String gms;

    /** 家族遗传疾病史 */
    @Excel(name = "家族遗传疾病史")
    private String jzycjbs;

    /** 初潮年龄 */
    @Excel(name = "初潮年龄")
    private String ccnl;

    /** 月经持续时间(d) */
    @Excel(name = "月经持续时间(d)")
    private String yjcxsj;

    /** 月经出血量类别代码 */
    @Excel(name = "月经出血量类别代码")
    private String yjcxllbdm;

    /** 月经周期(d) */
    @Excel(name = "月经周期(d)")
    private String yjzq;

    /** 痛经程度代码 */
    @Excel(name = "痛经程度代码")
    private String tjcddm;

    /** 孕次 */
    @Excel(name = "孕次")
    private String yc;

    /** 产次 */
    @Excel(name = "产次")
    private String cc;

    /** 早产次数 */
    @Excel(name = "早产次数")
    private String zccs;

    /** 自然流产次数 */
    @Excel(name = "自然流产次数")
    private String zrlccs;

    /** 人工流产次数 */
    @Excel(name = "人工流产次数")
    private String rglccs;

    /** 剖宫产次数 */
    @Excel(name = "剖宫产次数")
    private String pgccs;

    /** 阴道助产次数 */
    @Excel(name = "阴道助产次数")
    private String ydzccs;

    /** 死胎例数 */
    @Excel(name = "死胎例数")
    private String stls;

    /** 死产例数 */
    @Excel(name = "死产例数")
    private String scls;

    /** 前次分娩方式代码 */
    @Excel(name = "前次分娩方式代码")
    private String qcfmfsdm;

    /** 前次妊娠终止方式代码 */
    @Excel(name = "前次妊娠终止方式代码")
    private String qcrszzfsdm;

    /** 前次分娩日期 */
    @Excel(name = "前次分娩日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qcfmrq;

    /** 前次妊娠终止日期 */
    @Excel(name = "前次妊娠终止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qcrszzrq;

    /** 末次月经日期 */
    @Excel(name = "末次月经日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcyjrq;

    /** 预产期 */
    @Excel(name = "预产期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ycq;

    /** 孕期异常情况记录 */
    @Excel(name = "孕期异常情况记录")
    private String yqycqkjl;

    /** 早孕反应开始孕周 */
    @Excel(name = "早孕反应开始孕周")
    private String zyfyksyz;

    /** 早孕反应标志 */
    @Excel(name = "早孕反应标志")
    private String zyfybz;

    /** 胎动孕周 */
    @Excel(name = "胎动孕周")
    private String tdyz;

    /** 危重孕产妇标志 */
    @Excel(name = "危重孕产妇标志")
    private String wzycfbz;

    /** 孕产期高危因素_代码 */
    @Excel(name = "孕产期高危因素_代码")
    private String ycqgwysDm;

    /** 孕产期高危因素-标志 */
    @Excel(name = "孕产期高危因素-标志")
    private String ycqgwysBz;

    /** 高危评分日期 */
    @Excel(name = "高危评分日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gwpfrq;

    /** 高危评分孕周 */
    @Excel(name = "高危评分孕周")
    private String gwpfyz;

    /** 高危评分值(分) */
    @Excel(name = "高危评分值(分)")
    private String gwpfz;

    /** 高危妊娠级别代码 */
    @Excel(name = "高危妊娠级别代码")
    private String gwrsjbdm;

    /** 建档人员姓名 */
    @Excel(name = "建档人员姓名")
    private String jdryxm;

    /** 建档机构名称 */
    @Excel(name = "建档机构名称")
    private String jdjgmc;

    /** 建档孕周 */
    @Excel(name = "建档孕周")
    private String jdyz;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jcrxxm;

    /** 检查(测)机构名称 */
    @Excel(name = "检查(测)机构名称")
    private String jcjgmc;

    /** 检查(测)日期 */
    @Excel(name = "检查(测)日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setZyh(String zyh) 
    {
        this.zyh = zyh;
    }

    public String getZyh() 
    {
        return zyh;
    }
    public void setXm(String xm) 
    {
        this.xm = xm;
    }

    public String getXm() 
    {
        return xm;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setDaid(Long daid) 
    {
        this.daid = daid;
    }

    public Long getDaid() 
    {
        return daid;
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
    public void setTizheng(String tizheng) 
    {
        this.tizheng = tizheng;
    }

    public String getTizheng() 
    {
        return tizheng;
    }
    public void setSg(String sg) 
    {
        this.sg = sg;
    }

    public String getSg() 
    {
        return sg;
    }
    public void setSsy(String ssy) 
    {
        this.ssy = ssy;
    }

    public String getSsy() 
    {
        return ssy;
    }
    public void setSzy(String szy) 
    {
        this.szy = szy;
    }

    public String getSzy() 
    {
        return szy;
    }
    public void setJcsxy(String jcsxy) 
    {
        this.jcsxy = jcsxy;
    }

    public String getJcsxy() 
    {
        return jcsxy;
    }
    public void setJcszy(String jcszy) 
    {
        this.jcszy = jcszy;
    }

    public String getJcszy() 
    {
        return jcszy;
    }
    public void setTw(String tw) 
    {
        this.tw = tw;
    }

    public String getTw() 
    {
        return tw;
    }
    public void setZz(String zz) 
    {
        this.zz = zz;
    }

    public String getZz() 
    {
        return zz;
    }
    public void setTz(String tz) 
    {
        this.tz = tz;
    }

    public String getTz() 
    {
        return tz;
    }
    public void setXl(String xl) 
    {
        this.xl = xl;
    }

    public String getXl() 
    {
        return xl;
    }
    public void setTxl(String txl) 
    {
        this.txl = txl;
    }

    public String getTxl() 
    {
        return txl;
    }
    public void setGzczjg(String gzczjg) 
    {
        this.gzczjg = gzczjg;
    }

    public String getGzczjg() 
    {
        return gzczjg;
    }
    public void setPzczjg(String pzczjg) 
    {
        this.pzczjg = pzczjg;
    }

    public String getPzczjg() 
    {
        return pzczjg;
    }
    public void setGjjcjg(String gjjcjg) 
    {
        this.gjjcjg = gjjcjg;
    }

    public String getGjjcjg() 
    {
        return gjjcjg;
    }
    public void setYdjcjg(String ydjcjg) 
    {
        this.ydjcjg = ydjcjg;
    }

    public String getYdjcjg() 
    {
        return ydjcjg;
    }
    public void setZgjcjg(String zgjcjg) 
    {
        this.zgjcjg = zgjcjg;
    }

    public String getZgjcjg() 
    {
        return zgjcjg;
    }
    public void setZcfjjcjgdm(String zcfjjcjgdm) 
    {
        this.zcfjjcjgdm = zcfjjcjgdm;
    }

    public String getZcfjjcjgdm() 
    {
        return zcfjjcjgdm;
    }
    public void setYcfjjcjgdm(String ycfjjcjgdm) 
    {
        this.ycfjjcjgdm = ycfjjcjgdm;
    }

    public String getYcfjjcjgdm() 
    {
        return ycfjjcjgdm;
    }
    public void setZcrxjcjgdm(String zcrxjcjgdm) 
    {
        this.zcrxjcjgdm = zcrxjcjgdm;
    }

    public String getZcrxjcjgdm() 
    {
        return zcrxjcjgdm;
    }
    public void setYcrxjcjgdm(String ycrxjcjgdm) 
    {
        this.ycrxjcjgdm = ycrxjcjgdm;
    }

    public String getYcrxjcjgdm() 
    {
        return ycrxjcjgdm;
    }
    public void setJzjcjg(String jzjcjg) 
    {
        this.jzjcjg = jzjcjg;
    }

    public String getJzjcjg() 
    {
        return jzjcjg;
    }
    public void setJzxjcjg(String jzxjcjg) 
    {
        this.jzxjcjg = jzxjcjg;
    }

    public String getJzxjcjg() 
    {
        return jzxjcjg;
    }
    public void setWyjcjg(String wyjcjg) 
    {
        this.wyjcjg = wyjcjg;
    }

    public String getWyjcjg() 
    {
        return wyjcjg;
    }
    public void setRtjcjg(String rtjcjg) 
    {
        this.rtjcjg = rtjcjg;
    }

    public String getRtjcjg() 
    {
        return rtjcjg;
    }
    public void setSzjcjg(String szjcjg) 
    {
        this.szjcjg = szjcjg;
    }

    public String getSzjcjg() 
    {
        return szjcjg;
    }
    public void setFzcddm(String fzcddm) 
    {
        this.fzcddm = fzcddm;
    }

    public String getFzcddm() 
    {
        return fzcddm;
    }
    public void setFw(String fw) 
    {
        this.fw = fw;
    }

    public String getFw() 
    {
        return fw;
    }
    public void setXjbz(String xjbz) 
    {
        this.xjbz = xjbz;
    }

    public String getXjbz() 
    {
        return xjbz;
    }
    public void setGdgd(String gdgd) 
    {
        this.gdgd = gdgd;
    }

    public String getGdgd() 
    {
        return gdgd;
    }
    public void setDcwj(String dcwj) 
    {
        this.dcwj = dcwj;
    }

    public String getDcwj() 
    {
        return dcwj;
    }
    public void setQjjj(String qjjj) 
    {
        this.qjjj = qjjj;
    }

    public String getQjjj() 
    {
        return qjjj;
    }
    public void setQji(String qji) 
    {
        this.qji = qji;
    }

    public String getQji() 
    {
        return qji;
    }
    public void setZgjjjj(String zgjjjj) 
    {
        this.zgjjjj = zgjjjj;
    }

    public String getZgjjjj() 
    {
        return zgjjjj;
    }
    public void setPgclrq(Date pgclrq) 
    {
        this.pgclrq = pgclrq;
    }

    public Date getPgclrq() 
    {
        return pgclrq;
    }
    public void setPgclyz(String pgclyz) 
    {
        this.pgclyz = pgclyz;
    }

    public String getPgclyz() 
    {
        return pgclyz;
    }
    public void setJwjbs(String jwjbs) 
    {
        this.jwjbs = jwjbs;
    }

    public String getJwjbs() 
    {
        return jwjbs;
    }
    public void setSss(String sss) 
    {
        this.sss = sss;
    }

    public String getSss() 
    {
        return sss;
    }
    public void setGms(String gms) 
    {
        this.gms = gms;
    }

    public String getGms() 
    {
        return gms;
    }
    public void setJzycjbs(String jzycjbs) 
    {
        this.jzycjbs = jzycjbs;
    }

    public String getJzycjbs() 
    {
        return jzycjbs;
    }
    public void setCcnl(String ccnl) 
    {
        this.ccnl = ccnl;
    }

    public String getCcnl() 
    {
        return ccnl;
    }
    public void setYjcxsj(String yjcxsj) 
    {
        this.yjcxsj = yjcxsj;
    }

    public String getYjcxsj() 
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
    public void setYjzq(String yjzq) 
    {
        this.yjzq = yjzq;
    }

    public String getYjzq() 
    {
        return yjzq;
    }
    public void setTjcddm(String tjcddm) 
    {
        this.tjcddm = tjcddm;
    }

    public String getTjcddm() 
    {
        return tjcddm;
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
    public void setZccs(String zccs) 
    {
        this.zccs = zccs;
    }

    public String getZccs() 
    {
        return zccs;
    }
    public void setZrlccs(String zrlccs) 
    {
        this.zrlccs = zrlccs;
    }

    public String getZrlccs() 
    {
        return zrlccs;
    }
    public void setRglccs(String rglccs) 
    {
        this.rglccs = rglccs;
    }

    public String getRglccs() 
    {
        return rglccs;
    }
    public void setPgccs(String pgccs) 
    {
        this.pgccs = pgccs;
    }

    public String getPgccs() 
    {
        return pgccs;
    }
    public void setYdzccs(String ydzccs) 
    {
        this.ydzccs = ydzccs;
    }

    public String getYdzccs() 
    {
        return ydzccs;
    }
    public void setStls(String stls) 
    {
        this.stls = stls;
    }

    public String getStls() 
    {
        return stls;
    }
    public void setScls(String scls) 
    {
        this.scls = scls;
    }

    public String getScls() 
    {
        return scls;
    }
    public void setQcfmfsdm(String qcfmfsdm) 
    {
        this.qcfmfsdm = qcfmfsdm;
    }

    public String getQcfmfsdm() 
    {
        return qcfmfsdm;
    }
    public void setQcrszzfsdm(String qcrszzfsdm) 
    {
        this.qcrszzfsdm = qcrszzfsdm;
    }

    public String getQcrszzfsdm() 
    {
        return qcrszzfsdm;
    }
    public void setQcfmrq(Date qcfmrq) 
    {
        this.qcfmrq = qcfmrq;
    }

    public Date getQcfmrq() 
    {
        return qcfmrq;
    }
    public void setQcrszzrq(Date qcrszzrq) 
    {
        this.qcrszzrq = qcrszzrq;
    }

    public Date getQcrszzrq() 
    {
        return qcrszzrq;
    }
    public void setMcyjrq(Date mcyjrq) 
    {
        this.mcyjrq = mcyjrq;
    }

    public Date getMcyjrq() 
    {
        return mcyjrq;
    }
    public void setYcq(Date ycq) 
    {
        this.ycq = ycq;
    }

    public Date getYcq() 
    {
        return ycq;
    }
    public void setYqycqkjl(String yqycqkjl) 
    {
        this.yqycqkjl = yqycqkjl;
    }

    public String getYqycqkjl() 
    {
        return yqycqkjl;
    }
    public void setZyfyksyz(String zyfyksyz) 
    {
        this.zyfyksyz = zyfyksyz;
    }

    public String getZyfyksyz() 
    {
        return zyfyksyz;
    }
    public void setZyfybz(String zyfybz) 
    {
        this.zyfybz = zyfybz;
    }

    public String getZyfybz() 
    {
        return zyfybz;
    }
    public void setTdyz(String tdyz) 
    {
        this.tdyz = tdyz;
    }

    public String getTdyz() 
    {
        return tdyz;
    }
    public void setWzycfbz(String wzycfbz) 
    {
        this.wzycfbz = wzycfbz;
    }

    public String getWzycfbz() 
    {
        return wzycfbz;
    }
    public void setYcqgwysDm(String ycqgwysDm) 
    {
        this.ycqgwysDm = ycqgwysDm;
    }

    public String getYcqgwysDm() 
    {
        return ycqgwysDm;
    }
    public void setYcqgwysBz(String ycqgwysBz) 
    {
        this.ycqgwysBz = ycqgwysBz;
    }

    public String getYcqgwysBz() 
    {
        return ycqgwysBz;
    }
    public void setGwpfrq(Date gwpfrq) 
    {
        this.gwpfrq = gwpfrq;
    }

    public Date getGwpfrq() 
    {
        return gwpfrq;
    }
    public void setGwpfyz(String gwpfyz) 
    {
        this.gwpfyz = gwpfyz;
    }

    public String getGwpfyz() 
    {
        return gwpfyz;
    }
    public void setGwpfz(String gwpfz) 
    {
        this.gwpfz = gwpfz;
    }

    public String getGwpfz() 
    {
        return gwpfz;
    }
    public void setGwrsjbdm(String gwrsjbdm) 
    {
        this.gwrsjbdm = gwrsjbdm;
    }

    public String getGwrsjbdm() 
    {
        return gwrsjbdm;
    }
    public void setJdryxm(String jdryxm) 
    {
        this.jdryxm = jdryxm;
    }

    public String getJdryxm() 
    {
        return jdryxm;
    }
    public void setJdjgmc(String jdjgmc) 
    {
        this.jdjgmc = jdjgmc;
    }

    public String getJdjgmc() 
    {
        return jdjgmc;
    }
    public void setJdyz(String jdyz) 
    {
        this.jdyz = jdyz;
    }

    public String getJdyz() 
    {
        return jdyz;
    }
    public void setJcrxxm(String jcrxxm) 
    {
        this.jcrxxm = jcrxxm;
    }

    public String getJcrxxm() 
    {
        return jcrxxm;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("zyh", getZyh())
            .append("xm", getXm())
            .append("birthday", getBirthday())
            .append("daid", getDaid())
            .append("sfzjLbdm", getSfzjLbdm())
            .append("sfzjHm", getSfzjHm())
            .append("tizheng", getTizheng())
            .append("sg", getSg())
            .append("ssy", getSsy())
            .append("szy", getSzy())
            .append("jcsxy", getJcsxy())
            .append("jcszy", getJcszy())
            .append("tw", getTw())
            .append("zz", getZz())
            .append("tz", getTz())
            .append("xl", getXl())
            .append("txl", getTxl())
            .append("gzczjg", getGzczjg())
            .append("pzczjg", getPzczjg())
            .append("gjjcjg", getGjjcjg())
            .append("ydjcjg", getYdjcjg())
            .append("zgjcjg", getZgjcjg())
            .append("zcfjjcjgdm", getZcfjjcjgdm())
            .append("ycfjjcjgdm", getYcfjjcjgdm())
            .append("zcrxjcjgdm", getZcrxjcjgdm())
            .append("ycrxjcjgdm", getYcrxjcjgdm())
            .append("jzjcjg", getJzjcjg())
            .append("jzxjcjg", getJzxjcjg())
            .append("wyjcjg", getWyjcjg())
            .append("rtjcjg", getRtjcjg())
            .append("szjcjg", getSzjcjg())
            .append("fzcddm", getFzcddm())
            .append("fw", getFw())
            .append("xjbz", getXjbz())
            .append("gdgd", getGdgd())
            .append("dcwj", getDcwj())
            .append("qjjj", getQjjj())
            .append("qji", getQji())
            .append("zgjjjj", getZgjjjj())
            .append("pgclrq", getPgclrq())
            .append("pgclyz", getPgclyz())
            .append("jwjbs", getJwjbs())
            .append("sss", getSss())
            .append("gms", getGms())
            .append("jzycjbs", getJzycjbs())
            .append("ccnl", getCcnl())
            .append("yjcxsj", getYjcxsj())
            .append("yjcxllbdm", getYjcxllbdm())
            .append("yjzq", getYjzq())
            .append("tjcddm", getTjcddm())
            .append("yc", getYc())
            .append("cc", getCc())
            .append("zccs", getZccs())
            .append("zrlccs", getZrlccs())
            .append("rglccs", getRglccs())
            .append("pgccs", getPgccs())
            .append("ydzccs", getYdzccs())
            .append("stls", getStls())
            .append("scls", getScls())
            .append("qcfmfsdm", getQcfmfsdm())
            .append("qcrszzfsdm", getQcrszzfsdm())
            .append("qcfmrq", getQcfmrq())
            .append("qcrszzrq", getQcrszzrq())
            .append("mcyjrq", getMcyjrq())
            .append("ycq", getYcq())
            .append("yqycqkjl", getYqycqkjl())
            .append("zyfyksyz", getZyfyksyz())
            .append("zyfybz", getZyfybz())
            .append("tdyz", getTdyz())
            .append("wzycfbz", getWzycfbz())
            .append("ycqgwysDm", getYcqgwysDm())
            .append("ycqgwysBz", getYcqgwysBz())
            .append("gwpfrq", getGwpfrq())
            .append("gwpfyz", getGwpfyz())
            .append("gwpfz", getGwpfz())
            .append("gwrsjbdm", getGwrsjbdm())
            .append("jdryxm", getJdryxm())
            .append("jdjgmc", getJdjgmc())
            .append("jdyz", getJdyz())
            .append("jcrxxm", getJcrxxm())
            .append("jcjgmc", getJcjgmc())
            .append("jcrq", getJcrq())
            .toString();
    }
}
