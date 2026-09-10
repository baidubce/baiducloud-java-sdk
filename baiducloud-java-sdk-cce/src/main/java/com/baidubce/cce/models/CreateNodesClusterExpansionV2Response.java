package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateNodesClusterExpansionV2Response extends BaseBceResponse {

    /**
    * 新增节点的 ID 列表
    */
    private List<String> cceInstanceIDs;

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public List<String> getCceInstanceIDs() {
        return cceInstanceIDs;
    }

    public CreateNodesClusterExpansionV2Response setCceInstanceIDs(List<String> cceInstanceIDs) {
        this.cceInstanceIDs = cceInstanceIDs;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public CreateNodesClusterExpansionV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "CreateNodesClusterExpansionV2Response{" + "cceInstanceIDs=" + cceInstanceIDs + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
