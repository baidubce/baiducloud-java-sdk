package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RdmaNicTopo {
    /**
     * RDMA IP地址
     */
    private String rdmaIp;

    /**
     * 交换机名称
     */
    private String switchName;

    /**
     * 交换机端口
     */
    private String switchPort;

    /**
     * RDMA MAC地址
     */
    private String rdmaMac;

    /**
     * RDMA网关
     */
    private String rdmaGateway;

    public RdmaNicTopo setRdmaIp(String rdmaIp) {
        this.rdmaIp = rdmaIp;
        return this;
    }

    public String getRdmaIp() {
        return this.rdmaIp;
    }

    public RdmaNicTopo setSwitchName(String switchName) {
        this.switchName = switchName;
        return this;
    }

    public String getSwitchName() {
        return this.switchName;
    }

    public RdmaNicTopo setSwitchPort(String switchPort) {
        this.switchPort = switchPort;
        return this;
    }

    public String getSwitchPort() {
        return this.switchPort;
    }

    public RdmaNicTopo setRdmaMac(String rdmaMac) {
        this.rdmaMac = rdmaMac;
        return this;
    }

    public String getRdmaMac() {
        return this.rdmaMac;
    }

    public RdmaNicTopo setRdmaGateway(String rdmaGateway) {
        this.rdmaGateway = rdmaGateway;
        return this;
    }

    public String getRdmaGateway() {
        return this.rdmaGateway;
    }

    @Override
    public String toString() {
        return "RdmaNicTopo{" + "rdmaIp=" + rdmaIp + "\n" + "switchName=" + switchName + "\n" + "switchPort=" + switchPort + "\n" + "rdmaMac=" + rdmaMac + "\n" + "rdmaGateway="
                + rdmaGateway + "\n" + "}";
    }

}