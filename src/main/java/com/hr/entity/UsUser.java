package com.hr.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "us_user")
public class UsUser implements Serializable {
    @Id
    @Column(name = "UserNo")
    @GeneratedValue(generator = "JDBC")
    private String userno;

    @Column(name = "UserName")
    private String username;

    @Column(name = "ABC")
    private String abc;

    @Column(name = "CreateDate")
    private Date createdate;

    @Column(name = "Address")
    private String address;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "SMSPhone")
    private String smsphone;

    @Column(name = "AreaID")
    private Integer areaid;

    @Column(name = "UserType")
    private String usertype;

    @Column(name = "PayType")
    private String paytype;

    @Column(name = "BankName")
    private String bankname;

    @Column(name = "BankNum")
    private String banknum;

    @Column(name = "Formula")
    private String formula;

    @Column(name = "UserMoney")
    private BigDecimal usermoney;

    @Column(name = "MeterID")
    private Integer meterid;

    @Column(name = "DocNum")
    private String docnum;

    @Column(name = "Pwd")
    private String pwd;

    @Column(name = "ContractNum")
    private String contractnum;

    @Column(name = "ContractDate")
    private Date contractdate;

    @Column(name = "VolumeID")
    private Integer volumeid;

    @Column(name = "VolumeOrderIndex")
    private Integer volumeorderindex;

    @Column(name = "Disabled")
    private Boolean disabled;

    /**
     * @return UserNo
     */
    public String getUserno() {
        return userno;
    }

    /**
     * @param userno
     */
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    /**
     * @return UserName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return ABC
     */
    public String getAbc() {
        return abc;
    }

    /**
     * @param abc
     */
    public void setAbc(String abc) {
        this.abc = abc == null ? null : abc.trim();
    }

    /**
     * @return CreateDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return Phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return SMSPhone
     */
    public String getSmsphone() {
        return smsphone;
    }

    /**
     * @param smsphone
     */
    public void setSmsphone(String smsphone) {
        this.smsphone = smsphone == null ? null : smsphone.trim();
    }

    /**
     * @return AreaID
     */
    public Integer getAreaid() {
        return areaid;
    }

    /**
     * @param areaid
     */
    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    /**
     * @return UserType
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * @param usertype
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    /**
     * @return PayType
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * @param paytype
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    /**
     * @return BankName
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * @param bankname
     */
    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    /**
     * @return BankNum
     */
    public String getBanknum() {
        return banknum;
    }

    /**
     * @param banknum
     */
    public void setBanknum(String banknum) {
        this.banknum = banknum == null ? null : banknum.trim();
    }

    /**
     * @return Formula
     */
    public String getFormula() {
        return formula;
    }

    /**
     * @param formula
     */
    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    /**
     * @return UserMoney
     */
    public BigDecimal getUsermoney() {
        return usermoney;
    }

    /**
     * @param usermoney
     */
    public void setUsermoney(BigDecimal usermoney) {
        this.usermoney = usermoney;
    }

    /**
     * @return MeterID
     */
    public Integer getMeterid() {
        return meterid;
    }

    /**
     * @param meterid
     */
    public void setMeterid(Integer meterid) {
        this.meterid = meterid;
    }

    /**
     * @return DocNum
     */
    public String getDocnum() {
        return docnum;
    }

    /**
     * @param docnum
     */
    public void setDocnum(String docnum) {
        this.docnum = docnum == null ? null : docnum.trim();
    }

    /**
     * @return Pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * @return ContractNum
     */
    public String getContractnum() {
        return contractnum;
    }

    /**
     * @param contractnum
     */
    public void setContractnum(String contractnum) {
        this.contractnum = contractnum == null ? null : contractnum.trim();
    }

    /**
     * @return ContractDate
     */
    public Date getContractdate() {
        return contractdate;
    }

    /**
     * @param contractdate
     */
    public void setContractdate(Date contractdate) {
        this.contractdate = contractdate;
    }

    /**
     * @return VolumeID
     */
    public Integer getVolumeid() {
        return volumeid;
    }

    /**
     * @param volumeid
     */
    public void setVolumeid(Integer volumeid) {
        this.volumeid = volumeid;
    }

    /**
     * @return VolumeOrderIndex
     */
    public Integer getVolumeorderindex() {
        return volumeorderindex;
    }

    /**
     * @param volumeorderindex
     */
    public void setVolumeorderindex(Integer volumeorderindex) {
        this.volumeorderindex = volumeorderindex;
    }

    /**
     * @return Disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * @param disabled
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }
}