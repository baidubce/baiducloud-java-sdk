package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAutomaticStorageExpansionConfigurationRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * action
    */
    @JsonIgnore
    private String action;

    /**
    * 可用空间阈值, 单位%。当action为open时，为必传参数，仅允许实例在启用存储自动扩容时修改
    */
    private Integer freeSpaceThreshold;

    /**
    * 自动扩容磁盘的上限，单位GB。当action为open时，为必传参数，仅允许实例在启用存储自动扩容时修改。参数校验：必须为5的整倍数，必须大于实例当前磁盘quto，必须小于等于该实例变配时的磁盘上限
    */
    private Integer diskMaxLimit;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateAutomaticStorageExpansionConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getAction() {
        return action;
    }

    public UpdateAutomaticStorageExpansionConfigurationRequest setAction(String action) {
        this.action = action;
        return this;
    }

    public Integer getFreeSpaceThreshold() {
        return freeSpaceThreshold;
    }

    public UpdateAutomaticStorageExpansionConfigurationRequest setFreeSpaceThreshold(Integer freeSpaceThreshold) {
        this.freeSpaceThreshold = freeSpaceThreshold;
        return this;
    }

    public Integer getDiskMaxLimit() {
        return diskMaxLimit;
    }

    public UpdateAutomaticStorageExpansionConfigurationRequest setDiskMaxLimit(Integer diskMaxLimit) {
        this.diskMaxLimit = diskMaxLimit;
        return this;
    }

}
