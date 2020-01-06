package com.imedcare.project.fnbj.hqbjfw.hqbjfwwxjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 婚前保健服务问询记录对象 tb_fb_hqbjfwwxjl
 * 
 * @author imedcare
 * @date 2019-11-18
 */
public class TbFbHqbjfwwxjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 婚前保健服务登记id */
    @Excel(name = "婚前保健服务登记id")
    private Long hqbjfwdjid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 对方姓名 */
    @Excel(name = "对方姓名")
    private String dfxm;

    /** 对方记录表编号 */
    @Excel(name = "对方记录表编号")
    private Long dfjlbid;

    /** 血缘关系代码 */
    @Excel(name = "血缘关系代码")
    private String xygxdm;

    /** 既往疾病史 */
    @Excel(name = "既往疾病史")
    private String jwjbs;

    /** 手术史 */
    @Excel(name = "手术史")
    private String sss;

    /** 现病史 */
    @Excel(name = "现病史")
    private String xbs;

    /** 家族遗传性疾病史 */
    @Excel(name = "家族遗传性疾病史")
    private String jzycxjbs;

    /** 患者与本人关系代码 */
    @Excel(name = "患者与本人关系代码")
    private String hzybrgxdm;

    /** 初潮年龄 */
    @Excel(name = "初潮年龄")
    private Integer ccnl;

    /** 月经持续时间（d） */
    @Excel(name = "月经持续时间", readConverterExp = "d=")
    private Integer yjcxsj;

    /** 月经出血量类别代码 */
    @Excel(name = "月经出血量类别代码")
    private String yjcxllbdm;

    /** 月经周期 */
    @Excel(name = "月经周期")
    private Integer yjzq;

    /** 痛经程度代码 */
    @Excel(name = "痛经程度代码")
    private String tjcddm;

    /** 末次月经 */
    @Excel(name = "末次月经", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mcyjrq;

    /** 足月产次数 */
    @Excel(name = "足月产次数")
    private Integer zyccs;

    /** 早产次数 */
    @Excel(name = "早产次数")
    private Integer zccs;

    /** 流产总次数 */
    @Excel(name = "流产总次数")
    private Integer lczcs;

    /** 婚姻状况类别代码 */
    @Excel(name = "婚姻状况类别代码")
    private String hyzklbdm;

    /** 生育女数 */
    @Excel(name = "生育女数")
    private Integer syns;

    /** 女患遗传性疾病情况 */
    @Excel(name = "女患遗传性疾病情况")
    private String nhycxjbqk;

    /** 生育子数 */
    @Excel(name = "生育子数")
    private Integer syzs;

    /** 子患遗传性疾病情况 */
    @Excel(name = "子患遗传性疾病情况")
    private String zhycxjbqk;

    /** 家族近亲婚配标志 */
    @Excel(name = "家族近亲婚配标志")
    private String jzjqhpbz;

    /** 家族近亲婚配者与本人关系代码 */
    @Excel(name = "家族近亲婚配者与本人关系代码")
    private String jzjqhpzybrgxdm;

    /** 医疗机构代码 */
    @Excel(name = "医疗机构代码")
    private String yljgdm;

    /** 创建者代码 */
    @Excel(name = "创建者代码")
    private String cjzdm;

    /** 删除标志 */
    @Excel(name = "删除标志")
    private String deleteFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHqbjfwdjid(Long hqbjfwdjid) 
    {
        this.hqbjfwdjid = hqbjfwdjid;
    }

    public Long getHqbjfwdjid() 
    {
        return hqbjfwdjid;
    }
    public void setXm(String xm) 
    {
        this.xm = xm;
    }

    public String getXm() 
    {
        return xm;
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
    public void setDfxm(String dfxm) 
    {
        this.dfxm = dfxm;
    }

    public String getDfxm() 
    {
        return dfxm;
    }
    public void setDfjlbid(Long dfjlbid) 
    {
        this.dfjlbid = dfjlbid;
    }

    public Long getDfjlbid() 
    {
        return dfjlbid;
    }
    public void setXygxdm(String xygxdm) 
    {
        this.xygxdm = xygxdm;
    }

    public String getXygxdm() 
    {
        return xygxdm;
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
    public void setXbs(String xbs) 
    {
        this.xbs = xbs;
    }

    public String getXbs() 
    {
        return xbs;
    }
    public void setJzycxjbs(String jzycxjbs) 
    {
        this.jzycxjbs = jzycxjbs;
    }

    public String getJzycxjbs() 
    {
        return jzycxjbs;
    }
    public void setHzybrgxdm(String hzybrgxdm) 
    {
        this.hzybrgxdm = hzybrgxdm;
    }

    public String getHzybrgxdm() 
    {
        return hzybrgxdm;
    }
    public void setCcnl(Integer ccnl) 
    {
        this.ccnl = ccnl;
    }

    public Integer getCcnl() 
    {
        return ccnl;
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
    public void setYjzq(Integer yjzq) 
    {
        this.yjzq = yjzq;
    }

    public Integer getYjzq() 
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
    public void setMcyjrq(Date mcyjrq) 
    {
        this.mcyjrq = mcyjrq;
    }

    public Date getMcyjrq() 
    {
        return mcyjrq;
    }
    public void setZyccs(Integer zyccs) 
    {
        this.zyccs = zyccs;
    }

    public Integer getZyccs() 
    {
        return zyccs;
    }
    public void setZccs(Integer zccs) 
    {
        this.zccs = zccs;
    }

    public Integer getZccs() 
    {
        return zccs;
    }
    public void setLczcs(Integer lczcs) 
    {
        this.lczcs = lczcs;
    }

    public Integer getLczcs() 
    {
        return lczcs;
    }
    public void setHyzklbdm(String hyzklbdm) 
    {
        this.hyzklbdm = hyzklbdm;
    }

    public String getHyzklbdm() 
    {
        return hyzklbdm;
    }
    public void setSyns(Integer syns) 
    {
        this.syns = syns;
    }

    public Integer getSyns() 
    {
        return syns;
    }
    public void setNhycxjbqk(String nhycxjbqk) 
    {
        this.nhycxjbqk = nhycxjbqk;
    }

    public String getNhycxjbqk() 
    {
        return nhycxjbqk;
    }
    public void setSyzs(Integer syzs) 
    {
        this.syzs = syzs;
    }

    public Integer getSyzs() 
    {
        return syzs;
    }
    public void setZhycxjbqk(String zhycxjbqk) 
    {
        this.zhycxjbqk = zhycxjbqk;
    }

    public String getZhycxjbqk() 
    {
        return zhycxjbqk;
    }
    public void setJzjqhpbz(String jzjqhpbz) 
    {
        this.jzjqhpbz = jzjqhpbz;
    }

    public String getJzjqhpbz() 
    {
        return jzjqhpbz;
    }
    public void setJzjqhpzybrgxdm(String jzjqhpzybrgxdm) 
    {
        this.jzjqhpzybrgxdm = jzjqhpzybrgxdm;
    }

    public String getJzjqhpzybrgxdm() 
    {
        return jzjqhpzybrgxdm;
    }
    public void setYljgdm(String yljgdm) 
    {
        this.yljgdm = yljgdm;
    }

    public String getYljgdm() 
    {
        return yljgdm;
    }
    public void setCjzdm(String cjzdm) 
    {
        this.cjzdm = cjzdm;
    }

    public String getCjzdm() 
    {
        return cjzdm;
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
            .append("hqbjfwdjid", getHqbjfwdjid())
            .append("xm", getXm())
            .append("cardid", getCardid())
            .append("birthday", getBirthday())
            .append("dfxm", getDfxm())
            .append("dfjlbid", getDfjlbid())
            .append("xygxdm", getXygxdm())
            .append("jwjbs", getJwjbs())
            .append("sss", getSss())
            .append("xbs", getXbs())
            .append("jzycxjbs", getJzycxjbs())
            .append("hzybrgxdm", getHzybrgxdm())
            .append("ccnl", getCcnl())
            .append("yjcxsj", getYjcxsj())
            .append("yjcxllbdm", getYjcxllbdm())
            .append("yjzq", getYjzq())
            .append("tjcddm", getTjcddm())
            .append("mcyjrq", getMcyjrq())
            .append("zyccs", getZyccs())
            .append("zccs", getZccs())
            .append("lczcs", getLczcs())
            .append("hyzklbdm", getHyzklbdm())
            .append("syns", getSyns())
            .append("nhycxjbqk", getNhycxjbqk())
            .append("syzs", getSyzs())
            .append("zhycxjbqk", getZhycxjbqk())
            .append("jzjqhpbz", getJzjqhpbz())
            .append("jzjqhpzybrgxdm", getJzjqhpzybrgxdm())
            .append("yljgdm", getYljgdm())
            .append("cjzdm", getCjzdm())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
