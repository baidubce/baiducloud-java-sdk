package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpgradeTheFreeDomainNameToTheUniversalVersionRequest extends BaseBceRequest {

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
    * 计费信息。
    */
    private List<Billing> billing;

    public String getAction() {
        return action;
    }

    public UpgradeTheFreeDomainNameToTheUniversalVersionRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpgradeTheFreeDomainNameToTheUniversalVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getNames() {
        return names;
    }

    public UpgradeTheFreeDomainNameToTheUniversalVersionRequest setNames(List<String> names) {
        this.names = names;
        return this;
    }

    public List<Billing> getBilling() {
        return billing;
    }

    public UpgradeTheFreeDomainNameToTheUniversalVersionRequest setBilling(List<Billing> billing) {
        this.billing = billing;
        return this;
    }

}
