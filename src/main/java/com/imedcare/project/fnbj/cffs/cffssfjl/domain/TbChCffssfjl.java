package com.imedcare.project.fnbj.cffs.cffssfjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产妇访视随访记录对象 tb_ch_cffssfjl
 * 
 * @author zsl
 * @date 2019-11-18
 */
public class TbChCffssfjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long chId;

    /** 妇女档案id */
    @Excel(name = "妇女档案id")
    private Long healthfileid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String chName;

    /** 访视日期 */
    @Excel(name = "访视日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chFsrq;

    /** 访视人员姓名 */
    @Excel(name = "访视人员姓名")
    private String chFsryxm;

    /** 访视机构姓名 */
    @Excel(name = "访视机构姓名")
    private String chFsjgmc;

    /** 产后天数 */
    @Excel(name = "产后天数")
    private Long chChts;

    /** 体温 */
    @Excel(name = "体温")
    private String chTw;

    /** 收缩压 */
    @Excel(name = "收缩压")
    private String chSsy;

    /** 舒张压 */
    @Excel(name = "舒张压")
    private String chSzy;

    /** 乳头检查结果 */
    @Excel(name = "乳头检查结果")
    private String chRtjcjg;

    /** 乳汁量代码 */
    @Excel(name = "乳汁量代码")
    private String chRzldm;

    /** 宫底高度 */
    @Excel(name = "宫底高度")
    private String chGdgd;

    /** 伤口愈合状况代码 */
    @Excel(name = "伤口愈合状况代码")
    private String chSkyhzkdm;

    /** 恶露状况 */
    @Excel(name = "恶露状况")
    private String chElzk;

    /** 大便状况记录 */
    @Excel(name = "大便状况记录")
    private String chDbzkjl;

    /** 小便状况记录 */
    @Excel(name = "小便状况记录")
    private String chXbzkjl;

    /** 特殊情况记录 */
    @Excel(name = "特殊情况记录")
    private String chTsqkjl;

    /** 宣教内容 */
    @Excel(name = "宣教内容")
    private String chXjnr;

    /** 填表日期 */
    @Excel(name = "填表日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chTbrq;

    public void setChId(Long chId) 
    {
        this.chId = chId;
    }

    public Long getChId() 
    {
        return chId;
    }
    public void setHealthfileid(Long healthfileid) 
    {
        this.healthfileid = healthfileid;
    }

    public Long getHealthfileid() 
    {
        return healthfileid;
    }
    public void setChName(String chName) 
    {
        this.chName = chName;
    }

    public String getChName() 
    {
        return chName;
    }
    public void setChFsrq(Date chFsrq) 
    {
        this.chFsrq = chFsrq;
    }

    public Date getChFsrq() 
    {
        return chFsrq;
    }
    public void setChFsryxm(String chFsryxm) 
    {
        this.chFsryxm = chFsryxm;
    }

    public String getChFsryxm() 
    {
        return chFsryxm;
    }
    public void setChFsjgmc(String chFsjgmc)
    {
        this.chFsjgmc = chFsjgmc;
    }

    public String getChFsjgmc()
    {
        return chFsjgmc;
    }
    public void setChChts(Long chChts)
    {
        this.chChts = chChts;
    }

    public Long getChChts() 
    {
        return chChts;
    }
    public void setChTw(String chTw) 
    {
        this.chTw = chTw;
    }

    public String getChTw() 
    {
        return chTw;
    }
    public void setChSsy(String chSsy) 
    {
        this.chSsy = chSsy;
    }

    public String getChSsy() 
    {
        return chSsy;
    }
    public void setChSzy(String chSzy) 
    {
        this.chSzy = chSzy;
    }

    public String getChSzy() 
    {
        return chSzy;
    }
    public void setChRtjcjg(String chRtjcjg) 
    {
        this.chRtjcjg = chRtjcjg;
    }

    public String getChRtjcjg() 
    {
        return chRtjcjg;
    }
    public void setChRzldm(String chRzldm) 
    {
        this.chRzldm = chRzldm;
    }

    public String getChRzldm() 
    {
        return chRzldm;
    }
    public void setChGdgd(String chGdgd) 
    {
        this.chGdgd = chGdgd;
    }

    public String getChGdgd() 
    {
        return chGdgd;
    }
    public void setChSkyhzkdm(String chSkyhzkdm) 
    {
        this.chSkyhzkdm = chSkyhzkdm;
    }

    public String getChSkyhzkdm() 
    {
        return chSkyhzkdm;
    }
    public void setChElzk(String chElzk) 
    {
        this.chElzk = chElzk;
    }

    public String getChElzk() 
    {
        return chElzk;
    }
    public void setChDbzkjl(String chDbzkjl) 
    {
        this.chDbzkjl = chDbzkjl;
    }

    public String getChDbzkjl() 
    {
        return chDbzkjl;
    }
    public void setChXbzkjl(String chXbzkjl) 
    {
        this.chXbzkjl = chXbzkjl;
    }

    public String getChXbzkjl() 
    {
        return chXbzkjl;
    }
    public void setChTsqkjl(String chTsqkjl) 
    {
        this.chTsqkjl = chTsqkjl;
    }

    public String getChTsqkjl() 
    {
        return chTsqkjl;
    }
    public void setChXjnr(String chXjnr) 
    {
        this.chXjnr = chXjnr;
    }

    public String getChXjnr() 
    {
        return chXjnr;
    }
    public void setChTbrq(Date chTbrq) 
    {
        this.chTbrq = chTbrq;
    }

    public Date getChTbrq() 
    {
        return chTbrq;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("chId", getChId())
            .append("healthfileid", getHealthfileid())
            .append("chName", getChName())
            .append("chFsrq", getChFsrq())
            .append("chFsryxm", getChFsryxm())
            .append("chFsjgmc", getChFsjgmc())
            .append("chChts", getChChts())
            .append("chTw", getChTw())
            .append("chSsy", getChSsy())
            .append("chSzy", getChSzy())
            .append("chRtjcjg", getChRtjcjg())
            .append("chRzldm", getChRzldm())
            .append("chGdgd", getChGdgd())
            .append("chSkyhzkdm", getChSkyhzkdm())
            .append("chElzk", getChElzk())
            .append("chDbzkjl", getChDbzkjl())
            .append("chXbzkjl", getChXbzkjl())
            .append("chTsqkjl", getChTsqkjl())
            .append("chXjnr", getChXjnr())
            .append("chTbrq", getChTbrq())
            .toString();
    }
}
