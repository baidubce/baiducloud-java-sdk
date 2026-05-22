package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbPolicyRequest extends BaseBceRequest {

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
    * 监听端口
    */
    private Integer port;

    /**
    * 监听的端口所使用的协议
    */
    private String type;

    /**
    * 要修改的监听策略列表
    */
    private List<AppPolicyForUpdate> policyList;

    public String getBlbId() {
        return blbId;
    }

    public UpdateAppBlbPolicyRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public UpdateAppBlbPolicyRequest setPort(Integer port) {
        this.port = port;
        return this;
    }

    public String getType() {
        return type;
    }

    public UpdateAppBlbPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }

    public List<AppPolicyForUpdate> getPolicyList() {
        return policyList;
    }

    public UpdateAppBlbPolicyRequest setPolicyList(List<AppPolicyForUpdate> policyList) {
        this.policyList = policyList;
        return this;
    }

}
