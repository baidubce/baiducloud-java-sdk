package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTheListOfClusterNodeGroupsV2Response extends BaseBceResponse {

    /**
    * page
    */
    private ListInstanceGroupPage page;

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public ListInstanceGroupPage getPage() {
        return page;
    }

    public GetTheListOfClusterNodeGroupsV2Response setPage(ListInstanceGroupPage page) {
        this.page = page;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public GetTheListOfClusterNodeGroupsV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "GetTheListOfClusterNodeGroupsV2Response{" + "page=" + page + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
