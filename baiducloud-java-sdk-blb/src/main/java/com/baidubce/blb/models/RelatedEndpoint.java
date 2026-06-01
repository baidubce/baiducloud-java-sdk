package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedEndpoint {
    /**
     * 服务网卡的id
     */
    private String endpointId;

    /**
     * 服务网卡对应用户id
     */
    private String uid;

    /**
     * 关联时间
     */
    private String attachTime;

    public RelatedEndpoint setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    public String getEndpointId() {
        return this.endpointId;
    }

    public RelatedEndpoint setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getUid() {
        return this.uid;
    }

    public RelatedEndpoint setAttachTime(String attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    public String getAttachTime() {
        return this.attachTime;
    }

    @Override
    public String toString() {
        return "RelatedEndpoint{" + "endpointId=" + endpointId + "\n" + "uid=" + uid + "\n" + "attachTime=" + attachTime + "\n" + "}";
    }

}