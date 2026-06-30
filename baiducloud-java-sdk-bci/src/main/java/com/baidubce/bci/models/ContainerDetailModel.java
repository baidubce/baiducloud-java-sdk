package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContainerDetailModel {
    /**
     * 容器名称
     */
    private String name;

    /**
     * 容器镜像
     */
    private String image;

    /**
     * cpu数量
     */
    private Float cpu;

    /**
     * gpu数量
     */
    private Float gpu;

    /**
     * 内存大小
     */
    private Float memory;

    /**
     * 容器工作目录
     */
    private String workingDir;

    /**
     * 镜像拉取策略
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
     * 容器内端口信息
     */
    private List<Port> ports;

    /**
     * 容器存储卷信息
     */
    private List<VolumeMount> volumeMounts;

    /**
     * 容器环境变量列表
     */
    private List<Environment> envs;

    /**
     * 容器创建时间
     */
    private String createTime;

    /**
     * 容器更新时间
     */
    private String updateTime;

    /**
     * 容器删除时间
     */
    private String deleteTime;

    /**
     * previousState
     */
    private ContainerStatus previousState;

    /**
     * currentState
     */
    private ContainerStatus currentState;

    /**
     * 是否已通过就绪探针
     */
    private Boolean ready;

    /**
     * 重启次数
     */
    private Integer restartCount;

    public ContainerDetailModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ContainerDetailModel setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public ContainerDetailModel setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    public Float getCpu() {
        return this.cpu;
    }

    public ContainerDetailModel setGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    public Float getGpu() {
        return this.gpu;
    }

    public ContainerDetailModel setMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    public Float getMemory() {
        return this.memory;
    }

    public ContainerDetailModel setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    public String getWorkingDir() {
        return this.workingDir;
    }

    public ContainerDetailModel setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    public String getImagePullPolicy() {
        return this.imagePullPolicy;
    }

    public ContainerDetailModel setCommands(List<String> commands) {
        this.commands = commands;
        return this;
    }

    public List<String> getCommands() {
        return this.commands;
    }

    public ContainerDetailModel setArgs(List<String> args) {
        this.args = args;
        return this;
    }

    public List<String> getArgs() {
        return this.args;
    }

    public ContainerDetailModel setPorts(List<Port> ports) {
        this.ports = ports;
        return this;
    }

    public List<Port> getPorts() {
        return this.ports;
    }

    public ContainerDetailModel setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    public List<VolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    public ContainerDetailModel setEnvs(List<Environment> envs) {
        this.envs = envs;
        return this;
    }

    public List<Environment> getEnvs() {
        return this.envs;
    }

    public ContainerDetailModel setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public ContainerDetailModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public ContainerDetailModel setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    public String getDeleteTime() {
        return this.deleteTime;
    }

    public ContainerDetailModel setPreviousState(ContainerStatus previousState) {
        this.previousState = previousState;
        return this;
    }

    public ContainerStatus getPreviousState() {
        return this.previousState;
    }

    public ContainerDetailModel setCurrentState(ContainerStatus currentState) {
        this.currentState = currentState;
        return this;
    }

    public ContainerStatus getCurrentState() {
        return this.currentState;
    }

    public ContainerDetailModel setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    public Boolean getReady() {
        return this.ready;
    }

    public ContainerDetailModel setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    public Integer getRestartCount() {
        return this.restartCount;
    }

    @Override
    public String toString() {
        return "ContainerDetailModel{" + "name=" + name + "\n" + "image=" + image + "\n" + "cpu=" + cpu + "\n" + "gpu=" + gpu + "\n" + "memory=" + memory + "\n" + "workingDir="
                + workingDir + "\n" + "imagePullPolicy=" + imagePullPolicy + "\n" + "commands=" + commands + "\n" + "args=" + args + "\n" + "ports=" + ports + "\n"
                + "volumeMounts=" + volumeMounts + "\n" + "envs=" + envs + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "deleteTime="
                + deleteTime + "\n" + "previousState=" + previousState + "\n" + "currentState=" + currentState + "\n" + "ready=" + ready + "\n" + "restartCount=" + restartCount
                + "\n" + "}";
    }

}