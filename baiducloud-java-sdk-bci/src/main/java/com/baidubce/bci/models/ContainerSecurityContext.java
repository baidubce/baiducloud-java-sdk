package com.baidubce.bci.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContainerSecurityContext {
    /**
     * capabilities
     */
    private Capabilities capabilities;

    /**
     * 运行容器的用户ID
     */
    private Long runAsUser;

    /**
     * 运行容器进程入口点的GID
     */
    private Long runAsGroup;

    /**
     * 是否必须以非root用户运行
     */
    private Boolean runAsNonRoot;

    /**
     * 根文件系统是否只读，默认false
     */
    private Boolean readOnlyRootFilesystem;

    public ContainerSecurityContext setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public Capabilities getCapabilities() {
        return this.capabilities;
    }

    public ContainerSecurityContext setRunAsUser(Long runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    public Long getRunAsUser() {
        return this.runAsUser;
    }

    public ContainerSecurityContext setRunAsGroup(Long runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }

    public Long getRunAsGroup() {
        return this.runAsGroup;
    }

    public ContainerSecurityContext setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
        return this;
    }

    public Boolean getRunAsNonRoot() {
        return this.runAsNonRoot;
    }

    public ContainerSecurityContext setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        return this;
    }

    public Boolean getReadOnlyRootFilesystem() {
        return this.readOnlyRootFilesystem;
    }

    @Override
    public String toString() {
        return "ContainerSecurityContext{" + "capabilities=" + capabilities + "\n" + "runAsUser=" + runAsUser + "\n" + "runAsGroup=" + runAsGroup + "\n" + "runAsNonRoot="
                + runAsNonRoot + "\n" + "readOnlyRootFilesystem=" + readOnlyRootFilesystem + "\n" + "}";
    }

}