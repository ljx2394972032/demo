package com.ljx.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class Users implements Serializable {

    private Long id;

    private String email;

    @JsonIgnore
    private String password;

    private String headUrl;

    private String countryNum;

    private String phone;

    private String firstName;

    private String lastName;

    private String fullName;

    private Integer isDealer;

    private String state;

    private String suburb;

    private String postCode;

    private String dealerName;

    private String dealerCountryNum;

    private String dealerPhone;

    private String dealerState;

    private String dealerSuburb;

    private String dealerAddress;

    private String dealerPostCode;

    private String dealerLicenseNum;

    private Boolean frozen;

    private Long frozenStart;

    private Long frozenEnd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getCountryNum() {
        return countryNum;
    }

    public void setCountryNum(String countryNum) {
        this.countryNum = countryNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getIsDealer() {
        return isDealer;
    }

    public void setIsDealer(Integer isDealer) {
        this.isDealer = isDealer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerCountryNum() {
        return dealerCountryNum;
    }

    public void setDealerCountryNum(String dealerCountryNum) {
        this.dealerCountryNum = dealerCountryNum;
    }

    public String getDealerPhone() {
        return dealerPhone;
    }

    public void setDealerPhone(String dealerPhone) {
        this.dealerPhone = dealerPhone;
    }

    public String getDealerState() {
        return dealerState;
    }

    public void setDealerState(String dealerState) {
        this.dealerState = dealerState;
    }

    public String getDealerSuburb() {
        return dealerSuburb;
    }

    public void setDealerSuburb(String dealerSuburb) {
        this.dealerSuburb = dealerSuburb;
    }

    public String getDealerAddress() {
        return dealerAddress;
    }

    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    public String getDealerPostCode() {
        return dealerPostCode;
    }

    public void setDealerPostCode(String dealerPostCode) {
        this.dealerPostCode = dealerPostCode;
    }

    public String getDealerLicenseNum() {
        return dealerLicenseNum;
    }

    public void setDealerLicenseNum(String dealerLicenseNum) {
        this.dealerLicenseNum = dealerLicenseNum;
    }

    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public Long getFrozenStart() {
        return frozenStart;
    }

    public void setFrozenStart(Long frozenStart) {
        this.frozenStart = frozenStart;
    }

    public Long getFrozenEnd() {
        return frozenEnd;
    }

    public void setFrozenEnd(Long frozenEnd) {
        this.frozenEnd = frozenEnd;
    }
}