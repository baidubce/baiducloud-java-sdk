package com.baidubce.bcc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeypairModel {
    /**
     * 密钥对ID
     */
    private String keypairId;

    /**
     * 密钥对名称
     */
    private String name;

    /**
     * 密钥对描述
     */
    private String description;

    /**
     * 密钥对绑定的虚机数目
     */
    private Integer instanceCount;

    /**
     * 密钥对创建时间
     */
    private String createdTime;

    /**
     * 公钥内容
     */
    private String publicKey;

    /**
     * 公钥指纹
     */
    private String fingerPrint;

    /**
     * 私钥内容
     */
    private String privateKey;

    /**
     * 密钥对所在的地域id
     */
    private String regionId;

    /**
     * paas应用数目（查询密钥对列表、查询密钥对详情返回）
     */
    private List<PassInstanceModel> paasInstanceCount;

    public KeypairModel setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getKeypairId() {
        return this.keypairId;
    }

    public KeypairModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public KeypairModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public KeypairModel setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public KeypairModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public KeypairModel setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public KeypairModel setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
        return this;
    }

    public String getFingerPrint() {
        return this.fingerPrint;
    }

    public KeypairModel setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public KeypairModel setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public KeypairModel setPaasInstanceCount(List<PassInstanceModel> paasInstanceCount) {
        this.paasInstanceCount = paasInstanceCount;
        return this;
    }

    public List<PassInstanceModel> getPaasInstanceCount() {
        return this.paasInstanceCount;
    }

    @Override
    public String toString() {
        return "KeypairModel{" + "keypairId=" + keypairId + "\n" + "name=" + name + "\n" + "description=" + description + "\n" + "instanceCount=" + instanceCount + "\n"
                + "createdTime=" + createdTime + "\n" + "publicKey=" + publicKey + "\n" + "fingerPrint=" + fingerPrint + "\n" + "privateKey=" + privateKey + "\n" + "regionId="
                + regionId + "\n" + "paasInstanceCount=" + paasInstanceCount + "\n" + "}";
    }

}