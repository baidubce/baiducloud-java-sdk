package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetZoneBySpecRequest extends BaseBceRequest {

    /**
    * instanceType
    */
    @JsonIgnore
    private String instanceType;

    /**
    * productType
    */
    @JsonIgnore
    private String productType;

    /**
    * spec
    */
    @JsonIgnore
    private String spec;

    /**
    * specId
    */
    @JsonIgnore
    private String specId;

    public String getInstanceType() {
        return instanceType;
    }

    public GetZoneBySpecRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getProductType() {
        return productType;
    }

    public GetZoneBySpecRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public GetZoneBySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpecId() {
        return specId;
    }

    public GetZoneBySpecRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

}
