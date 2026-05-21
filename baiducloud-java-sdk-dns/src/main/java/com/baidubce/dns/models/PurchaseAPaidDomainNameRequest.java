package com.baidubce.dns.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseAPaidDomainNameRequest extends BaseBceRequest {

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
    * 购买的产品版本，包含：普惠版（“discount”）、企业版（“flagship”）。
    */
    private String productVersion;

    /**
    * 计费信息。
    */
    private Billing billing;

    public String getClientToken() {
        return clientToken;
    }

    public PurchaseAPaidDomainNameRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<String> getNames() {
        return names;
    }

    public PurchaseAPaidDomainNameRequest setNames(List<String> names) {
        this.names = names;
        return this;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public PurchaseAPaidDomainNameRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public PurchaseAPaidDomainNameRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

}
