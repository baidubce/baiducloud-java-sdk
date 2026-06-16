package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCdsModel {
    /**
     * CDS磁盘存储类型，默认是hp1(高性能云磁盘)。（创建实例、创建抢占实例、查询抢占实例市场价）
     */
    private String storageType;

    /**
     * CDS磁盘容量，必须为大于0的整数，单位为GB，大小为0~5120G（创建实例、创建抢占实例、查询抢占实例市场价）
     */
    private Integer cdsSizeInGB;

    /**
     * 磁盘数量（创建实例）
     */
    private Integer cdsNum;

    /**
     * 额外 IO 性能（创建实例）
     */
    private Integer cdsExtraIo;

    /**
     * 快照ID，当通过快照创建磁盘时，此属性有效，不能小于快照大小（创建实例、创建抢占实例、查询抢占实例市场价）
     */
    private String snapshotId;

    /**
     * 加密密钥（创建实例）
     */
    private String encryptKey;

    /**
     * 磁盘删除保护（创建实例）
     */
    private String enableDeleteProtection;

    /**
     * 磁盘随实例删除，计费方式为按量后付时生效，初始值为false，V2 API需要在释放实例时指定cdsAttributeActive参数为true才可生效（创建实例）
     */
    private Boolean deleteWithInstance;

    /**
     * 释放时是否删除自动快照（创建实例）
     */
    private Boolean deleteAutoSnapshot;

    /**
     * 磁盘名称（创建实例）
     */
    private String name;

    public CreateCdsModel setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageType() {
        return this.storageType;
    }

    public CreateCdsModel setCdsSizeInGB(Integer cdsSizeInGB) {
        this.cdsSizeInGB = cdsSizeInGB;
        return this;
    }

    public Integer getCdsSizeInGB() {
        return this.cdsSizeInGB;
    }

    public CreateCdsModel setCdsNum(Integer cdsNum) {
        this.cdsNum = cdsNum;
        return this;
    }

    public Integer getCdsNum() {
        return this.cdsNum;
    }

    public CreateCdsModel setCdsExtraIo(Integer cdsExtraIo) {
        this.cdsExtraIo = cdsExtraIo;
        return this;
    }

    public Integer getCdsExtraIo() {
        return this.cdsExtraIo;
    }

    public CreateCdsModel setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateCdsModel setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
        return this;
    }

    public String getEncryptKey() {
        return this.encryptKey;
    }

    public CreateCdsModel setEnableDeleteProtection(String enableDeleteProtection) {
        this.enableDeleteProtection = enableDeleteProtection;
        return this;
    }

    public String getEnableDeleteProtection() {
        return this.enableDeleteProtection;
    }

    public CreateCdsModel setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
        return this;
    }

    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public CreateCdsModel setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }

    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public CreateCdsModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "CreateCdsModel{" + "storageType=" + storageType + "\n" + "cdsSizeInGB=" + cdsSizeInGB + "\n" + "cdsNum=" + cdsNum + "\n" + "cdsExtraIo=" + cdsExtraIo + "\n"
                + "snapshotId=" + snapshotId + "\n" + "encryptKey=" + encryptKey + "\n" + "enableDeleteProtection=" + enableDeleteProtection + "\n" + "deleteWithInstance="
                + deleteWithInstance + "\n" + "deleteAutoSnapshot=" + deleteAutoSnapshot + "\n" + "name=" + name + "\n" + "}";
    }

}