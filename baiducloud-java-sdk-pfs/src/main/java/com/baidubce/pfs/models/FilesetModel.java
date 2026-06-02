package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilesetModel {
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
     * 容量配额（单位GB）
     */
    private Integer blockQuota;

    /**
     * 容量使用量（单位KB）
     */
    private Long blockUsage;

    /**
     * 文件数量配额
     */
    private Long filesQuota;

    /**
     * 文件数使用量
     */
    private Long filesUsage;

    /**
     * 文件数预分配配额
     */
    private Long allocatedinode;

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
     * 是否为父fileset<br>• 1，表示子目录中有fileset<br>• 0，表示子目录中没有fileset
     */
    private Boolean parentPath;

    public FilesetModel setFilesetName(String filesetName) {
        this.filesetName = filesetName;
        return this;
    }

    public String getFilesetName() {
        return this.filesetName;
    }

    public FilesetModel setFilesetId(String filesetId) {
        this.filesetId = filesetId;
        return this;
    }

    public String getFilesetId() {
        return this.filesetId;
    }

    public FilesetModel setFilesetPath(String filesetPath) {
        this.filesetPath = filesetPath;
        return this;
    }

    public String getFilesetPath() {
        return this.filesetPath;
    }

    public FilesetModel setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public FilesetModel setBlockQuota(Integer blockQuota) {
        this.blockQuota = blockQuota;
        return this;
    }

    public Integer getBlockQuota() {
        return this.blockQuota;
    }

    public FilesetModel setBlockUsage(Long blockUsage) {
        this.blockUsage = blockUsage;
        return this;
    }

    public Long getBlockUsage() {
        return this.blockUsage;
    }

    public FilesetModel setFilesQuota(Long filesQuota) {
        this.filesQuota = filesQuota;
        return this;
    }

    public Long getFilesQuota() {
        return this.filesQuota;
    }

    public FilesetModel setFilesUsage(Long filesUsage) {
        this.filesUsage = filesUsage;
        return this;
    }

    public Long getFilesUsage() {
        return this.filesUsage;
    }

    public FilesetModel setAllocatedinode(Long allocatedinode) {
        this.allocatedinode = allocatedinode;
        return this;
    }

    public Long getAllocatedinode() {
        return this.allocatedinode;
    }

    public FilesetModel setCtime(String ctime) {
        this.ctime = ctime;
        return this;
    }

    public String getCtime() {
        return this.ctime;
    }

    public FilesetModel setQpsLimit(Long qpsLimit) {
        this.qpsLimit = qpsLimit;
        return this;
    }

    public Long getQpsLimit() {
        return this.qpsLimit;
    }

    public FilesetModel setBandwidthLimitMb(Long bandwidthLimitMb) {
        this.bandwidthLimitMb = bandwidthLimitMb;
        return this;
    }

    public Long getBandwidthLimitMb() {
        return this.bandwidthLimitMb;
    }

    public FilesetModel setParentPath(Boolean parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    public Boolean getParentPath() {
        return this.parentPath;
    }

    @Override
    public String toString() {
        return "FilesetModel{" + "filesetName=" + filesetName + "\n" + "filesetId=" + filesetId + "\n" + "filesetPath=" + filesetPath + "\n" + "status=" + status + "\n"
                + "blockQuota=" + blockQuota + "\n" + "blockUsage=" + blockUsage + "\n" + "filesQuota=" + filesQuota + "\n" + "filesUsage=" + filesUsage + "\n" + "allocatedinode="
                + allocatedinode + "\n" + "ctime=" + ctime + "\n" + "qpsLimit=" + qpsLimit + "\n" + "bandwidthLimitMb=" + bandwidthLimitMb + "\n" + "parentPath=" + parentPath
                + "\n" + "}";
    }

}