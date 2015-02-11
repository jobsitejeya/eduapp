package com.edu.app.domain;
// Generated Jul 5, 2008 9:25:16 PM by Hibernate Tools 3.1.0.beta5


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * EduAddress generated by hbm2java
 */
@Entity
@Table(name="edu_address")
public class EduAddress  extends BaseEntity {

    // Fields
     private Integer addressType;
     private int addRefType;
     private int addRefTypeId;
     private String address1;
     private String address2;
     private String city;
     private String state;
     private String country;
     private String zipcode;
     private String phone1;
     private String phone2;
     private String mobile;
     private String fax;

     // Constructors

    /** default constructor */
    public EduAddress() {
    }

   // Property accessors

    @Column(name="Address_Type", unique=false, nullable=true, insertable=true, updatable=true)
    public Integer getAddressType() {
        return this.addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    @Column(name="Add_Ref_Type", unique=false, nullable=false, insertable=true, updatable=true)
    public int getAddRefType() {
        return this.addRefType;
    }

    public void setAddRefType(int addRefType) {
        this.addRefType = addRefType;
    }

    @Column(name="Add_Ref_Type_Id", unique=false, nullable=false, insertable=true, updatable=true)
    public int getAddRefTypeId() {
        return this.addRefTypeId;
    }

    public void setAddRefTypeId(int addRefTypeId) {
        this.addRefTypeId = addRefTypeId;
    }

    @Column(name="Address1", unique=false, nullable=true, insertable=true, updatable=true)
    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Column(name="Address2", unique=false, nullable=true, insertable=true, updatable=true)
    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Column(name="City", unique=false, nullable=true, insertable=true, updatable=true, length=64)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name="State", unique=false, nullable=true, insertable=true, updatable=true, length=64)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name="Country", unique=false, nullable=true, insertable=true, updatable=true, length=64)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name="Zipcode", unique=false, nullable=true, insertable=true, updatable=true, length=15)
    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Column(name="Phone1", unique=false, nullable=true, insertable=true, updatable=true, length=20)
    public String getPhone1() {
        return this.phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Column(name="Phone2", unique=false, nullable=true, insertable=true, updatable=true, length=20)
    public String getPhone2() {
        return this.phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Column(name="Mobile", unique=false, nullable=true, insertable=true, updatable=true, length=20)
    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name="Fax", unique=false, nullable=true, insertable=true, updatable=true, length=20)
    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}