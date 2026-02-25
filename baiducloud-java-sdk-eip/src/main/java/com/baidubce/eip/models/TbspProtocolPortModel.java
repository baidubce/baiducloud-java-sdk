
package com.baidubce.eip.models;



import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbspProtocolPortModel  {
    /**
     * DDoS增强防护包封禁协议类型，包含icmp、tcp和udp
     */
    private String type;

    /**
     * DDoS增强防护包协议封禁端口起始值
     */
    private Integer portBegin;

    /**
     * DDoS增强防护包协议封禁端口终止值
     */
    private Integer portEnd;

    public TbspProtocolPortModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public TbspProtocolPortModel setPortBegin(Integer portBegin) {
        this.portBegin = portBegin;
        return this;
    }

    public Integer getPortBegin() {
        return this.portBegin;
    }

    public TbspProtocolPortModel setPortEnd(Integer portEnd) {
        this.portEnd = portEnd;
        return this;
    }

    public Integer getPortEnd() {
        return this.portEnd;
    }

    @Override
    public String toString() {
        return "TbspProtocolPortModel{"
                + "type=" + type + "\n"
                + "portBegin=" + portBegin + "\n"
                + "portEnd=" + portEnd + "\n"
                + "}";
    }




}