package com.imedcare.project.jbda.etda.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 儿童档案对象 tx_child_info
 * 
 * @author imedcare
 * @date 2019-11-13
 */
public class TxChildInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 健康档案号 */
    private Long healthFileId;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 儿童姓名 */
    @Excel(name = "儿童姓名")
    private String childName;

    /** 生日 */
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 年龄 */
    @Excel(name = "年龄")
    private String age;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 民族 */
    @Excel(name = "民族")
    private String nationality;

    /** 父亲姓名 */
    @Excel(name = "父亲姓名")
    private String fatherName;

    /** 父亲单位 */
    @Excel(name = "父亲单位")
    private String fatherJob;

    /** 母亲姓名 */
    @Excel(name = "母亲姓名")
    private String motherName;

    /** 母亲单位 */
    @Excel(name = "母亲单位")
    private String motherJob;

    /** 家庭地址 */
    @Excel(name = "家庭地址")
    private String address;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 建卡时间 */
    @Excel(name = "建卡时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creatTime;

    /** 托幼单位 */
    @Excel(name = "托幼单位")
    private String nursery;

    /** 入托时间 */
    @Excel(name = "入托时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nurseryTime;

    /** 父亲身份证 */
    @Excel(name = "父亲身份证")
    private String fatherId;

    /** 母亲身份证 */
    @Excel(name = "母亲身份证")
    private String motherId;

    public void setHealthFileId(Long healthFileId) 
    {
        this.healthFileId = healthFileId;
    }

    public Long getHealthFileId() 
    {
        return healthFileId;
    }
    public void setCardid(String cardid) 
    {
        this.cardid = cardid;
    }

    public String getCardid() 
    {
        return cardid;
    }
    public void setChildName(String childName) 
    {
        this.childName = childName;
    }

    public String getChildName() 
    {
        return childName;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setAge(String age) 
    {
        this.age = age;
    }

    public String getAge() 
    {
        return age;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setNationality(String nationality) 
    {
        this.nationality = nationality;
    }

    public String getNationality() 
    {
        return nationality;
    }
    public void setFatherName(String fatherName) 
    {
        this.fatherName = fatherName;
    }

    public String getFatherName() 
    {
        return fatherName;
    }
    public void setFatherJob(String fatherJob) 
    {
        this.fatherJob = fatherJob;
    }

    public String getFatherJob() 
    {
        return fatherJob;
    }
    public void setMotherName(String motherName) 
    {
        this.motherName = motherName;
    }

    public String getMotherName() 
    {
        return motherName;
    }
    public void setMotherJob(String motherJob) 
    {
        this.motherJob = motherJob;
    }

    public String getMotherJob() 
    {
        return motherJob;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setCreatTime(Date creatTime) 
    {
        this.creatTime = creatTime;
    }

    public Date getCreatTime() 
    {
        return creatTime;
    }
    public void setNursery(String nursery) 
    {
        this.nursery = nursery;
    }

    public String getNursery() 
    {
        return nursery;
    }
    public void setNurseryTime(Date nurseryTime) 
    {
        this.nurseryTime = nurseryTime;
    }

    public Date getNurseryTime() 
    {
        return nurseryTime;
    }
    public void setFatherId(String fatherId) 
    {
        this.fatherId = fatherId;
    }

    public String getFatherId() 
    {
        return fatherId;
    }
    public void setMotherId(String motherId) 
    {
        this.motherId = motherId;
    }

    public String getMotherId() 
    {
        return motherId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("healthFileId", getHealthFileId())
            .append("cardid", getCardid())
            .append("childName", getChildName())
            .append("birthday", getBirthday())
            .append("age", getAge())
            .append("gender", getGender())
            .append("nationality", getNationality())
            .append("fatherName", getFatherName())
            .append("fatherJob", getFatherJob())
            .append("motherName", getMotherName())
            .append("motherJob", getMotherJob())
            .append("address", getAddress())
            .append("phone", getPhone())
            .append("creatTime", getCreatTime())
            .append("nursery", getNursery())
            .append("nurseryTime", getNurseryTime())
            .append("fatherId", getFatherId())
            .append("motherId", getMotherId())
            .toString();
    }
}
