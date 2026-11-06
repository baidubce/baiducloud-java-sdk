package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyDatabasePortRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 修改端口的参数
    */
    private Integer entryPort;

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyDatabasePortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getEntryPort() {
        return entryPort;
    }

    public ModifyDatabasePortRequest setEntryPort(Integer entryPort) {
        this.entryPort = entryPort;
        return this;
    }

}
