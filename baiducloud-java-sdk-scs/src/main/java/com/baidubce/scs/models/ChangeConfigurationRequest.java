package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChangeConfigurationRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 引擎版本。例如redis 3.2/4.0/5.0/6.0 等
    */
    private String engineVersion;

    /**
    * 参见附录中[实例规格](https://cloud.baidu.com/doc/SCS/s/1jwvxtsh0#%E5%AE%9E%E4%BE%8B%E8%A7%84%E6%A0%BC)
    */
    private String nodeType;

    /**
    * 分片个数
    */
    private Integer shardNum;

    /**
    * 存储空间
    */
    private Integer diskFlavor;

    public String getInstanceId() {
        return instanceId;
    }

    public ChangeConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public ChangeConfigurationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public ChangeConfigurationRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public ChangeConfigurationRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public String getNodeType() {
        return nodeType;
    }

    public ChangeConfigurationRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public Integer getShardNum() {
        return shardNum;
    }

    public ChangeConfigurationRequest setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public Integer getDiskFlavor() {
        return diskFlavor;
    }

    public ChangeConfigurationRequest setDiskFlavor(Integer diskFlavor) {
        this.diskFlavor = diskFlavor;
        return this;
    }

}
