package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterTypeUpgradeRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 是否维护时间内执行。默认false。true：维护时间内执行；false：立即执行。
    */
    private Boolean isDefer;

    /**
    * 节点规格。<li>可以是新的规格，需要是Redis集群版的规格。<li>可以为空，默认为原实例规格，但是需要确保原实例规格为集群版的规格，否则执行失败。
    */
    private String nodeType;

    /**
    * 分片数量。<li>可以设置新的分片数量；<li>可以为空，默认为原实例分片数。
    */
    private Integer shardNum;

    /**
    * 副本信息。<li>不支持减少副本，可以新增。<li>可以设置新的副本信息，需全量的副本信息。<li>可以为空，默认为原实例副本数。
    */
    private List<ReplicationItem> replicationInfo;

    public String getInstanceId() {
        return instanceId;
    }

    public ClusterTypeUpgradeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getIsDefer() {
        return isDefer;
    }

    public ClusterTypeUpgradeRequest setIsDefer(Boolean isDefer) {
        this.isDefer = isDefer;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public ClusterTypeUpgradeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public Integer getShardNum() {
        return shardNum;
    }

    public ClusterTypeUpgradeRequest setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public List<ReplicationItem> getReplicationInfo() {
        return replicationInfo;
    }

    public ClusterTypeUpgradeRequest setReplicationInfo(List<ReplicationItem> replicationInfo) {
        this.replicationInfo = replicationInfo;
        return this;
    }

}
