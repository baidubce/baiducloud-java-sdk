package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteInstanceDeploySetRequest extends BaseBceRequest {

    /**
    * 部署集id
    */
    private String deployId;

    /**
    * 实例id数组
    */
    private List<String> instanceIdList;

    public String getDeployId() {
        return deployId;
    }

    public DeleteInstanceDeploySetRequest setDeployId(String deployId) {
        this.deployId = deployId;
        return this;
    }

    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public DeleteInstanceDeploySetRequest setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

}
