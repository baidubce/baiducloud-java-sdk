package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListStrategiesRequest extends BaseBceRequest {

    /**
    * policyType
    */
    @JsonIgnore
    private String policyType;

    /**
    * nameFilter
    */
    @JsonIgnore
    private String nameFilter;

    public String getPolicyType() {
        return policyType;
    }

    public ListStrategiesRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    public String getNameFilter() {
        return nameFilter;
    }

    public ListStrategiesRequest setNameFilter(String nameFilter) {
        this.nameFilter = nameFilter;
        return this;
    }

}
