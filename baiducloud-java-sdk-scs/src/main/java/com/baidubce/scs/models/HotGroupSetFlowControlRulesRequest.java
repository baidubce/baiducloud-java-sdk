package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupSetFlowControlRulesRequest extends BaseBceRequest {

    /**
    * groupId
    */
    @JsonIgnore
    private String groupId;

    /**
    * 集群ID
    */
    private String clusterShowId;

    /**
    * 写流量限制。（读写流量限制至少传一个）
    */
    private Integer qpsWrite;

    /**
    * 读流量限制。（读写流量限制至少传一个）
    */
    private Integer qpsRead;

    public String getGroupId() {
        return groupId;
    }

    public HotGroupSetFlowControlRulesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getClusterShowId() {
        return clusterShowId;
    }

    public HotGroupSetFlowControlRulesRequest setClusterShowId(String clusterShowId) {
        this.clusterShowId = clusterShowId;
        return this;
    }

    public Integer getQpsWrite() {
        return qpsWrite;
    }

    public HotGroupSetFlowControlRulesRequest setQpsWrite(Integer qpsWrite) {
        this.qpsWrite = qpsWrite;
        return this;
    }

    public Integer getQpsRead() {
        return qpsRead;
    }

    public HotGroupSetFlowControlRulesRequest setQpsRead(Integer qpsRead) {
        this.qpsRead = qpsRead;
        return this;
    }

}
