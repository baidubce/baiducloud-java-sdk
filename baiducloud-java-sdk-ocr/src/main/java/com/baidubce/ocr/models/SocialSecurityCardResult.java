package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SocialSecurityCardResult {
    /**
     * cardNumber
     */
    @JsonProperty("card_number")
    private SocialSecurityCardField cardNumber;

    /**
     * name
     */
    private SocialSecurityCardField name;

    /**
     * sex
     */
    private SocialSecurityCardField sex;

    /**
     * birthDate
     */
    @JsonProperty("birth_date")
    private SocialSecurityCardField birthDate;

    /**
     * socialSecurityNumber
     */
    @JsonProperty("social_security_number")
    private SocialSecurityCardField socialSecurityNumber;

    /**
     * issueDate
     */
    @JsonProperty("issue_date")
    private SocialSecurityCardField issueDate;

    /**
     * bankCardNumber
     */
    @JsonProperty("bank_card_number")
    private SocialSecurityCardField bankCardNumber;

    /**
     * expiryDate
     */
    @JsonProperty("expiry_date")
    private SocialSecurityCardField expiryDate;

    public SocialSecurityCardResult setCardNumber(SocialSecurityCardField cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public SocialSecurityCardField getCardNumber() {
        return this.cardNumber;
    }

    public SocialSecurityCardResult setName(SocialSecurityCardField name) {
        this.name = name;
        return this;
    }

    public SocialSecurityCardField getName() {
        return this.name;
    }

    public SocialSecurityCardResult setSex(SocialSecurityCardField sex) {
        this.sex = sex;
        return this;
    }

    public SocialSecurityCardField getSex() {
        return this.sex;
    }

    public SocialSecurityCardResult setBirthDate(SocialSecurityCardField birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public SocialSecurityCardField getBirthDate() {
        return this.birthDate;
    }

    public SocialSecurityCardResult setSocialSecurityNumber(SocialSecurityCardField socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    public SocialSecurityCardField getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public SocialSecurityCardResult setIssueDate(SocialSecurityCardField issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public SocialSecurityCardField getIssueDate() {
        return this.issueDate;
    }

    public SocialSecurityCardResult setBankCardNumber(SocialSecurityCardField bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
        return this;
    }

    public SocialSecurityCardField getBankCardNumber() {
        return this.bankCardNumber;
    }

    public SocialSecurityCardResult setExpiryDate(SocialSecurityCardField expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    public SocialSecurityCardField getExpiryDate() {
        return this.expiryDate;
    }

    @Override
    public String toString() {
        return "SocialSecurityCardResult{" + "cardNumber=" + cardNumber + "\n" + "name=" + name + "\n" + "sex=" + sex + "\n" + "birthDate=" + birthDate + "\n"
                + "socialSecurityNumber=" + socialSecurityNumber + "\n" + "issueDate=" + issueDate + "\n" + "bankCardNumber=" + bankCardNumber + "\n" + "expiryDate=" + expiryDate
                + "\n" + "}";
    }

}