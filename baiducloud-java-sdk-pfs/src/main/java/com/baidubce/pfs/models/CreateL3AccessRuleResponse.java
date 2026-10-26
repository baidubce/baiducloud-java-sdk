package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL3AccessRuleResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回
    */
    private String requestId;

    /**
    * 单条创建成功时返回的规则 ID
    */
    private Integer accessRuleId;

    /**
    * 批量创建时的逐条结果
    */
    private List<CreateAccessRuleResult> responses;

    public String getRequestId() {
        return requestId;
    }

    public CreateL3AccessRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public Integer getAccessRuleId() {
        return accessRuleId;
    }

    public CreateL3AccessRuleResponse setAccessRuleId(Integer accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }

    public List<CreateAccessRuleResult> getResponses() {
        return responses;
    }

    public CreateL3AccessRuleResponse setResponses(List<CreateAccessRuleResult> responses) {
        this.responses = responses;
        return this;
    }

    @Override
    public String toString() {
        return "CreateL3AccessRuleResponse{" + "requestId=" + requestId + "\n" + "accessRuleId=" + accessRuleId + "\n" + "responses=" + responses + "\n" + "}";
    }

}
