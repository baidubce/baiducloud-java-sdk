package com.baidubce.as.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdjustNumV2Request extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * adjustNode
    */
    @JsonIgnore
    private String adjustNode;

    /**
    * 期望调整到的节点数
    */
    private Integer adjustNum;

    public String getGroupId() {
        return groupId;
    }

    public AdjustNumV2Request setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getAdjustNode() {
        return adjustNode;
    }

    public AdjustNumV2Request setAdjustNode(String adjustNode) {
        this.adjustNode = adjustNode;
        return this;
    }

    public Integer getAdjustNum() {
        return adjustNum;
    }

    public AdjustNumV2Request setAdjustNum(Integer adjustNum) {
        this.adjustNum = adjustNum;
        return this;
    }

}
