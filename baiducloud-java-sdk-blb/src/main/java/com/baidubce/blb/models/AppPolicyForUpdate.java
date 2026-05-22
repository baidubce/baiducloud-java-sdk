package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppPolicyForUpdate {
    /**
     * 转发策略id。
     */
    private String policyId;

    /**
     * 优先级，取值范围1-32768，且不能与已有条目重复。数值越小，优先级越高，规则匹配顺序为按优先级由高到低匹配。priority和description不能同时为空。
     */
    private Integer priority;

    /**
     * 描述信息。最大200字符。priority和description不能同时为空。
     */
    private String description;

    public AppPolicyForUpdate setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return this.policyId;
    }

    public AppPolicyForUpdate setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public AppPolicyForUpdate setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "AppPolicyForUpdate{" + "policyId=" + policyId + "\n" + "priority=" + priority + "\n" + "description=" + description + "\n" + "}";
    }

}