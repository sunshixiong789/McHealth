package com.imedcare.project.fnbpc.fnbpcfzjcjl.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 妇女病普查辅助检查记录对象 tb_fb_fnbpcfzjcjl
 * 
 * @author imedcare
 * @date 2019-11-21
 */
public class TbFbFnbpcfzjcjl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String xm;

    /** 身份证件-号码 */
    @Excel(name = "身份证件-号码")
    private String cardid;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String birthday;

    /** 妇女病普查登记ID */
    @Excel(name = "妇女病普查登记ID")
    private Long fnbpcdjid;

    /** 乳腺X线检查结果 */
    @Excel(name = "乳腺X线检查结果")
    private String rxxxjcjg;

    /** 乳腺B超检查结果 */
    @Excel(name = "乳腺B超检查结果")
    private String rxbcjcjg;

    /** 阴道镜检查结果 */
    @Excel(name = "阴道镜检查结果")
    private String ydjjcjg;

    /** 阴道分泌物性状描述 */
    @Excel(name = "阴道分泌物性状描述")
    private String ydfmwxzms;

    /** 阴道细胞学诊断结果代码 */
    @Excel(name = "阴道细胞学诊断结果代码")
    private String ydxbxzdjgdm;

    /** 滴虫检测结果代码 */
    @Excel(name = "滴虫检测结果代码")
    private String dcjcjgdm;

    /** 念珠菌检测结果代码 */
    @Excel(name = "念珠菌检测结果代码")
    private String nzjjcjgdm;

    /** 阴道分泌物清洁度代码 */
    @Excel(name = "阴道分泌物清洁度代码")
    private String ydfmwqjddm;

    /** 淋球菌检查结果 */
    @Excel(name = "淋球菌检查结果")
    private String lqjjcjg;

    /** 梅毒血清学实验结果代码 */
    @Excel(name = "梅毒血清学实验结果代码")
    private String mdxqxsyjgdm;

    /** 其他 */
    @Excel(name = "其他")
    private String qt;

    /** 检查（测）日期 */
    @Excel(name = "检查", readConverterExp = "测=")
    private Date jcrq;

    /** 检查（测）人员代码 */
    @Excel(name = "检查", readConverterExp = "测=")
    private String jcrydm;

    /** 检查（测）人员姓名 */
    @Excel(name = "检查", readConverterExp = "测=")
    private String jcryxm;

    /** 检查（测）机构代码 */
    @Excel(name = "检查", readConverterExp = "测=")
    private String jcjgdm;

    /** 检查（测）机构名称 */
    @Excel(name = "检查", readConverterExp = "测=")
    private String jcjgmc;

    /** 删除标志 */
    private String deleteFlag;

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
    public void setCardid(String cardid) 
    {
        this.cardid = cardid;
    }

    public String getCardid() 
    {
        return cardid;
    }
    public void setBirthday(String birthday) 
    {
        this.birthday = birthday;
    }

    public String getBirthday() 
    {
        return birthday;
    }
    public void setFnbpcdjid(Long fnbpcdjid) 
    {
        this.fnbpcdjid = fnbpcdjid;
    }

    public Long getFnbpcdjid() 
    {
        return fnbpcdjid;
    }
    public void setRxxxjcjg(String rxxxjcjg) 
    {
        this.rxxxjcjg = rxxxjcjg;
    }

    public String getRxxxjcjg() 
    {
        return rxxxjcjg;
    }
    public void setRxbcjcjg(String rxbcjcjg) 
    {
        this.rxbcjcjg = rxbcjcjg;
    }

    public String getRxbcjcjg() 
    {
        return rxbcjcjg;
    }
    public void setYdjjcjg(String ydjjcjg) 
    {
        this.ydjjcjg = ydjjcjg;
    }

    public String getYdjjcjg() 
    {
        return ydjjcjg;
    }
    public void setYdfmwxzms(String ydfmwxzms) 
    {
        this.ydfmwxzms = ydfmwxzms;
    }

    public String getYdfmwxzms() 
    {
        return ydfmwxzms;
    }
    public void setYdxbxzdjgdm(String ydxbxzdjgdm) 
    {
        this.ydxbxzdjgdm = ydxbxzdjgdm;
    }

    public String getYdxbxzdjgdm() 
    {
        return ydxbxzdjgdm;
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
    public void setYdfmwqjddm(String ydfmwqjddm) 
    {
        this.ydfmwqjddm = ydfmwqjddm;
    }

    public String getYdfmwqjddm() 
    {
        return ydfmwqjddm;
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
    public void setQt(String qt) 
    {
        this.qt = qt;
    }

    public String getQt() 
    {
        return qt;
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
            .append("xm", getXm())
            .append("cardid", getCardid())
            .append("birthday", getBirthday())
            .append("fnbpcdjid", getFnbpcdjid())
            .append("rxxxjcjg", getRxxxjcjg())
            .append("rxbcjcjg", getRxbcjcjg())
            .append("ydjjcjg", getYdjjcjg())
            .append("ydfmwxzms", getYdfmwxzms())
            .append("ydxbxzdjgdm", getYdxbxzdjgdm())
            .append("dcjcjgdm", getDcjcjgdm())
            .append("nzjjcjgdm", getNzjjcjgdm())
            .append("ydfmwqjddm", getYdfmwqjddm())
            .append("lqjjcjg", getLqjjcjg())
            .append("mdxqxsyjgdm", getMdxqxsyjgdm())
            .append("qt", getQt())
            .append("jcrq", getJcrq())
            .append("jcrydm", getJcrydm())
            .append("jcryxm", getJcryxm())
            .append("jcjgdm", getJcjgdm())
            .append("jcjgmc", getJcjgmc())
            .append("deleteFlag", getDeleteFlag())
            .toString();
    }
}
