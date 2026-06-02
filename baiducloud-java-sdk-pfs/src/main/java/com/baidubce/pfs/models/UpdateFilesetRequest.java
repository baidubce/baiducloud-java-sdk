package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateFilesetRequest extends BaseBceRequest {

    /**
    * fileset所属的pfs实例短id
    */
    private String instanceId;

    /**
    * 更新fileset的 Id
    */
    private String filesetId;

    /**
    * 需要更新的fileset名称<br><li>不传该值表示不修改
    */
    private String filesetName;

    /**
    * 容量限制，单位GB<br><li>设置为0时表示不限制<br><li>不传该值表示不修改<br><li>如果设置该值，需满足以下条件：小于等于PFS实例容量
    */
    private Integer blockQuota;

    /**
    * 文件数限制<br><li>设置为0时表示不限制<br><li>不传该值表示不修改<br><li>如果设置该值，需满足以下条件（若设置文件数配额不在此范围，请提交工单）：1.大于等于 max{100万，文件数预分配配额}；2.小于等于30亿
    */
    private Long filesQuota;

    /**
    * iops限制<br><li>IOPS QoS为Fileset的最大IOPS（不包含DIO）性能，当Fileset的IOPS使用性能达到QoS设置阈值后，会触发流控。
    */
    private Integer qpsLimit;

    /**
    * 带宽限制，单位MB<br><li>吞吐QoS为Fileset的最大吞吐性能（不包含DIO），当Fileset的吞吐使用性能达到QoS设置阈值后，会触发流控。
    */
    private Integer bandwidthLimitMb;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateFilesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getFilesetId() {
        return filesetId;
    }

    public UpdateFilesetRequest setFilesetId(String filesetId) {
        this.filesetId = filesetId;
        return this;
    }

    public String getFilesetName() {
        return filesetName;
    }

    public UpdateFilesetRequest setFilesetName(String filesetName) {
        this.filesetName = filesetName;
        return this;
    }

    public Integer getBlockQuota() {
        return blockQuota;
    }

    public UpdateFilesetRequest setBlockQuota(Integer blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }

    public Long getFilesQuota() {
        return filesQuota;
    }

    public UpdateFilesetRequest setFilesQuota(Long filesQuota) {
        this.filesQuota = filesQuota;
        return this;
    }

    public Integer getQpsLimit() {
        return qpsLimit;
    }

    public UpdateFilesetRequest setQpsLimit(Integer qpsLimit) {
        this.qpsLimit = qpsLimit;
        return this;
    }

    public Integer getBandwidthLimitMb() {
        return bandwidthLimitMb;
    }

    public UpdateFilesetRequest setBandwidthLimitMb(Integer bandwidthLimitMb) {
        this.bandwidthLimitMb = bandwidthLimitMb;
        return this;
    }

}
