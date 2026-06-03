package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PauseL2BucketLinkRequest extends BaseBceRequest {

    /**
    * 数据流动所属PFS实例ID
    */
    private String instanceId;

    /**
    * 需要暂停的数据流动ID
    */
    private String bucketLinkId;

    public String getInstanceId() {
        return instanceId;
    }

    public PauseL2BucketLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBucketLinkId() {
        return bucketLinkId;
    }

    public PauseL2BucketLinkRequest setBucketLinkId(String bucketLinkId) {
        this.bucketLinkId = bucketLinkId;
        return this;
    }

}
