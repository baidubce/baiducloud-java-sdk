package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPriceForCreateInstanceRequest extends BaseBceRequest {

    /**
    * 引擎类型。默认值为2。取值范围如下： <br>  Redis内存型: 2 <br>  Reids 容量型: 3
    */
    private Integer engine;

    /**
    * 集群类型。默认值为master_slave。取值范围如下：<br>  Redis内存型标准版：master_slave<br>  Redis内存型集群版：cluster<br>  Redis容量型（Pegadb）集群版：cluster<br> Memcache: default
    */
    private String clusterType;

    /**
    * 实例规格。<br>Redis内存型和Redis容量型时为必填项。具体规格通过   [获取实例规格列表](https://cloud.baidu.com/doc/SCS/s/ikhvw6dqg)接口获取。<br>Memcache时为非必填项，此参数无效。
    */
    private String nodeType;

    /**
    * Memcache的节点规格。单位GB。<br>取值范围：1、2、4、8、16、32、64。
    */
    private Integer cacheInstanceType;

    /**
    * 分片个数，默认为1
    */
    private Integer shardNum;

    /**
    * 副本数量。默认值为1。取值范围1-10。<br>Redis内存型和Redis容量型时有效。<br>Memcache时无效。
    */
    private Integer replicationNum;

    /**
    * 购买数量，默认为1
    */
    private Integer instanceNum;

    /**
    * 存储磁盘类型，购买Reids 容量型(原 PegaDB)时有效 。默认值为cloud_hp1。
    */
    private String diskType;

    /**
    * 单分片存储磁盘容量大小，购买Reids 容量型(原 PegaDB)时为必填项。
    */
    private Integer diskFlavor;

    /**
    * 计费类型。默认为按量付费postpay。取值范围如下：<br>包年包月：prepay。<br> 按量付费：postpay。
    */
    private String chargeType;

    /**
    * 计费周期。计费类型为包年包月时必填，单位为月，默认为1
    */
    private Integer period;

    /**
    * 计费单位。包年包月时默认值为MONTH；按量付费时默认值为MINUTE。取值范围如下，区分大小写：<br>  年：YEAR<br> 月：MONTH<br> 日：DAY<br>小时：HOUR。仅按量付费支持此项。<br>分钟：MINUTE。仅按量付费支持此项。
    */
    private String timeUnit;

    public Integer getEngine() {
        return engine;
    }

    public GetPriceForCreateInstanceRequest setEngine(Integer engine) {
        this.engine = engine;
        return this;
    }

    public String getClusterType() {
        return clusterType;
    }

    public GetPriceForCreateInstanceRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public GetPriceForCreateInstanceRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public Integer getCacheInstanceType() {
        return cacheInstanceType;
    }

    public GetPriceForCreateInstanceRequest setCacheInstanceType(Integer cacheInstanceType) {
        this.cacheInstanceType = cacheInstanceType;
        return this;
    }

    public Integer getShardNum() {
        return shardNum;
    }

    public GetPriceForCreateInstanceRequest setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public Integer getReplicationNum() {
        return replicationNum;
    }

    public GetPriceForCreateInstanceRequest setReplicationNum(Integer replicationNum) {
        this.replicationNum = replicationNum;
        return this;
    }

    public Integer getInstanceNum() {
        return instanceNum;
    }

    public GetPriceForCreateInstanceRequest setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    public String getDiskType() {
        return diskType;
    }

    public GetPriceForCreateInstanceRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    public Integer getDiskFlavor() {
        return diskFlavor;
    }

    public GetPriceForCreateInstanceRequest setDiskFlavor(Integer diskFlavor) {
        this.diskFlavor = diskFlavor;
        return this;
    }

    public String getChargeType() {
        return chargeType;
    }

    public GetPriceForCreateInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    public Integer getPeriod() {
        return period;
    }

    public GetPriceForCreateInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public GetPriceForCreateInstanceRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

}
