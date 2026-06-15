package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileSystemModel {
    /**
     * cfs文件系统ID
     */
    private String fsId;

    /**
     * 挂载目标的地址
     */
    private String mountAds;

    /**
     * 挂载目录
     */
    private String path;

    /**
     * cfs文件系统的协议类型，可选值为：nfs，smb
     */
    private String protocol;

    public FileSystemModel setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    public String getFsId() {
        return this.fsId;
    }

    public FileSystemModel setMountAds(String mountAds) {
        this.mountAds = mountAds;
        return this;
    }

    public String getMountAds() {
        return this.mountAds;
    }

    public FileSystemModel setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public FileSystemModel setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return this.protocol;
    }

    @Override
    public String toString() {
        return "FileSystemModel{" + "fsId=" + fsId + "\n" + "mountAds=" + mountAds + "\n" + "path=" + path + "\n" + "protocol=" + protocol + "\n" + "}";
    }

}