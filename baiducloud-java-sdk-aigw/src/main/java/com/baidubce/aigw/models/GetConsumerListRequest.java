package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetConsumerListRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * tagKey
    */
    @JsonIgnore
    private String tagKey;

    /**
    * tagValue
    */
    @JsonIgnore
    private String tagValue;

    public String getInstanceId() {
        return instanceId;
    }

    public GetConsumerListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public GetConsumerListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public GetConsumerListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getTagKey() {
        return tagKey;
    }

    public GetConsumerListRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    public String getTagValue() {
        return tagValue;
    }

    public GetConsumerListRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

}
