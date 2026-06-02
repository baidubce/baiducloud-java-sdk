package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescFilesetResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    private String requestId;

    /**
    * fileset名称
    */
    private String filesetName;

    /**
    * fileset id
    */
    private String filesetId;

    /**
    * fileset path
    */
    private String filesetPath;

    /**
    * 
    */
    private Integer status;

    /**
    * 容量限制（单位GB）
    */
    private Integer blockQuota;

    /**
    * 容量使用量（单位KB）
    */
    private Integer blockUsage;

    /**
    * 文件数量限制
    */
    private Integer filesQuota;

    /**
    * 文件使用量
    */
    private Integer filesUsage;

    /**
    * 文件数预分配配额
    */
    private Long allocatedInode;

    /**
    * 创建时间
    */
    private String ctime;

    /**
    * iops限制
    */
    private Long qpsLimit;

    /**
    * 带宽限制
    */
    private Long bandwidthLimitMb;

    /**
    * 是否为父fileset<br><li> 1，表示子目录中有fileset<br><li>0，表示子目录中没有filset
    */
    private Boolean parentPath;

    public String getRequestId() {
        return requestId;
    }

    public DescFilesetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getFilesetName() {
        return filesetName;
    }

    public DescFilesetResponse setFilesetName(String filesetName) {
        this.filesetName = filesetName;
        return this;
    }

    public String getFilesetId() {
        return filesetId;
    }

    public DescFilesetResponse setFilesetId(String filesetId) {
        this.filesetId = filesetId;
        return this;
    }

    public String getFilesetPath() {
        return filesetPath;
    }

    public DescFilesetResponse setFilesetPath(String filesetPath) {
        this.filesetPath = filesetPath;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public DescFilesetResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getBlockQuota() {
        return blockQuota;
    }

    public DescFilesetResponse setBlockQuota(Integer blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }

    public Integer getBlockUsage() {
        return blockUsage;
    }

    public DescFilesetResponse setBlockUsage(Integer blockUsage) {
        this.blockUsage = blockUsage;
        return this;
    }

    public Integer getFilesQuota() {
        return filesQuota;
    }

    public DescFilesetResponse setFilesQuota(Integer filesQuota) {
        this.filesQuota = filesQuota;
        return this;
    }

    public Integer getFilesUsage() {
        return filesUsage;
    }

    public DescFilesetResponse setFilesUsage(Integer filesUsage) {
        this.filesUsage = filesUsage;
        return this;
    }

    public Long getAllocatedInode() {
        return allocatedInode;
    }

    public DescFilesetResponse setAllocatedInode(Long allocatedInode) {
        this.allocatedInode = allocatedInode;
        return this;
    }

    public String getCtime() {
        return ctime;
    }

    public DescFilesetResponse setCtime(String ctime) {
        this.ctime = ctime;
        return this;
    }

    public Long getQpsLimit() {
        return qpsLimit;
    }

    public DescFilesetResponse setQpsLimit(Long qpsLimit) {
        this.qpsLimit = qpsLimit;
        return this;
    }

    public Long getBandwidthLimitMb() {
        return bandwidthLimitMb;
    }

    public DescFilesetResponse setBandwidthLimitMb(Long bandwidthLimitMb) {
        this.bandwidthLimitMb = bandwidthLimitMb;
        return this;
    }

    public Boolean getParentPath() {
        return parentPath;
    }

    public DescFilesetResponse setParentPath(Boolean parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    @Override
    public String toString() {
        return "DescFilesetResponse{" + "requestId=" + requestId + "\n" + "filesetName=" + filesetName + "\n" + "filesetId=" + filesetId + "\n" + "filesetPath=" + filesetPath
                + "\n" + "status=" + status + "\n" + "blockQuota=" + blockQuota + "\n" + "blockUsage=" + blockUsage + "\n" + "filesQuota=" + filesQuota + "\n" + "filesUsage="
                + filesUsage + "\n" + "allocatedInode=" + allocatedInode + "\n" + "ctime=" + ctime + "\n" + "qpsLimit=" + qpsLimit + "\n" + "bandwidthLimitMb=" + bandwidthLimitMb
                + "\n" + "parentPath=" + parentPath + "\n" + "}";
    }

}
