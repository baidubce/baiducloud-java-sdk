package com.baidubce.vpc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NextHop {
    /**
     * 下一跳ID
     */
    private String nexthopId;

    /**
     * 路由类型。目前只支持专线网关类型："dcGateway"
     */
    private String nexthopType;

    /**
     * 多线模式。负载均衡取值为ecmp；主备模式取值ha:active、ha:standby，分别表示主、备路由
     */
    private String pathType;

    public NextHop setNexthopId(String nexthopId) {
        this.nexthopId = nexthopId;
        return this;
    }

    public String getNexthopId() {
        return this.nexthopId;
    }

    public NextHop setNexthopType(String nexthopType) {
        this.nexthopType = nexthopType;
        return this;
    }

    public String getNexthopType() {
        return this.nexthopType;
    }

    public NextHop setPathType(String pathType) {
        this.pathType = pathType;
        return this;
    }

    public String getPathType() {
        return this.pathType;
    }

    @Override
    public String toString() {
        return "NextHop{" + "nexthopId=" + nexthopId + "\n" + "nexthopType=" + nexthopType + "\n" + "pathType=" + pathType + "\n" + "}";
    }

}