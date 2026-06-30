package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NfsVolume {
    /**
     * NFS服务器名称
     */
    private String name;

    /**
     * NFS服务器地址
     */
    private String server;

    /**
     * NFS数据卷路径
     */
    private String path;

    /**
     * 是否只读，默认false
     */
    private Boolean readOnly;

    public NfsVolume setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public NfsVolume setServer(String server) {
        this.server = server;
        return this;
    }

    public String getServer() {
        return this.server;
    }

    public NfsVolume setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPath() {
        return this.path;
    }

    public NfsVolume setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    @Override
    public String toString() {
        return "NfsVolume{" + "name=" + name + "\n" + "server=" + server + "\n" + "path=" + path + "\n" + "readOnly=" + readOnly + "\n" + "}";
    }

}