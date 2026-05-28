package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpgradeZoneRequest extends BaseBceRequest {

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
    * 域名的名称。
    */
    private List<String> names;

    /**
    * billing
    */
    private Billing billing;

    public String getAction() {
        return action;
    }

    public UpgradeZoneRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpgradeZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getNames() {
        return names;
    }

    public UpgradeZoneRequest setNames(List<String> names) {
        this.names = names;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public UpgradeZoneRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
