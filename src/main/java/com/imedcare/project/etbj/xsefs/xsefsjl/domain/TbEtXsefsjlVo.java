package com.imedcare.project.etbj.xsefs.xsefsjl.domain;


import java.util.Date;

/**
 * @description: 新生儿访视记录Vo
 * @author: huangweiye
 * @create: 2019-11-14 10:13
 **/
public class TbEtXsefsjlVo {

    private Long id;

    /** 新生儿访视登记ID */
    private Long fsdjid;

    /** 体重 */
    private String tz;

    /** 身长 */
    private String sc;

    /** 头围 */
    private String tw;

    /** 黄疸部位 */
    private String hddm;

    /** 喂养方式代码 */
    private String wyfs;

    /** 小便性状代码 */
    private String xbzkdm;

    /** 小便状况 */
    private String xbzk;

    /** 大便性状代码 */
    private String dbzkdm;

    /** 大便状况 */
    private String dbzk;

    /** 有无特殊情况 */
    private String tsqk;

    /** 特殊情况 */
    private String tsqksm;

    /** 有无并发症 */
    private String bfz;

    /** 并发症代码 */
    private String bfzdm;

    /** 指导意见 */
    private String zdyj;

    /** 访视日期 */
    private Date fsrq;

    /** 机构名称 */
    private String jgmc;

    /** 访视医生姓名 */
    private String ysxm;

    /** 新生儿姓名 */
    private String xm;

    /** 出生日期 */
    private Date csrq;

    /** 母亲姓名 */
    private String mqxm;

    /** 地址-省/直辖市/自治区 */
    private String dzsheng;

    /** 地址-市/地区 */
    private String dzshi;

    /** 地址-区/县 */
    private String dzxian;

    /** 地址-乡镇/街道办事处 */
    private String dzxiang;

    /** 地址-村/街/路 */
    private String dzcun;

    /** 地址-门牌 */
    private String dzmp;

    /** 联系方式 */
    private String lxfs;
    /** 
    * @Description: 现住址
    */ 
    private String xzz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFsdjid() {
        return fsdjid;
    }

    public void setFsdjid(Long fsdjid) {
        this.fsdjid = fsdjid;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getTw() {
        return tw;
    }

    public void setTw(String tw) {
        this.tw = tw;
    }

    public String getHddm() {
        return hddm;
    }

    public void setHddm(String hddm) {
        this.hddm = hddm;
    }

    public String getWyfs() {
        return wyfs;
    }

    public void setWyfs(String wyfs) {
        this.wyfs = wyfs;
    }

    public String getXbzkdm() {
        return xbzkdm;
    }

    public void setXbzkdm(String xbzkdm) {
        this.xbzkdm = xbzkdm;
    }

    public String getXbzk() {
        return xbzk;
    }

    public void setXbzk(String xbzk) {
        this.xbzk = xbzk;
    }

    public String getDbzkdm() {
        return dbzkdm;
    }

    public void setDbzkdm(String dbzkdm) {
        this.dbzkdm = dbzkdm;
    }

    public String getDbzk() {
        return dbzk;
    }

    public void setDbzk(String dbzk) {
        this.dbzk = dbzk;
    }

    public String getTsqk() {
        return tsqk;
    }

    public void setTsqk(String tsqk) {
        this.tsqk = tsqk;
    }

    public String getTsqksm() {
        return tsqksm;
    }

    public void setTsqksm(String tsqksm) {
        this.tsqksm = tsqksm;
    }

    public String getBfz() {
        return bfz;
    }

    public void setBfz(String bfz) {
        this.bfz = bfz;
    }

    public String getBfzdm() {
        return bfzdm;
    }

    public void setBfzdm(String bfzdm) {
        this.bfzdm = bfzdm;
    }

    public String getZdyj() {
        return zdyj;
    }

    public void setZdyj(String zdyj) {
        this.zdyj = zdyj;
    }

    public Date getFsrq() {
        return fsrq;
    }

    public void setFsrq(Date fsrq) {
        this.fsrq = fsrq;
    }

    public String getJgmc() {
        return jgmc;
    }

    public void setJgmc(String jgmc) {
        this.jgmc = jgmc;
    }

    public String getYsxm() {
        return ysxm;
    }

    public void setYsxm(String ysxm) {
        this.ysxm = ysxm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    public String getMqxm() {
        return mqxm;
    }

    public void setMqxm(String mqxm) {
        this.mqxm = mqxm;
    }

    public String getDzsheng() {
        return dzsheng;
    }

    public void setDzsheng(String dzsheng) {
        this.dzsheng = dzsheng;
    }

    public String getDzshi() {
        return dzshi;
    }

    public void setDzshi(String dzshi) {
        this.dzshi = dzshi;
    }

    public String getDzxian() {
        return dzxian;
    }

    public void setDzxian(String dzxian) {
        this.dzxian = dzxian;
    }

    public String getDzxiang() {
        return dzxiang;
    }

    public void setDzxiang(String dzxiang) {
        this.dzxiang = dzxiang;
    }

    public String getDzcun() {
        return dzcun;
    }

    public void setDzcun(String dzcun) {
        this.dzcun = dzcun;
    }

    public String getDzmp() {
        return dzmp;
    }

    public void setDzmp(String dzmp) {
        this.dzmp = dzmp;
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public String getXzz() {
        return xzz;
    }

    public void setXzz(String xzz) {
        this.xzz = xzz;
    }
}
