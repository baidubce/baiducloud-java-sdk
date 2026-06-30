package com.baidubce.bci.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateImageCacheRequest extends BaseBceRequest {

    /**
    * 镜像缓存名称
    */
    private String imageCacheName;

    /**
    * 原始镜像数组，每个对象包含镜像地址和版本信息
    */
    private List<OriginImage> originImages;

    /**
    * 子网ID
    */
    private String subnetId;

    /**
    * 安全组ID
    */
    private String securityGroupId;

    /**
    * 可用区名称
    */
    private String zoneName;

    /**
    * 临时存储大小（单位：GB）
    */
    private Integer temporaryStorageSize;

    /**
    * 是否需要弹性公网IP
    */
    private Boolean needEip;

    /**
    * 弹性公网IP地址，needEip为true时必须提供
    */
    private String eipIp;

    /**
    * 是否自动匹配镜像缓存
    */
    private Boolean autoMatchImageCache;

    /**
    * 镜像仓库凭据
    */
    private List<ImageRegistryCredential> imageRegistrySecrets;

    public String getImageCacheName() {
        return imageCacheName;
    }

    public CreateImageCacheRequest setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }

    public List<OriginImage> getOriginImages() {
        return originImages;
    }

    public CreateImageCacheRequest setOriginImages(List<OriginImage> originImages) {
        this.originImages = originImages;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateImageCacheRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public CreateImageCacheRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateImageCacheRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public Integer getTemporaryStorageSize() {
        return temporaryStorageSize;
    }

    public CreateImageCacheRequest setTemporaryStorageSize(Integer temporaryStorageSize) {
        this.temporaryStorageSize = temporaryStorageSize;
        return this;
    }

    public Boolean getNeedEip() {
        return needEip;
    }

    public CreateImageCacheRequest setNeedEip(Boolean needEip) {
        this.needEip = needEip;
        return this;
    }

    public String getEipIp() {
        return eipIp;
    }

    public CreateImageCacheRequest setEipIp(String eipIp) {
        this.eipIp = eipIp;
        return this;
    }

    public Boolean getAutoMatchImageCache() {
        return autoMatchImageCache;
    }

    public CreateImageCacheRequest setAutoMatchImageCache(Boolean autoMatchImageCache) {
        this.autoMatchImageCache = autoMatchImageCache;
        return this;
    }

    public List<ImageRegistryCredential> getImageRegistrySecrets() {
        return imageRegistrySecrets;
    }

    public CreateImageCacheRequest setImageRegistrySecrets(List<ImageRegistryCredential> imageRegistrySecrets) {
        this.imageRegistrySecrets = imageRegistrySecrets;
        return this;
    }

}
