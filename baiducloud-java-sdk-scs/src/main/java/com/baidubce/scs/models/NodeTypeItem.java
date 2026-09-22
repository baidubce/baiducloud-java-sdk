package com.baidubce.scs.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NodeTypeItem {
    /**
     * 节点规格
     */
    private String nodeType;

    /**
     * 节点容量
     */
    private Integer instanceFlavor;

    /**
     * cpu数量
     */
    private Integer cpuNum;

    /**
     * 网络吞吐
     */
    private Float networkThroughputInGbps;

    /**
     * 参考最大Qps
     */
    private Integer peakQps;

    /**
     * 最大连接数
     */
    private Integer maxConnections;

    /**
     * 允许的分片数量
     */
    private List<Integer> allowedNodeNumList;

    /**
     * Pegadb规格最小的磁盘大小，单位GB。
     */
    private Integer minDiskFlavor;

    /**
     * Pegadb规格最小的磁盘大小，单位GB。
     */
    private Integer maxDiskFlavor;

    public NodeTypeItem setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public NodeTypeItem setInstanceFlavor(Integer instanceFlavor) {
        this.instanceFlavor = instanceFlavor;
        return this;
    }

    public Integer getInstanceFlavor() {
        return this.instanceFlavor;
    }

    public NodeTypeItem setCpuNum(Integer cpuNum) {
        this.cpuNum = cpuNum;
        return this;
    }

    public Integer getCpuNum() {
        return this.cpuNum;
    }

    public NodeTypeItem setNetworkThroughputInGbps(Float networkThroughputInGbps) {
        this.networkThroughputInGbps = networkThroughputInGbps;
        return this;
    }

    public Float getNetworkThroughputInGbps() {
        return this.networkThroughputInGbps;
    }

    public NodeTypeItem setPeakQps(Integer peakQps) {
        this.peakQps = peakQps;
        return this;
    }

    public Integer getPeakQps() {
        return this.peakQps;
    }

    public NodeTypeItem setMaxConnections(Integer maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    public NodeTypeItem setAllowedNodeNumList(List<Integer> allowedNodeNumList) {
        this.allowedNodeNumList = allowedNodeNumList;
        return this;
    }

    public List<Integer> getAllowedNodeNumList() {
        return this.allowedNodeNumList;
    }

    public NodeTypeItem setMinDiskFlavor(Integer minDiskFlavor) {
        this.minDiskFlavor = minDiskFlavor;
        return this;
    }

    public Integer getMinDiskFlavor() {
        return this.minDiskFlavor;
    }

    public NodeTypeItem setMaxDiskFlavor(Integer maxDiskFlavor) {
        this.maxDiskFlavor = maxDiskFlavor;
        return this;
    }

    public Integer getMaxDiskFlavor() {
        return this.maxDiskFlavor;
    }

    @Override
    public String toString() {
        return "NodeTypeItem{" + "nodeType=" + nodeType + "\n" + "instanceFlavor=" + instanceFlavor + "\n" + "cpuNum=" + cpuNum + "\n" + "networkThroughputInGbps="
                + networkThroughputInGbps + "\n" + "peakQps=" + peakQps + "\n" + "maxConnections=" + maxConnections + "\n" + "allowedNodeNumList=" + allowedNodeNumList + "\n"
                + "minDiskFlavor=" + minDiskFlavor + "\n" + "maxDiskFlavor=" + maxDiskFlavor + "\n" + "}";
    }

}