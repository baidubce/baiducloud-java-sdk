package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Receiver {
    /**
     * 用户/用户组ID
     */
    @JsonProperty("receivers.id")
    private String receiversId;

    /**
     * 主账户对应的domainId
     */
    @JsonProperty("receivers.domainId")
    private String receiversDomainId;

    /**
     * 用户/用户组名称
     */
    @JsonProperty("receivers.name")
    private String receiversName;

    /**
     * 用户配置的邮箱
     */
    @JsonProperty("receivers.email")
    private String receiversEmail;

    /**
     * 用户配置的电话号码
     */
    @JsonProperty("receivers.phone")
    private String receiversPhone;

    public Receiver setReceiversId(String receiversId) {
        this.receiversId = receiversId;
        return this;
    }

    public String getReceiversId() {
        return this.receiversId;
    }

    public Receiver setReceiversDomainId(String receiversDomainId) {
        this.receiversDomainId = receiversDomainId;
        return this;
    }

    public String getReceiversDomainId() {
        return this.receiversDomainId;
    }

    public Receiver setReceiversName(String receiversName) {
        this.receiversName = receiversName;
        return this;
    }

    public String getReceiversName() {
        return this.receiversName;
    }

    public Receiver setReceiversEmail(String receiversEmail) {
        this.receiversEmail = receiversEmail;
        return this;
    }

    public String getReceiversEmail() {
        return this.receiversEmail;
    }

    public Receiver setReceiversPhone(String receiversPhone) {
        this.receiversPhone = receiversPhone;
        return this;
    }

    public String getReceiversPhone() {
        return this.receiversPhone;
    }

    @Override
    public String toString() {
        return "Receiver{" + "receiversId=" + receiversId + "\n" + "receiversDomainId=" + receiversDomainId + "\n" + "receiversName=" + receiversName + "\n" + "receiversEmail="
                + receiversEmail + "\n" + "receiversPhone=" + receiversPhone + "\n" + "}";
    }

}