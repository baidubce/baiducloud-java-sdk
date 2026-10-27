package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSrcInfo {
    /**
     * 数据源名称
     */
    private String dataSrcName;

    /**
     * 数据源唯一Id
     */
    private String dataSrcId;

    /**
     * 所属的 RapidFS 实例唯一 Id
     */
    private String instanceId;

    /**
     * 所属的 RapidFS 实例名称
     */
    private String instanceName;

    /**
     * 用户客户端挂载该数据源的地址
     */
    private String mountTarget;

    /**
     * 数据源状态，见 DataSrcStatus
     */
    private String status;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 数据源的 BOS bucket
     */
    private String bucket;

    /**
     * 是否为其他账号的 bucket，非 BOS 数据源固定为true
     */
    private Boolean otherAccount;

    /**
     * 对象存储类型，BOS / OSS
     */
    private String storageType;

    /**
     * 数据源实际使用的 endpoint，BOS 数据源导入且未显式传入时为后端推导值
     */
    private String bucketEndpoint;

    /**
     * 数据源的目录前缀
     */
    private String dirPrefix;

    /**
     * 数据源导入时是否立即同步元数据， 默认 ture
     */
    private Boolean syncMetaOnImport;

    /**
     * 是否保留软链
     */
    private Boolean keepSymlink;

    /**
     * 权限组Id
     */
    private String authGroupId;

    /**
     * 权限组名称
     */
    private String authGroupName;

    /**
     * 数据源的容量配额，-1 表示未设置
     */
    private Integer quotaMiB;

    /**
     * 数据源已使用容量
     */
    private Integer usedMiB;

    /**
     * 该数据源的绑定列表，见数据类型 MountServiceBinding
     */
    private List<MountServiceBinding> mountServiceBindings;

    public DataSrcInfo setDataSrcName(String dataSrcName) {
        this.dataSrcName = dataSrcName;
        return this;
    }

    public String getDataSrcName() {
        return this.dataSrcName;
    }

    public DataSrcInfo setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getDataSrcId() {
        return this.dataSrcId;
    }

    public DataSrcInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public DataSrcInfo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public DataSrcInfo setMountTarget(String mountTarget) {
        this.mountTarget = mountTarget;
        return this;
    }

    public String getMountTarget() {
        return this.mountTarget;
    }

    public DataSrcInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public DataSrcInfo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public DataSrcInfo setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public String getBucket() {
        return this.bucket;
    }

    public DataSrcInfo setOtherAccount(Boolean otherAccount) {
        this.otherAccount = otherAccount;
        return this;
    }

    public Boolean getOtherAccount() {
        return this.otherAccount;
    }

    public DataSrcInfo setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public DataSrcInfo setBucketEndpoint(String bucketEndpoint) {
        this.bucketEndpoint = bucketEndpoint;
        return this;
    }

    public String getBucketEndpoint() {
        return this.bucketEndpoint;
    }

    public DataSrcInfo setDirPrefix(String dirPrefix) {
        this.dirPrefix = dirPrefix;
        return this;
    }

    public String getDirPrefix() {
        return this.dirPrefix;
    }

    public DataSrcInfo setSyncMetaOnImport(Boolean syncMetaOnImport) {
        this.syncMetaOnImport = syncMetaOnImport;
        return this;
    }

    public Boolean getSyncMetaOnImport() {
        return this.syncMetaOnImport;
    }

    public DataSrcInfo setKeepSymlink(Boolean keepSymlink) {
        this.keepSymlink = keepSymlink;
        return this;
    }

    public Boolean getKeepSymlink() {
        return this.keepSymlink;
    }

    public DataSrcInfo setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

    public String getAuthGroupId() {
        return this.authGroupId;
    }

    public DataSrcInfo setAuthGroupName(String authGroupName) {
        this.authGroupName = authGroupName;
        return this;
    }

    public String getAuthGroupName() {
        return this.authGroupName;
    }

    public DataSrcInfo setQuotaMiB(Integer quotaMiB) {
        this.quotaMiB = quotaMiB;
        return this;
    }

    public Integer getQuotaMiB() {
        return this.quotaMiB;
    }

    public DataSrcInfo setUsedMiB(Integer usedMiB) {
        this.usedMiB = usedMiB;
        return this;
    }

    public Integer getUsedMiB() {
        return this.usedMiB;
    }

    public DataSrcInfo setMountServiceBindings(List<MountServiceBinding> mountServiceBindings) {
        this.mountServiceBindings = mountServiceBindings;
        return this;
    }

    public List<MountServiceBinding> getMountServiceBindings() {
        return this.mountServiceBindings;
    }

    @Override
    public String toString() {
        return "DataSrcInfo{" + "dataSrcName=" + dataSrcName + "\n" + "dataSrcId=" + dataSrcId + "\n" + "instanceId=" + instanceId + "\n" + "instanceName=" + instanceName + "\n"
                + "mountTarget=" + mountTarget + "\n" + "status=" + status + "\n" + "description=" + description + "\n" + "bucket=" + bucket + "\n" + "otherAccount="
                + otherAccount + "\n" + "storageType=" + storageType + "\n" + "bucketEndpoint=" + bucketEndpoint + "\n" + "dirPrefix=" + dirPrefix + "\n" + "syncMetaOnImport="
                + syncMetaOnImport + "\n" + "keepSymlink=" + keepSymlink + "\n" + "authGroupId=" + authGroupId + "\n" + "authGroupName=" + authGroupName + "\n" + "quotaMiB="
                + quotaMiB + "\n" + "usedMiB=" + usedMiB + "\n" + "mountServiceBindings=" + mountServiceBindings + "\n" + "}";
    }

}