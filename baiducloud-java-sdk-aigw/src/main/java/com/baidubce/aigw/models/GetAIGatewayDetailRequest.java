package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAIGatewayDetailRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * srcProduct
    */
    @JsonIgnore
    private String srcProduct;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    public String getInstanceId() {
        return instanceId;
    }

    public GetAIGatewayDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getSrcProduct() {
        return srcProduct;
    }

    public GetAIGatewayDetailRequest setSrcProduct(String srcProduct) {
        this.srcProduct = srcProduct;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public GetAIGatewayDetailRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

}
