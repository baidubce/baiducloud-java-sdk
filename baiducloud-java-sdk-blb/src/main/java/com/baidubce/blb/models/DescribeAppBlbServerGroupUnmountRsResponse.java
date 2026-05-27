package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeAppBlbServerGroupUnmountRsResponse extends BaseBceResponse {

    /**
    * 包含查询结果的列表
    */
    private List<AppBackendServer> backendServerList;

    public List<AppBackendServer> getBackendServerList() {
        return backendServerList;
    }

    public DescribeAppBlbServerGroupUnmountRsResponse setBackendServerList(List<AppBackendServer> backendServerList) {
        this.backendServerList = backendServerList;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeAppBlbServerGroupUnmountRsResponse{" + "backendServerList=" + backendServerList + "\n" + "}";
    }

}
