package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenewTbspRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 续费周期（按月:1-9； 按年:1-3）
    */
    private Integer renewTime;

    /**
    * 续费周期单位（DAY/MONTH/YEAR)
    */
    private String renewTimeUnit;


    public String getId() {
        return id;
    }

    public RenewTbspRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public RenewTbspRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Integer getRenewTime() {
        return renewTime;
    }

    public RenewTbspRequest setRenewTime(Integer renewTime) {
        this.renewTime = renewTime;
        return this;
    }

    public String getRenewTimeUnit() {
        return renewTimeUnit;
    }

    public RenewTbspRequest setRenewTimeUnit(String renewTimeUnit) {
        this.renewTimeUnit = renewTimeUnit;
        return this;
    }


}
