package com.imedcare.project.fn.cqsczdxx.domain;

import java.util.Date;

/**
 * @author maqilin
 * @description: 妇女
 * @date 2019/11/8 22:22
 */
public class Women {
    // 建档id
    private String id;

    // 姓名
    private String name;

    // 证件类型
    private String idNoType;

    // 证件号码
    private String idNo;

    // 出生日期
    private Date birthday;

    // 现住址省
    private String addressProvice;
    // 现住址市
    private String addressCity;
    // 现住址区
    private String addressRegion;

    // 邮编
    private String mail;
    // 电话
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNoType() {
        return idNoType;
    }

    public void setIdNoType(String idNoType) {
        this.idNoType = idNoType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddressProvice() {
        return addressProvice;
    }

    public void setAddressProvice(String addressProvice) {
        this.addressProvice = addressProvice;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Women{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", idNoType='" + idNoType + '\'' +
                ", idNo='" + idNo + '\'' +
                ", birthday=" + birthday +
                ", addressProvice='" + addressProvice + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressRegion='" + addressRegion + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
