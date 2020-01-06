package com.imedcare.project.jbda.fnda.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.imedcare.framework.aspectj.lang.annotation.Excel;
import com.imedcare.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 妇女档案对象 tx_woman_info
 *
 * @author liuyang
 * @date 2019-11-14
 */
public class TxWomanInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 健康档案号 */
    private Long healthFileId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 住址 */
    @Excel(name = "住址")
    private String address;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String cardid;

    /** 民族 */
    @Excel(name = "民族")
    private String nation;

    /** 初潮年龄 */
    @Excel(name = "初潮年龄")
    private String menophanianAge;

    /** 月经周期 */
    @Excel(name = "月经周期")
    private String menstrualCycle;

    /** 行经天数 */
    @Excel(name = "行经天数")
    private String menstrualPeriod;

    /** 痛经 */
    @Excel(name = "痛经")
    private String hurt;

    /** 月经量 */
    @Excel(name = "月经量")
    private String menstrualQuantity;

    /** 血块 */
    @Excel(name = "血块")
    private String bloodClot;

    /** 是否绝经 */
    @Excel(name = "是否绝经")
    private String stopFlag;

    /** 绝经年龄 */
    @Excel(name = "绝经年龄")
    private String stopAge;

    /** 手术绝经 */
    @Excel(name = "手术绝经")
    private String operationStop;

    /** 绝经后阴道出血 */
    @Excel(name = "绝经后阴道出血")
    private String bleedingAfterStop;

    /** 接触出血 */
    @Excel(name = "接触出血")
    private String contactBleeding;

    /** 白带味 */
    @Excel(name = "白带味")
    private String smellLeucorrhea;

    /** 子宫或附件切除 */
    @Excel(name = "子宫或附件切除")
    private String discardFlag;

    /** 切除年月 */
    @Excel(name = "切除年月", width = 30, dateFormat = "yyyy-MM-dd")
    private Date discardDate;

    /** 白带量 */
    @Excel(name = "白带量")
    private String leucorrheaQuantity;

    /** 白带色 */
    @Excel(name = "白带色")
    private String leucorrheaColor;

    /** 其他 */
    @Excel(name = "其他")
    private String leucorrheaColorOther;

    /** 氧感 */
    @Excel(name = "氧感")
    private String itch;

    /** 婚否 */
    @Excel(name = "婚否")
    private String marriage;

    /** 结婚年龄 */
    @Excel(name = "结婚年龄")
    private String marriageAge;

    /** 妊娠次数 */
    @Excel(name = "妊娠次数")
    private Long gestationTimes;

    /** 生育次数 */
    @Excel(name = "生育次数")
    private Long deliveryTimes;

    /** 剖宫产次数 */
    @Excel(name = "剖宫产次数")
    private Long cesareanTimes;

    /** 人工流产次数 */
    @Excel(name = "人工流产次数")
    private Long artificialAbortion;

    /** 自然流产次数 */
    @Excel(name = "自然流产次数")
    private Long spontaneousAbortion;

    /** 引产次数 */
    @Excel(name = "引产次数")
    private Long inducedLabour;

    /** 死胎 */
    @Excel(name = "死胎")
    private String deatFetus;

    /** 死产 */
    @Excel(name = "死产")
    private String stillbirth;

    /** 产褥感染 */
    @Excel(name = "产褥感染")
    private String puerperalInfection;

    /** 末次分娩日期 */
    @Excel(name = "末次分娩日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastDeliveryDate;

    /** 节育环 */
    @Excel(name = "节育环")
    private String contraceptiveRing;

    /** 环位置 */
    @Excel(name = "环位置")
    private String contraceptiveRingLoc;

    /** 结扎日期 */
    @Excel(name = "结扎日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contraceptiveDate;

    /** 口服药 */
    @Excel(name = "口服药")
    private String takenPills;

    /** 工具 */
    @Excel(name = "工具")
    private String tools;

    /** 曾患妇科病 */
    @Excel(name = "曾患妇科病")
    private String diseaseHistory;

    /** 妇科手术史 */
    @Excel(name = "妇科手术史")
    private String operationHistory;

    /** 乳癌家族史 */
    @Excel(name = "乳癌家族史")
    private String breastCancerFamily;

    /** 出血 */
    @Excel(name = "出血")
    private String blood;

    /** 乳腺癌 */
    @Excel(name = "乳腺癌")
    private String breastCancer;

    /** 乳腺癌确诊时间 */
    @Excel(name = "乳腺癌确诊时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date breastCancerDate;

    /** 乳腺癌治疗 */
    @Excel(name = "乳腺癌治疗")
    private String breastCancerTreat;

    /** 宫颈癌 */
    @Excel(name = "宫颈癌")
    private String uterineNeckCancer;

    /** 宫颈癌确诊时间 */
    @Excel(name = "宫颈癌确诊时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date uterineNeckCancerDate;

    /** 宫颈癌治疗 */
    @Excel(name = "宫颈癌治疗", width = 30, dateFormat = "yyyy-MM-dd")
    private Date uterineNeckCancerTreat;

    /** 备注 */
    @Excel(name = "备注")
    private String otherDes;

    public void setHealthFileId(Long healthFileId)
    {
        this.healthFileId = healthFileId;
    }

    public Long getHealthFileId()
    {
        return healthFileId;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
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
    public void setNation(String nation)
    {
        this.nation = nation;
    }

    public String getNation()
    {
        return nation;
    }
    public void setMenophanianAge(String menophanianAge)
    {
        this.menophanianAge = menophanianAge;
    }

    public String getMenophanianAge()
    {
        return menophanianAge;
    }
    public void setMenstrualCycle(String menstrualCycle)
    {
        this.menstrualCycle = menstrualCycle;
    }

    public String getMenstrualCycle()
    {
        return menstrualCycle;
    }
    public void setMenstrualPeriod(String menstrualPeriod)
    {
        this.menstrualPeriod = menstrualPeriod;
    }

    public String getMenstrualPeriod()
    {
        return menstrualPeriod;
    }
    public void setHurt(String hurt)
    {
        this.hurt = hurt;
    }

    public String getHurt()
    {
        return hurt;
    }
    public void setMenstrualQuantity(String menstrualQuantity)
    {
        this.menstrualQuantity = menstrualQuantity;
    }

    public String getMenstrualQuantity()
    {
        return menstrualQuantity;
    }
    public void setBloodClot(String bloodClot)
    {
        this.bloodClot = bloodClot;
    }

    public String getBloodClot()
    {
        return bloodClot;
    }
    public void setStopFlag(String stopFlag)
    {
        this.stopFlag = stopFlag;
    }

    public String getStopFlag()
    {
        return stopFlag;
    }
    public void setStopAge(String stopAge)
    {
        this.stopAge = stopAge;
    }

    public String getStopAge()
    {
        return stopAge;
    }
    public void setOperationStop(String operationStop)
    {
        this.operationStop = operationStop;
    }

    public String getOperationStop()
    {
        return operationStop;
    }
    public void setBleedingAfterStop(String bleedingAfterStop)
    {
        this.bleedingAfterStop = bleedingAfterStop;
    }

    public String getBleedingAfterStop()
    {
        return bleedingAfterStop;
    }
    public void setContactBleeding(String contactBleeding)
    {
        this.contactBleeding = contactBleeding;
    }

    public String getContactBleeding()
    {
        return contactBleeding;
    }
    public void setSmellLeucorrhea(String smellLeucorrhea)
    {
        this.smellLeucorrhea = smellLeucorrhea;
    }

    public String getSmellLeucorrhea()
    {
        return smellLeucorrhea;
    }
    public void setDiscardFlag(String discardFlag)
    {
        this.discardFlag = discardFlag;
    }

    public String getDiscardFlag()
    {
        return discardFlag;
    }
    public void setDiscardDate(Date discardDate)
    {
        this.discardDate = discardDate;
    }

    public Date getDiscardDate()
    {
        return discardDate;
    }
    public void setLeucorrheaQuantity(String leucorrheaQuantity)
    {
        this.leucorrheaQuantity = leucorrheaQuantity;
    }

    public String getLeucorrheaQuantity()
    {
        return leucorrheaQuantity;
    }
    public void setLeucorrheaColor(String leucorrheaColor)
    {
        this.leucorrheaColor = leucorrheaColor;
    }

    public String getLeucorrheaColor()
    {
        return leucorrheaColor;
    }
    public void setLeucorrheaColorOther(String leucorrheaColorOther)
    {
        this.leucorrheaColorOther = leucorrheaColorOther;
    }

    public String getLeucorrheaColorOther()
    {
        return leucorrheaColorOther;
    }
    public void setItch(String itch)
    {
        this.itch = itch;
    }

    public String getItch()
    {
        return itch;
    }
    public void setMarriage(String marriage)
    {
        this.marriage = marriage;
    }

    public String getMarriage()
    {
        return marriage;
    }
    public void setMarriageAge(String marriageAge)
    {
        this.marriageAge = marriageAge;
    }

    public String getMarriageAge()
    {
        return marriageAge;
    }
    public void setGestationTimes(Long gestationTimes)
    {
        this.gestationTimes = gestationTimes;
    }

    public Long getGestationTimes()
    {
        return gestationTimes;
    }
    public void setDeliveryTimes(Long deliveryTimes)
    {
        this.deliveryTimes = deliveryTimes;
    }

    public Long getDeliveryTimes()
    {
        return deliveryTimes;
    }
    public void setCesareanTimes(Long cesareanTimes)
    {
        this.cesareanTimes = cesareanTimes;
    }

    public Long getCesareanTimes()
    {
        return cesareanTimes;
    }
    public void setArtificialAbortion(Long artificialAbortion)
    {
        this.artificialAbortion = artificialAbortion;
    }

    public Long getArtificialAbortion()
    {
        return artificialAbortion;
    }
    public void setSpontaneousAbortion(Long spontaneousAbortion)
    {
        this.spontaneousAbortion = spontaneousAbortion;
    }

    public Long getSpontaneousAbortion()
    {
        return spontaneousAbortion;
    }
    public void setInducedLabour(Long inducedLabour)
    {
        this.inducedLabour = inducedLabour;
    }

    public Long getInducedLabour()
    {
        return inducedLabour;
    }
    public void setDeatFetus(String deatFetus)
    {
        this.deatFetus = deatFetus;
    }

    public String getDeatFetus()
    {
        return deatFetus;
    }
    public void setStillbirth(String stillbirth)
    {
        this.stillbirth = stillbirth;
    }

    public String getStillbirth()
    {
        return stillbirth;
    }
    public void setPuerperalInfection(String puerperalInfection)
    {
        this.puerperalInfection = puerperalInfection;
    }

    public String getPuerperalInfection()
    {
        return puerperalInfection;
    }
    public void setLastDeliveryDate(Date lastDeliveryDate)
    {
        this.lastDeliveryDate = lastDeliveryDate;
    }

    public Date getLastDeliveryDate()
    {
        return lastDeliveryDate;
    }
    public void setContraceptiveRing(String contraceptiveRing)
    {
        this.contraceptiveRing = contraceptiveRing;
    }

    public String getContraceptiveRing()
    {
        return contraceptiveRing;
    }
    public void setContraceptiveRingLoc(String contraceptiveRingLoc)
    {
        this.contraceptiveRingLoc = contraceptiveRingLoc;
    }

    public String getContraceptiveRingLoc()
    {
        return contraceptiveRingLoc;
    }
    public void setContraceptiveDate(Date contraceptiveDate)
    {
        this.contraceptiveDate = contraceptiveDate;
    }

    public Date getContraceptiveDate()
    {
        return contraceptiveDate;
    }
    public void setTakenPills(String takenPills)
    {
        this.takenPills = takenPills;
    }

    public String getTakenPills()
    {
        return takenPills;
    }
    public void setTools(String tools)
    {
        this.tools = tools;
    }

    public String getTools()
    {
        return tools;
    }
    public void setDiseaseHistory(String diseaseHistory)
    {
        this.diseaseHistory = diseaseHistory;
    }

    public String getDiseaseHistory()
    {
        return diseaseHistory;
    }
    public void setOperationHistory(String operationHistory)
    {
        this.operationHistory = operationHistory;
    }

    public String getOperationHistory()
    {
        return operationHistory;
    }
    public void setBreastCancerFamily(String breastCancerFamily)
    {
        this.breastCancerFamily = breastCancerFamily;
    }

    public String getBreastCancerFamily()
    {
        return breastCancerFamily;
    }
    public void setBlood(String blood)
    {
        this.blood = blood;
    }

    public String getBlood()
    {
        return blood;
    }
    public void setBreastCancer(String breastCancer)
    {
        this.breastCancer = breastCancer;
    }

    public String getBreastCancer()
    {
        return breastCancer;
    }
    public void setBreastCancerDate(Date breastCancerDate)
    {
        this.breastCancerDate = breastCancerDate;
    }

    public Date getBreastCancerDate()
    {
        return breastCancerDate;
    }
    public void setBreastCancerTreat(String breastCancerTreat)
    {
        this.breastCancerTreat = breastCancerTreat;
    }

    public String getBreastCancerTreat()
    {
        return breastCancerTreat;
    }
    public void setUterineNeckCancer(String uterineNeckCancer)
    {
        this.uterineNeckCancer = uterineNeckCancer;
    }

    public String getUterineNeckCancer()
    {
        return uterineNeckCancer;
    }
    public void setUterineNeckCancerDate(Date uterineNeckCancerDate)
    {
        this.uterineNeckCancerDate = uterineNeckCancerDate;
    }

    public Date getUterineNeckCancerDate()
    {
        return uterineNeckCancerDate;
    }
    public void setUterineNeckCancerTreat(Date uterineNeckCancerTreat)
    {
        this.uterineNeckCancerTreat = uterineNeckCancerTreat;
    }

    public Date getUterineNeckCancerTreat()
    {
        return uterineNeckCancerTreat;
    }
    public void setOtherDes(String otherDes)
    {
        this.otherDes = otherDes;
    }

    public String getOtherDes()
    {
        return otherDes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("healthFileId", getHealthFileId())
                .append("name", getName())
                .append("gender", getGender())
                .append("address", getAddress())
                .append("birthday", getBirthday())
                .append("cardid", getCardid())
                .append("nation", getNation())
                .append("menophanianAge", getMenophanianAge())
                .append("menstrualCycle", getMenstrualCycle())
                .append("menstrualPeriod", getMenstrualPeriod())
                .append("hurt", getHurt())
                .append("menstrualQuantity", getMenstrualQuantity())
                .append("bloodClot", getBloodClot())
                .append("stopFlag", getStopFlag())
                .append("stopAge", getStopAge())
                .append("operationStop", getOperationStop())
                .append("bleedingAfterStop", getBleedingAfterStop())
                .append("contactBleeding", getContactBleeding())
                .append("smellLeucorrhea", getSmellLeucorrhea())
                .append("discardFlag", getDiscardFlag())
                .append("discardDate", getDiscardDate())
                .append("leucorrheaQuantity", getLeucorrheaQuantity())
                .append("leucorrheaColor", getLeucorrheaColor())
                .append("leucorrheaColorOther", getLeucorrheaColorOther())
                .append("itch", getItch())
                .append("marriage", getMarriage())
                .append("marriageAge", getMarriageAge())
                .append("gestationTimes", getGestationTimes())
                .append("deliveryTimes", getDeliveryTimes())
                .append("cesareanTimes", getCesareanTimes())
                .append("artificialAbortion", getArtificialAbortion())
                .append("spontaneousAbortion", getSpontaneousAbortion())
                .append("inducedLabour", getInducedLabour())
                .append("deatFetus", getDeatFetus())
                .append("stillbirth", getStillbirth())
                .append("puerperalInfection", getPuerperalInfection())
                .append("lastDeliveryDate", getLastDeliveryDate())
                .append("contraceptiveRing", getContraceptiveRing())
                .append("contraceptiveRingLoc", getContraceptiveRingLoc())
                .append("contraceptiveDate", getContraceptiveDate())
                .append("takenPills", getTakenPills())
                .append("tools", getTools())
                .append("diseaseHistory", getDiseaseHistory())
                .append("operationHistory", getOperationHistory())
                .append("breastCancerFamily", getBreastCancerFamily())
                .append("blood", getBlood())
                .append("breastCancer", getBreastCancer())
                .append("breastCancerDate", getBreastCancerDate())
                .append("breastCancerTreat", getBreastCancerTreat())
                .append("uterineNeckCancer", getUterineNeckCancer())
                .append("uterineNeckCancerDate", getUterineNeckCancerDate())
                .append("uterineNeckCancerTreat", getUterineNeckCancerTreat())
                .append("otherDes", getOtherDes())
                .toString();
    }
}
