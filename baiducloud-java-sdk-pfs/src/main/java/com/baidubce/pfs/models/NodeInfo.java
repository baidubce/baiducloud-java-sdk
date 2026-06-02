package com.baidubce.pfs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeInfo {
    /**
     * 客户端节点短ID（BBC ID/AIHC ID/HPAS ID）
     */
    private String nodeId;

    /**
     * 客户端节点名称
     */
    private String nodeName;

    /**
     * 客户端节点内网IP(AIHC不展示)
     */
    private String internalIp;

    /**
     * 可用区（cn-gz-d）
     */
    private String zoneName;

    /**
     * vpc id
     */
    private String vpcId;

    /**
     * vpc name
     */
    private String vpcName;

    /**
     * 节点挂载后端集群list
     */
    private List<String> instanceIdList;

    /**
     * 
     */
    private String nodeStatus;

    /**
     * BBC/BCC/AIHC/HPAS
     */
    private String nodeType;

    /**
     * 
     */
    private String mountStatus;

    /**
     * 节点密码
     */
    private String passwd;

    /**
     * 挂载服务名称
     */
    private String mtName;

    /**
     * 挂载服务id
     */
    private String mtId;

    /**
     * 节点的挂载路径
     */
    private String mtPath;

    public NodeInfo setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public NodeInfo setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public NodeInfo setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    public String getInternalIp() {
        return this.internalIp;
    }

    public NodeInfo setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public NodeInfo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public NodeInfo setVpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    public String getVpcName() {
        return this.vpcName;
    }

    public NodeInfo setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

    public List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public NodeInfo setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    public String getNodeStatus() {
        return this.nodeStatus;
    }

    public NodeInfo setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public NodeInfo setMountStatus(String mountStatus) {
        this.mountStatus = mountStatus;
        return this;
    }

    public String getMountStatus() {
        return this.mountStatus;
    }

    public NodeInfo setPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public NodeInfo setMtName(String mtName) {
        this.mtName = mtName;
        return this;
    }

    public String getMtName() {
        return this.mtName;
    }

    public NodeInfo setMtId(String mtId) {
        this.mtId = mtId;
        return this;
    }

    public String getMtId() {
        return this.mtId;
    }

    public NodeInfo setMtPath(String mtPath) {
        this.mtPath = mtPath;
        return this;
    }

    public String getMtPath() {
        return this.mtPath;
    }

    @Override
    public String toString() {
        return "NodeInfo{" + "nodeId=" + nodeId + "\n" + "nodeName=" + nodeName + "\n" + "internalIp=" + internalIp + "\n" + "zoneName=" + zoneName + "\n" + "vpcId=" + vpcId
                + "\n" + "vpcName=" + vpcName + "\n" + "instanceIdList=" + instanceIdList + "\n" + "nodeStatus=" + nodeStatus + "\n" + "nodeType=" + nodeType + "\n"
                + "mountStatus=" + mountStatus + "\n" + "passwd=" + passwd + "\n" + "mtName=" + mtName + "\n" + "mtId=" + mtId + "\n" + "mtPath=" + mtPath + "\n" + "}";
    }

}