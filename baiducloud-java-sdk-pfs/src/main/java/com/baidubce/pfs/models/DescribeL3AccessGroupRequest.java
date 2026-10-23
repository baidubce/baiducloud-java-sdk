package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeL3AccessGroupRequest extends BaseBceRequest {

    /**
    * 权限组名称
    */
    private String accessGroupName;

    /**
    * 权限组所属的可用区
    */
    private String zoneName;

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public DescribeL3AccessGroupRequest setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public DescribeL3AccessGroupRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

}
