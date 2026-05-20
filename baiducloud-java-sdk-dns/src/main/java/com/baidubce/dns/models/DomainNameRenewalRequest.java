package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DomainNameRenewalRequest extends BaseBceRequest {

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 计费信息。
    */
    private List<BillingForRenew> billing;

    public String getName() {
        return name;
    }

    public DomainNameRenewalRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getAction() {
        return action;
    }

    public DomainNameRenewalRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DomainNameRenewalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<BillingForRenew> getBilling() {
        return billing;
    }

    public DomainNameRenewalRequest setBilling(List<BillingForRenew> billing) {
        this.billing = billing;
        return this;
    }

}
