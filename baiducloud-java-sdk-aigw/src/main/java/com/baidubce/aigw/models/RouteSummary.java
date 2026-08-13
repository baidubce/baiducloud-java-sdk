package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteSummary {
    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 路由状态，当前为 PUBLISHED
     */
    private String routeStatus;

    /**
     * 绑定的自定义域名
     */
    private List<String> domains;

    /**
     * 关联域名数量
     */
    private Integer associatedDomainCount;

    /**
     * matchPath
     */
    private RouteMatchPath matchPath;

    /**
     * 目标服务摘要列表
     */
    private List<TargetService> targetService;

    /**
     * 创建时间，格式为 `YYYY-MM-DD HH:mm:ss`
     */
    private String createTime;

    /**
     * 来源产品标识
     */
    private String srcProduct;

    public RouteSummary setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

    public String getRouteName() {
        return this.routeName;
    }

    public RouteSummary setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus;
        return this;
    }

    public String getRouteStatus() {
        return this.routeStatus;
    }

    public RouteSummary setDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public List<String> getDomains() {
        return this.domains;
    }

    public RouteSummary setAssociatedDomainCount(Integer associatedDomainCount) {
        this.associatedDomainCount = associatedDomainCount;
        return this;
    }

    public Integer getAssociatedDomainCount() {
        return this.associatedDomainCount;
    }

    public RouteSummary setMatchPath(RouteMatchPath matchPath) {
        this.matchPath = matchPath;
        return this;
    }

    public RouteMatchPath getMatchPath() {
        return this.matchPath;
    }

    public RouteSummary setTargetService(List<TargetService> targetService) {
        this.targetService = targetService;
        return this;
    }

    public List<TargetService> getTargetService() {
        return this.targetService;
    }

    public RouteSummary setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public RouteSummary setSrcProduct(String srcProduct) {
        this.srcProduct = srcProduct;
        return this;
    }

    public String getSrcProduct() {
        return this.srcProduct;
    }

    @Override
    public String toString() {
        return "RouteSummary{" + "routeName=" + routeName + "\n" + "routeStatus=" + routeStatus + "\n" + "domains=" + domains + "\n" + "associatedDomainCount="
                + associatedDomainCount + "\n" + "matchPath=" + matchPath + "\n" + "targetService=" + targetService + "\n" + "createTime=" + createTime + "\n" + "srcProduct="
                + srcProduct + "\n" + "}";
    }

}