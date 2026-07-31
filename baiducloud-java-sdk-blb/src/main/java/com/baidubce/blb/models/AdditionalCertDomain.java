package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdditionalCertDomain {
    /**
     * 证书ID
     */
    private String certId;

    /**
     * 证书域名。若证书的产品类型为通配符域名版还支持通配符域名及其子域名
     */
    private String host;

    public AdditionalCertDomain setCertId(String certId) {
        this.certId = certId;
        return this;
    }

    public String getCertId() {
        return this.certId;
    }

    public AdditionalCertDomain setHost(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return this.host;
    }

    @Override
    public String toString() {
        return "AdditionalCertDomain{" + "certId=" + certId + "\n" + "host=" + host + "\n" + "}";
    }

}