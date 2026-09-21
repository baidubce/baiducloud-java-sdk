package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyInstanceConfigUsingPOSTRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    private String instanceId;

    /**
    * reason
    */
    private String reason;

    /**
    * userConfigs
    */
    private List<InstanceConfigUserConfig> userConfigs;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyInstanceConfigUsingPOSTRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public ModifyInstanceConfigUsingPOSTRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public List<InstanceConfigUserConfig> getUserConfigs() {
        return userConfigs;
    }

    public ModifyInstanceConfigUsingPOSTRequest setUserConfigs(List<InstanceConfigUserConfig> userConfigs) {
        this.userConfigs = userConfigs;
        return this;
    }

}
