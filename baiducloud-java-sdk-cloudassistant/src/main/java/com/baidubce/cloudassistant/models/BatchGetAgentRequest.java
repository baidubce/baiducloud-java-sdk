package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchGetAgentRequest extends BaseBceRequest {

    /**
    * 虚机列表
    */
    private List<Host> hosts;

    public List<Host> getHosts() {
        return hosts;
    }

    public BatchGetAgentRequest setHosts(List<Host> hosts) {
        this.hosts = hosts;
        return this;
    }

}
