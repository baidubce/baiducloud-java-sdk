package com.baidubce.rapidfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddCacheNodeInfo {
    /**
     * 节点 ip
     */
    private String ip;

    /**
     * 
     */
    private String config;

    /**
     * 
     */
    private List<DiskInfo> diskInfos;

    /**
     * cache 节点服务部署路径，默认 /home/.rapidfs/
     */
    private String deployPath;

    /**
     * bccInfo
     */
    private BCCCacheNodeInfo bccInfo;

    /**
     * idcInfo
     */
    private IDCCacheNodeInfo idcInfo;

    public AddCacheNodeInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public AddCacheNodeInfo setConfig(String config) {
        this.config = config;
        return this;
    }

    public String getConfig() {
        return this.config;
    }

    public AddCacheNodeInfo setDiskInfos(List<DiskInfo> diskInfos) {
        this.diskInfos = diskInfos;
        return this;
    }

    public List<DiskInfo> getDiskInfos() {
        return this.diskInfos;
    }

    public AddCacheNodeInfo setDeployPath(String deployPath) {
        this.deployPath = deployPath;
        return this;
    }

    public String getDeployPath() {
        return this.deployPath;
    }

    public AddCacheNodeInfo setBccInfo(BCCCacheNodeInfo bccInfo) {
        this.bccInfo = bccInfo;
        return this;
    }

    public BCCCacheNodeInfo getBccInfo() {
        return this.bccInfo;
    }

    public AddCacheNodeInfo setIdcInfo(IDCCacheNodeInfo idcInfo) {
        this.idcInfo = idcInfo;
        return this;
    }

    public IDCCacheNodeInfo getIdcInfo() {
        return this.idcInfo;
    }

    @Override
    public String toString() {
        return "AddCacheNodeInfo{" + "ip=" + ip + "\n" + "config=" + config + "\n" + "diskInfos=" + diskInfos + "\n" + "deployPath=" + deployPath + "\n" + "bccInfo=" + bccInfo
                + "\n" + "idcInfo=" + idcInfo + "\n" + "}";
    }

}