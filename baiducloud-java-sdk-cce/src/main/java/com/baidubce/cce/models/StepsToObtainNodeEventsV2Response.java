package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StepsToObtainNodeEventsV2Response extends BaseBceResponse {

    /**
    * 事件类型
    */
    private String status;

    /**
    * 集群操作步骤
    */
    private List<Step> steps;

    /**
    * 请求ID
    */
    private String requestID;

    public String getStatus() {
        return status;
    }

    public StepsToObtainNodeEventsV2Response setStatus(String status) {
        this.status = status;
        return this;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public StepsToObtainNodeEventsV2Response setSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public StepsToObtainNodeEventsV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "StepsToObtainNodeEventsV2Response{" + "status=" + status + "\n" + "steps=" + steps + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
