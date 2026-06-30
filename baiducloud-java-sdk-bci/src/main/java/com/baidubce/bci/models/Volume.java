package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Volume {
    /**
     * NFS类型数据卷（网络文件系统）
     */
    private List<NfsVolume> nfs;

    /**
     * EmptyDir类型数据卷（空目录）
     */
    private List<EmptyDirVolume> emptyDir;

    /**
     * ConfigFile类型数据卷（配置文件）
     */
    private List<ConfigFileVolume> configFile;

    public Volume setNfs(List<NfsVolume> nfs) {
        this.nfs = nfs;
        return this;
    }

    public List<NfsVolume> getNfs() {
        return this.nfs;
    }

    public Volume setEmptyDir(List<EmptyDirVolume> emptyDir) {
        this.emptyDir = emptyDir;
        return this;
    }

    public List<EmptyDirVolume> getEmptyDir() {
        return this.emptyDir;
    }

    public Volume setConfigFile(List<ConfigFileVolume> configFile) {
        this.configFile = configFile;
        return this;
    }

    public List<ConfigFileVolume> getConfigFile() {
        return this.configFile;
    }

    @Override
    public String toString() {
        return "Volume{" + "nfs=" + nfs + "\n" + "emptyDir=" + emptyDir + "\n" + "configFile=" + configFile + "\n" + "}";
    }

}