package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceDomainUsingPOSTRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * domain
    */
    private String domain;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstanceDomainUsingPOSTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public UpdateInstanceDomainUsingPOSTRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public UpdateInstanceDomainUsingPOSTRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }

}
