package com.imedcare.project.fnbpc.fnbpctgjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 妇女病普查体格检查记录对象 tb_fb_fnbpctgjcjl
 * 
 * @author liuyang
 * @date 2019-11-21
 */
public class TbFbFnbpctgjcjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 妇女病普查登记ID */
    @Excel(name = "妇女病普查登记ID")
    private Long fnbpcdjid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String cardid;

    /** 心率(次分钟) */
    @Excel(name = "心率(次分钟)")
    private Integer xl;

    /** 收缩压(mmHg) */
    @Excel(name = "收缩压(mmHg)")
    private Integer ssy;

    /** 舒张压(mmHg) */
    @Excel(name = "舒张压(mmHg)")
    private Integer szy;

    /** 左侧附件检查结果 */
    @Excel(name = "左侧附件检查结果")
    private String zcfjjcjgdm;

    /** 右侧附件检查结果 */
    @Excel(name = "右侧附件检查结果")
    private String ycfjjcjgdm;

    /** 宫颈检查结果 */
    @Excel(name = "宫颈检查结果")
    private String gjjcjg;

    /** 阴道检查结果 */
    @Excel(name = "阴道检查结果")
    private String ydjcjg;

    /** 外阴检查结果 */
    @Excel(name = "外阴检查结果")
    private String wyjcjg;

    /** 子宫检查结果 */
    @Excel(name = "子宫检查结果")
    private String zgjcjg;

    /** 左侧乳腺检查结果 */
    @Excel(name = "左侧乳腺检查结果")
    private String zcrxjcjgdm;

    /** 右侧乳腺检查结果 */
    @Excel(name = "右侧乳腺检查结果")
    private String ycrxjcjgdm;

    /** 检查(测)日期 */
    @Excel(name = "检查(测)日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date jcrq;

    /** 检查(测)人员代码 */
    @Excel(name = "检查(测)人员代码")
    private String jcrydm;

    /** 检查(测)人员姓名 */
    @Excel(name = "检查(测)人员姓名")
    private String jcryxm;

    /** 检查(测)机构代码 */
    @Excel(name = "检查(测)机构代码")
    private String jcjgdm;

    /** 检查(测)机构名称 */
    @Excel(name = "检查(测)机构名称")
    private String jcjgmc;

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
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setCardid(String cardid) 
    {
        this.cardid = cardid;
    }

    public String getCardid() 
    {
        return cardid;
    }
    public void setXl(Integer xl) 
    {
        this.xl = xl;
    }

    public Integer getXl() 
    {
        return xl;
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
    public void setWyjcjg(String wyjcjg) 
    {
        this.wyjcjg = wyjcjg;
    }

    public String getWyjcjg() 
    {
        return wyjcjg;
    }
    public void setZgjcjg(String zgjcjg) 
    {
        this.zgjcjg = zgjcjg;
    }

    public String getZgjcjg() 
    {
        return zgjcjg;
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
    public void setJcrydm(String jcrydm) 
    {
        this.jcrydm = jcrydm;
    }

    public String getJcrydm() 
    {
        return jcrydm;
    }
    public void setJcryxm(String jcryxm) 
    {
        this.jcryxm = jcryxm;
    }

    public String getJcryxm() 
    {
        return jcryxm;
    }
    public void setJcjgdm(String jcjgdm) 
    {
        this.jcjgdm = jcjgdm;
    }

    public String getJcjgdm() 
    {
        return jcjgdm;
    }
    public void setJcjgmc(String jcjgmc) 
    {
        this.jcjgmc = jcjgmc;
    }

    public String getJcjgmc() 
    {
        return jcjgmc;
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
            .append("birthday", getBirthday())
            .append("cardid", getCardid())
            .append("xl", getXl())
            .append("ssy", getSsy())
            .append("szy", getSzy())
            .append("zcfjjcjgdm", getZcfjjcjgdm())
            .append("ycfjjcjgdm", getYcfjjcjgdm())
            .append("gjjcjg", getGjjcjg())
            .append("ydjcjg", getYdjcjg())
            .append("wyjcjg", getWyjcjg())
            .append("zgjcjg", getZgjcjg())
            .append("zcrxjcjgdm", getZcrxjcjgdm())
            .append("ycrxjcjgdm", getYcrxjcjgdm())
            .append("jcrq", getJcrq())
            .append("jcrydm", getJcrydm())
            .append("jcryxm", getJcryxm())
            .append("jcjgdm", getJcjgdm())
            .append("jcjgmc", getJcjgmc())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
