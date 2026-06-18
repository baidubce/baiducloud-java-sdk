package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryTheLastUsageTimeOfAccesskeyResponse extends BaseBceResponse {

    /**
    * 访问密钥id
    */
    private String accessKeyId;

    /**
    * 访问密钥id的上次使用时间
    */
    private String lastUsedTime;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public QueryTheLastUsageTimeOfAccesskeyResponse setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    public String getLastUsedTime() {
        return lastUsedTime;
    }

    public QueryTheLastUsageTimeOfAccesskeyResponse setLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }

    @Override
    public String toString() {
        return "QueryTheLastUsageTimeOfAccesskeyResponse{" + "accessKeyId=" + accessKeyId + "\n" + "lastUsedTime=" + lastUsedTime + "\n" + "}";
    }

}
