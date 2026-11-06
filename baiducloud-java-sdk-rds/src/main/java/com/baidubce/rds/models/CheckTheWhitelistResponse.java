package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckTheWhitelistResponse extends BaseBceResponse {

    /**
    * 数据修改的版本号，如：\"v0\"。当前字段仅在 version 取值为1时返回
    */
    private String etag;

    /**
    * 白名单IP地址列表
    */
    private List<String> securityIps;

    /**
    * 当前字段为保留字段，固定取值 console。仅在version 取值为2时返回
    */
    private String securityIpGroup;

    /**
    * 白名单分组名称。仅在version 取值为2时返回
    */
    private String tag;

    public String getEtag() {
        return etag;
    }

    public CheckTheWhitelistResponse setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    public List<String> getSecurityIps() {
        return securityIps;
    }

    public CheckTheWhitelistResponse setSecurityIps(List<String> securityIps) {
        this.securityIps = securityIps;
        return this;
    }

    public String getSecurityIpGroup() {
        return securityIpGroup;
    }

    public CheckTheWhitelistResponse setSecurityIpGroup(String securityIpGroup) {
        this.securityIpGroup = securityIpGroup;
        return this;
    }

    public String getTag() {
        return tag;
    }

    public CheckTheWhitelistResponse setTag(String tag) {
        this.tag = tag;
        return this;
    }

    @Override
    public String toString() {
        return "CheckTheWhitelistResponse{" + "etag=" + etag + "\n" + "securityIps=" + securityIps + "\n" + "securityIpGroup=" + securityIpGroup + "\n" + "tag=" + tag + "\n"
                + "}";
    }

}
