package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestTriggerTargetAddressRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 目标URL
    */
    private String address;

    /**
    * header key仅支持“Authorization”
    */
    private Map<String, String> headers;

    public String getInstanceId() {
        return instanceId;
    }

    public TestTriggerTargetAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public TestTriggerTargetAddressRequest setAddress(String address) {
        this.address = address;
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public TestTriggerTargetAddressRequest setHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

}
