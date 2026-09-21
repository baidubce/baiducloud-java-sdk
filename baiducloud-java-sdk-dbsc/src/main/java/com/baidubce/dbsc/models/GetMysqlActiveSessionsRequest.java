package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlActiveSessionsRequest extends BaseBceRequest {

    /**
    * appId
    */
    @JsonIgnore
    private String appId;

    public String getAppId() {
        return appId;
    }

    public GetMysqlActiveSessionsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

}
