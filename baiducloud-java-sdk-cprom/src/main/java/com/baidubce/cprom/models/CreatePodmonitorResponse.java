package com.baidubce.cprom.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePodmonitorResponse extends BaseBceResponse {

    /**
    * Pod Monitor名称
    */
    private String podMonitorName;

    public String getPodMonitorName() {
        return podMonitorName;
    }

    public CreatePodmonitorResponse setPodMonitorName(String podMonitorName) {
        this.podMonitorName = podMonitorName;
        return this;
    }

    @Override
    public String toString() {
        return "CreatePodmonitorResponse{" + "podMonitorName=" + podMonitorName + "\n" + "}";
    }

}
