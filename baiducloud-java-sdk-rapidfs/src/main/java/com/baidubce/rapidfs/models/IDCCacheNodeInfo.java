package com.baidubce.rapidfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IDCCacheNodeInfo {
    /**
     * SSH 用户名
     */
    private String sshUser;

    /**
     * 
     */
    private String sshPassword;

    /**
     * SSH 端口
     */
    private Integer sshPort;

    public IDCCacheNodeInfo setSshUser(String sshUser) {
        this.sshUser = sshUser;
        return this;
    }

    public String getSshUser() {
        return this.sshUser;
    }

    public IDCCacheNodeInfo setSshPassword(String sshPassword) {
        this.sshPassword = sshPassword;
        return this;
    }

    public String getSshPassword() {
        return this.sshPassword;
    }

    public IDCCacheNodeInfo setSshPort(Integer sshPort) {
        this.sshPort = sshPort;
        return this;
    }

    public Integer getSshPort() {
        return this.sshPort;
    }

    @Override
    public String toString() {
        return "IDCCacheNodeInfo{" + "sshUser=" + sshUser + "\n" + "sshPassword=" + sshPassword + "\n" + "sshPort=" + sshPort + "\n" + "}";
    }

}