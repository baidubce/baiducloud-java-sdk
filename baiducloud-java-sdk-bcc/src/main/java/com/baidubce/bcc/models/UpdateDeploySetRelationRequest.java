package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDeploySetRelationRequest extends BaseBceRequest {

    /**
    * 实例id
    */
    private String instanceId;

    /**
    * 要加入的部署集id列表
    */
    private List<String> deploysetIdList;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateDeploySetRelationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getDeploysetIdList() {
        return deploysetIdList;
    }

    public UpdateDeploySetRelationRequest setDeploysetIdList(List<String> deploysetIdList) {
        this.deploysetIdList = deploysetIdList;
        return this;
    }

}
