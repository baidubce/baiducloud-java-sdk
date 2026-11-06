package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableGranularityUpdateUserDescriptionApiRequest extends BaseBceRequest {

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

    /**
    * 新备注
    */
    private String remark;

    public String getInstanceId() {
        return instanceId;
    }

    public TableGranularityUpdateUserDescriptionApiRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getUser() {
        return user;
    }

    public TableGranularityUpdateUserDescriptionApiRequest setUser(String user) {
        this.user = user;
        return this;
    }

    public String getHost() {
        return host;
    }

    public TableGranularityUpdateUserDescriptionApiRequest setHost(String host) {
        this.host = host;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public TableGranularityUpdateUserDescriptionApiRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }

}
