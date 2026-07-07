package com.baidubce.agentidentity.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchAcquisitionOfUsersRequest extends BaseBceRequest {

    /**
    * 用户池 ID
    */
    private String userPoolId;

    /**
    * 用户 ID 列表，最多 100 个
    */
    private List<String> ids;

    public String getUserPoolId() {
        return userPoolId;
    }

    public BatchAcquisitionOfUsersRequest setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    public List<String> getIds() {
        return ids;
    }

    public BatchAcquisitionOfUsersRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

}
