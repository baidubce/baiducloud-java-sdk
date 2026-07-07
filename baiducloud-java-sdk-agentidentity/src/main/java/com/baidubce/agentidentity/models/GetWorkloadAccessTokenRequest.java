package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetWorkloadAccessTokenRequest extends BaseBceRequest {

    /**
    * BCE 用户 ID（服务号调用时必填，用户身份调用不传，系统自动解析覆盖）
    */
    private String bceUserId;

    /**
    * （二选一，优先使用）Agent ID，优先使用 ID，存在则不看 name
    */
    private String agentId;

    /**
    * （二选一）Agent 名称
    */
    private String agentName;

    /**
    * 有效期（秒），默认 3600，最小 900，最大 86400
    */
    private Integer durationSeconds;

    public String getBceUserId() {
        return bceUserId;
    }

    public GetWorkloadAccessTokenRequest setBceUserId(String bceUserId) {
        this.bceUserId = bceUserId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public GetWorkloadAccessTokenRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getAgentName() {
        return agentName;
    }

    public GetWorkloadAccessTokenRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public GetWorkloadAccessTokenRequest setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

}
