package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListL2BucketLinkRequest extends BaseBceRequest {

    /**
    * PFS实例ID
    */
    private String instanceId;

    /**
    * 返回bucketlink列表长度，默认为20个，取值范围为【1，20】，超过范围的规整为1或20
    */
    private Integer maxKeys;

    /**
    * 请求的分段类型，必须指定marker
    */
    private String manner;

    /**
    * 按照bucketlinkId（格式一般为"dflow-xxxxxx"）的字典序排列，从marker之后的第一个开始返回（不包括marker）
    */
    private String marker;

    public String getInstanceId() {
        return instanceId;
    }

    public ListL2BucketLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getMaxKeys() {
        return maxKeys;
    }

    public ListL2BucketLinkRequest setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    public String getManner() {
        return manner;
    }

    public ListL2BucketLinkRequest setManner(String manner) {
        this.manner = manner;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public ListL2BucketLinkRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }

}
