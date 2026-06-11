package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemImageModel {
    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 镜像名称
     */
    private String imageName;

    /**
     * 操作系统类型，如linux、windows
     */
    private String osType;

    /**
     * 操作系统版本
     */
    private String osVersion;

    /**
     * 操作系统架构
     */
    private String osArch;

    /**
     * 操作系统名称
     */
    private String osName;

    /**
     * 操作系统语言
     */
    private String osLang;

    /**
     * 创建实例时所需的最小磁盘大小，单位GiB
     */
    private Integer minSizeInGiB;

    public SystemImageModel setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return this.imageId;
    }

    public SystemImageModel setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    public String getImageName() {
        return this.imageName;
    }

    public SystemImageModel setOsType(String osType) {
        this.osType = osType;
        return this;
    }

    public String getOsType() {
        return this.osType;
    }

    public SystemImageModel setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public SystemImageModel setOsArch(String osArch) {
        this.osArch = osArch;
        return this;
    }

    public String getOsArch() {
        return this.osArch;
    }

    public SystemImageModel setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public String getOsName() {
        return this.osName;
    }

    public SystemImageModel setOsLang(String osLang) {
        this.osLang = osLang;
        return this;
    }

    public String getOsLang() {
        return this.osLang;
    }

    public SystemImageModel setMinSizeInGiB(Integer minSizeInGiB) {
        this.minSizeInGiB = minSizeInGiB;
        return this;
    }

    public Integer getMinSizeInGiB() {
        return this.minSizeInGiB;
    }

    @Override
    public String toString() {
        return "SystemImageModel{" + "imageId=" + imageId + "\n" + "imageName=" + imageName + "\n" + "osType=" + osType + "\n" + "osVersion=" + osVersion + "\n" + "osArch="
                + osArch + "\n" + "osName=" + osName + "\n" + "osLang=" + osLang + "\n" + "minSizeInGiB=" + minSizeInGiB + "\n" + "}";
    }

}