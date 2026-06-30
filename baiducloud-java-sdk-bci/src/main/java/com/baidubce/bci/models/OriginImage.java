package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OriginImage {
    /**
     * 原始镜像地址
     */
    private String originImageAddress;

    /**
     * 原始镜像版本
     */
    private String originImageVersion;

    public OriginImage setOriginImageAddress(String originImageAddress) {
        this.originImageAddress = originImageAddress;
        return this;
    }

    public String getOriginImageAddress() {
        return this.originImageAddress;
    }

    public OriginImage setOriginImageVersion(String originImageVersion) {
        this.originImageVersion = originImageVersion;
        return this;
    }

    public String getOriginImageVersion() {
        return this.originImageVersion;
    }

    @Override
    public String toString() {
        return "OriginImage{" + "originImageAddress=" + originImageAddress + "\n" + "originImageVersion=" + originImageVersion + "\n" + "}";
    }

}