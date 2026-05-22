package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbPolicyRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 对应所在BLB下监听器端口号
    */
    private Integer listenerPort;

    /**
    * 监听器绑定策略列表，当监听器类型为TCP、UDP、SSL时，只能创建一条且只支持全匹配；当监听器类型为http、https监听器支持多个policy
    */
    private List<CreateAppPolicy> appPolicyVos;

    /**
    * 当监听器端口下有多个协议时，type必传
    */
    private String type;

    public String getBlbId() {
        return blbId;
    }

    public CreateAppBlbPolicyRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateAppBlbPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getListenerPort() {
        return listenerPort;
    }

    public CreateAppBlbPolicyRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }

    public List<CreateAppPolicy> getAppPolicyVos() {
        return appPolicyVos;
    }

    public CreateAppBlbPolicyRequest setAppPolicyVos(List<CreateAppPolicy> appPolicyVos) {
        this.appPolicyVos = appPolicyVos;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateAppBlbPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }

}
