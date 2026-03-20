package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpsecConfig {
    /**
     * 加密算法，取值范围：aes/aes192/aes256/3des
     */
    private String ipsecEncAlg;

    /**
     * 认证算法，取值范围：sha1/md5
     */
    private String ipsecAuthAlg;

    /**
     * DH分组，取值范围：group2/group5/group14/group24
     */
    private String ipsecPfs;

    /**
     * SA生命周期,取值范围：180-86400
     */
    private String ipsecLifetime;

    public IpsecConfig setIpsecEncAlg(String ipsecEncAlg) {
        this.ipsecEncAlg = ipsecEncAlg;
        return this;
    }

    public String getIpsecEncAlg() {
        return this.ipsecEncAlg;
    }

    public IpsecConfig setIpsecAuthAlg(String ipsecAuthAlg) {
        this.ipsecAuthAlg = ipsecAuthAlg;
        return this;
    }

    public String getIpsecAuthAlg() {
        return this.ipsecAuthAlg;
    }

    public IpsecConfig setIpsecPfs(String ipsecPfs) {
        this.ipsecPfs = ipsecPfs;
        return this;
    }

    public String getIpsecPfs() {
        return this.ipsecPfs;
    }

    public IpsecConfig setIpsecLifetime(String ipsecLifetime) {
        this.ipsecLifetime = ipsecLifetime;
        return this;
    }

    public String getIpsecLifetime() {
        return this.ipsecLifetime;
    }

    @Override
    public String toString() {
        return "IpsecConfig{" + "ipsecEncAlg=" + ipsecEncAlg + "\n" + "ipsecAuthAlg=" + ipsecAuthAlg + "\n" + "ipsecPfs=" + ipsecPfs + "\n" + "ipsecLifetime=" + ipsecLifetime
                + "\n" + "}";
    }

}