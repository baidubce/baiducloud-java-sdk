package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SwitchMasterSlaveShard {
    /**
     * 指定要切换的分片。可从实例详情接口RedisList字段中获取分片信息。
     */
    private String hashName;

    /**
     * 指定该分片中要切换为主的节点ID。可从实例详情接口RedisList字段中获取分片中节点ID的信息。
     */
    private String nodeShowId;

    public SwitchMasterSlaveShard setHashName(String hashName) {
        this.hashName = hashName;
        return this;
    }

    public String getHashName() {
        return this.hashName;
    }

    public SwitchMasterSlaveShard setNodeShowId(String nodeShowId) {
        this.nodeShowId = nodeShowId;
        return this;
    }

    public String getNodeShowId() {
        return this.nodeShowId;
    }

    @Override
    public String toString() {
        return "SwitchMasterSlaveShard{" + "hashName=" + hashName + "\n" + "nodeShowId=" + nodeShowId + "\n" + "}";
    }

}