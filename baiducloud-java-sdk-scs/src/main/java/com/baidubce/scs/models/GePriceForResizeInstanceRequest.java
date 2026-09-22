package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GePriceForResizeInstanceRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 节点规格，Redis内存型和Redis容量型此字段有效。<br>具体规格通过 [获取实例规格列表](https://cloud.baidu.com/doc/SCS/s/ikhvw6dqg)接口获取。
    */
    private String nodeType;

    /**
    * 分片个数，默认为1
    */
    private Integer shardNum;

    /**
    * 副本数量，默认为1。<br/>Redis内存型和Redis容量型此字段有效。
    */
    private Integer replicationNum;

    /**
    * 单分片容量，单位GB。<br/>  Redis容量型此字段有效。
    */
    private Integer diskFlavor;

    /**
    * 计费类型。预付费prepay/后付费postpay,计费类型需与原实例相同
    */
    private String chargeType;

    /**
    * 计费周期。计费类型为预付费必填,单位为月
    */
    private Integer period;

    /**
    * 变更类型。<br/>modifyType：Redis标准版变配为集群版时的询价标识，此时为必填字段。
    */
    private String changeType;

    public String getClientToken() {
        return clientToken;
    }

    public GePriceForResizeInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public GePriceForResizeInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public GePriceForResizeInstanceRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public Integer getShardNum() {
        return shardNum;
    }

    public GePriceForResizeInstanceRequest setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public Integer getReplicationNum() {
        return replicationNum;
    }

    public GePriceForResizeInstanceRequest setReplicationNum(Integer replicationNum) {
        this.replicationNum = replicationNum;
        return this;
    }

    public Integer getDiskFlavor() {
        return diskFlavor;
    }

    public GePriceForResizeInstanceRequest setDiskFlavor(Integer diskFlavor) {
        this.diskFlavor = diskFlavor;
        return this;
    }

    public String getChargeType() {
        return chargeType;
    }

    public GePriceForResizeInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    public Integer getPeriod() {
        return period;
    }

    public GePriceForResizeInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public String getChangeType() {
        return changeType;
    }

    public GePriceForResizeInstanceRequest setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

}
