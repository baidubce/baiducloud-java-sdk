package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelL2BucketLinkRequest extends BaseBceRequest {

    /**
    * 需要取消的数据流动ID
    */
    private String bucketLinkId;

    /**
    * 取消数据流动任务所属PFS实例ID
    */
    private String instanceId;

    public String getBucketLinkId() {
        return bucketLinkId;
    }

    public CancelL2BucketLinkRequest setBucketLinkId(String bucketLinkId) {
        this.bucketLinkId = bucketLinkId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CancelL2BucketLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

}
