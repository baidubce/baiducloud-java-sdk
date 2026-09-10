package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveTheNodeGroupNodeListV2Response extends BaseBceResponse {

    /**
    * page
    */
    private ListInstancesByInstanceGroupIDPage page;

    /**
    * 响应的请求的 ID
    */
    private String requestID;

    public ListInstancesByInstanceGroupIDPage getPage() {
        return page;
    }

    public RetrieveTheNodeGroupNodeListV2Response setPage(ListInstancesByInstanceGroupIDPage page) {
        this.page = page;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public RetrieveTheNodeGroupNodeListV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "RetrieveTheNodeGroupNodeListV2Response{" + "page=" + page + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
