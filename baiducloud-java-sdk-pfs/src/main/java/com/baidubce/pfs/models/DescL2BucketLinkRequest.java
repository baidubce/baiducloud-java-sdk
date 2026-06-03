package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescL2BucketLinkRequest extends BaseBceRequest {

    /**
    * 数据流动所属PFS实例Id
    */
    private String instanceId;

    /**
    * 数据流动ID
    */
    private String bucketLinkId;

    public String getInstanceId() {
        return instanceId;
    }

    public DescL2BucketLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBucketLinkId() {
        return bucketLinkId;
    }

    public DescL2BucketLinkRequest setBucketLinkId(String bucketLinkId) {
        this.bucketLinkId = bucketLinkId;
        return this;
    }

}
