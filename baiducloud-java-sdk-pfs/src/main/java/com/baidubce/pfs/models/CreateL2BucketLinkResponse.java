package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateL2BucketLinkResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * 数据流动ID
    */
    private String bucketLinkId;

    public String getRequestId() {
        return requestId;
    }

    public CreateL2BucketLinkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getBucketLinkId() {
        return bucketLinkId;
    }

    public CreateL2BucketLinkResponse setBucketLinkId(String bucketLinkId) {
        this.bucketLinkId = bucketLinkId;
        return this;
    }

    @Override
    public String toString() {
        return "CreateL2BucketLinkResponse{" + "requestId=" + requestId + "\n" + "bucketLinkId=" + bucketLinkId + "\n" + "}";
    }

}
