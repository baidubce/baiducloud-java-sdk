package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL3AccessGroupResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回
    */
    private String requestId;

    /**
    * 创建出来的权限组名称
    */
    private String accessGroupName;

    public String getRequestId() {
        return requestId;
    }

    public CreateL3AccessGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public CreateL3AccessGroupResponse setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    @Override
    public String toString() {
        return "CreateL3AccessGroupResponse{" + "requestId=" + requestId + "\n" + "accessGroupName=" + accessGroupName + "\n" + "}";
    }

}
