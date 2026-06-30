package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceDetailModel {
    /**
     * volume
     */
    private Volume volume;

    /**
     * 业务容器
     */
    private List<ContainerDetailModel> containers;

    /**
     * init容器
     */
    private List<ContainerDetailModel> initContainers;

    /**
     * 安全组信息
     */
    private List<SecurityGroupModel> securityGroups;

    /**
     * vpc
     */
    private VpcModel vpc;

    /**
     * subnet
     */
    private SubnetModel subnet;

    public InstanceDetailModel setVolume(Volume volume) {
        this.volume = volume;
        return this;
    }

    public Volume getVolume() {
        return this.volume;
    }

    public InstanceDetailModel setContainers(List<ContainerDetailModel> containers) {
        this.containers = containers;
        return this;
    }

    public List<ContainerDetailModel> getContainers() {
        return this.containers;
    }

    public InstanceDetailModel setInitContainers(List<ContainerDetailModel> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    public List<ContainerDetailModel> getInitContainers() {
        return this.initContainers;
    }

    public InstanceDetailModel setSecurityGroups(List<SecurityGroupModel> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public List<SecurityGroupModel> getSecurityGroups() {
        return this.securityGroups;
    }

    public InstanceDetailModel setVpc(VpcModel vpc) {
        this.vpc = vpc;
        return this;
    }

    public VpcModel getVpc() {
        return this.vpc;
    }

    public InstanceDetailModel setSubnet(SubnetModel subnet) {
        this.subnet = subnet;
        return this;
    }

    public SubnetModel getSubnet() {
        return this.subnet;
    }

    @Override
    public String toString() {
        return "InstanceDetailModel{" + "volume=" + volume + "\n" + "containers=" + containers + "\n" + "initContainers=" + initContainers + "\n" + "securityGroups="
                + securityGroups + "\n" + "vpc=" + vpc + "\n" + "subnet=" + subnet + "\n" + "}";
    }

}