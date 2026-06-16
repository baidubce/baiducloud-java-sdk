package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletesInstanceDeploySetRequest extends BaseBceRequest {

    /**
    * 部署集ID
    */
    private String deployId;

    /**
    * 实例ID列表
    */
    private List<String> instanceIdList;

    public String getDeployId() {
        return deployId;
    }

    public DeletesInstanceDeploySetRequest setDeployId(String deployId) {
        this.deployId = deployId;
        return this;
    }

    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public DeletesInstanceDeploySetRequest setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

}
