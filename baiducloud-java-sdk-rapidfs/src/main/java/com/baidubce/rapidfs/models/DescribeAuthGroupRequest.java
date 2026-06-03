package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAuthGroupRequest extends BaseBceRequest {

    /**
    * 待查询的 rapidFS 实例唯一 ID
    */
    private String instanceId;

    /**
    * 权限组id
    */
    private String authGroupId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescribeAuthGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAuthGroupId() {
        return authGroupId;
    }

    public DescribeAuthGroupRequest setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

}
