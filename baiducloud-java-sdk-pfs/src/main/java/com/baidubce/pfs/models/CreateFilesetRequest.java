package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFilesetRequest extends BaseBceRequest {

    /**
    * 创建fileset的pfs实例短id
    */
    private String instanceId;

    /**
    * 创建fileset的名称<br><li>长度为1~128个英文或中文字符。<br><li>必须以大小字母或中文开头。<br><li>可以包含数字、中文、半角冒号（:）、下划线（_）或者短划线（-）
    */
    private String filesetName;

    /**
    * 创建fileset的路径，fileset路径为PFS文件系统中的绝对路径。<br><li>该路径必须为新路径，不能为已存在路径。<br><li>路径以正斜线（/）开头，例如：/filepath，该路径会自动创建。<br><li>父目录必须是已存在的普通目录。<br><li>路径深度最多为8层。<br><li>路径总长度最多为1013个字符。
    * <br><li>单层目录名称长度最多为255个字符。
    */
    private String filesetPath;

    /**
    * 容量限制，单位GB<br><li>容量配额为Fileset的最大可写入容量，达到配额上限后无法再写入新数据。<br><li>容量配额不能超过PFS文件系统实例总容量。<br><li>不设置或者设置为0时表示不限制
    */
    private Integer blockQuota;

    /**
    * 文件数限制<br><li>文件数配额为Fileset最多可写入的文件与目录数量，达到配额上限后无法再写入新数据。<br><li>文件数配额最高可设置为30亿，超过请提工单。<br><li>不设置或者设置为0时表示不限制
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

    public CreateFilesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getFilesetName() {
        return filesetName;
    }

    public CreateFilesetRequest setFilesetName(String filesetName) {
        this.filesetName = filesetName;
        return this;
    }

    public String getFilesetPath() {
        return filesetPath;
    }

    public CreateFilesetRequest setFilesetPath(String filesetPath) {
        this.filesetPath = filesetPath;
        return this;
    }

    public Integer getBlockQuota() {
        return blockQuota;
    }

    public CreateFilesetRequest setBlockQuota(Integer blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }

    public Long getFilesQuota() {
        return filesQuota;
    }

    public CreateFilesetRequest setFilesQuota(Long filesQuota) {
        this.filesQuota = filesQuota;
        return this;
    }

    public Integer getQpsLimit() {
        return qpsLimit;
    }

    public CreateFilesetRequest setQpsLimit(Integer qpsLimit) {
        this.qpsLimit = qpsLimit;
        return this;
    }

    public Integer getBandwidthLimitMb() {
        return bandwidthLimitMb;
    }

    public CreateFilesetRequest setBandwidthLimitMb(Integer bandwidthLimitMb) {
        this.bandwidthLimitMb = bandwidthLimitMb;
        return this;
    }

}
