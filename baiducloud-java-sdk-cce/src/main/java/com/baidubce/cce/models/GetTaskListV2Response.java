package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskListV2Response extends BaseBceResponse {

    /**
    * page
    */
    private ListTaskPage page;

    /**
    * 请求 ID, 问题定位提供该 ID
    */
    private String requestID;

    public ListTaskPage getPage() {
        return page;
    }

    public GetTaskListV2Response setPage(ListTaskPage page) {
        this.page = page;
        return this;
    }

    public String getRequestID() {
        return requestID;
    }

    public GetTaskListV2Response setRequestID(String requestID) {
        this.requestID = requestID;
        return this;
    }

    @Override
    public String toString() {
        return "GetTaskListV2Response{" + "page=" + page + "\n" + "requestID=" + requestID + "\n" + "}";
    }

}
