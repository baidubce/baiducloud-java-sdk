package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAppBlbPolicyRequest extends BaseBceRequest {

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
    * 要删除策略前端端口
    */
    private Integer port;

    /**
    * 所有待释放的策略标识符，一起组成一个数组
    */
    private List<String> policyIdList;

    /**
    * 当监听器端口下有多个协议时，type必传
    */
    private String type;

    public String getBlbId() {
        return blbId;
    }

    public DeleteAppBlbPolicyRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAppBlbPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public DeleteAppBlbPolicyRequest setPort(Integer port) {
        this.port = port;
        return this;
    }

    public List<String> getPolicyIdList() {
        return policyIdList;
    }

    public DeleteAppBlbPolicyRequest setPolicyIdList(List<String> policyIdList) {
        this.policyIdList = policyIdList;
        return this;
    }

    public String getType() {
        return type;
    }

    public DeleteAppBlbPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }

}
