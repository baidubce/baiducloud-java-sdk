package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryApikeyDetailsPermanentlyValidRequest extends BaseBceRequest {

    /**
    * 子用户Id；如果apikey归属其他子用户则必填
    */
    private String userId;

    /**
    * APIKey ID
    */
    private String id;

    public String getUserId() {
        return userId;
    }

    public QueryApikeyDetailsPermanentlyValidRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getId() {
        return id;
    }

    public QueryApikeyDetailsPermanentlyValidRequest setId(String id) {
        this.id = id;
        return this;
    }

}
