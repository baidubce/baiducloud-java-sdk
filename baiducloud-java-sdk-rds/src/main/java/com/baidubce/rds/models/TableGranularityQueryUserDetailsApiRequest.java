package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableGranularityQueryUserDetailsApiRequest extends BaseBceRequest {

    /**
    * RDS 实例 ID
    */
    private String instanceId;

    /**
    * 账号名
    */
    private String user;

    /**
    * 来源主机
    */
    private String host;

    public String getInstanceId() {
        return instanceId;
    }

    public TableGranularityQueryUserDetailsApiRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getUser() {
        return user;
    }

    public TableGranularityQueryUserDetailsApiRequest setUser(String user) {
        this.user = user;
        return this;
    }

    public String getHost() {
        return host;
    }

    public TableGranularityQueryUserDetailsApiRequest setHost(String host) {
        this.host = host;
        return this;
    }

}
