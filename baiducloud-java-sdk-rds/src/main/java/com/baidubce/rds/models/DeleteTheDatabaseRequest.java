package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteTheDatabaseRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * dbName
    */
    @JsonIgnore
    private String dbName;

    public String getInstanceId() {
        return instanceId;
    }

    public DeleteTheDatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDbName() {
        return dbName;
    }

    public DeleteTheDatabaseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

}
