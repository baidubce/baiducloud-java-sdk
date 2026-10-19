package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObtainThePriceDifferenceOfPrepaidTransformerRequest extends BaseBceRequest {

    /**
    * 实例 ID。
    */
    private String instanceId;

    /**
    * CPU 个数。
    */
    private Integer cpuCount;

    /**
    * 内存大小，单位是 MB。
    */
    private Integer allocatedMemoryInGB;

    /**
    * 存储大小，单位是 GB。
    */
    private Integer allocatedStorageInGB;

    /**
    * 存储磁盘包括本地SSD磁盘（取值为：normal\_io）、增强型SSD云磁盘（取值为：cloud\_enha）、 高性能云磁盘（取值为：cloud\_high）、cloud\_nor（取值为: 通用型SSD）四种。
    */
    private String diskIoType;

    /**
    * 不传值的话默认为双机版，传 Singleton 则指定为单机版。
    */
    private String category;

    public String getInstanceId() {
        return instanceId;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getCpuCount() {
        return cpuCount;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public Integer getAllocatedMemoryInGB() {
        return allocatedMemoryInGB;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerRequest setAllocatedMemoryInGB(Integer allocatedMemoryInGB) {
        this.allocatedMemoryInGB = allocatedMemoryInGB;
        return this;
    }

    public Integer getAllocatedStorageInGB() {
        return allocatedStorageInGB;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerRequest setAllocatedStorageInGB(Integer allocatedStorageInGB) {
        this.allocatedStorageInGB = allocatedStorageInGB;
        return this;
    }

    public String getDiskIoType() {
        return diskIoType;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerRequest setDiskIoType(String diskIoType) {
        this.diskIoType = diskIoType;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public ObtainThePriceDifferenceOfPrepaidTransformerRequest setCategory(String category) {
        this.category = category;
        return this;
    }

}
