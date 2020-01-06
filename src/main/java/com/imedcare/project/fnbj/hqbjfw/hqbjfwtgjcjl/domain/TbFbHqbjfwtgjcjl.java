package com.imedcare.project.fnbj.hqbjfw.hqbjfwtgjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 婚前保健服务体格检查记录对象 tb_fb_hqbjfwtgjcjl
 * 
 * @author liuyang
 * @date 2019-11-19
 */
public class TbFbHqbjfwtgjcjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 婚前保健服务登记ID */
    @Excel(name = "婚前保健服务登记ID")
    private Long hqbjfwdjid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

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

    /** 收缩压(mmHg) */
    @Excel(name = "收缩压(mmHg)")
    private Integer ssy;

    /** 舒张压(mmHg) */
    @Excel(name = "舒张压(mmHg)")
    private Integer szy;

    /** 特殊体态检查结果 */
    @Excel(name = "特殊体态检查结果")
    private String tsttjcjg;

    /** 精神状态代码 */
    @Excel(name = "精神状态代码")
    private String jsztdm;

    /** 特殊面容检查结果 */
    @Excel(name = "特殊面容检查结果")
    private String tsmrjcjg;

    /** 五官检查结果 */
    @Excel(name = "五官检查结果")
    private String wgjcjg;

    /** 智力发育 */
    @Excel(name = "智力发育")
    private String zlfy;

    /** 心率(次/分) */
    @Excel(name = "心率(次/分)")
    private Integer xlh;

    /** 心律 */
    @Excel(name = "心律")
    private String xl;

    /** 心脏听诊结果 */
    @Excel(name = "心脏听诊结果")
    private String xztzjg;

    /** 腹部听诊结果 */
    @Excel(name = "腹部听诊结果")
    private String fbtzjg;

    /** 肝脏触诊结果 */
    @Excel(name = "肝脏触诊结果")
    private String gzczjg;

    /** 四肢检查结果 */
    @Excel(name = "四肢检查结果")
    private String szjcjg;

    /** 脊柱检查结果 */
    @Excel(name = "脊柱检查结果")
    private String jzjcjg;

    /** 皮肤毛发检查结果 */
    @Excel(name = "皮肤毛发检查结果")
    private String pfmfjcjg;

    /** 甲状腺检查结果 */
    @Excel(name = "甲状腺检查结果")
    private String jzxjcjg;

    /** 妇科检查方式代码 */
    @Excel(name = "妇科检查方式代码")
    private String fkjcfsdm;

    /** 知情同意标志 */
    @Excel(name = "知情同意标志")
    private String zqtybz;

    /** 阴毛检查结果 */
    @Excel(name = "阴毛检查结果")
    private String ymjcjg;

    /** 外阴检查结果 */
    @Excel(name = "外阴检查结果")
    private String wyjcjg;

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

    /** 宫颈检查结果 */
    @Excel(name = "宫颈检查结果")
    private String gjjcjgdm;

    /** 左侧乳腺检查结果代码 */
    @Excel(name = "左侧乳腺检查结果代码")
    private String zcrxjcjgdm;

    /** 右侧乳腺检查结果代码 */
    @Excel(name = "右侧乳腺检查结果代码")
    private String ycrxjcjgdm;

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
    public void setHqbjfwdjid(Long hqbjfwdjid) 
    {
        this.hqbjfwdjid = hqbjfwdjid;
    }

    public Long getHqbjfwdjid() 
    {
        return hqbjfwdjid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
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
    public void setSsy(Integer ssy) 
    {
        this.ssy = ssy;
    }

    public Integer getSsy() 
    {
        return ssy;
    }
    public void setSzy(Integer szy) 
    {
        this.szy = szy;
    }

    public Integer getSzy() 
    {
        return szy;
    }
    public void setTsttjcjg(String tsttjcjg) 
    {
        this.tsttjcjg = tsttjcjg;
    }

    public String getTsttjcjg() 
    {
        return tsttjcjg;
    }
    public void setJsztdm(String jsztdm) 
    {
        this.jsztdm = jsztdm;
    }

    public String getJsztdm() 
    {
        return jsztdm;
    }
    public void setTsmrjcjg(String tsmrjcjg) 
    {
        this.tsmrjcjg = tsmrjcjg;
    }

    public String getTsmrjcjg() 
    {
        return tsmrjcjg;
    }
    public void setWgjcjg(String wgjcjg) 
    {
        this.wgjcjg = wgjcjg;
    }

    public String getWgjcjg() 
    {
        return wgjcjg;
    }
    public void setZlfy(String zlfy) 
    {
        this.zlfy = zlfy;
    }

    public String getZlfy() 
    {
        return zlfy;
    }
    public void setXlh(Integer xlh) 
    {
        this.xlh = xlh;
    }

    public Integer getXlh() 
    {
        return xlh;
    }
    public void setXl(String xl) 
    {
        this.xl = xl;
    }

    public String getXl() 
    {
        return xl;
    }
    public void setXztzjg(String xztzjg) 
    {
        this.xztzjg = xztzjg;
    }

    public String getXztzjg() 
    {
        return xztzjg;
    }
    public void setFbtzjg(String fbtzjg) 
    {
        this.fbtzjg = fbtzjg;
    }

    public String getFbtzjg() 
    {
        return fbtzjg;
    }
    public void setGzczjg(String gzczjg) 
    {
        this.gzczjg = gzczjg;
    }

    public String getGzczjg() 
    {
        return gzczjg;
    }
    public void setSzjcjg(String szjcjg) 
    {
        this.szjcjg = szjcjg;
    }

    public String getSzjcjg() 
    {
        return szjcjg;
    }
    public void setJzjcjg(String jzjcjg) 
    {
        this.jzjcjg = jzjcjg;
    }

    public String getJzjcjg() 
    {
        return jzjcjg;
    }
    public void setPfmfjcjg(String pfmfjcjg) 
    {
        this.pfmfjcjg = pfmfjcjg;
    }

    public String getPfmfjcjg() 
    {
        return pfmfjcjg;
    }
    public void setJzxjcjg(String jzxjcjg) 
    {
        this.jzxjcjg = jzxjcjg;
    }

    public String getJzxjcjg() 
    {
        return jzxjcjg;
    }
    public void setFkjcfsdm(String fkjcfsdm) 
    {
        this.fkjcfsdm = fkjcfsdm;
    }

    public String getFkjcfsdm() 
    {
        return fkjcfsdm;
    }
    public void setZqtybz(String zqtybz) 
    {
        this.zqtybz = zqtybz;
    }

    public String getZqtybz() 
    {
        return zqtybz;
    }
    public void setYmjcjg(String ymjcjg) 
    {
        this.ymjcjg = ymjcjg;
    }

    public String getYmjcjg() 
    {
        return ymjcjg;
    }
    public void setWyjcjg(String wyjcjg) 
    {
        this.wyjcjg = wyjcjg;
    }

    public String getWyjcjg() 
    {
        return wyjcjg;
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
    public void setGjjcjgdm(String gjjcjgdm) 
    {
        this.gjjcjgdm = gjjcjgdm;
    }

    public String getGjjcjgdm() 
    {
        return gjjcjgdm;
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
            .append("hqbjfwdjid", getHqbjfwdjid())
            .append("name", getName())
            .append("cardid", getCardid())
            .append("birthday", getBirthday())
            .append("dfjlbid", getDfjlbid())
            .append("dfxm", getDfxm())
            .append("ssy", getSsy())
            .append("szy", getSzy())
            .append("tsttjcjg", getTsttjcjg())
            .append("jsztdm", getJsztdm())
            .append("tsmrjcjg", getTsmrjcjg())
            .append("wgjcjg", getWgjcjg())
            .append("zlfy", getZlfy())
            .append("xlh", getXlh())
            .append("xl", getXl())
            .append("xztzjg", getXztzjg())
            .append("fbtzjg", getFbtzjg())
            .append("gzczjg", getGzczjg())
            .append("szjcjg", getSzjcjg())
            .append("jzjcjg", getJzjcjg())
            .append("pfmfjcjg", getPfmfjcjg())
            .append("jzxjcjg", getJzxjcjg())
            .append("fkjcfsdm", getFkjcfsdm())
            .append("zqtybz", getZqtybz())
            .append("ymjcjg", getYmjcjg())
            .append("wyjcjg", getWyjcjg())
            .append("ydjcjg", getYdjcjg())
            .append("zgjcjg", getZgjcjg())
            .append("zcfjjcjgdm", getZcfjjcjgdm())
            .append("ycfjjcjgdm", getYcfjjcjgdm())
            .append("gjjcjgdm", getGjjcjgdm())
            .append("zcrxjcjgdm", getZcrxjcjgdm())
            .append("ycrxjcjgdm", getYcrxjcjgdm())
            .append("jcrq", getJcrq())
            .append("jcryxm", getJcryxm())
            .append("jcjgmc", getJcjgmc())
            .toString();
    }
}
