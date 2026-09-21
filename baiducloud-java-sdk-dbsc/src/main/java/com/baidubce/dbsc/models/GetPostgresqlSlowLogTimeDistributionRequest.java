package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPostgresqlSlowLogTimeDistributionRequest extends BaseBceRequest {

    /**
    * appId
    */
    @JsonIgnore
    private String appId;

    /**
    * nodeId
    */
    @JsonIgnore
    private String nodeId;

    /**
    * start
    */
    @JsonIgnore
    private String start;

    /**
    * end
    */
    @JsonIgnore
    private String end;

    /**
    * dbNames
    */
    @JsonIgnore
    private List dbNames;

    /**
    * users
    */
    @JsonIgnore
    private List users;

    /**
    * clientIPs
    */
    @JsonIgnore
    private List clientIPs;

    public String getAppId() {
        return appId;
    }

    public GetPostgresqlSlowLogTimeDistributionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public GetPostgresqlSlowLogTimeDistributionRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getStart() {
        return start;
    }

    public GetPostgresqlSlowLogTimeDistributionRequest setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public GetPostgresqlSlowLogTimeDistributionRequest setEnd(String end) {
        this.end = end;
        return this;
    }

    public List getDbNames() {
        return dbNames;
    }

    public GetPostgresqlSlowLogTimeDistributionRequest setDbNames(List dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    public List getUsers() {
        return users;
    }

    public GetPostgresqlSlowLogTimeDistributionRequest setUsers(List users) {
        this.users = users;
        return this;
    }

    public List getClientIPs() {
        return clientIPs;
    }

    public GetPostgresqlSlowLogTimeDistributionRequest setClientIPs(List clientIPs) {
        this.clientIPs = clientIPs;
        return this;
    }

}
