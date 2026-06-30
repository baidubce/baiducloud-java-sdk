package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Container {
    /**
     * 容器名，1-40字符，由字母数字、"-"或"."组成
     */
    private String name;

    /**
     * 镜像
     */
    private String image;

    /**
     * 内存（GiB），不可超过实例总内存
     */
    private Float memory;

    /**
     * CPU（核），不可超过实例总核数
     */
    private Float cpu;

    /**
     * 容器使用GPU个数
     */
    private Float gpu;

    /**
     * 容器工作目录
     */
    private String workingDir;

    /**
     * 镜像拉取策略：Always、IfNotPresent、Never
     */
    private String imagePullPolicy;

    /**
     * 容器启动命令
     */
    private List<String> commands;

    /**
     * 容器启动参数
     */
    private List<String> args;

    /**
     * 数据卷挂载信息
     */
    private List<VolumeMount> volumeMounts;

    /**
     * 容器内端口信息
     */
    private List<Port> ports;

    /**
     * 环境变量
     */
    private List<Environment> environmentVars;

    /**
     * livenessProbe
     */
    private Probe livenessProbe;

    /**
     * readinessProbe
     */
    private Probe readinessProbe;

    /**
     * startupProbe
     */
    private Probe startupProbe;

    /**
     * 是否分配标准输入缓冲区，默认false
     */
    private Boolean stdin;

    /**
     * 标准输入流多会话是否保持开启，默认false
     */
    private Boolean stdinOnce;

    /**
     * 是否开启交互（/bin/bash时需设为true），默认false
     */
    private Boolean tty;

    /**
     * securityContext
     */
    private ContainerSecurityContext securityContext;

    public Container setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Container setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public Container setMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    public Float getMemory() {
        return this.memory;
    }

    public Container setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    public Float getCpu() {
        return this.cpu;
    }

    public Container setGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    public Float getGpu() {
        return this.gpu;
    }

    public Container setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    public String getWorkingDir() {
        return this.workingDir;
    }

    public Container setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    public String getImagePullPolicy() {
        return this.imagePullPolicy;
    }

    public Container setCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

    public List<String> getCommands() {
        return this.commands;
    }

    public Container setArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public List<String> getArgs() {
        return this.args;
    }

    public Container setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    public List<VolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    public Container setPorts(List<Port> ports) {
        this.ports = ports;
        return this;
    }

    public List<Port> getPorts() {
        return this.ports;
    }

    public Container setEnvironmentVars(List<Environment> environmentVars) {
        this.environmentVars = environmentVars;
        return this;
    }

    public List<Environment> getEnvironmentVars() {
        return this.environmentVars;
    }

    public Container setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public Probe getLivenessProbe() {
        return this.livenessProbe;
    }

    public Container setReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public Probe getReadinessProbe() {
        return this.readinessProbe;
    }

    public Container setStartupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    public Probe getStartupProbe() {
        return this.startupProbe;
    }

    public Container setStdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    public Boolean getStdin() {
        return this.stdin;
    }

    public Container setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    public Boolean getStdinOnce() {
        return this.stdinOnce;
    }

    public Container setTty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    public Boolean getTty() {
        return this.tty;
    }

    public Container setSecurityContext(ContainerSecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    public ContainerSecurityContext getSecurityContext() {
        return this.securityContext;
    }

    @Override
    public String toString() {
        return "Container{" + "name=" + name + "\n" + "image=" + image + "\n" + "memory=" + memory + "\n" + "cpu=" + cpu + "\n" + "gpu=" + gpu + "\n" + "workingDir=" + workingDir
                + "\n" + "imagePullPolicy=" + imagePullPolicy + "\n" + "commands=" + commands + "\n" + "args=" + args + "\n" + "volumeMounts=" + volumeMounts + "\n" + "ports="
                + ports + "\n" + "environmentVars=" + environmentVars + "\n" + "livenessProbe=" + livenessProbe + "\n" + "readinessProbe=" + readinessProbe + "\n"
                + "startupProbe=" + startupProbe + "\n" + "stdin=" + stdin + "\n" + "stdinOnce=" + stdinOnce + "\n" + "tty=" + tty + "\n" + "securityContext=" + securityContext
                + "\n" + "}";
    }

}