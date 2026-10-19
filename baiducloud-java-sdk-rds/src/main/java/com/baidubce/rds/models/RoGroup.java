package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoGroup {
    /**
     * 节点ID。
     */
    private String roGroupId;

    /**
     * 可用区名称，多个逗号分隔。
     */
    private String roGroupName;

    /**
     * roGroupEndpoint
     */
    private InstanceDict roGroupEndpoint;

    /**
     * vpcID。
     */
    private String vpcId;

    /**
     * VPC地址。
     */
    private String subnetId;

    /**
     * 外网访问功能状态,参考[公网状态表](/doc/RDS/s/9jwvz0wd3#%E5%85%AC%E7%BD%91%E8%AE%BF%E9%97%AE%E7%8A%B6%E6%80%81)。
     */
    private String eipStatus;

    /**
     * 只读组列表。
     */
    private List<AppList> roGroupAppList;

    /**
     * simpleVpcVo
     */
    @JsonProperty("SimpleVpcVo")
    private SimpleVpcVo simpleVpcVo;

    /**
     * subnetVo
     */
    private SubnetVo subnetVo;

    /**
     * vpcVo
     */
    private SimpleVpcVo vpcVo;

    public RoGroup setRoGroupId(String roGroupId) {
        this.roGroupId = roGroupId;
        return this;
    }

    public String getRoGroupId() {
        return this.roGroupId;
    }

    public RoGroup setRoGroupName(String roGroupName) {
        this.roGroupName = roGroupName;
        return this;
    }

    public String getRoGroupName() {
        return this.roGroupName;
    }

    public RoGroup setRoGroupEndpoint(InstanceDict roGroupEndpoint) {
        this.roGroupEndpoint = roGroupEndpoint;
        return this;
    }

    public InstanceDict getRoGroupEndpoint() {
        return this.roGroupEndpoint;
    }

    public RoGroup setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public RoGroup setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public RoGroup setEipStatus(String eipStatus) {
        this.eipStatus = eipStatus;
        return this;
    }

    public String getEipStatus() {
        return this.eipStatus;
    }

    public RoGroup setRoGroupAppList(List<AppList> roGroupAppList) {
        this.roGroupAppList = roGroupAppList;
        return this;
    }

    public List<AppList> getRoGroupAppList() {
        return this.roGroupAppList;
    }

    public RoGroup setSimpleVpcVo(SimpleVpcVo simpleVpcVo) {
        this.simpleVpcVo = simpleVpcVo;
        return this;
    }

    public SimpleVpcVo getSimpleVpcVo() {
        return this.simpleVpcVo;
    }

    public RoGroup setSubnetVo(SubnetVo subnetVo) {
        this.subnetVo = subnetVo;
        return this;
    }

    public SubnetVo getSubnetVo() {
        return this.subnetVo;
    }

    public RoGroup setVpcVo(SimpleVpcVo vpcVo) {
        this.vpcVo = vpcVo;
        return this;
    }

    public SimpleVpcVo getVpcVo() {
        return this.vpcVo;
    }

    @Override
    public String toString() {
        return "RoGroup{" + "roGroupId=" + roGroupId + "\n" + "roGroupName=" + roGroupName + "\n" + "roGroupEndpoint=" + roGroupEndpoint + "\n" + "vpcId=" + vpcId + "\n"
                + "subnetId=" + subnetId + "\n" + "eipStatus=" + eipStatus + "\n" + "roGroupAppList=" + roGroupAppList + "\n" + "simpleVpcVo=" + simpleVpcVo + "\n" + "subnetVo="
                + subnetVo + "\n" + "vpcVo=" + vpcVo + "\n" + "}";
    }

}