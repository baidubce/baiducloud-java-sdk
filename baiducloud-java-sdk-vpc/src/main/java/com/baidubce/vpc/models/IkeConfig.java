package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IkeConfig {
    /**
     * 版本，取值范围：v1/v2
     */
    private String ikeVersion;

    /**
     * 协商模式，取值范围：main/aggressive
     */
    private String ikeMode;

    /**
     * 加密算法，取值范围：aes/aes192/aes256/3des
     */
    private String ikeEncAlg;

    /**
     * 认证算法，取值范围：sha1/md5
     */
    private String ikeAuthAlg;

    /**
     * DH分组，取值范围：group2/group5/group14/group24
     */
    private String ikePfs;

    /**
     * SA生命周期,取值范围：60-86400
     */
    private String ikeLifeTime;

    public IkeConfig setIkeVersion(String ikeVersion) {
        this.ikeVersion = ikeVersion;
        return this;
    }

    public String getIkeVersion() {
        return this.ikeVersion;
    }

    public IkeConfig setIkeMode(String ikeMode) {
        this.ikeMode = ikeMode;
        return this;
    }

    public String getIkeMode() {
        return this.ikeMode;
    }

    public IkeConfig setIkeEncAlg(String ikeEncAlg) {
        this.ikeEncAlg = ikeEncAlg;
        return this;
    }

    public String getIkeEncAlg() {
        return this.ikeEncAlg;
    }

    public IkeConfig setIkeAuthAlg(String ikeAuthAlg) {
        this.ikeAuthAlg = ikeAuthAlg;
        return this;
    }

    public String getIkeAuthAlg() {
        return this.ikeAuthAlg;
    }

    public IkeConfig setIkePfs(String ikePfs) {
        this.ikePfs = ikePfs;
        return this;
    }

    public String getIkePfs() {
        return this.ikePfs;
    }

    public IkeConfig setIkeLifeTime(String ikeLifeTime) {
        this.ikeLifeTime = ikeLifeTime;
        return this;
    }

    public String getIkeLifeTime() {
        return this.ikeLifeTime;
    }

    @Override
    public String toString() {
        return "IkeConfig{" + "ikeVersion=" + ikeVersion + "\n" + "ikeMode=" + ikeMode + "\n" + "ikeEncAlg=" + ikeEncAlg + "\n" + "ikeAuthAlg=" + ikeAuthAlg + "\n" + "ikePfs="
                + ikePfs + "\n" + "ikeLifeTime=" + ikeLifeTime + "\n" + "}";
    }

}