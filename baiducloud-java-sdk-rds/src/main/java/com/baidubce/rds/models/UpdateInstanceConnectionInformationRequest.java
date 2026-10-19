package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateInstanceConnectionInformationRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 域名前缀。域名前缀 由小写字母和数字组 成，以小写字母开头 ，长度在3-30之间
    */
    private String address;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateInstanceConnectionInformationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UpdateInstanceConnectionInformationRequest setAddress(String address) {
        this.address = address;
        return this;
    }

}
