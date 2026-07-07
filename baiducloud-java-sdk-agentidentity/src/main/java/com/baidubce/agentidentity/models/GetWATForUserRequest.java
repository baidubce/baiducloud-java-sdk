package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetWATForUserRequest extends BaseBceRequest {

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
    * 终端用户 ID
    */
    private String userId;

    /**
    * 会话 ID，用于关联用户会话
    */
    private String sessionId;

    /**
    * 有效期（秒），默认 3600，最小 900，最大 86400
    */
    private Integer durationSeconds;

    public String getBceUserId() {
        return bceUserId;
    }

    public GetWATForUserRequest setBceUserId(String bceUserId) {
        this.bceUserId = bceUserId;
        return this;
    }

    public String getAgentId() {
        return agentId;
    }

    public GetWATForUserRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getAgentName() {
        return agentName;
    }

    public GetWATForUserRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public GetWATForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getSessionId() {
        return sessionId;
    }

    public GetWATForUserRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public GetWATForUserRequest setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

}
