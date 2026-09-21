package com.baidubce.cce.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReceiveAddr {
    /**
     * 接收方式三元组，格式为 [发送方式, 发送地址, 描述]，如 ["email", "123@baidu.com", "这是描述"]
     */
    @JsonProperty("ReceiveAddr")
    private List<String> receiveAddr;

    public ReceiveAddr setReceiveAddr(List<String> receiveAddr) {
        this.receiveAddr = receiveAddr;
        return this;
    }

    public List<String> getReceiveAddr() {
        return this.receiveAddr;
    }

    @Override
    public String toString() {
        return "ReceiveAddr{" + "receiveAddr=" + receiveAddr + "\n" + "}";
    }

}