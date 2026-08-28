package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankcardResult {
    /**
     * 银行卡卡号
     */
    @JsonProperty("bank_card_number")
    private String bankCardNumber;

    /**
     * 有效期
     */
    @JsonProperty("valid_date")
    private String validDate;

    /**
     * 银行卡类型
     */
    @JsonProperty("bank_card_type")
    private Integer bankCardType;

    /**
     * 银行名
     */
    @JsonProperty("bank_name")
    private String bankName;

    /**
     * 持卡人姓名
     */
    @JsonProperty("holder_name")
    private String holderName;

    /**
     * bankCardNumberLocation
     */
    @JsonProperty("bank_card_number_location")
    private BankCardNumberLocation bankCardNumberLocation;

    /**
     * cardQuality
     */
    @JsonProperty("card_quality")
    private CardQuality cardQuality;

    public BankcardResult setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
        return this;
    }

    public String getBankCardNumber() {
        return this.bankCardNumber;
    }

    public BankcardResult setValidDate(String validDate) {
        this.validDate = validDate;
        return this;
    }

    public String getValidDate() {
        return this.validDate;
    }

    public BankcardResult setBankCardType(Integer bankCardType) {
        this.bankCardType = bankCardType;
        return this;
    }

    public Integer getBankCardType() {
        return this.bankCardType;
    }

    public BankcardResult setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public String getBankName() {
        return this.bankName;
    }

    public BankcardResult setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public BankcardResult setBankCardNumberLocation(BankCardNumberLocation bankCardNumberLocation) {
        this.bankCardNumberLocation = bankCardNumberLocation;
        return this;
    }

    public BankCardNumberLocation getBankCardNumberLocation() {
        return this.bankCardNumberLocation;
    }

    public BankcardResult setCardQuality(CardQuality cardQuality) {
        this.cardQuality = cardQuality;
        return this;
    }

    public CardQuality getCardQuality() {
        return this.cardQuality;
    }

    @Override
    public String toString() {
        return "BankcardResult{" + "bankCardNumber=" + bankCardNumber + "\n" + "validDate=" + validDate + "\n" + "bankCardType=" + bankCardType + "\n" + "bankName=" + bankName
                + "\n" + "holderName=" + holderName + "\n" + "bankCardNumberLocation=" + bankCardNumberLocation + "\n" + "cardQuality=" + cardQuality + "\n" + "}";
    }

}