package com.baidubce.aihc.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobSpec {
    /**
     * 镜像地址，需要包含tag
     */
    private String image;

    /**
     * imageConfig
     */
    private ImageConfig imageConfig;

    /**
     * worker副本数
     */
    private Integer replicas;

    /**
     * 配置资源配额
     */
    private List<Resource> resources;

    /**
     * 
     */
    private List<Env> envs;

    /**
     * 
     */
    private Boolean enableRDMA;

    /**
     * 是否使用宿主机网络，开启后作业worker将使用宿主机网络，开启RDMA时默认为true；平台默认容器网络，只有P800整机训练部分场景才需要打开，打开后多实例调度到同节点可能导致端口冲突影响调度，请谨慎使用
     */
    private Boolean hostNetwork;

    public JobSpec setImage(String image) {
        this.image = image;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public JobSpec setImageConfig(ImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }

    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    public JobSpec setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    public Integer getReplicas() {
        return this.replicas;
    }

    public JobSpec setResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public List<Resource> getResources() {
        return this.resources;
    }

    public JobSpec setEnvs(List<Env> envs) {
        this.envs = envs;
        return this;
    }

    public List<Env> getEnvs() {
        return this.envs;
    }

    public JobSpec setEnableRDMA(Boolean enableRDMA) {
        this.enableRDMA = enableRDMA;
        return this;
    }

    public Boolean getEnableRDMA() {
        return this.enableRDMA;
    }

    public JobSpec setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    public Boolean getHostNetwork() {
        return this.hostNetwork;
    }

    @Override
    public String toString() {
        return "JobSpec{" + "image=" + image + "\n" + "imageConfig=" + imageConfig + "\n" + "replicas=" + replicas + "\n" + "resources=" + resources + "\n" + "envs=" + envs + "\n"
                + "enableRDMA=" + enableRDMA + "\n" + "hostNetwork=" + hostNetwork + "\n" + "}";
    }

}